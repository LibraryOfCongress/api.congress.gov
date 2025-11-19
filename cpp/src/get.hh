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
// Member
/////////////////////////////////////////////////////////////////////////////////////////////////////

struct Term
{
  std::string chamber;
  int startYear = 0;
  int endYear = 0;
};

struct Member
{
  std::string name;
  std::string partyName;
  std::string state;
  std::string imageUrl;
  std::vector<Term> terms;
};

/////////////////////////////////////////////////////////////////////////////////////////////////////
// BillRequest
/////////////////////////////////////////////////////////////////////////////////////////////////////

struct BillRequest
{
  std::string key;
  std::string format;
  int congress;
  std::string billType;
  int limit;

  BillRequest(const std::string& k, const std::string& fmt, int cong, const std::string& type, int lim = 0)
    : key(k), format(fmt), congress(cong), billType(type), limit(lim)
  {
  }
};

int get_bill(const BillRequest& request);
int get_member(const std::string& key, const std::string& format, int limit);

#endif