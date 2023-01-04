# CDG Example Client with Python

## Table of contents

- [Requirements](#requirements)
- [API Credentials](#api-credentials)
- [Typical Use of CDGClient](#typical-use-of-cdgclient)
- [Examples](#examples)
- [Configurable options](#configurable-options)
- [How to talk to various endpoints](#how-to-talk-to-various-endpoints)  
- [Client arguments](#client-arguments)
- [Additional Information](#additional-information)

## Requirements

This client with developed and tested with Python 3.8 so should work with that version
and above. We have tested with older Python versions.

This example client requires the `requests` package, and optionally the `keyring`
package.
They may be installed with one of the the following commands:

```shell
⏵ python3 -m pip install requests keyring        # X-platform
⏵ apt install python3-requests python3-keyring   # Debian

```

`lxml` might be useful as well, if you expect to be using and parsing a lot of XML.
JSON is the default data serialization format.

On Unix, you may want to directly run the example scripts as executable files,
though they work after the `python` command as well:

```bash
⏵ chmod a+x cdg_cli bill_example.py
```

Windows folks will probably need to type `python` before any scripts,
assuming python is on your PATH.

## API Credentials

Sign up for and retrieve your API key from <https://api.congress.gov/sign-up>

## Typical Use of CDGClient

```python
from cdg_client import CDGClient  # make it available

client = CDGClient(api_key)  # pass the key, response_format="xml" if needed

# use requests args and kwargs below modify the request:
data, status_code = client.get(endpoint, *args, **kwargs)

# JSON data is pre-parsed, XML will need
# import xml.etree.ElementTree as ET
# root = ET.fromstring(data)

# go to town!
```

## Examples

Below are a few fleshed out examples.

### Command line interface ➧ `cdg_cli`

`cdg_cli` is an example of:

- Using the CDGClient class.
- Making simple queries at the command-line.
- How to use the "keyring" functionality of your OS.
- Using the JSON format, data is returned as native data structures.

First, you'll need to enter your API Auth key at the prompt.

That is, wait for the prompt, do *not* put it on the command-line proper:

```sh
⏵ python cdg_cli --prompt-key # Enter, do *not* pass API Auth key here ✗

API Key:               # Do paste it here ✓

  INFO     API Key was saved.

# Now you can run it
```

Now, to look at bill/hr/21/committeess, write:

```sh
⏵ python cdg_cli bill/117/hr/21/committees
  INFO     __main__/main:111 HTTP Status: 200
  INFO     __main__/main:112 API Returned:
```

```json
{
    "committees": [
        {
            "activities": [
                {
                    "date": "2021-01-07T01: 26: 34Z",
                    "name": "Referred to"
                }
            ],
            "chamber": "Senate",
            "name": "Homeland Security and Governmental Affairs Committee",
            "subcommittees": [],
            "systemCode": "ssga00",
            "type": "Standing",
            "url": "https: //api.congress.gov/v3/committee/senate/ssga00?format=json"
        },
        {
            "activities": [
                {
                    "date": "2021-01-04T15:11:25Z",
                    "name": "Referred to"
                }
            ],
            "chamber": "House",
            "name": "Oversight and Reform Committee",
            "subcommittees": [],
            "systemCode": "hsgo00",
            "type": "Standing",
            "url": "https://api.congress.gov/v3/committee/house/hsgo00?format=json"
        }
    ],
    "request": {
        "billNumber": "21",
        "billType": "hr",
        "billUrl": "https://api.congress.gov/v3/bill/117/hr/21?format=json",
        "congress": "117",
        "contentType": "application/json",
        "format": "json"
    }
}
```

## Configurable options

| Key                      | Description                                                        | Values                                       |
|--------------------------|--------------------------------------------------------------------|----------------------------------------------|
| *API_KEY*                | The API key used to authenticate calls                             | Retrieved from <https://api.congress.gov>      |
| *RESPONSE_FORMAT*        | Sets the response format returned by the API                       | xml, json                                    |
| *BILL.CONGRESS*          | The numerical value of the congress to query                       | 1 - 117 (or current congress)                |
| *BILL.CHAMBER*           | The congressional chamber                                          | hr, s, sjres, hjres                          |
| *BILL.NUMBER*            | The bill number to query                                           | A valid bill number from <https://congress.gov> |
| *BILL.URL*               | The bill url for the API to query                                  | bill                                         |

### How to talk to various endpoints

`bill_example` is an example of:

- Using the CDGClient class
- How the endpoints are structured.
- Using an external "secrets" config file.
- Using the XML format.

```sh
⏵  python3 bill_example.py
 1. bill:
   - congress:            '117'
   - type:                'HR'
   - originChamber:       'House'
   - originChamberCode:   'H'
   - number:              '5681'
   - url:                 'https://api.congress.gov/v3/bill/117/hr/5681?format=xml'
   - title:               'Shadow Wolves Enhancement Act'
   - latestAction:        ''
   - updateDate:          '2022-04-08'
 ...
```

## Client arguments

Other options allowed as arguments to python bill_example.py are:

| Argument             | Description                              |
|----------------------|------------------------------------------|
| *help*               | Displays the help message                |
| *all_bill_calls*     | Runs all of the defined bill API calls   |
| *bills_get_all*      | Gets all bills                           |
| *bills_by_congress*  | Gets all bills by the specified congress |
| *bills_by_chamber*   | Gets all bills by the specified chamber  |
| *bill*               | Gets a specific bill                     |
| *bill_actions*       | Gets a bills actions                     |
| *bill_amendments*    | Gets a bills amendments                  |
| *bill_committees*    | Gets a bills committees                  |
| *bill_cosponsors*    | Gets a bills cosponsors                  |
| *bill_related_bills* | Gets a bills related bills               |
| *bill_subjects*      | Gets a bills subjects                    |
| *bill_summaries*     | Gets a bills summaries                   |
| *bill_texts*         | Gets a bills texts                       |
|  *bill_titles*       | Gets a bills titles                      |

## Additional Information

- For more information and the full API reference, please visit <https://api.congress.gov/>
- Alternative ways to make use of your API key when making calls can be found here: <https://api.data.gov/docs/api-key/>

---
© 2022, Library of Congress via Congress.gov
