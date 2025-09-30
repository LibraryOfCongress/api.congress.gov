#include "get.hh"

/////////////////////////////////////////////////////////////////////////////////////////////////////
// get_member
//https://api.congress.gov/v3/member?api_key=[INSERT_KEY]&limit=250
/////////////////////////////////////////////////////////////////////////////////////////////////////

int get_member(const std::string key, int limit)
{
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
