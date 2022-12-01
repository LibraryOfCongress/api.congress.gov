# Congress endpoint
## Coverage
Coverage information for congress data in the API can be found at the [Congresses field values list](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Information on past session dates can be found on Congress.gov at the [Dates of Past Sessions](https://www.congress.gov/past-days-in-session).
## OpenAPI Specification
View OpenAPI Specification on the congress API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/congress/congress_list).
## Elements and Descriptions
The section below details available element names, their descriptions, and possible values. 
### List Level

Note that congress items at the list level cannot be filtered (https://api.congress.gov/v3/congress?api_key=).

`<api-root>`

The `<api-root>` is only present in the XML format.

`<congresses>`

Parent container for congress and congressional sessions. A `<congresses>` element may include the following children:
- `<item>` 
  - Container for a congress item. An `<item>` element is repeatable and may include the following children:
    - `<name>` (e.g. 116th Congress)
      - The name of the congress.
    - `<startYear>` (e.g. 2019)
      - The start year for the congress. Congresses span over a two-year period.
    - `<endYear>` (e.g. 2020)
      - The end year for the congress. Congresses span over a two-year period.
    - `<sessions>` 
      - Container for sessions of congress. A `<sessions>` element may include the following children:
        - `<item>`
          - Container for a single session of congress for a chamber. An `<item>` element is repeatable and may include the following children:
            - `<chamber>`(e.g. House)
              - The chamber associated with the session of congress.
              - Possible values are "House" and "Senate".
            - `<type>` (e.g. R)
              - The type of session. 
              - Possible values are "R" and "S" where "R" stands for "Regular" and "S" stands for "Special".
            - `<startDate>` (e.g. 2019-01-03)
              - The start date of the session.
            - `<endDate>` (e.g. 2020-01-03)
              - The end date of the session.
            - `<number>` (e.g. 1)
              - The assigned session's number.
              - For special sessions, this value is suppressed.
### Item Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<congress>`

Parent container for a congress and its congressional sessions. A `<congress>` element may include the following children:
- `<sessions>`
  - Container for sessions of congress. A `<sessions>` element may include the following children:
    - `<item>`
      - Container for a single session of congress for a chamber. An `<item>` element is repeatable and may include the following children:
        - `<chamber>`(e.g. House)
          - The chamber associated with the session of congress.
          - Possible values are "House" and "Senate".
        - `<type>` (e.g. R)
          - The type of session. 
          - Possible values are "R" and "S" where "R" stands for "Regular" and "S" stands for "Special".
        - `<startDate>` (e.g. 2019-01-03)
          - The start date of the session.
        - `<endDate>` (e.g. 2020-01-03)
          - The end date of the session.
        - `<number>` (e.g. 1)
          - The assigned session's number.
          - For special sessions, this value is suppressed.
- `<name>` (e.g. 116th Congress)
  - The name of the congress.
- `<startYear>` (e.g. 2019)
  - The start year for the congress. Congresses span over a two-year period.
- `<endYear>` (e.g. 2020)
  - The end year for the congress. Congresses span over a two-year period.
- `<updateDate>` (e.g. 2019-01-03T18:37:12Z)
  - The date of update in Congress.gov.
- `<number>` (e.g. 116)
  - The congress number. 
- `<url>` (e.g. https://api.congress.gov/v3/congress/116)
  - A referrer URL to the congress item in the API.    
