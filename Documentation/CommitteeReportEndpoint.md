# Committee Report endpoints

## Coverage

Coverage information for committee reports data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about committee reports data at [About Committee Reports of the U.S. Congress](https://www.congress.gov/help/committee-reports) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the committee report API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/committee-report/committee_reports).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that committee report items at the list level can be filtered down by congress (e.g. 117) and by report type (e.g. hrpt) – <https://api.congress.gov/v3/committee-report/117/hrpt?api_key>=.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<reports>`

 Parent container for committee reports. A `<reports>` element may include the following children:

- `<item>`
  - Container for an individual committee report. An `<item>` element is repeatable and may include the following children:
    - `<citation>` (e.g., H. Rept. 117-351)
      - The report's citation, which consists of the report type, congress number, and the assigned report number.
    - `<url>` (e.g., <https://api.congress.gov/v3/committee-report/117/HRPT/351>)
      - A referrer URL to the report item in the API.
    - `<updateDate>` (e.g., 2022-08-13 19:26:27+00:00)
      - The date of update in Congress.gov
    - `<congress>` (e.g., 117)
      - The congress during which the committee report was produced.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<chamber>` (e.g., House)
      - The chamber where the committee report was produced.
      - Possible values are "House" and "Senate".
    - `<type>` (e.g., HRPT)
      - The type of report.
      - Possible values are "HRPT", "SRPT", and "ERPT".
    - `<number>` (e.g., 351)
      - The assigned committee report number.
    - `<part>` (e.g., 1)
      - The part number of the report.
      - Committee reports without parts will have a value of 1. If there are multiple parts, the number value may be 2, 3, etc.

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<committeeReports>`

Parent container for multiple committee report parts within a single report. A `<committeeReports>` element may include the following children:

- `<committeeReport>`
  - Container for a single report or report part. A `<committeeReport>` element may include the following children:
    - `<committees>`
      - Container for the committees associated with a report. A `<committees>` element may include the following children, which are repeatable:
        - `<item>`
          - Container for an individual committee associated with a report. An `<item>` element is repeatable and may include the following children:
        - `<url>` (e.g., <https://api.congress.gov/v3/committee/house/hsba00>)
          - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
        - `<systemCode>` (e.g., hsba00)
          - Unique ID value for the committee.
        - `<name>` Financial Services Committee
          - The name of the committee.
    - `<congress>` (e.g., 117)
      - The congress during which the committee report was produced.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<chamber>` (e.g., House)
      - The chamber where the committee report was produced.
      - Possible values are "House" and "Senate".
    - `<sessionNumber>` (e.g., 2)
      - The session of congress during which the report was produced.
      - Possible values are "1" and "2".
    - `<citation>` (e.g., H. Rept. 117-351)
      - The report's citation, which consists of the report type, congress number, and the assigned report number.
    - `<number>` (e.g., 351)
      - The assigned committee report number.
    - `<part>` (e.g., 1)
      - The part number of the report.
      - Committee reports without parts will have a value of 1. If there are multiple parts, the number value may be 2, 3, etc.
    - `<type>` (e.g., HRPT)
      - The type of report.
      - Possible values are "HRPT", "SRPT", and "ERPT".  
    - `<updateDate>` (e.g., 2022-06-21T23:26:16Z)
      - The date of update in Congress.gov.
    - `<isConferenceReport>` (e.g., False)
      - Flag indicating whether the report is a conference report.
      - Possible values are "True" or "False".
    - `<title>` (e.g., EXPANDING FINANCIAL ACCESS FOR UNDERSERVED COMMUNITIES ACT)
      - The title of the committee report.
    - `<issueDate>` (e.g., 2022-06-07T04:00:00Z)
      - The date the report was issued.
    - `<reportType>` (e.g., H.Rept.)
      - The type of report.
      - Possible values are "S.Rept", "H.Rept", and "Ex.Rept".
    - `<text>`
      - Container for committee report text. A `<text>` element may include the following children:
        - `<count>` (e.g., 2)
          - The number of text formats for the committee report.
        - `<url>` (e.g., <https://api.congress.gov/v3/committee-report/117/hrpt/351/text>)
          - A referrer URL to the text level of the committee report API. Click [here](#text-level) for more information about the text level.
  - `<associatedTreaties>`
    - Container for associated treaties to the executive report. An `<associatedTreaties>` element may include the following children (the below data is taken from <https://api.congress.gov/v3/committee-report/117/erpt/5?api_key>=):
      - `<item>`
        - Container for an associated treaty. An `<item>` element is repeatable and may include the following children:
          - `<congress>` (e.g., 117)
            - The congress during which the treaty was submitted.
            - Unlike bills and resolutions, treaties remain active in a congress until they are ratified or returned to the President.
          - `<number>` (e.g., 3)
            - The assigned treaty number.
          - `<part>`
            - The treaty part, if the treaty was partitioned.
            - Possible values include "A", "B", "C", etc.
          - `<url>` (e.g., <https://api.congress.gov/v3/treaty/117/3>)
            - A referrer URL to the treaty item on the API.
            - Documentation for the treaty endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/TreatyEndpoint.md).
  - `<associatedBill>`
    - Container for associated bills to the committee report. An `<associatedBill>` element may include the following children:
      - `<item>`
        - Container for an associated bill. An `<item>` element is repeatable and may include the following children:
          - `<congress>` (e.g., 117)
            - The congress during which a bill or resolution was introduced or submitted.
          - `<type>` (e.g., HR)
            - The type of bill or resolution.
            - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
          - `<number>` (e.g., 7003)
            - The assigned bill or resolution number.
          - `<url>` (e.g., <https://api.congress.gov/v3/bill/117/hr/7003>)
            - A referrer URL to the bill or resolution item in the API. Documentation for the bill endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).

### Text Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<textVersions>`

Parent container for the text versions of a committee report. A `<textVersion>` element may include the following children, which are repeatable:

- `<item>`
  - Container for a text version of the report. An `<item>` element is repeatable and may include the following children:
    - `<formats>`
      - Container for a text format for the committee report. A `<formats>` element may include the following children:
        - `<item>`
          - Container for a report version. An `<item>` element is repeatable and may include the following children:
            - `<url>` (e.g., <https://www.congress.gov/117/crpt/hrpt351/generated/CRPT-117hrpt351.htm>)
              - The URL for the text version format for the committee report.
              - Work is scheduled to make the URL absolute, instead of relative.
            - `<type>` (e.g., Formatted Text)
              - The format type for the committee report text.
              - Possible values are "Formatted Text" and "PDF".
            - `<isErrata>` (e.g., N)
              - Flag indicating whether the text is errata or not.
              - Possible values are "Y" or "N".
