#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <ctime>
#include <sstream>
#include <assert.h>
#include "asio.hpp"
#include "asio/ssl.hpp"
#include <openssl/ssl.h>
#include "ssl_read.hh"

/////////////////////////////////////////////////////////////////////////////////////////////////////
//ssl_read
/////////////////////////////////////////////////////////////////////////////////////////////////////

int ssl_read(const std::string& host, const std::string& port_num, const std::string& http, std::string& response)
{
  std::vector<std::string> header;

  std::stringstream ss;
  try
  {
    std::error_code ec;
    asio::io_service io_service;
    asio::ip::tcp::resolver resolver(io_service); //name resolution (DNS lookup)
    asio::ip::tcp::resolver::query query(host, port_num);
    asio::ip::tcp::resolver::iterator endpoint_iterator = resolver.resolve(query);

    asio::ssl::context context(asio::ssl::context::tlsv12_client);
    context.set_default_verify_paths();

    asio::ssl::stream<asio::ip::tcp::socket> sock(io_service, context);
    asio::connect(sock.lowest_layer(), endpoint_iterator);
    sock.lowest_layer().set_option(asio::ip::tcp::no_delay(true));

    //Server Name Indication (SNI)
    ::SSL_set_tlsext_host_name(sock.native_handle(), host.c_str());

    sock.set_verify_mode(asio::ssl::verify_none);
    sock.set_verify_callback(asio::ssl::rfc2818_verification(host));
    sock.handshake(asio::ssl::stream<asio::ip::tcp::socket>::client);

    size_t ret = asio::write(sock, asio::buffer(http, http.size()));

    //read until end of HTTP header
    //Note:: after a successful read_until operation, the streambuf may contain additional data
    //beyond the delimiter. An application will typically leave that data in the streambuf for a subsequent
    //read_until operation to examine.

    asio::streambuf sbuf;
    std::string line;

    asio::read_until(sock, sbuf, "\r\n\r\n");
    std::istream response_stream(&sbuf);
    while (std::getline(response_stream, line) && line != "\r")
    {
      header.push_back(line);
      std::cout << line << std::endl;
    }

    //dump whatever content we already have
    if (sbuf.size() > 0)
    {
      ss << &sbuf;
    }

    //read until EOF, dumping to string stream as we go.
    while (asio::read(sock, sbuf, asio::transfer_at_least(1), ec))
    {
      ss << &sbuf;
    }
    if (ec != asio::error::eof)
    {
    }
  }
  catch (std::exception& e)
  {
    std::cout << e.what() << std::endl;
    std::ofstream ofs1("exception.txt");
    ofs1 << e.what();
    ofs1.close();
  }

  response = ss.str();
  return 0;
}
