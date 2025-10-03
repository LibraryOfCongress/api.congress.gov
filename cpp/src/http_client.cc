#include <iostream>
#include <ctime>
#include <sstream>
#include <fstream>
#include "asio.hpp"
#include "asio/ssl.hpp"
#include <openssl/ssl.h>
#include "ssl_read.hh"
#include "get.hh"

std::string extract_value(const std::string& content, const std::string& key);

/////////////////////////////////////////////////////////////////////////////////////////////////////
//main
/////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
  /////////////////////////////////////////////////////////////////////////////////////////////////////
  // load API key and other configuration values from file
  /////////////////////////////////////////////////////////////////////////////////////////////////////

  std::ifstream file("config.json");
  if (!file.is_open())
  {
    return -1;
  }

  std::stringstream ss;
  ss << file.rdbuf();
  std::string buf = ss.str();
  file.close();

  std::string key = extract_value(buf, "API_KEY");
  std::string format = extract_value(buf, "RESPONSE_FORMAT");
  int limit = std::stoi(extract_value(buf, "LIMIT"));

  std::cout << "API_KEY: " << key << std::endl;
  std::cout << "RESPONSE_FORMAT: " << format << std::endl;

  int congress = 118;
  std::string billType = "hr";
  BillRequest request(key, format, congress, billType, limit);
  if (get_bill(request) < 0)
  {
    return -1;
  }

  return 0;

  if (get_member(key, format, limit) < 0)
  {
    return -1;
  }

  return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
// extract_value
/////////////////////////////////////////////////////////////////////////////////////////////////////

std::string extract_value(const std::string& content, const std::string& key)
{
  size_t pos_key = content.find("\"" + key + "\"");
  size_t pos_colon = content.find(":", pos_key);
  size_t first = content.find("\"", pos_colon);
  size_t second = content.find("\"", first + 1);
  return content.substr(first + 1, second - first - 1);
}
