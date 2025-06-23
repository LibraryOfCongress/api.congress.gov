# Nomination endpoints

## Coverage

Coverage information for nominations data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about nominations data at [About Nominations by the U.S. President](https://www.congress.gov/help/nominations) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the nomination API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/nomination/nomination_list).

## A Note on Partitioned Nominations

A presidential nomination (PN) with multiple nominees may be partitioned by the Senate if the nominees follow a different confirmation path. Partitions are identified with a suffix; for example, PN230-1 (114th Congress) and PN230-2 (114th Congress). Searching on a PN number in Congress.gov API, such as PN230, without a partition designation will retrieve all partitions of a partitioned nomination.

## Elements and Descriptions

The section below details available element names, their descriptions, and possible values.

### List Level

Note that nomination items at the list level can be filtered down by congress (e.g. 117) - <https://api.congress.gov/v3/nomination/117/?api_key>=.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<nominations>`

Parent container for nominations. A `<nominations>` element may include the following children:

- `<item>`
  - Container for a nomination. An `<item>` element is repeatable and may include the following children:
    - `<congress>` (e.g. 117)
      - The congress during which the nomination was received.
      - View the [field value list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<number>` (e.g. 1064)
      - The assigned nomination number.
      - Read more about nomination numbering at [About Nominations by the U.S. President](https://www.congress.gov/help/nominations) on Congress.gov.
    - `<partNumber>`
      - The part number for the nomination. Nominations with multiple nominees may be partitioned if the nominees follow different confirmation paths.
    - `<citation>` (e.g. PN1064)
      - The citation identifying the nomination. PN indicates "Presidential Nomination" and the digits that follow are the nomination's assigned number. If the nomination was partitioned, the citation will include a dash and the part number (e.g. PN78-4).
    - `<description>` (e.g. Lisette Nieves, of New York, to be a Member of the Board of Directors of the Corporation for National and Community Service for a term expiring October 6, 2027. (Reappointment))
      - The description of the nomination.
    - `<receivedDate>` (e.g. 2021-09-13)
      - The date the nomination was received from the President.
    - `<nominationType>`
      - Container for type data for the nomination. A `<nominationType>` element may include the following children:
        - `<isCivilian>` (e.g. True)
          - Flag indicating whether the nomination is for a civilian position.
          - Possible values are "True" or "False".
        - `<isMilitary>` (e.g. False)
          - Flag indicating whether the nomination is for a military nomination.
          - Possible values are "True" or "False".
    - `<latestAction>`
      - Container for the latest action taken on the nomination. A `<latestAction>` element may include the following children:
        - `<actionDate>` (e.g., 2022-07-21)
          - The date of the latest action taken on the nomination.
        - `<text>` (e.g., Confirmed by the Senate by Voice Vote.)
          - The text of the latest action taken on the nomination.
    - `<updateDate>` (e.g. 2022-07-22T04:24:15Z)
      - The date of update in Congress.gov.
    - `<url>` (e.g. <https://api.congress.gov/v3/nomination/117/1064>)
      - A referrer URL to the nomination item in the API.
    - `<organization>` (e.g., Corporation for National and Community Service)
      - The name of the organization for which the nomination was submitted.

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<nomination>`

Parent container for the nomination. A `<nomination>` element may contain the following children:

- `<congress>` (e.g. 117)
  - The congress during which the nomination was received.
  - View the [field value list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
- `<number>` (e.g. 1064)
  - The assigned nomination number.
  - Read more about nomination numbering at [About Nominations by the U.S. President](https://www.congress.gov/help/nominations) on Congress.gov.
- `<partNumber>`
  - The part number for the nomination. Nominations with multiple nominees may be partitioned if the nominees follow different confirmation paths.
- `<citation>` (e.g. PN1064)
  - The citation identifying the nomination. PN indicates "Presidential Nomination" and the digits that follow are the nomination's assigned number. If the nomination was partitioned, the citation will include a dash and the part number (e.g. PN78-4).
- `<isPrivileged>` (e.g. True)
  - Flag indicating whether the nomination is privileged and entitled to expedited procedures.
  - Possible values are "True" or "False".
  - Read more about privileged nominations at [About Nominations by the U.S. President](https://www.congress.gov/help/nominations) on Congress.gov.
- `<isList>` (e.g. False)
  - Flag indicating whether the nomination is for the Military, Foreign Service, National Oceanic and Atmospheric Administration (NOAA), or Public Health.
  - Possible values are "True" or "False".
- `<receivedDate>` (e.g., 2021-09-13)
  - The date the nomination was received from the President.
- `<description>` (e.g., Lisette Nieves, of New York, to be a Member of the Board of Directors of the Corporation for National and Community Service for a term expiring October 6, 2027. (Reappointment))
  - The description of the nomination.
- `<executiveCalendarNumber>`
  - Executive calendar number information for the nomination.
- `<authorityDate>` (e.g. 2022-07-21)
  - The date when the Senate granted authority to the Secretary of the Senate to receive nominations during periods of recess or adjournment.
- `<nominees>`
  - Container for nominee position data. A `<nominees>` element may include the following children:
    - `<item>`
      - Container for a nominee position. An `<item>` element is repeatable and may include the following children:
        - `<ordinal>` (e.g. 1)
          - Ordinal used for the display order of positions for a nomination.
        - `<introText>`
          - Introductory text for a nominee position.
        - `<organization>` (e.g. Corporation for National and Community Service)
          - The name of the organization for which the nomination was submitted.
        - `<positionTitle>` (e.g. Member of the Board of Directors of the Corporation for National and Community Service)
          - The title of the position for which the nominee has been nominated.
        - `<division>`
          - The name of the division within the organization for which the nominee has been nominated.
        - `<url>` (e.g. <https://api.congress.gov/v3/nomination/117/1064/1>)
          - A referrer URL to the nominee position level of the nomination API. Click [here](#nominees-level) for more information about the nominee position level.
          - Note that if there are nominees for multiple positions within a nomination, there will be multiple referrer URLs to those nominee position levels. The numbering for the referrer URLs will be sequential (e.g. 1, 2, etc.).
        - `<nomineeCount>` (e.g. 1)
          - The count of nominees for a position.
- `<committees>`
  - Container for committees or subcommittees with activity associated with the nomination. Read more [About Committees and Committee Materials](https://www.congress.gov/help/committee-materials) on Congress.gov.
    - `<count>`
      - The number of committees with activity associated with the nomination.
    - `<url>`
      - A referrer URL to the committees level of the nomination API. Click [here](#committees-level) for more information about the committees level.
- `<latestAction>`
  - Container for the latest action taken by the Senate or the President on the nomination. A `<latestAction>` element may include the following children:
    - `<actionDate>` (e.g. 2022-07-21)
      - The date of the latest action taken on the nomination.
    - `<text>` (e.g. Confirmed by the Senate by Voice Vote)
      - The text of the latest action taken on the nomination.
- `<nominationType>`
  - Container for type data for the nomination. A <nominationType> element may include the following children:
    - `<isCivilian>` (e.g. True)
       - Flag indicating whether the nomination is for a civilian position.
       - Possible values are "True" or "False".
    - `<isMilitary>` (e.g. False)
       - Flag indicating whether the nomination is for a military nomination.
       - Possible values are "True" or "False".
- `<actions>`
  - Container for actions on the nomination. An `<actions>` element may include the following children:
    - `<count>` (e.g. 6)
      - The number of actions on the nomination. The `<count>` may include actions from the Senate and the President.
    - `<url>` (e.g. <https://api.congress.gov/v3/nomination/117/1064/actions>)
      - A referrer URL to the actions level of the nomination API. Click [here](#actions-level) for more information about the actions level.
- `<hearings>`
  - Container for all printed hearings associated with the nomination. A `<hearings>` element may include the following children (the below data is from <https://api.congress.gov/v3/nomination/116/389>):
    - `<count>` (e.g. 1)
      - The number of printed hearings associated with the nomination.
    - `<url>` (e.g. <https://api.congress.gov/v3/nomination/116/389/hearings>)
      - A referrer URL to the printed hearings level of the nomination API. Click [here](#hearings-level) for more information about the printed hearings level.
- `<updateDate>` (e.g. 2022-07-22 04:25:15+00:00)
  - The date of update in Congress.gov.

### Nominees Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<nominees>`

Parent container for nominees associated with the nomination. A `<nominees>` element may include the following children:

- `<item>`
  - Container for a nominee associated with the nomination. An `<item>` element is repeatable and may include the following children:
    - `<ordinal>` (e.g. 1)
      - Ordinal used for the display order of nominees.
    - `<lastName>` (e.g. Nieves)
      - Last name of a nominee.
      - This element may be populated with a string (the letter 'D' followed by a sequence of numbers)  like 'D016128'. That string is an identification number used for classified nominees.
    - `<firstName>` (e.g. Lisette)
      - The first name of a nominee.
    - `<middleName>`
      - The middle name of a nominee.
    - `<prefix>`
      - The name prefix for a nominee. This may be a military title, like 'Col.'
    - `<suffix>`
      - The name suffix for a nominee. This may suffixes like 'Jr.'
    - `<state>` (e.g. NY)
      - The two-digit postal code abbreviation for the nominee.
    - `<effectiveDate>`
      - The date when the appointment will become effective.
    - `<predecessorName>`
      - The name of the person who previously held the position to which the nominee has been nominated.
    - `<corpsCode>`
      - The corps code assigned by the White House to identify Corps.

### Committees Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<committees>`

Parent container for committees with activity associated with the nomination. A list of committees with an association to data on Congress.gov is available at the [Committee Name History](https://www.congress.gov/help/committee-name-history) page on Congress.gov. A list of current committees is available at [Committees of the U.S. Congress](https://www.congress.gov/committees) on Congress.gov. A `<committees>` element may include the following children:

- `<item>`
  - Container for a committee with activity associated with the nomination. An `<item>` element is repeatable and may include the following children (the below data is from <https://api.congress.gov/v3/nomination/117/1520/committees>):
    - `<url>` (e.g. <https://api.congress.gov/v3/committee/house/sscm00>)
      - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
    - `<systemCode>` (e.g. sscm00)
      - Unique ID value for the committee.
    - `<name>` (e.g. Commerce, Science, and Transportation Committee)
      - The name of the committee.
    - `<chamber>` (e.g. Senate)
      - The chamber where the committee operates. This value will always be set to "Senate".
    - `<type>` (e.g. Standing)
      - The type or status of the committee.
      - Possible values are "Standing", "Select", and "Other".
    - `<subcommittees>`
      - Container for subcommittees with activity associated with the nomination.
    - `<activities>`
      - Container for committee or subcommittee activities associated with the nomination. An `<activities>` element may include the following children:
        - `<item>`
          - Container for a committee or subcommittee activity. An `<item>` element is repeatable and may include the following children:
            - `<name>`
              - The name of the committee or subcommittee activity.
              - Possible values are "Referred to", "Discharged from", "Re-Referred to", "Re-Committed to", and "Reported by".
            - `<date>` (e.g. 2022-01-20T103:53:52Z)
              - The date of the committee or subcommittee activity.

### Actions Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<actions>`

Parent container for all actions taken on the nomination. Actions may come from the Senate or the President. An `<actions>` element may include the following children:

- `<item>`
  - Container for an action taken on the nomination. An `<item>` element is repeatable and may include the following children:
    - `<actionDate>`(e.g. 2022-07-21)
      - The date of action taken on the nomination.
    - `<text>` (e.g. Confirmed by the Senate by Voice Vote.)
      - The text of the action taken on the nomination.
    - `<type>` (e.g. Floor)
      - A short name representing stages or categories of more detailed actions. Most types condense actions into sets. Some types are used for data processing and do not represent Senate processes.
      - Possible values are "IntroReferral", "Committee", "Calendars", and "Floor".
    - `<actionCode>` (e.g. S05310)
      - A Senate-provided code associated with the action taken on the nomination.
    - `<committees>`
      - Container for committees associated with the action. A `<committees>` element may include the following children:
        - `<item>`
          - Container for a committee associated with the action. An `<item>` element is repeatable and may include the following children:
            - `<url>`
              - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
            - `<systemCode>`
              - Unique ID value for the committee.
            - `<name>`
              - The name of committee.

### Hearings Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<hearings>`

Parent container for printed hearings associated with the nomination. A `<hearings>` element may include the following children (the below data is from <https://api.congress.gov/v3/nomination/116/389/hearings>):

- `<item>`
  - Container for a printed hearing on the nomination. An `<item>` element is repeatable and may include the following children:
    - `<chamber>` (e.g. Senate)
      - The chamber where the hearing associated with the nomination took place. This value will always be set to "Senate".
    - `<number>` (e.g. 38)
      - The number for the printed hearing.
    - `<partNumber>`
      - The part number for the hearing, if printed in parts.
    - `<citation>` (e.g. S.Hrg. 116-38)
      - The printed hearing citation.
    - `<jacketNumber>` (e.g. 37106)
      - The jacket number, as present on the paper and PDF formats of the printed hearing.
    - `<errataNumber>`
      - If errata, the printed hearing's errata number.
      - Read more [about errata](https://www.congress.gov/help/legislative-glossary#glossary_errata) on Congress.gov.
    - `<date>` (e.g. 2019-06-05)
      - The date when the hearing took place.
