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
assuming it python is on your PATH.


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

Password:               # Do paste it here ✓

  INFO     API Key was saved.

```

### Examples of how to talk to various endpoints:

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
