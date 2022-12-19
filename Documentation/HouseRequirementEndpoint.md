# House requirement endpoint
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
    - `<url>` (e.g. https://api.congress.gov/v3/house-requirement/12478)
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
- `<agency>` (e.g. Executive Office of the President)
  - The government entity mandated to submit a report.
- `<frequency>` (e.g. If specified circumstances arise.)
  - The set interval for when a report is mandated to be submitted.
- `<nature>` (e.g. Approval of recommendations related to reducing the costs of federal real estate.)
  - The brief description of the report.
- `<legalAuthority>` (e.g. Public Law 114–287, section 13(c)(1); (130 Stat. 1471))
  - Citations to the statute associated with the House requirement.
