#include <iostream>
#include <ctime>
#include <sstream>
#include <fstream>
#include "asio.hpp"
#include "asio/ssl.hpp"
#include <openssl/ssl.h>
#include "ssl_read.hh"
#include "get.hh"

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

  if (get_member(key, 250) < 0)
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