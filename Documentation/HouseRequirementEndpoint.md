# House requirement endpoints

## Coverage

Coverage information for House requirements data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about House requirements data within [About Communications to the House](https://www.congress.gov/help/house-communications) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the House requirement API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/house-requirement/house_requirement).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that House requirement items at the list level cannot be filtered ([https://api.congress.gov/v3/house-requirement](https://api.congress.gov/v3/house-requirement)).

`<api-root>`

The `<api-root>` is only present in the XML format.

`<houseReqirements>`

Parent container for House requirements. A `<houseReqirements>` element may include the following children:

- `<item>`
  - Container for a House requirement item. An `<item>` element is repeatable and may include the following children:
    - `<number>` (e.g. 12478)
      - The assigned requirement number.
    - `<updateDate>` (e.g. 2021-11-05)
      - The date of update in Congress.gov.
    - `<url>` (e.g. <https://api.congress.gov/v3/house-requirement/12478>)
      - A referrer URL to the House requirement item in the API.

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<houseRequirement>`

Parent container for a House requirement item. A `<houseRequirement>` element may include the following children:

- `<number>` (e.g. 12478)
  - The assigned House requirement number.
- `<updateDate>` (e.g. 2021-11-05)
  - The date of update in Congress.gov.
- `<parentAgency>` (e.g. Executive Office of the President)
  - The government entity mandated to submit a report.
- `<frequency>` (e.g. If specified circumstances arise.)
  - The set interval for when a report is mandated to be submitted.
- `<nature>` (e.g. Approval of recommendations related to reducing the costs of federal real estate.)
  - The brief description of the report.
- `<legalAuthority>` (e.g. Public Law 114–287, section 13(c)(1); (130 Stat. 1471))
  - Citations to the statute associated with the House requirement.
- `<activeRecord>` (e.g., True)
  - Flag to indicate whether the requirement is active.
  - Possible values are "True" and "False".
- `<submittingAgency>` (e.g., Office of Management and Budget)
  - The government agency mandated to submit a report.
- `<submittingOfficial>` (e.g., Director)
  - The government official mandated to submit a report.
- `<matchingCommunications>` (the below data is taken from <https://api.congress.gov/v3/house-requirement/8070?api_key=>):
  - Container for matching communications to the requirement. A `<matchingCommunications>` element includes the following children:
    - `<count>` (e.g., 85138)
      - The number of matching communications to the requirement.
    - `<url>` (e.g., <https://api.congress.gov/v3/house-requirement/8070/matching-communications>)
      - A referrer URL to the matching communications level of the house requirement API. Click [here](#matching-communications-level) for more information on the matching communications level. 

### Matching Communications Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<matchingCommunications>`

Parent container for matching House communications to the requirement. A `<matchingCommunications>` element may include the following children:

- `<item>`
  - Container for a House communication item. An `<item>` element is repeatable and may include the following children:
    - `<chamber>` (e.g. House)
      - The chamber where the communication was received. This value will always be set to "House".
    - `<number>` (e.g. 1)
      - The assigned communication number.
    - `<communicationType>`
      - Container for communication type information. A `<communicationType>` element may include the following children:
        - `<code>` (e.g. EC)
          - The code for the type of communication.
          - Possible values are "EC", "PM", "PT", and "ML".
        - `<name>` (e.g. Executive Communication)
          - The name of the type of communication.
          - Possible values are "Executive Communication", "Presidential Message", "Petition", and "Memorial".
    - `<congress>` (e.g. 115)
      - The congress during which the communication was received.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<url>` (e.g. <https://api.congress.gov/v3/house-communication/115/EC/1>)
      - A referrer URL to the communication item in the API.
