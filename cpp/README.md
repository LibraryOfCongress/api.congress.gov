# Congress API Client

A C++ application that fetches data from the Congress API using HTTPS.

https://gpo.congress.gov/

## Prerequisites

This project requires CMake, a C++ compiler, OpenSSL, and the ASIO library.

## Installation Instructions

### macOS

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
brew install cmake openssl asio
export OPENSSL_ROOT_DIR=$(brew --prefix openssl)
export PKG_CONFIG_PATH=$(brew --prefix openssl)/lib/pkgconfig:$PKG_CONFIG_PATH
```

### Linux (Ubuntu/Debian)

```bash
sudo apt install build-essential cmake libssl-dev libasio-dev
```

### Windows 

1. Install CMake from https://cmake.org/download/
2. Download OpenSSL pre-compiled binaries from https://slproweb.com/products/Win32OpenSSL.html
3 Set environment variable:

```cmd
set OPENSSL_ROOT_DIR=C:\OpenSSL-Win64
```

## Building the Project

On a bash shell (on Windows, Git bash shell), run 
```bash
chmod a+x build.cmake.sh 
build.cmake.sh
```

## Setup

1. Create a `key.txt` file in the project root with your Congress API key. Obtain key from 

https://gpo.congress.gov/sign-up/

Edit file config.json with the API key

```json
{
  "API_KEY": "MY_API_KEY",
  "RESPONSE_FORMAT": "json",
  "LIMIT": "2"
}
```

2. Run the application:
```bash
./congress 
```

The application will fetch member data and save it to `member.json`.

## HTTP 

An HTTP GET request with the following format is made 

```bash
GET /v3/member?api_key=API_KEY&limit=1 HTTP/1.1
Host: api.congress.gov
Accept: */*
Connection: close
```

## Example JSON response

```
{
    "members": [
        {
            "bioguideId": "Y000064",
            "depiction": {
                "attribution": "Image courtesy of the Member",
                "imageUrl": "https://www.congress.gov/img/member/y000064_200.jpg"
            },
            "name": "Young, Todd",
            "partyName": "Republican",
            "state": "Indiana",
            "terms": {
                "item": [
                    {
                        "chamber": "House of Representatives",
                        "endYear": 2017,
                        "startYear": 2011
                    },
                    {
                        "chamber": "Senate",
                        "startYear": 2017
                    }
                ]
            },
            "updateDate": "2025-09-20T10:30:32Z",
            "url": "https://api.congress.gov/v3/member/Y000064?format=json"
        }
    ],
    "pagination": {
        "count": 2598,
        "next": "https://api.congress.gov/v3/member?offset=1&limit=1&format=json"
    },
    "request": {
        "contentType": "application/json",
        "format": "json"
    }
}

```
