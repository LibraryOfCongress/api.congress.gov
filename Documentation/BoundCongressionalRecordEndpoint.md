# Bound Congressional Record endpoint

## Coverage

Coverage information for bound Congressional Record data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates).  Read more about Congressional Record data at [About the Congressional Record](https://www.congress.gov/help/congressional-record) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the Congressional Record API and available parameters at [https://api.congress.gov](https://api.congress.gov/#/daily-congressional-record/daily-congressional-record_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that bound Congressional Record items can be filtered down to volume by adding /{year}?api_key=[INSERT_KEY], /{year}/{month}?api_key=[INSERT_KEY], or /{year}/{month}/{day}?api_key=[INSERT_KEY] to your search. 

Examples of these searches include:
- /{year}: <https://api.congress.gov/v3/bound-congressional-record/1990?api_key=[INSERT_KEY]>
- /{year}/{month}: <https://api.congress.gov/v3/bound-congressional-record/1990/05?api_key=[INSERT_KEY]>
- /{year}/{month}/{day}: <https://api.congress.gov/v3/bound-congressional-record/1990/05/21?api_key=[INSERT_KEY]>

`<api-root>`

The `<api-root>` is only present in the XML format.

`<boundCongressionalRecord>`

Parent container for Congressional Record issues. A `<boundCongressionalRecord>` element may include the following children:

- `<item>`
  - Container for a bound Congressional Record issue. An `<item>` element may include the following children:
    - `<date>`
      - The bound Congressional Record's date.
    - `<volumeNumber>`
      - The bound Congressional Record's volume number. 
    - `<congress>`
      - The Congress associated with the bound Congressional Record issue.
    - `<SessionNumber>`
      - The session number. Possible values are "1" and "2". 
    - `<UpdateDate>` 
       - The date that the bound Congressional Reord was updated.
    - `<URL>`
      - The URL for the bound Congress Record.

- `<dailyDigest>`
  - Container for a bound Congressional Record's Daily Digest. A `<dailyDigest>` element may include the following children:
    - `<startPage>`
      - The start page for the Daily Digest section.
    - `<endPage>`
      - The end page for the Daily Digest section.
    - `<text>`
      - Container for Daily Digest text. A `<text>` element may include:
        - `<item>`
        - Container for single Daily Digest text. An `<item>` element may include:
           - `<type>`
           - The Daily Digest format type. For example, PDF.
           - `<URL>`
           - The URL for the Daily Digest text.
             
- `<Sections>`
  - Container for a bound Congressional Record's sections. A `<Sections>` element may include the following children:
    - `<item>`
    - Container for a section of a bound Congressional Record. An `<item> ` element may include the following children:
       - `<name> `
       - The name of the bound Congressional Record section. For example, "Senate." 
       - `<startPage>`
       - The start page for the Daily Digest section.
       - `<endPage>`
       - The end page for the Daily Digest section.
       
      


