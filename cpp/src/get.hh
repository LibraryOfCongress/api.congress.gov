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

int get_member(const std::string& key, const std::string& format, int limit);

#endif