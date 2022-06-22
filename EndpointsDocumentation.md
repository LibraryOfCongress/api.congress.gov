# Overview
## Introduction
The beta Congress.gov Application Programming Interface (API) provides a method for Congress and the public to view, retrieve, and re-use machine-readable data from collections available on Congress.gov. This documentation contains information on accessing and using the beta Congress.gov API. Additionally, an overview of the data available through the beta Congress.gov API is detailed. 

Within the beta Congress.gov API, responses are returned in XML or JSON formats. An `api-root` element will be visible for responses returned in XML. 

For every request, three elements are returned:
- The **Request** element contains information about the API request itself. This includes the format and the `contentType`; this is essentially the information you might expect to see in a request header.
- The **Pagination** element contains a count of how many total data items are contained within the response, a URL containing the next page of results; and, if the offset is greater than 1, a URL containing the previous page of results.
- The **Data** element, the name of which changes depending on the endpoint utilized (i.e. `bills` for the bill endpoint, `amendments` for the amendment endpoint, etc.). This element contains a list of all data items returned by your API call. 
## Key/Authentication
An API key is required for access. Sign up for a key [here](https://api.data.gov/signup/). Email lawoutreach@loc.gov for assistance in authenticating your API key (which will be required until after the beta API is released to the public in September 2022).
## Versioning
The current version of the API is version 3 (v3). Prior versions were used by the Government Publishing Office (GPO) for its [Bulk Data Repository](https://www.govinfo.gov/bulkdata), and other clients. If the API requires major changes, then Congress.gov will issue a version 4 (v4) before retiring v3 after a period of time.
## Support
Congress.gov staff will monitor and respond to any [issues](https://github.com/LibraryOfCongress/api.congress.gov/issues) created in this repository, and will initiate actions, as necessary. Before creating an issue in the repository, please review existing issues and add a comment to any issues relevant to yours. 
## Change Management
Congrss.gov staff will issue change management communication through the [ChangeLog](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/ChangeLog.md) so that consumers are able to adjust accordingly. The [ChangeLog](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/ChangeLog.md) will contain information on updates to the API, the impacted endpoints, and the expected production release date. 
# Endpoints
## bill
### Coverage
Coverage information for bill data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates) on Congress.gov. Projects to add more historical legislative data to Congress.gov are underway. Read more about bill data at [About Legislation of the U.S. Congress](https://www.congress.gov/help/legislation) on Congress.gov.
### Base Request
The base request for bill data in the API is **api.data.gov/congress/v3/bill**. The request will return 20 results by default. Basic information about each bill item will be included in the request. Included in that basic information is the congress, bill type, bill number, origin chamber, URL to the bill item in the API, title, latest action, and the bill's update date in Congress.gov. Filters can be added to the URL in order to limit results returned to just items in a single Congress (e.g. **api.data.gov/congress/v3/bill/117**) or Congress and bill type (e.g. **api.data.gov/congress/v3/bill/117/hr**).
### Item
Depending on the data available, each bill item in the API may contain the following: congress, bill type, bill number, origin chamber, introduced date, title[^1], constitutional authority statement, committee count, associated committee report(s), related bills[^2] count, actions count, sponsor, cosponsor count, associated Congressional Budget Office (CBO) cost estimate(s), law information, policy area term[^3], subjects[^4] count, summaries[^5] count, amendments count, text count, latest action, and the bill’s update date in Congress.gov.
### Levels
Depending on the data available, each bill item in the API may contain a referrer link to the following deeper levels: actions, amendments, committees, cosponsors, relatedBills[^2], subjects[^4], summaries[^5], text, and titles. These levels contain more information related to the bill item. For example, the actions level may contain the following for each action on the bill: date of action, text of the action, the type of action (e.g. Floor, President), action code[^6] (e.g. 28000), source system (e.g. House, Senate, Library of Congress), associated committee information, associated recorded vote information, and associated calendar information. 
## amendment
### Coverage
Coverage information for amendment data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates) on Congress.gov[^7]. Read more about [amendments on Congress.gov](https://www.congress.gov/help/legislative-glossary#glossary_amendment).
### Base Request
The base request for amendment data in the Congress.gov API is **api.data.gov/congress/v3/amendment**. The request will return 20 results by default. Basic information about each amendment item will be included in the request. Included in the basic information is the congress, amendment type, amendment number, description, purpose, latest action, and url to the amendment item in the API. Filters can be added to the URL in order to limit results returned to just items in a single congress (e.g. **api.data.gov/congress/v3/amendment/117**) or congress and amendment type (e.g. **api.data.gov/congress/v3/amendment/117/samdt**).
### Item
Depending on the data available, each amendment item in the API may contain the following: congress, amendment type, amendment number, purpose, description, latest action, and the amendment’s update date in Congress.gov.
### Levels
Depending on the data available, each amendment item in the API may contain a referrer link to the following deeper levels: actions, amendments (to the amendment), and cosponsors. These levels contain more information related to the amendment item. For example, the actions level may contain the following for each action on the amendment: date of action, text of the action, the type of action (e.g. Floor), action code[^6] (e.g. 91000), source system (e.g. House, Senate, Library of Congress), associated committee information and associated recorded vote information. 

[^1]: Read more about [titles](https://www.congress.gov/help/legislative-glossary#glossary_title) on Congress.gov.
[^2]: Read more [About Related Bills](https://www.congress.gov/help/related-bills) on Congress.gov.
[^3]: Read more about [Policy Area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) on Congress.gov.
[^4]: Read more about [Legislative Subjects](https://www.congress.gov/help/legislative-glossary#glossary_legislativesubjectterm) on Congress.gov.
[^5]: Read more about [Bill Summaries](https://www.congress.gov/help/legislative-glossary#glossary_billsummary) on Congress.gov.
[^6]: A [field value list of action codes](https://www.congress.gov/help/field-values/action-codes) from the Library of Congress can be viewed on Congress.gov.
[^7]: On Congress.gov, 97th Congress Senate Amendments are available. Efforts are underway to add those amendments to the API.
