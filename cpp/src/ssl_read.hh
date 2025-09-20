#ifndef READ_HH_
#define READ_HH_

#include <string>
#include <vector>

int ssl_read(const std::string& host, const std::string& port_num, const std::string& http, std::string& response);
std::string get_response(const std::string& host, const std::string& port_num, const std::string& api);
struct url_t
{
  std::string path, domain, protocol, port, query;
};

void parse_url(const std::string& raw, url_t& url);

#endif
