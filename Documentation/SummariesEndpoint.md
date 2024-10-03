# Summaries endpoints

## Coverage

Coverage information for bill summaries data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). By default, only bill summaries published in the last day are available from this endpoint unless "fromDateTime" and/or "toDateTime" parameters are added to the API request (read more about those parameters in the OpenAPI Specification, linked below; however, all bill summaries published for bills available on Congress.gov can be found at the [bill endpoint](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md#summaries-level).

## OpenAPI Specification

View OpenAPI Specification on the summaries API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/summaries/bill_summaries_all).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that bill summary items at the list level can be filtered down by congress (e.g., 117) and by bill type (e.g., hr) - <https://api.congress.gov/v3/summaries/117/hr?api_key>=.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<summaries>`

 Parent container for bill summaries. A `<summaries>` element may include the following children:

- `<summary>`
  - Container for an individual bill summary. A `<summary>` element is repeatable and may include the following children:
    - `<bill>`
      - Container for the associated bill to the summary. A `<bill>` element may include the following children:
        - `<congress>` (e.g., 117)
          - The congress during which a bill or resolution was introduced or submitted.
          - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
        - `<type>` (e.g., HR)
          - The type of bill or resolution.
          - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
        - `<originChamber>` (e.g., House)
          - The chamber of origin where a bill or resolution was introduced or submitted.
          - Possible values are "House" and "Senate".
        - `<originChamberCode>` (e.g., H)
          - The code for the chamber of origin where the bill or resolution was introduced or submitted.
          - Possible values are "H" and "S".
        - `<number>` (e.g., 8432)
          - The assigned bill or resolution number.
        - `<url>` (e.g., <https://api.congress.gov/v3/bill/117/hr/8432>)
          - A referrer URL to the bill or resolution item in the API. Documentation for the bill endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).
        - `<title>` (e.g., Beagle Brigade Act of 2022)
          - The display title for the bill or resolution on Congress.gov.
        - `<updateDateIncludingText>` (e.g., 2022-09-29T07:15:39Z)
          - The date of update for the bill on Congres.gov, which includes updates to the bill's text.
    - `<text>` (e.g., `<![CDATA[ <p><strong>Beagle Brigade Act of 2022</strong></p> <p>This bill provides statutory authority for the National Detector Dog Training Center that is operated by the Animal and Plant Health Inspection Service of the Department of Agriculture. The center trains dogs to inspect passenger baggage, cargo, mailed packages, and vehicles to detect foreign pests and diseases that threaten domestic agriculture and natural resources.</p> ]]>`>
      - The text of the bill summary.
      - Note that the bill summary text is encased in CDATA and contains HTML codes. The HTML codes may not be valid (see [#2](https://github.com/LibraryOfCongress/api.congress.gov/issues/2)); efforts are underway to improve the validity of the HTML codes.
    - `<actionDate>` (e.g., 2022-05-16)
      - The date of the action associated with the bill summary.
    - `<updateDate>` (e.g., 2022-08-18T17:00:44Z)
      - The date of update on Congress.gov.
    - `<currentChamber>` (e.g., House)
      - The chamber that took the action associated with the bill summary.
      - Possible values are "House" and "Senate".
    - `<currentChamberCode>` (e.g., H)
      - The code for the chamber that took the action associated with the bill summary.
      - Possible values are "H" and "S".
    - `<actionDesc>` (e.g., Introduced in House)
      - The description of the action associated with the bill summary.
    - `<versionCode>` (e.g., 00)
      - The internal code used by CRS to tag its bill summaries according to the action associated with the bill summary.
      - Click [here](#bill-summary-version-codes-action-descriptions-and-chamber) for a list of codes. Note that the version codes used have varied over time.  
    - `<lastSummaryUpdateDate>` (e.g., 2022-08-18T16:46:01Z)
      - The date the bill summary was last updated. This date also reflects the date and time when a bill summary is re-published.

#### Bill summary version codes, action descriptions, and chamber

| versionCode | actionDesc | chamber |
| ----------- | ---------- | ------- |
| 00 | Introduced in House | House |
| 00 | Introduced in Senate | Senate |
| 01 | Reported to Senate with amendment(s) | Senate |
| 02 | Reported to Senate amended, 1st committee reporting | Senate |
| 03 | Reported to Senate amended, 2nd committee reporting | Senate |
| 04 | Reported to Senate amended, 3rd committee reporting | Senate |
| 07 | Reported to House | House |
| 08 | Reported to House, Part I | House |
| 09 | Reported to House, Part II | House |
| 12 | Reported to Senate without amendment, 1st committee reporting | Senate |
| 13 | Reported to Senate without amendment, 2nd committee reporting | Senate |
| 17 | Reported to House with amendment(s) | House |
| 18 | Reported to House amended, Part I | House |
| 19 | Reported to House amended Part II | House |
| 20 | Reported to House amended, Part III | House |
| 21 | Reported to House amended, Part IV | House |
| 22 | Reported to House amended, Part V | House |
| 25 | Reported to Senate | Senate |
| 28 | Reported to House without amendment, Part I | House |
| 29 | Reported to House without amendment, Part II | House |
| 31 | Reported to House without amendment, Part IV | House |
| 33 | Laid on table in House | House |
| 34 | Indefinitely postponed in Senate | Senate |
| 35 | Passed Senate amended | Senate |
| 36 | Passed House amended | House |
| 37 | Failed of passage in Senate | Senate |
| 38 | Failed of passage in House | House |
| 39 | Senate agreed to House amendment with amendment | Senate |
| 40 | House agreed to Senate amendment with amendment | House |
| 43 | Senate disagreed to House amendment | Senate |
| 44 | House disagreed to Senate amendment | House |
| 45 | Senate receded and concurred with amendment | Senate |
| 46 | House receded and concurred with amendment | House |
| 47 | Conference report filed in Senate | Senate |
| 48 | Conference report filed in House | House |
| 49 | Public Law | |
| 51 | Line item veto by President | |
| 52 | Passed Senate amended, 2nd occurrence | Senate |
| 53 | Passed House | House |
| 54 | Passed House, 2nd occurrence | House |
| 55 | Passed Senate | Senate |
| 56 | Senate vitiated passage of bill after amendment | Senate |
| 58 | Motion to recommit bill as amended by Senate | Senate |
| 59 | House agreed to Senate amendment | House |
| 60 | Senate agreed to House amendment with amendment, 2nd occurrence | Senate |
| 62 | House agreed to Senate amendment with amendment, 2nd occurrence | House |
| 66 | House receded and concurred with amendment, 2nd occurrence | House |
| 70 | House agreed to Senate amendment without amendment | House |
| 71 | Senate agreed to House amendment without amendment | Senate |
| 74 | Senate agreed to House amendment | Senate |
| 77 | Discharged from House committee | House |
| 78 | Discharged from Senate committee | Senate |
| 79 | Reported to House without amendment | House |
| 80 | Reported to Senate without amendment | Senate |
| 81 | Passed House without amendment | House |
| 82 | Passed Senate without amendment | Senate |
| 83 | Conference report filed in Senate, 2nd conference report | Senate |
| 86 | Conference report filed in House, 2nd conference report | House |
| 87 | Conference report filed in House, 3rd conference report | House |
