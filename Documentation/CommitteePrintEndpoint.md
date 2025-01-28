# Committee Print endpoints

## Coverage

Coverage information for committee print data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about committee print data at [About Committees and Committee Materials](https://www.congress.gov/help/committee-materials#committee-prints) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the committee print API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/committee-print/committee_print_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that committee print items at the list level can be filtered down by congress (e.g., 117) and by chamber (e.g., house) - <https://api.congress.gov/v3/committee-print/117/house?api_key>=.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<committeePrints>`

Container for committee prints. A `<committeePrints>` container may include the following children:

- `<item>`
  - Container for an individual committee print. An `<item>` element is repeatable and may include the following children:
     - `<jacketNumber>` (e.g., 48144)
         - The jacket identifier of the committee print. The `<jacketNumber>` is printed on the front page of a print and is usually five digits.
     - `<url>` (e.g., <https://api.congress.gov/v3/committee-print/117/house/48144>)
         - A referrer URL to the committee print item in the API.
     - `<updateDate>` (e.g., 2022-08-01T21:19:33Z)
         - The date of update in Congress.gov.
     - `<congress>` (e.g., 117)
         - The congress during which the committee print was produced.
         - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
     - `<chamber>` (e.g., House)
         - The chamber where the committee print was produced.
         - Possible values are "House", "Senate" and "NoChamber".

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<committeePrint>`

Parent container for a single committee print. A `<committeePrint>` element may include the following children:

- `<item>`
  - Container for a committee print. An `<item>` element may include the following children:
     - `<jacketNumber>` (e.g., 48144)
         - The jacket identifier of the committee print. The `<jacketNumber>` is printed on the front page of a print and is usually five digits.
     - `<citation>` (e.g., 117-62)
         - The committee print's citation. 
         - Committee prints may or may not be numbered by their associated committee. 
     - `<congress>` (e.g., 117)
         - The congress during which the committee print was produced.
         - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
     - `<number>` (e.g., 62)
         - The assigned committee print number. 
     - `<title>` (e.g., RULES COMMITTEE PRINT 117-62 TEXT OF H.R. 5768, VIOLENT INCIDENT CLEAR- ANCE AND TECHNOLOGICAL INVESTIGATIVE METHODS ACT OF 2022)
         - The title of the committee print. 
     - `<chamber>` (e.g., House)
         - The chamber where the committee print was produced.
         - Possible values are "House", "Senate" and "NoChamber".
     - `<committees>` 
         - Container for the committees associated with the committee print. A `<committees>` element may include the following children:
             - `<item>`
                 - Container for an individual committee associated with a committee report. An `<item>` element is repeatable and may include the following children:
                      - `<url>` (e.g., <https://api.congress.gov/v3/committee/house/hsru00>)
                          - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
                      - `<systemCode>` (e.g., hsru00)
                          - Unique ID value for the committee.
                      - `<name>` (e.g., Rules Committee)
                          - The name of the committee.
     - `<associatedBills>`
         - Container for associated bills to the committee print. An `<associatedBills>` element may include the following children:
             - `<item>`
                 - Container for an associated bill. An `<item>` element is repeatable and may include the following children:
                     - `<congress>` (e.g., 117)
                         - The congress during which a bill or resolution was introduced or submitted.
                     - `<type>` (e.g., HR)
                         - The type of bill or resolution.
                         - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
                     - `<number>` (e.g., 5768)
                         - The assigned bill or resolution number.
                     - `<url>` (e.g., <https://api.congress.gov/v3/bill/117/hr/5768>)
                         - A referrer URL to the bill or resolution item in the API. Documentation for the bill endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).
     - `<text>`
         - Container for committee print text. A `<text>` element may include the following children:
             - `<count>` (e.g., 4)
                 - The number of text formats for the committee print.
             - `<url>` (e.g., <https://api.congress.gov/v3/committee-print/117/house/48144/text>)
                 - A referrer URL to the text level of the committee print API. Click [here](#text-level) for more information about the text level.

### Text Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<text>`

Parent container for the text formats of a committee print. A `<text>` element may include the following children:

- `<item>`
     - Container for a text format. An `<item>` element is repeatable and may include the following children: 
         - `<url>` (<https://www.congress.gov/117/cprt/HPRT48144/CPRT-117HPRT48144.pdf>)
             - The URL for the text format in Congress.gov.
         - `<type>` (e.g., PDF)
             - The format type for the text.
             - Possible values are "PDF", "Formatted Text", "Formatted XML", and "Generated HTML".
