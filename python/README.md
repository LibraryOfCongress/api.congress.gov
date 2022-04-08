# CDG Example Client with Python

## Requirements

This client with developed and tested with Python 3.8 so should work with that version
and above.

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

```
⏵ chmod a+x cdg_cli bill_example.py
```

Windows folks will probably need to type `python` before any scripts,
assuming python is on your PATH.


## Typical Use of CDGClient

```python
from cdg_client import CDGClient  # make it available

client = CDGClient(auth_key)  # pass the key, response_format="xml" if needed

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
⏵ cdg_cli --prompt-key # Enter, do *not* pass API Auth key here ✗

Auth Key:               # Do paste it here ✓

  INFO     API Key was saved.

# Now you can run it

⏵ cdg_cli bill/117/hr/21/committees
  INFO     __main__/main:111 HTTP Status: 200
  INFO     __main__/main:112 API Returned:
{'committees': [{'activities': [{'date': '2021-01-07T01:26:34Z',
                                 'name': 'Referred to'}],
                 'chamber': 'Senate',
                 'name': 'Homeland Security and Governmental Affairs Committee',
                 'subcommittees': [],
                 'systemCode': 'ssga00',
                 'type': 'Standing',
                 'url': 'http://api1.test.congress.gov/v3/committee/senate/ssga00?format=json'},
                {'activities': [{'date': '2021-01-04T15:11:25Z',
                                 'name': 'Referred to'}],
                 'chamber': 'House',
                 'name': 'Oversight and Reform Committee',
                 'subcommittees': [],
                 'systemCode': 'hsgo00',
                 'type': 'Standing',
                 'url': 'http://api1.test.congress.gov/v3/committee/house/hsgo00?format=json'}],
 'request': {'billNumber': '21',
             'billType': 'hr',
             'billUrl': 'http://api1.test.congress.gov/v3/bill/117/hr/21?format=json',
             'congress': '117',
             'contentType': 'application/json',
             'format': 'json'}}
```

<p>&nbsp;</p>

### How to talk to various endpoints:

`bill_example` is an example of:

- Using the CDGClient class
- How the endpoints are structured.
- Using an external "secrets" config file.
- Using the XML format.


```
⏵  python3 bill_example.py
 1. bill:
   - congress:            '117'
   - type:                'HR'
   - originChamber:       'House'
   - originChamberCode:   'H'
   - number:              '5681'
   - url:                 'http://api1.test.congress.gov/v3/bill/117/hr/5681?format=xml'
   - title:               'Shadow Wolves Enhancement Act'
   - latestAction:        ''
   - updateDate:          '2022-04-08'
 ...
```

<p>&nbsp;</p>

---
© 2022, Library of Congress via Congress.gov
