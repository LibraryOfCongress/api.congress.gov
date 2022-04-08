# CDG Example Client with Python

## Requirements

This client with tested with Python 3.8 so should work with that version and above.

This example client requires the `requests` package, and optionally the `keyring`
package.
They may be installed with the following command:

```shell
⏵ python3 -m pip install requests keyring

```

lxml might be useful as well, if you expect to be using and parsing a lot of XML.
JSON is the default data serializtion format.

On Unix, you may want to directly run the example scripts as executable files,
though they work after the python command as well:

```
⏵ chmod a+x cdg_cli bill_example.py
```

## Command line interface

First enter your API Auth key at the prompt.

Wait for the prompt, do *not* put on the command-line proper:

```sh
⏵ cdg_cli --prompt-key # ENTER, do not pass API Auth key here

Password: # (Do paste it here)

  INFO     API Key was saved.

```

## Typical Use

```python
from cdg_client import CDGClient


client = CDGClient(auth_key)

# go to town!
# use requests args and kwargs below modify the request:
data, status_code = client.get(endpoint, *args, **kwargs)

```

### Examples of how to talk to various endpoints:

```
⏵  python3 bill_example.py
```
