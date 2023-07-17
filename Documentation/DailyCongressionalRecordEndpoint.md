# Daily Congressional Record endpoint

## Coverage

Coverage information for daily congressional record data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates).  Read more about Congressional Record data at [About the Congressional Record](https://www.congress.gov/help/congressional-record) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the congressional record API and available parameters at [https://api.congress.gov](https://api.congress.gov/#/daily-congressional-record/daily-congressional-record_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that date congressional record items can be filtered down to volume by adding /{VOLUME_NUMBER}?api_key=[INSERT_KEY] to your search (e.g.,<https://api.congress.gov/v3/daily-congressional-record/166?api_key=[INSERT_KEY]>).

`<api-root>`

The `<api-root>` is only present in the XML format.

`<dailyCongressionalRecord>`

Parent container for congressional record issues. A `<dailyCongressionalRecord>` element may include the following children:

- `<Issue>`
  - Container for a daily congressional record issue. An `<Issue>` element may include the following children:
    - `<issueNumber>`
      - The daily congressional record's issue number.
    - `<volumeNumber>`
      - The daily congressional record's volume number. 
    - `<congress>`
      - The congress associated with the daily congressional record issue.
    - `<SessionNumber>`
      - The session number. Possible values are "1" and "2". 
    - `<URL>` 
      - The URL to the entire issue of the daily congressional record. 
    - `<UpdateDate>` 
       - The date that the daily congressional record was updated. 
