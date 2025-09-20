#include <iostream>
#include <ctime>
#include <sstream>
#include <fstream>
#include "asio.hpp"
#include "asio/ssl.hpp"
#include <openssl/ssl.h>
#include "ssl_read.hh"

int get_member(const std::string key);
std::string load_key_from_file(const std::string& filename);

/////////////////////////////////////////////////////////////////////////////////////////////////////
//main
/////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
  std::string key = load_key_from_file("key.txt");
  if (key.empty())
  {
    std::cerr << "Failed to load API key from key.txt" << std::endl;
    return -1;
  }

  if (get_member(key) < 0)
  {
    return -1;
  }
  return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
// load_key_from_file
/////////////////////////////////////////////////////////////////////////////////////////////////////

std::string load_key_from_file(const std::string& filename)
{
  std::ifstream file(filename);
  if (!file.is_open())
  {
    return "";
  }

  std::string key;
  std::getline(file, key);
  file.close();
  key.erase(key.find_last_not_of(" \t\r\n") + 1);
  return key;
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
// get_member
//https://api.congress.gov/v3/member?api_key=[INSERT_KEY]
/////////////////////////////////////////////////////////////////////////////////////////////////////

int get_member(const std::string key)
{
  int limit = 0;
  const std::string host = "api.congress.gov";
  const std::string port_num = "443";
  std::stringstream http;
  http << "GET /v3/member?api_key=" << key;
  if (limit > 0)
  {
    http << "&limit=" << limit;
  }
  http << " HTTP/1.1\r\n";
  http << "Host: " << host;
  http << "\r\n";
  http << "Accept: */*\r\n";
  http << "Connection: close\r\n\r\n";
  std::cout << http.str() << std::endl;

  std::string json;
  ssl_read(host, port_num, http.str(), json);

  if (!json.size())
  {
    return -1;
  }

  std::cout << json.c_str() << std::endl;
  std::ofstream ofs("member.json");
  ofs << json;
  ofs.close();

  return 0;
}