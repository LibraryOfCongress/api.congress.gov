# House communication endpoint
## Coverage 
Coverage information for House communications data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about House communications data at [About Communications to the House](https://www.congress.gov/help/house-communications) on Congress.gov.
## OpenAPI Specification
View OpenAPI Specification on the House communications API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/house-communication/house_communication). 
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
Note that House communication items at the list level can be filtered down by congress (e.g. 117) and by communication type (e.g. ec) - https://api.congress.gov/v3/house-communication/117/ec?api_key=. 

`<api-root>` 

The `<api-root>` is only present in the XML format.

`<houseCommunications>`

Parent container for House communications. A `<houseCommunications>` element may include the following children:
- `<item>` 
  - Container for a House communication item. An `<item>` element is repeatable and may include the following children:
    - `<chamber>` (e.g. House)
      - The chamber where the communication was received. This value will always be set to "House".    
    - `<communicationNumber>` (e.g. 1)
      - The assigned communication number.
    -  `<communicationType>`
        - Container for communication type information. A `<communicationType>` element may include the following children:
          -  `<code>` (e.g. EC)
             - The code for the type of communication. 
             - Possible values are "EC", "PM", "PT", and "ML".
          - `<name>` (e.g. Executive Communication)
            - The name of the type of communication.
            - Possible values are "Executive Communication", "Presidential Message", "Petition", and "Memorial".
    - `<congressNumber>` (e.g. 115)
      - The congress during which the communication was received. 
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<url>` (e.g. https://api.congress.gov/v3/house-communication/115/ec/1)
        - A referrer URL to the communication item in the API.

### Item Level
`<api-root>` 

The `<api-root>` is only present in the XML format.

`<house-communication>` 

Parent container for a House communication item. A `<house-communication>` element may include the following children:
- `<chamber>` (e.g. House)
  - The chamber where the communication was received. This value will always be set to "House".
- `<communicationNumber>` (e.g. 1)
  - The assigned communication number.
- `<communicationType>`
  - Container for communication type information. A `<communicationType>` element may include the following children:
    - `<code>` (e.g. EC)
      - The code for the type of communication.
      - Possible values are "EC", "PM", "PT", and "ML".
    - `<name>` (e.g. Executive Communication)
      - The name of the type of communication.
      - Possible values are "Executive Communication", "Presidential Message", "Petition", and "Memorial".
- `<congressNumber>` (e.g. 115)
  - The congress during which the communication was received. 
  - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
- `<abstract>` (e.g. A letter from the Clerk, U.S. House of Representatives, transmitting a list of reports created by the Clerk, pursuant to Rule II, clause 2(b), of the Rules of the House; (H. Doc. No. 115–4); to the Committee on House Administration and ordered to be printed.)
  - The abstract text for the communication. 
- `<congressionalRecordDate>` (e.g. 2017-01-03)
  - The date the communication was published in the Congressional Record. 
- `<committees>`
  - Container for committees associated with the communication. A `<committees>` element may include the following children:
      - `<item>`
          - Container for a single committee associated with the communication. An `<item>` element is repeatable and may include the following children:
              - `<name>` (e.g. House Administration Committee)
                  - The name of the committee.
              - `<referredToCommitteeDate>` (e.g. 2017-01-03)
                  - The date the communication was referred to the committee.
