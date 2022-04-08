# CDG Example Client with Python

## Requirements

This client with developed and tested with Python 3.8 so should work with that version
and above.

This example client requires the `requests` package, and optionally the `keyring`
package.
They may be installed with the following command:

```shell
⏵ python3 -m pip install requests keyring

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
from cdg_client import CDGClient

client = CDGClient(auth_key)  # response_format="xml"

# use requests args and kwargs below modify the request:
data, status_code = client.get(endpoint, *args, **kwargs)

# JSON data is pre-parsed, XML will need
# import xml.etree.ElementTree as ET
# root = ET.fromstring(data)

# go to town!
```

## Command line interface ➧ `cdg_cli`

`cdg_cli` is an example of:

- Using the CDGClient class
- Making simple queries at the command-line
- How to use the "keyring" functionality of your OS.
- Using the JSON format, data is returned as native data structures.

First, you'll need to enter your API Auth key at the prompt.

That is, wait for the prompt, do *not* put on the command-line proper:

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
```
