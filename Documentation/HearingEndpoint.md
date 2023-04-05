# Hearing endpoints

## Coverage 

Coverage information for hearing data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about hearing data at [About Committees and Committee Materials](https://www.congress.gov/help/committee-materials#committee-hearings) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the committee print API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/hearing/hearing_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that hearing items at the list level can be filtered by congress (e.g., 116) and by chamber (e.g., house) - <https://api.congress.gov/v3/hearing/116/house?api_key=>.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<hearings>`

Container for hearings. A `<hearings>` container may include the following children:

- `<item>`
     - Container for an individual hearing. An `<item>` element is repeatable and may include the following children:
         - `<jacketNumber>` (e.g., 37721)
             - The jacket identifier of the hearing. The `<jacketNumber>` is printed on the front page of a hearing and is usually five digits.
         - `<updateDate>` (e.g., 2022-06-30 03:50:22+00:00)
             - The date of update in Congress.gov.
         - `<chamber>` (e.g., Senate)
             - The chamber where the hearing was held. 
             - Possible values are "House", "Senate", and "NoChamber".
         - `<congress>` (e.g., 116)
             - The congress during which the hearing was held.
             - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
         - `<number>` (e.g., 64)
             - The hearing number. 
             - Hearings may or may not be numbered by their associated committee.
         - `<part>`
             - The hearing's part number, if printed in parts.
         - `<url>` (e.g., <https://api.congress.gov/v3/hearing/116/senate/37721>)
             - A referrer URL to the hearing item in the API.

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<hearing>`

Parent container for a single hearing. A `<hearing>` element may include the following children:

- `<jacketNumber>` (e.g., 37721)
     - The jacket identifier of the hearing. The `<jacketNumber>` is printed on the front page of a hearing and is usually five digits.
- `<libraryOfCongressIdentifier>` (e.g., LC64252)
     - The Library of Congress identifier for a hearing. While unlikely, this number may change.
- `<number>` (e.g., 64)
     - The hearing number. 
     - Hearings may or may not be numbered by their associated committee.
- `<part>`
     - The hearing part number, if printed in parts.
- `<updateDate>` (e.g., 2022-06-30 03:50:22+00:00)
     - The date of update in Congress.gov.
- `<congress>` (e.g., 116)
     - The congress during which the hearing was held.
     - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
- `<title>` (e.g., OUTSIDE PERSPECTIVES ON THE COLLECTION OF BENEFICIAL OWNERSHIP INFORMATION)
     - The title of the hearing.
- `<citation>` (e.g., S.Hrg.116-64)
     - The hearing's citation.
     - Hearings may or may not be numbered by their associated committee.
- `<chamber>` (e.g., Senate)
     - The chamber where the hearing was held. 
     - Possible values are "House", "Senate", and "NoChamber".
- `<committees>`
     - Container for the committees that held the hearing. A `<committees>` element may include the following children:
         - `<item>`
             - Container for an individual committee that held the hearing. An `<item>` element is repeatable and may include the following children:
                 - `<name>` (e.g., Senate Banking, Housing, and Urban Affairs Committee)
                     - The name of the committee.
                 - `<systemCode>` (e.g., ssbk00)
                     - Unique ID value for the committee.
                 - `<url>` (e.g., https://api.congress.gov/v3/committee/senate/ssbk00)
                     - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
- `<dates>`
     - Container for dates when the hearing was held. A `<dates>` element may include the following children:
         - `<item>`
             - Container for an individual date when the hearing was held. An `<item>` element is repeatable and may include the following children:
                 - `<date>` (e.g., 2019-06-20)
                     - A date when the hearing was held.
- `<formats>`
     - Container for the hearing transcript text formats. A `<formats>` element may include the following children:
         - `<item>`
             - Container for an individual hearing transcript text format. An `<item>` element is repeatable and may include the following children.
                 - `<type>` (e.g., PDF)
                     - The format type for the hearing transcript text.
                     - Possible values are "PDF" and "Formatted Text".
                 - `<url>` (e.g., <https://congress.gov/116/chrg/CHRG-116shrg37721/CHRG-116shrg37721.pdf>)
                     - The URL for the hearing transcript text in Congress.gov.
