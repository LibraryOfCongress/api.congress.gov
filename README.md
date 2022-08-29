# Overview
## Introduction
The beta Congress.gov Application Programming Interface (API) - https://api.congress.gov/v3/?api_key= - provides a method for Congress and the public to view, retrieve, and re-use machine-readable data from collections available on Congress.gov. This repository contains information on accessing and using the beta Congress.gov API, as well as documentation on available endpoints.

Within the beta Congress.gov API, responses are returned in XML or JSON formats. An `<api-root>` element will be visible for responses returned in XML. 

For every request, three elements are returned:
- The **Request** element contains information about the API request itself. This includes the format and the `<contentType>`; this is essentially the information you might expect to see in a request header.
- The **Pagination** element contains a count of how many total data items are contained within the response, a URL containing the next page of results; and, if the offset is greater than 1, a URL containing the previous page of results.
- The **Data** element, the name of which changes depending on the endpoint utilized (i.e. `<bills>` for the bill endpoint, `<amendments>` for the amendment endpoint, etc.). This element contains a list of all data items returned by your API call. 
## Key/Authentication
An API key is required for access. Sign up for a key [here](https://api.data.gov/signup/). Email lawoutreach@loc.gov for assistance in authenticating your API key (which will be required until the beta API is released to the public in September 2022).
## Versioning
The current version of the API is version 3 (v3). Prior versions were used by the Government Publishing Office (GPO) for its [Bulk Data Repository](https://www.govinfo.gov/bulkdata), and other clients. 
## Support
Congress.gov staff will monitor and respond to any [issues](https://github.com/LibraryOfCongress/api.congress.gov/issues) created in this repository, and will initiate actions, as necessary. Before creating an issue in the repository, please review existing issues and add a comment to any issues relevant to yours. 
## Change Management
Congress.gov staff will issue change management communication through the [ChangeLog](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/ChangeLog.md) so that consumers are able to adjust accordingly. The [ChangeLog](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/ChangeLog.md) will contain information on updates to the API, the impacted endpoints, and the expected production release date. 

# Congress.gov API Beta Working Group 

The purpose of this repository is to communicate with Congressional data partners in support of developing the Congress.gov API (v3) that is anticipated to be released to the public at a future date. Development plans to be supported within the repository include: 

- Python and Java sample client code
- [Two-way communication](https://github.com/LibraryOfCongress/api.congress.gov/issues) for Congressional data partners
- [Change management communication](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/ChangeLog.md)
- [User documentation](https://github.com/LibraryOfCongress/api.congress.gov/tree/main/Documentation) with clear information about Congressional data publishing workflows

The purposes of the Congress.gov API (v3): 

- Support Congressional data partners (by protecting them from scrapers that degrade Congress.gov access) 
- Facilitate access to more complete and accurate Congressional data
- Provide a useful, extensible resource for Congressional data partners
- Replace Congress.gov API (v2), a closed API used primarily for bulk data sharing
  
The initial Congress.gov API (v3) is implemented as a RESTful read API that is presented as a hierarchical browse API.
