# Bill endpoint
## Coverage
Coverage information for bill data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Projects to add more historical legislative data to Congress.gov are underway. Read more about bill data at [About Legislation of the U.S. Congress](https://www.congress.gov/help/legislation) on Congress.gov.
## Elements and Descriptions
The section below provides available element names, their description, and possible values.
### List Level
*Note that bill items at the list level can be filtered down by congress (e.g. 117) and by bill type (e.g. HR) - **api.data.gov/congress/v3/bill/117/hr?api_key**.*

`<api-root>`

The `<api-root>` is only present in the XML format.

`<bills>`

Parent container for bills and resolutions. A `<bills>` element may include the following children:
- `<bill>`
  - Parent container for a bill or resolution. A `<bill>` element may include the following children:
  - `<congress>` (e.g. 117)
    - The congress during which a bill or resolution was introduced or submitted.
    - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
  - `<type>` (e.g. HR)
    - The type of bill or resolution. 
    - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
  - `<originChamber>` (e.g. House)
    - The chamber of origin where a bill or resolution was introduced or submitted.
    - Possible values are "House" and "Senate".
  - `<originChamberCode>` (e.g. H)
    - The code for the chamber of origin where the bill or resolution was introduced or submitted. 
    - Possible values are "H" and "S".
  - `<number>` (e.g. 3076)
    - The assigned bill or resolution number.
  - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076**)
    - The referrer URL to the bill or resolution item in the API.
  - `<title>` (e.g. Postal Service Reform Act of 2022)
    - The display title for the bill or resolution.
  - `<latestAction>`
    - Parent container for the latest action taken on the bill or resolution. The `<latestAction>` may include the following children:
      - `<actionDate>` (e.g. 2022-04-06)
        - The date of the latest action taken on the bill or resolution.
      - `<text>` (e.g. Became Public Law No: 117-108.)
        - The text of the latest action taken on the bill or resolution.
      - `<actionTime>`
        - The time of the latest action taken on the bill or resolution. Certain actions taken by the House contain this element.
  - `<updateDate>` (e.g. 2022-05-05)
    - The date of update in Congress.gov. This date has no legislative significance. 
### Item Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<bill>`

Parent container for a bill or resolution. A `<bill>` may include the following children:
- `<number>` (e.g. 3076)
  - The assigned bill or resolution number.
- `<updateDate>` (e.g. 2022-05-05)
  - The date of update in Congress.gov. This date has no legislative significance. 
- `<originChamber>` (e.g. House)
  - The chamber of origin where a bill or resolution was introduced or submitted.
  - Possible values are "House" and "Senate".
- `<type>` (e.g. HR)
  - The type of bill or resolution. 
  - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
- `<introducedDate>`(e.g. 2021-05-11)
  - The date the bill or resolution was submitted or introduced.
- `<congress>` (e.g. 117)
  - The congress during which a bill or resolution was introduced or submitted.
  - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
- `<constitutionalAuthorityStatementText>`
  - Text extracted from the Congressional Record to accompany House Bills (HR) and House Joint Resolutions (HJRES) that cites the power granted to Congress by the Constitution to enact the proposed law, as required by Clause 7 of House Rule XII. Read more about constitutional authority statements on the [House Rules Committee website](https://rules.house.gov/rules-and-resources/constitutional-authority-statements).
  - Note that the text is encased in CDATA.
- `<committees>` 
  - Parent container for committees or subcommittees with activity associated with the bill or resolution. Read more [About Committees and Committee Materials](https://www.congress.gov/help/committee-materials) on Congress.gov. 
  - The committees element may include the following children:
    - `<count>` (e.g. 3)
      - The number of committees with activity associated with the bill or resolution.
    -  `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/committees**)
       - A referrer URL to the committees level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#committees-level) for more information about the committees level. 
- `<committeeReports>`
  - Parent container for committee reports associated with the bill or resolution. Read more [About Committee Reports of the U.S. Congress](https://www.congress.gov/help/committee-reports) on Congress.gov. 
  - Note that the `<committeeReports>` container will be empty unless a bill or resolution has an associated committee report on Congress.gov.
  - The committeeReports element may include the following children:
    - `<committeeReport>`
      - Parent container for an individual committee report related to the bill or resolution. The `<committeeReport>` element may include the following children:
        - `<citation>` (e.g. H. Rept. 117-89,Part 1)
          - The committee report citation.
        - `<url>` (e.g. **api.data.gov/congress/v3/committeeReport/117/HRPT/89**)
          - A referrer URL to the committee report item in the API. Documentation for the committee report endpoint is in progress.
- `<relatedBills>`
  - Parent container for related bills to the bill or resolution, as assigned by CRS, the House, and the Senate. Read [About Related Bills](https://www.congress.gov/help/related-bills) on Congress.gov. 
  - The `<relatedBills>` element may include the following children:
    - `<count>` (e.g. 2)
      - The number of related bills assigned to the bill or resolution.
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/relatedbills**)
      - A referrer URL to the related bills level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#related-bills-level) for more information about the related bills level.
- `<actions>` 
  - Parent container for actions on the bill or resolution. The `<actions>` element may include the following children:
    - `<count>` (e.g. 30)
      - The number of actions on the bill or resolution. The `<count>` includes actions from the House, Senate, and Library of Congress.
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/actions**)
      - A referrer URL to the actions level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#actions-level) for more information about the actions level. 
- `<sponsors>`
  - Parent container for the sponsor of the bill or resolution. A `<sponsors>` element may include the following children:
    - `<item>`
      - Parent container for a single sponsor of the bill or resolution. The `<item>` element may include the following children:
        - `<bioguideId>` (e.g. M000087)
          - The unique identifier for the bill or resolution sponsor, as assigned in the [Biographical Directory of the United States Congress, 1774-Present](http://bioguide.congress.gov/).
          - View a [field values list of Bioguide identifiers](https://www.congress.gov/help/field-values/member-bioguide-ids) for current and former members in Congress.gov. 
        - `<fullName>` (e.g. Rep. Maloney, Carolyn B. [D-NY-12])
          - The display name of the bill or resolution sponsor. 
        - `<firstName>` (e.g. Carolyn)
          - The first name of the bill or resolution sponsor.
        - `<middleName>` (e.g. B.)
          - The middle name of the bill or resolution sponsor.
          - Note that this element may be empty.
        - `<lastName>` (e.g. Maloney)
          - The last name of the bill or resolution sponsor. 
        - `<party>` (e.g. D)
          - The party code of the bill or resolution sponsor.
        - `<state>` (e.g. NY)
          - A two-letter abbreviation for the state, territory, or district represented by the bill or resolution sponsor.
        - `<url>` (e.g. **api.data.gov/congress/v3/member/M000087**)
          - A referrer URL to the member item in the API. Documentation for the member endpoint is in progress.
        - `<district>` (e.g. 12)
          - The congressional district that the bill or resolution sponsor represents.
          - Note that this element will be empty for Senate sponsors and will be "0" for states, territories, or districts where there is only one congressional district.
- `<cosponsors>`
  - Parent container for any cosponsors of the bill or resolution. The `<cosponsors>` element may include the following children:
    - `<countIncludingWithdrawnCosponsors>` (e.g. 31)
      - The total number of cosponsors of the bill or resolution, including any withdrawn cosponsors.
    - `<count>` (e.g. 30)
      - The current number of cosponsors of the bill or resolution, not including any withdrawn cosponsors. 
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/s/3580/cosponsors**)
      - A referrer URL to the cosponsors level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#cosponsors-level) for more information about the cosponsors level.
- `<cboCostEstimates>`
  - Parent container for Congressional Budget Office (CBO) cost estimates associated with a bill or resolution. Read [about CBO](https://www.congress.gov/help/legislative-glossary#glossary_cbo) on Congress.gov.
  - The `<cboCostEstimates>` element may include the following children:
    - `<item`
      - Parent container for a CBO cost estimate. The `<item>` element may include the following children:
        - `<pubDate>` (e.g. 2021-07-14T17:27:00Z)
          - The date the CBO cost estimate was published.
        - `<title>` (e.g. H.R. 3076, Postal Service Reform Act of 2021)
          - The title of the CBO cost estimate.
        - `<url>` (e.g. https://www.cbo.gov/publication/57356)
          - The URL for the CBO cost estimate on https://www.cbo.gov/.
- `<laws>`
  - Parent container for public or private law data for the bill or joint resolution. The `<laws>` element may include the following children:
    - `<type>` (e.g. Public Law)
      - The type of law.
      - Possible values are "Public Law" or "Private Law".
    - `<number>` (e.g. 117-108)
      - The law number, as assigned by the National Archives and Records Administration (NARA).
-  `<notes>`
    - Parent container for notes attached to the bill or resolution on Congress.gov. The note may contain supplemental information about the bill or resolution that users may find helpful. Read more [about notes](https://www.congress.gov/help/legislative-glossary#glossary_notes) on Congress.gov. 
    - The `<notes>` element may include the following children:
      - `<item>`
        - Parent container for a note. The `<item>` element may include the following children:
          - `<text>` (e.g. `<![CDATA[ <a href="https://rules.house.gov/sites/democrats.rules.house.gov/files/BILLS-117HR2471SA-RCP-117-35.pdf" target="_blank">The House Rules Committee Print</a>, <a href="https://docs.house.gov/floor/Default.aspx?date=2022-03-07" target="_blank">joint explanatory statements</a>, and <a href="https://www.congress.gov/congressional-report/117th-congress/house-report/269/1" target="_blank">H.Rept. 117-269</a> from the House Rules Committee are available. ]]>`)
            - The text of the note on Congress.gov (from **api.data.gov/congress/v3/117/hr/2471**)
            - Note that the text is encased in CDATA.
- `<policyArea>`
  - Parent container for the policy area term of the bill or resolution. Every bill and resolution is assigned one policy area term out of a list of 32; view a [field values list of policy area terms](https://www.congress.gov/help/field-values/policy-area) on Congress.gov. Read more [about policy area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) on Congress.gov. 
  - The `<policyArea>` element may include the following children:
    - `<name>` (e.g. Government Operations and Politics)
      - The policy area term assigned to the bill or resolution by CRS.
- `<subjects>`
  - Parent container for legislative subject terms assigned to the bill or resolution by CRS. Read more about [legislative subject terms](https://www.congress.gov/help/find-bills-by-subject) on Congress.gov. 
  - The `<subjects>` element may include the following children:
    - `<count>` (e.g. 17)
      - The number of legislative subject terms assigned to the bill or resolution by CRS.
    -  `<url>` (e.g. **api.data.gov/congress/v3/bill/hr/3076/subjects**)
        - A referrer URL to the subjects level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#subjects-level) for more information about the subjects level.
- `<summaries>`
  - Parent container for bill summaries, written by CRS legislative analysts, on the bill or resolution. Read more [about bill summaries](https://www.congress.gov/help/legislative-glossary#glossary_billsummary) on Congress.gov.
  - The `<summaries>` element may include the following children:
    - `<count>` (e.g. 5)
      - The number of bill summaries on the bill or resolution. 
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/summaries**)
      - A referrer URL to the summaries level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#summaries-level) for more information about the summaries level. 
- `<title>` (e.g. Postal Service Reform Act of 2022)
  - The display title for the bill or resolution on Congress.gov. This title may be a short title or an official title. 
  - Read more about [short titles](https://www.congress.gov/help/legislative-glossary#glossary_shorttitle) and [official titles](https://www.congress.gov/help/legislative-glossary#glossary_officialtitle) on Congress.gov.
- `<titles>`
  - Parent container for titles associated with the bill or resolution. The `<titles>` element may include the following children:
    - `<count>` (e.g. 13)
      - The number of titles associated with the bill or resolution. This number may include measure short titles, level short titles, and official titles from the House, Senate, and the Government Publishing Office (GPO).
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/titles**)
      - A referrer URL to the titles level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#titles-level) for more information about the titles level.
- `<amendments>`
  - Parent container for amendments to the bill or resolution. Read more [about amendments](https://www.congress.gov/help/legislative-glossary#glossary_amendment) on Congress.gov. 
  - The `<amendments>` element may include the following children:
    - `<count>` (e.g. 48)
      - The number of amendments to the bill or resolution.
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/amendments**)
      - A referrer URL to the amendments level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#amendments-level) for more information about the amendments level.
- `<textVersions>`
  - Parent container for text of the bill or resolution. Read more [About Legislation Text](https://www.congress.gov/help/legislation-text) on Congress.gov. 
  - The `<textVersions>` element may include the following children:
    - `<count>` (e.g. 7)
      - The number of texts for the bill or resolution.
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/text**)
      - A referrer URL to the text level of the bill API. Click [here](/ExpandedBillEndpointDocumentation.md/#text-level) for more information about the text level.
-  `<latestAction>` 
    - Parent container for the latest action taken by the House, Senate, or the President on the bill or resolution. The `<latestAction>` element may include the following children:
      - `<actionDate>` (e.g. 2022-04-06)
        - The date of the latest action taken on the bill or resolution.
      - `<text>` (e.g. Became Public Law No: 117-108.)
        - The text of the latest action taken on the bill or resolution.
      - `<actionTime>`
        - The time of the latest action taken on the bill or resolution. Certain actions taken by the House contain this element.
#### Committees Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<committees>`

Parent container for committees associated with the bill or resolution. A list of committees with an association to data on Congress.gov is available at the [Committee Name History](https://www.congress.gov/help/committee-name-history) page on Congress.gov. A list of current committees is available at [Committees of the U.S. Congress](https://www.congress.gov/committees) on Congress.gov. A `<committees>` element may include the following children:
- `<item>`
  - Parent container for a committee associated with the bill or resolution. An `<item>` element may include the following children:
    - `<url>` (e.g. **api.data.gov/congress/v3/committee/house/hsif00**)
      - A referrer URL to the committee or subcommittee item in the committee API. Documentation for the committee endpoint is in progress.
    - `<systemCode>` (e.g. hsif00)
      - A code associated with the committee or subcommittee used to match items in Congress.gov with the committee or subcommittee.
    - `<name>` (e.g. Energy and Commerce Committee)
      - The name of the committee or subcommittee associated with the bill or resolution. 
    - `<chamber>` (e.g. House)
      - The chamber where the committee or subcommittee operates. 
      - Possible values are "House", "Senate", or "Joint".
    - `<type>` (e.g. Standing)
      - The type or status of the committee or subcommittee.
      - Possible values are "Standing", "Select", "Special", "Joint", "Task Force", "Other", "Subcommittee", or "Commission or Caucus".
    - `<subcommittees>`
      - Parent container for subcommittees associated with the bill or resolution.
    - `<activities>`
      - Parent container for committee or subcommittee activities on a bill or resolution. Read more [about committee-related activity](https://www.congress.gov/help/legislative-glossary#glossary_committeerelatedactivity) on Congress.gov. 
      - The `<activities>` element may include the following children:
        - `<item>`
          - Parent container for a committee or subcommittee activity on a bill or resolution. The `<item>` element may include the following children:
            - `<name>` (e.g. Referred to)
              - The name of the committee or subcommittee activity.
              - Possible values are "Referred to", "Re-Referred to", "Hearings by", "Markup by", "Reported by", "Reported original measure", "Committed to", "Re-Committed to", and "Legislative Interest". 
            - `<date>` (e.g. 2021-05-11T18:05:45Z)
              - The date of the committee or subcommittee activity.
#### Related Bills Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<relatedBills>`

Parent container for related bills added by the House, Senate, and CRS. Read more [About Related Bills](https://www.congress.gov/help/related-bills) on Congress.gov. A `<relatedBills>` element may include the following children:
- `<item>`
  - Parent container for a related bill to the bill or resolution. An `<item>` element may include the following children:
    - `<url>` (e.g. **api.data.gov/congress/v3/bill/117/s/1720**)
      - A referrer URL to the bill item in the API.
    - `<title>` (e.g. Postal Service Reform Act of 2021)
      - The display title for the related bill or resolution on Congress.gov. This title may be a short title or an official title. 
    - `<congress>` (e.g. 117)
      - The congress during which the related bill or resolution was introduced or submitted.
    - `<number>` (e.g. 1720) 
      - The assigned bill or resolution number for the related bill.
    - `<type>` (e.g. S)
      - The type of related bill or resolution. 
      - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
    - `<latestAction>`
      - Parent container for the latest action taken on the bill or resolution. The `<latestAction>` may include the following children:
        - `<actionDate>` (e.g. 2021-05-19)
          - The date of the latest action taken on the bill or resolution.
        - `<text>` (e.g. Read twice and referred to the Committee on Homeland Security and Governmental Affairs.)
          - The text of the latest action taken on the bill or resolution.
        - `<actionTime>`
          - The time of the latest action taken on the bill or resolution. Certain actions taken by the House contain this element.
     - `<relationshipDetails>` 
       - Parent container for the details on the type of relationship added by the House, Senate, or CRS. A `<relationshipDetails>` element may include the following children:
        - `<item>`
          - An `<item>` element may include the following children:
            - `<type>` (e.g. Related bill)
              - The type of relationship, as designated by the House, Senate, or CRS.
            - `<identifiedBy>` (e.g. CRS)
              - The entity responsible for identifying the relationship. 
              - Possible values are "House", "Senate", and "CRS".

#### Actions Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<actions>`
Parent container for all actions taken on a bill or resolution. Actions may come from the House, Senate, or Library of Congress. An `<actions>` element may include the following children:
- `<item>`
  - Parent container for an action taken on a bill or resolution. An `<item>` element may include the following children:
    - `<actionDate>` (e.g. 2022-03-08)
      - The date of the action taken on a bill or resolution.
    - `<actionTime>`
      - The time of the action taken on a bill or resolution. Certain actions taken by the House contain this element.
    - `<text>` (e.g. Passed Senate without amendment by Yea-Nay Vote. 79 - 19. Record Vote Number: 71.)
      - The text of the action taken on a bill or resolution.
    - `<type>` (e.g. Floor)
      - A short name representing legislative process stages or categories of more detailed actions. Most types condense actions into sets. Some types are used for data processing and do not represent House or Senate legislative process activities.
      - Possible values are "Committee", "Calendars", "Floor", "BecameLaw", "IntroReferral", "President", "ResolvingDifferences", "Discharge", "NotUsed", and "Veto".
    - `<actionCode>`
      - An action code associated with the action taken on a bill or resolution. The `<actionCode>` element will be present only for House and Library of Congress actions. 
      - View a [field values list of Library of Congress action codes](https://www.congress.gov/help/field-values/action-codes) on Congress.gov.
    - `<sourceSystem>`
      - Parent container for the source system where the action was entered. A `<sourceSystem>` element may include the following children:
        - `<code>` (e.g. 0)
          - A code for the source system that entered the action.
          - Possible values are "0", "1", "2", or "9".
          - "0" is for Senate, "1" and "2" are for House, and "9" is Library of Congress.
        - `<name>` (e.g. Senate)
          - The name of the source system that entered the action.
          - Possible values are "Senate", "House committee actions", "House floor actions", and "Library of Congress".
     - `<committees>`
       - Parent container for committees associated with the action. A `<committees>` element may include the following children:
        - `<item>`
          - Parent container for a committee associated with the action. An `<item>` element may include the following children:
            - `<url>`
              - A referrer URL to the committee or subcommittee item in the API. Documentation for the committee endpoint is in progress.
            - `<systemCode>`
              - A code associated with the committee or subcommittee used to match items in Congress.gov with the committee or subcommittee.
            - `<name>`
              - The name of the committee or subcommittee associated with the action.
     - `<recordedVotes>`
       - Parent container for recorded (roll call) votes associated with the action. Read more [about roll call votes](https://www.congress.gov/help/legislative-glossary#glossary_rollcallvote) on Congress.gov. More information can also be found at the [Roll Call Votes by the U.S. Congress](https://www.congress.gov/roll-call-votes) and [Votes in the House and Senate](https://www.congress.gov/help/votes-in-the-house-and-senate) pages on Congress.gov. 
       - A `<recordedVotes>` element may include the following children:
         - `<recordedVote>` 
           - Parent container for a recorded (roll call) vote associated with the action. A `<recordedVote>` element may include the following children:
             - `<rollNumber>` (e.g. 70)
                - The recorded (roll call) vote number.
             - `<url>` (e.g. https://www.senate.gov/legislative/LIS/roll_call_votes/vote1172/vote_117_2_00070.xml)
                - The url to the recorded (roll call) vote on [Senate.gov](https://www.senate.gov/legislative/votes_new.htm) or [Clerk.House.gov](https://clerk.house.gov/Votes).
                - Note that the provided URL is for the XML format of the recorded (roll call) vote. 
             - `<chamber>` (e.g. Senate)
               - The chamber where the recorded (roll call) vote took place.
               - Possible values are "House" and "Senate".
             - `<congress>` (e.g. 117)
               - The congress during which the recorded (roll call) vote took place.
             - `<date>` (e.g. 2022-03-08T22:45:05Z)
               - The date of the recorded (roll call) vote.
             - `<sessionNumber>` (e.g. 2)
               - The session of congress during which the recorded (roll call) vote took place.
     - `<calendarNumber>`
       - Parent container for calendar information associated with the action. Read more [about calendars](https://www.congress.gov/help/legislative-glossary#glossary_calendar) on Congress.gov.
       - A `<calendarNumber>` element may include the following children:
         - `<calendar>` 
           - The calendar name (e.g. Senate Calendar of Business, U00171) associated with the action.
         - `<number>`
           - The Senate calendar number. Actions from the House associated with a calendar will not have a number value populated in this field.
#### Cosponsors Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<cosponsors>`
Parent container for cosponsors of a bill or resolution. Read more [about cosponsors](https://www.congress.gov/help/legislative-glossary#glossary_cosponsor) on Congress.gov. A `<cosponsors>` element may include the following children:
- `<item>`
  - Parent container for a cosponsor of a bill or resolution. An `<item>` element may include the following children:
    - `<bioguideId>` (e.g. C001078)
      - The unique identifier for the bill or resolution cosponsor, as assigned in the [Biographical Directory of the United States Congress, 1774-Present](http://bioguide.congress.gov/).
      - View a [field values list of Bioguide identifiers](https://www.congress.gov/help/field-values/member-bioguide-ids) for current and former members in Congress.gov. 
     - `<fullName>` (e.g. Rep. Connolly, Gerald E. [D-VA-11])
        - The display name for the bill or resolution cosponsor.
     - `<firstName>` (e.g. Gerald)
        - The first name of the bill or resolution cosponsor.
     - `<middleName>` (e.g. E.)
        - The middle name of the bill or resolution cosponsor. 
     - `<lastName>` (e.g. Connolly)
        - The last name of the bill or resolution cosponsor. 
     - `<party>` (e.g. D)
        - The party code of the bill or resolution cosponsor.
        - Possible values are "D", "R", "I", "ID", and "L".
     - `<state>` (e.g. VA)
        - A two-letter abbreviation for the state, territory, or district represented by the bill or resolution cosponsor. 
     - `<url>` (e.g. **api.data.gov/congress/v3/member/C001078**)
        - A referrer URL to the member item in the API. Documentation for the member endpoint is in progress.
     - `<district>` (e.g. 11)
        - The congressional district that the bill or resolution sponsor represents. 
        - Note that this element will be empty for Senate cosponsors and will be "0" for states, territories, or districts where there is only one congressional district.
     - `<sponsorshipDate>` (e.g. 2021-05-11)
        - The date the member became a cosponsor to the bill or resolution.
     - `<isOriginalCosponsor>` (e.g. True)
        - A designation that the member is an original or additional cosponsor to the bill or resolution. If the member cosponsored the bill or resolution on the date of its introduction or submission, then this value will be "True". If the member cosponsored the bill or resolution after its date of introduction or submission, then this value will be "False". 
        - Possible values are "True" and "False"
    - `<sponsorshipWithdrawnDate>`
        - The date the cosponsor withdrew their cosponsorship of the bill or resolution.

#### Subjects Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<subjects>`
Parent container for [legislative subject terms](https://www.congress.gov/help/legislative-glossary#glossary_legislativesubjectterm) and [policy area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) attached to a bill or resolution, as assigned by CRS. Note that subject terms from the [Legislative Indexing Vocabulary](https://www.congress.gov/help/legislative-glossary#glossary_legislativeindexingvocabulary) were applied to bills and resolutions from the 93rd to the 110th Congresses (1973-2008). Read more [about subject and policy area terms](https://www.congress.gov/help/find-bills-by-subject) on Congress.gov. A `<subjects>` element may include the following children:
- `<legislativeSubjects>`
  - Parent container for legislative subject terms attached to a bill or resolution. A `<legislativeSubjects>` element may include the following children:
     - `<item>` 
        - Parent container for a legislative subject term attached to a bill or resolution. An `<item>` element may include the following children:
          - `<name>` (e.g. Congressional oversight)
              - The name of the legislative subject term attached to a bill or resolution. 
- `<policyArea>`
  - Parent container for the policy area term attached to a bill or resolution. Each bill or resolution will have only one policy area term taken from a [list of 32 terms](https://www.congress.gov/help/field-values/policy-area) on Congress.gov. 
  - Note that prior to the 101st Congress (1989), terms outside of the list of 32 may be used as a policy area term for a bill or resolution. Projects are underway to standardize the terms during those congresses.
  - A `<policyArea>` element may include the following children:
      - `<name>` (e.g. Government Operations and Politics)
        - The name of the policy area term attached to a bill or resolution.

#### Summaries Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<summaries>`

Parent container for bill summaries on the bill or resolution. Bill summaries are written by legislative analysts in CRS. Read more [about bill summaries](https://www.congress.gov/help/legislative-glossary#glossary_billsummary) on Congress.gov. A `<summaries>` element may include the following children:
- `<summary>`
  - Parent container for a bill summary on the bill or resolution. A `<summary>` element may include the following children:
    - `<versionCode>` (e.g. 00)
      - The internal code used by CRS to tag its summaries according to the action associated with the summary. 
      - Click [here](/ExpandedBillEndpointDocumentation.md/#bill-summary-version-codes-action-descriptions-and-chamber) for a list of codes. Note that the version codes have varied over time. 
    - `<actionDate>` (e.g. 2021-05-11)
      - The date of action associated with the bill summary. 
    -  `<actionDesc>` (e.g. Introduced in House)
       - The description of the action associated with the bill summary.
    - `<updateDate>` (e.g. 2021-06-07T20:24:30Z)
        - The update date for the bill summary in Congress.gov. This may be the date the summary was published or re-published. 
    - `<text>` (e.g. `<![CDATA[ <p><strong>Postal Service Reform Act of 2021</strong></p> <p>This bill addresses the finances and operations of the U.S. Postal Service (USPS).</p> <p>The bill requires the Office of Personnel Management to establish the Postal Service Health Benefits Program for USPS employees and retirees and provides for coordinated enrollment of retirees under this program and Medicare. The bill repeals the requirement that the USPS annually prepay future retirement health benefits.</p> <p>Additionally, the USPS may establish a program to enter into agreements with an agency of any state government, local government, or tribal government, and with other government agencies, to provide certain nonpostal products and services that reasonably contribute to the costs of the USPS and meet other specified criteria.</p> <p>The USPS must develop and maintain a publicly available dashboard to track service performance and must report regularly on its operations and financial condition.</p> <p>The Postal Regulatory Commission must annually submit to the USPS a budget of its expenses. It must also conduct a study to identify the causes and effects of postal inefficiencies relating to flats (e.g., large envelopes).</p> <p>The USPS Office of Inspector General shall perform oversight of the Postal Regulatory Commission.</p> <ul> <ul> </ul> </ul> ]]>`)
      - The text of the bill summary.
      - Note that the text is encased in CDATA and contains HTML codes (e.g. `<p>`). The HTML codes may not be valid (see [#2](https://github.com/LibraryOfCongress/api.congress.gov/issues/2)); efforts are underway to improve the validity of the HTML codes.
##### Bill summary version codes, action descriptions, and chamber
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

#### Titles Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<titles>`

Parent container for titles associated with the bill or resolution. A title may be an [official title](https://www.congress.gov/help/legislative-glossary#glossary_officialtitle), a [short title](https://www.congress.gov/help/legislative-glossary#glossary_shorttitle), or a [popular title](https://www.congress.gov/help/legislative-glossary#glossary_populartitle). A `<titles>` element may include the following children:
- `<item>`
  - Parent container for a title associated with the bill or resolution. An `<item>` element may include the following children:
    - `<titleType>` (e.g. Short Title(s) as Passed House)
      - A short description of the type of title associated with the bill or resolution. 
    - `<title>` (e.g. Postal service Reform Act of 2022)
      - The text of the title associated with the bill or resolution. 
    -  `<chamberCode>` (e.g. H)
       - The chamber code associated with the title. This element is not populated for all titles (e.g. a display title will never have an associated chamber).
       - Possible values are "H" and "S".
    -  `<chamberName>` (e.g. House)
       - The name of the chamber associated with the title. This element is not populated for all titles (e.g. a display title will never have an associated chamber).
       - Possible values are "House" and "Senate".
    - `<billTextVersionName>` (e.g. Engrossed in House)
        - The name of the bill text version associated with the title. This element is not populated for all titles (e.g. a display title will never have an associated bill text version). 
    - `<billTextVersionCode>` (e.g. EH)
        - The file extension code for the bill text version associated with the title. This element is not populate for all titles (e.g. a display title will never have an associated bill text version).
