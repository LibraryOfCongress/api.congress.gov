# Senate communication endpoint
## Coverage
Coverage information for Senate communications data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about Senate communications data at [About Senate Executive and Other Communications](https://www.congress.gov/help/senate-communications) on Congress.gov.

Note that currently, only Senate communications from the 114th Congress to the present are available in the API. Efforts are underway to add Senate communications from prior congresses to the API. Check the [ChangeLog](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/ChangeLog.md) for any updates.
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
Note that Senate communication items at the list level can be filtered down by congress (e.g. 117) and by communication type (e.g. ec) - https://api.congress.gov/v3/senate-communication/117/ec?api_key=.

`<api-root>` 

The `<api-root>` is only present in the XML format.

`<senateCommunications>` 

Parent container for Senate communications. A `<senateCommunications>` element may include the following children:
- `<item>`
  - Container for a Senate communication item. An `<item>` element is repeatable and may include the following children:
    - `<chamber>` (e.g. Senate)
      - The chamber where the communication was received. This value will always be set to "Senate".
    - `<number>` (e.g. 2561)
      - The assigned communication number.
    - `<communicationType>`
      - Container for communication type information. A `<communicationType>` element may include the following children:
        - `<code>` (e.g. EC)
          - The code for the type of communication.
          - Possible values are "EC", "POM", and "PM".
        - `<name>` (e.g. Executive Communication)
          - The name of the type of communication.
          - Possible values are "Executive Communication", "Petition or Memorial", and "Presidential Message".
    - `<congress>` (e.g. 117)
      - The congress during which the communication was received.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<url>` (e.g. https://api.congress.gov/v3/senate-communication/117/ec/2561)
      - A referrer URL to the communication item in the API.

## Item Level
`<api-root>` 

The `<api-root>` is only present in the XML format.

`<senate-communication>`

Parent container for a Senate communication item. A `<senate-communication>` element may include the following children:
- `<chamber>` (e.g. Senate)
  - The chamber where the communication was received. This value will always be set to "Senate".
- `<number>` (e.g. 2561)
  - The assigned communication number.
- `<communicationType>`
  - Container for communication type information. A `<communicationType>` element may include the following children:
    - `<code>` (e.g. EC)
      - The code for the type of communication.
      - Possible values are "EC", "POM", and "PM".
    - `<name>` (e.g. Executive Communication)
      - The name of the type of communication.
      - Possible values are "Executive Communication", "Petition or Memorial", and "Presidential Message".
- `<congress>` (e.g. 117)
  - The congress during which the communication was received.
  - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
- `<abstract>` (e.g. A communication from the Board Chairman and Chief Executive Officer, Farm Credit Administration, transmitting, pursuant to law, the Administration's annual report for calendar year 2021; to the Committee on Agriculture, Nutrition, and Forestry.)
  - The abstract text for the communication.
- `<congressionalRecordDate>` (e.g. 2021-11-03)
  - The date the communication was published in the Congressional Record. 
- `<committees>`
  - Container for committees associated with the communication. A `<committees>` element may include the following children:
    - `<item>`
      - Container for a single committee associated with the communication. An `<item>` element is repeatable and may include the following children:
        - `<name>` (e.g. Agriculture, Nutrition, and Forestry Committee)
          - The name of the committee.
        - `<referralDate>` (e.g. 2021-11-03)
          - The date the communication was referred to the committee.
        - `<url>` (e.g. https://api.congress.gov/v3/committee/senate/ssaf00)
          - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
