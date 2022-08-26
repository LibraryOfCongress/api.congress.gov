"""
    CDG Client - An example client for the Congress.gov API.

    @copyright: 2022, Library of Congress
    @license: CC0 1.0
"""
from urllib.parse import urljoin

import requests


API_VERSION = "v3"
ROOT_URL = "https://api.data.gov/congress/"
RESPONSE_FORMAT = "json"


class _MethodWrapper:
    """ Wrap request method to facilitate queries.  Supports requests signature. """

    def __init__(self, parent, http_method):
        self._parent = parent
        self._method = getattr(parent._session, http_method)

    def __call__(self, endpoint, *args, **kwargs):  # full signature passed here
        response = self._method(
            urljoin(self._parent.base_url, endpoint), *args, **kwargs
        )
        # unpack
        if response.headers.get("content-type", "").startswith("application/json"):
            return response.json(), response.status_code
        else:
            return response.content, response.status_code


class CDGClient:
    """ A sample client to interface with Congress.gov. """

    def __init__(
        self,
        api_key,
        api_version=API_VERSION,
        response_format=RESPONSE_FORMAT,
        raise_on_error=True,
    ):
        self.base_url = urljoin(ROOT_URL, api_version) + "/"
        self._session = requests.Session()

        # do not use url parameters, even if offered, use headers
        self._session.params = {"format": response_format}
        self._session.headers.update({"x-api-key": api_key})

        if raise_on_error:
            self._session.hooks = {
                "response": lambda r, *args, **kwargs: r.raise_for_status()
            }

    def __getattr__(self, method_name):
        """Find the session method dynamically and cache for later."""
        method = _MethodWrapper(self, method_name)
        self.__dict__[method_name] = method
        return method
