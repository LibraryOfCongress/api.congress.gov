#ifndef GET_CONGRESS_HH
#define GET_CONGRESS_HH

#include <iostream>
#include <ctime>
#include <sstream>
#include <fstream>
#include "asio.hpp"
#include "asio/ssl.hpp"
#include <openssl/ssl.h>
#include "ssl_read.hh"

/////////////////////////////////////////////////////////////////////////////////////////////////////
// Bill
/////////////////////////////////////////////////////////////////////////////////////////////////////

struct Bill
{
  std::string key;
  std::string format;
  int congress;
  std::string billType;
  int limit;

  Bill(const std::string& k, const std::string& fmt, int cong, const std::string& type, int lim = 0)
    : key(k), format(fmt), congress(cong), billType(type), limit(lim)
  {
  }
};

int get_bill(const Bill& params);
int get_member(const std::string& key, const std::string& format, int limit);

#endif