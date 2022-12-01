# Amendment endpoint
## Coverage
Coverage information for amendment data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates) on Congress.gov. Read more [about amendments](https://www.congress.gov/help/legislative-glossary#glossary_amendment) on Congress.gov.
## OpenAPI Specification
View OpenAPI Specification on the amendment API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/amendments/Amendment). 
## Elements and Descriptions
### List Level
Note that amendment items at the list level can be filtered down by congress and then by amendment type (e.g. https://api.congress.gov/v3/amendment/117/SAMDT?api_key=). 

`<api-root>`

The `<api-root>` is only present in the XML format.

`<amendments>`

Parent container for amendments. An `<amendments>` element may include the following children:
-	`<amendment>`
    -	Container for an amendment. An `<amendment>` element may include the following children:
        -	`<number>` (e.g. 2137)
            -	The assigned amendment number. 
        -	`<description>`
            -	The amendment's description.
            -	Only House amendments will have this element populated.
        -	`<purpose>` (e.g. In the nature of a substitute.)
            -	The amendment's purpose.
            -	House amendments and proposed Senate amendments may have this element populated.
        -	`<congress>` (e.g. 117)
            -	The congress during which an amendment was submitted or offered.
        -	`<type>` (e.g. SAMDT)
            -	The type of amendment.
            -	Possible values are "HAMDT", "SAMDT", and "SUAMDT". Note that the "SUAMDT" type value is only available for the 97th and 98th Congresses.
        - `<latestAction>`
            -  Container for the latest action taken on the amendment. A `<latestAction>` element may include the following children:
                  - `<actionDate>` (e.g. 2021-08-08)
                      - The date of the latest action taken on the amendment.
                  -	`<text>` (e.g. Amendment SA 2137 agreed to in Senate by Yea-Nay Vote. 69 - 28. Record Vote Number: 312.)
                      -	The text of the latest action taken on the amendment.
                  -	`<actionTime>`
                      -	The time of the latest action taken on the amendment. 
                      -	Certain actions taken by the House contain this element.
         - `<url>` (e.g. https://api.congress.gov/v3/amendment/117/samdt/2137)
             - The referrer URL to the amendment item in the API.
### Item Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<amendment>`

Parent container for an amendment. An `<amendment>` element may include the following children:
  -	`<number>` (e.g. 2137)
      -	The assigned amendment number. 
  -	`<description>`
    -	The amendment's description.
    -	Only House amendments will have this element populated.
  -	`<purpose>` (e.g. In the nature of a substitute.)
    -	The amendment's purpose.
    -	House amendments and proposed Senate amendments may have this element populated.
  -	`<congress>` (e.g. 117)
    -	The congress during which an amendment was submitted or offered.
  -	`<type>` (e.g. SAMDT)
    -	The type of amendment.
    -	Possible values are "HAMDT", "SAMDT", and "SUAMDT". Note that the "SUAMDT" type value is only available for the 97th and 98th Congresses.
  -	`<latestAction>`
    -	Container for the latest action taken on the amendment. A `<latestAction>` element may include the following children:
        - `<actionDate>` (e.g. 2021-08-08)
            - The date of the latest action taken on the amendment.
        - `<text>` (e.g. Amendment SA 2137 agreed to in Senate by Yea-Nay Vote. 69 - 28. Record Vote Number: 312.)
            - The text of the latest action taken on the amendment.
        - `<actionTime>`
            - The time of the latest action taken on the amendment. 
            - Certain actions taken by the House contain this element.
  -	`<sponsors>`
    -	Container for the sponsor of the amendment. A `<sponsors>` element may include the following children:
        -	`<item>`
            -	Container for a single sponsor of the amendment. An `<item>` element may include the following children:
                -	`<bioguideId>` (e.g. S001191)
                      -	The unique identifier for the amendment's sponsor, as assigned in the [Biographical Directory of the United States Congress, 1774-Present](https://bioguide.congress.gov/).
                      -	View a [field values list of Bioguide identifiers](https://www.congress.gov/help/field-values/member-bioguide-ids) for current and former members in Congress.gov.
                -	`<fullName>` (e.g. Sen. Sinema, Kyrsten [D-AZ])
                     - The display name of the amendment's sponsor.
                -	`<firstName>` (e.g. Kyrsten)
                     - The first name of the amendment's sponsor.
                -	`<middleName>` 
                     - The middle name or initial of the amendment's sponsor.
                - `<lastName>`(e.g. Sinema)
                     - The last name of the amendment's sponsor. 
                -	`<party>` (e.g. D)
                     - The party code of the amendment's sponsor.
                -	`<state>` (e.g. AZ)
                     - A two-letter abbreviation for the state, territory, or district represented by the amendment's sponsor.
                -	`<url>` (e.g. https://api.congress.gov/v3/member/S001191)
                     - A referrer URL to the member item in the API. Documentation for the member endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/MemberEndpoint.md).
                - `<district>` 
                     - The congressional district that the amendment's sponsor represents.
                     - Note that this element will be empty for Senate sponsors and will be "0" for states, territories, or districts where there is only one congressional district.
  -	`<cosponsors>`
      -	Container for any cosponsors of the amendment. Only Senate amendments may have this element populated.
      -	A `<cosponsors>` element may include the following children (the below counts are taken from https://api.congress.gov/v3/amendment/117/samdt/3892):
        -	`<countIncludingWithdrawnCosponsors>` (e.g. 2)
            -	The total number of cosponsors of the amendment, including any withdrawn cosponsors.
        -	`<count>` (e.g. 1)
            -	The current number of cosponsors of the amendment, not including any withdrawn cosponsors. 
        -	`<url>` (e.g. https://api.congress.gov/v3/amendment/117/samdt/3892/cosponsors)
            -	A referrer URL to the cosponsors level of the amendment API. Click [here](#cosponsors-level) for more information about the cosponsors level.
  -	`<proposedDate>` (e.g. 2021-08-01T04:00:00Z)
      -	The date the amendment was proposed on the floor. 
      -	This element will only be populated for proposed Senate amendments.
  -	`<submittedDate>` (e.g. 2021-08-01T04:00:00Z)
      -	The date the amendment was submitted or offered. 
  -	`<chamber>` (e.g. Senate)
      -	The chamber in which the amendment was submitted or offered.
  -	`<amendedBill>` 
      -	Container for the bill amended by the amendment. An `<amendedBill>` element may include the following children:
          -	`<congress>` (e.g. 117) 
             -	The congress during which the bill or resolution was introduced or submitted.
         -	`<type>` (e.g. HR)
              -	The type of bill or resolution. 
              -	Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
         -	`<originChamber>` (e.g. House)
              -	The chamber of origin where a bill or resolution was introduced or submitted.
              -	Possible values are "House" and "Senate".
         - `<originChamberCode>` (e.g. H)
              -	The code for the chamber of origin where the bill or resolution was introduced or submitted.
              -	Possible values are "H" and "S".
        -	`<number>` (e.g. 3684)
             - The assigned bill or resolution number.
        -	`<url>` (e.g. https://api.congress.gov/v3/bill/117/hr/3684)
            -	A referrer URL to the bill or resolution item in the API. Documentation for the bill endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).
        -	`<title>` (e.g. Infrastructure Investment and Jobs Act)
            -	The display title for the bill or resolution on Congress.gov.
-	`<amendedAmendment>` 
    -	Container for the amendment amended by the amendment. An `<amendedAmendment>` element may include the following children (the below amendment data is taken from https://api.congress.gov/v3/amendment/117/samdt/2564) :
        -	`<number>` (e.g. 2137)
            -	The assigned amendment number.
        - `<description>`
            - The amendment's description.
            - Only House amendments will have this element populated.
        -	`<purpose>` (e.g. In the nature of a substitute.)
            - The amendment's purpose.
            - House amendments and proposed Senate amendments may have this element populated.
        -	`<congress>` (e.g. 117)
            - The congress during which an amendment was submitted or offered.
        -	`<type>` (e.g. SAMDT)
            - The type of amendment.
            - Possible values are "HAMDT", "SAMDT", and "SUAMDT". Note that the "SUAMDT" type value is only available for the 97th and 98th Congresses.
        -	`<url>` (e.g. https://api.congress.gov/v3/amendment/117/samdt/2137)
            - A referrer URL to the amendment item in the API.
  -	`<amendmentsToAmendment>`
    -	Container for amendments to the amendment. An `<amendmentsToAmendment>` element may contain the following children:
        -	`<count>` (e.g. 507)
            -	The number of amendments to the amendment. 
        -	`<url>` (e.g. https://api.congress.gov/v3/amendment/117/samdt/2137/amendments)
            -	A referrer URL to the amendment to amendments level of the amendment API. Click [here](#amendments-to-amendment-level) for more information about the amendments to amendments level.
  -	`<notes>`
      -	Container for notes attached to the amendment on Congress.gov. The note may contain supplemental information about the amendment that users may find helpful. Read more [about notes](https://www.congress.gov/help/legislative-glossary#glossary_notes) on Congress.gov.
      -	A  `<notes>` element may include the following children:
        -	`<item>`
            -	Container for a note. An `<item>` element may include the following children:
                -	`<text>` (e.g. `<![CDATA[ The Senate agreed to the amendment on 12/5/2016, then vitiated its adoption on 12/5/2016, then agreed to the amendment on 12/10/2016. ]]>`)
                    -	The text of the note on Congress.gov (from https://api.congress.gov/v3/amendment/114/samdt/5129).
                    - Note that the text is encased in CDATA.
  -	`<amendedTreaty>`
      -	Container for the treaty amended by the amendment. An `<amendedTreaty>` element may contain the following children (the below treaty data is taken from https://api.congress.gov/v3/amendment/117/samdt/2137):
        -	`<congress>` (e.g. 116)
            -	The congress during which a treaty was submitted. 
        -	`<treatyNumber>` (e.g. 1)
            -	The assigned treaty number.
        -	`<url>` (e.g. https://api.congress.gov/v3/treaty/116/1)
            -	A referrer URL to the treaty item in the API. Documentation for the treaty endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/TreatyEndpoint.md).
  -	`<actions>`
      - Container for actions on the amendment. An `<actions>` element may include the following children:
          - `<count>` (e.g. 19)
              - The number of actions on the amendment. A `<count>` element may include actions from the House, Senate, and Library of Congress.
          - `<url>` (e.g. https://api.congress.gov/v3/amendment/117/samdt/2137/actions)
              - A referrer URL to the actions level of the amendment API. Click [here](#actions-level) for more information about the actions level.
## Actions Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<actions>`

Parent container for all actions taken on an amendment. Actions may come from the House, Senate, or Library of Congress. An `<actions>` element may include the following children:
-	`<item>` 
    -	Container for an action taken on an amendment. An `<item>` element is repeatable and may include the following children:
        -	`<actionDate>` (e.g. 2021-08-08)
            -	The date of the action taken on an amendment.
        -	`<actionTime>`
            -	The time of the action taken on an amendment. 
            -	Certain actions taken by the House contain this element.
        -	`<text>` (e.g. Amendment SA 2137 agreed to in Senate by Yea-Nay Vote. 69 - 28. Record Vote Number: 312.)
            -	The text of the action taken on an amendment.
        -	`<type>` (e.g. Floor)
            -	A short name representing legislative process stages or categories of more detailed actions. Most types condense actions into sets. Some types are used for data processing and do not represent House or Senate legislative process activities.
            -	Possible values are "Committee", "Floor", "IntroReferral", "ResolvingDifferences", and "NotUsed".
        -	`<actionCode>`
            -	An action code associated with the action taken on an amendment. 
            -	The `<actionCode>` element will be present only for actions where the `<sourceSystem>` is 2 (House) or 9 (Library of Congress).
                -	[Action Codes](https://www.congress.gov/help/field-values/action-codes) is an authoritative list of values where the `<sourceSystem>` is 9 (Library of Congress).
                -	An authoritative list of values where the `<sourceSystem>` is 2 (House) does not exist.
            -	Various code sets are used by multiple systems in the House, Senate, and Library of Congress by legislative clerks and data editors for functions independent of this data set. As new codes and systems were developed, there was no coordinated effort to retroactively apply new codes to old records. Many codes are concatenated with other codes or elements or utilize free text. Codes in one set may be redundant with a different code in another code set. Additionally, some codes may have been used and re-used over the years for different purposes further complicating the ability to create an authoritative list. View the original code set of [U.S. Congress legislative status steps](http://www.loc.gov/pictures/resource/ppmsca.33996/).
         - `<sourceSystem>`
            -	Container for the source system where the action was entered. A `<sourceSystem>` element may include the following children:
                - `<code>` (e.g. 0)
                    -	A code for the source system that entered the action.
                    -	Possible values are "0", "1", "2", or "9".
                    -	"0" is for Senate, "1" and "2" are for House, and "9" is Library of Congress.
                - `<name>` (e.g. Senate)
                    - The name of the source system that entered the action.
                    - Possible values are "Senate", "House committee actions", "House floor actions", and "Library of Congress".
          - `<committees>`
            -	Container for committees associated with the action. A `<committees>` element may include the following children:
                -	`<item>`
                    -	Container for a committee associated with the action. An `<item>` element is repeatable and may include the following children:
                        -	`<url>`
                            -	A referrer URL to the committee or subcommittee in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
                        -	`<systemCode>`
                            -	Unique ID value for the committee or subcommittee.
                        -	`<name>`
                            -	The name of the committee or subcommittee associated with the action. 
          -	`<recordedVotes>`
              -	Container for recorded (roll call) votes associated with the action. Read more [about roll call votes]( https://www.congress.gov/help/legislative-glossary#glossary_rollcallvote) on Congress.gov. More information can also be found at the [Roll Call Votes by the U.S. Congress](https://www.congress.gov/roll-call-votes) and [Votes in the House and Senate](https://www.congress.gov/help/votes-in-the-house-and-senate) pages on Congress.gov. 
                  -	A `<recordedVotes>` element may include the following children:
                      -	`<recordedVote>`
                          -	Container for a recorded (roll call) vote associated with the action. A `<recordedVote>` element may include the following children:
                              - `<rollNumber>` (e.g. 312)
                                  - The recorded (roll call) vote number. 
                              - `<url>` (e.g. https://www.senate.gov/legislative/LIS/roll_call_votes/vote1171/vote_117_1_00312.xml)
                                  - The url to the recorded (roll call) vote on [Senate.gov](https://www.senate.gov/legislative/votes_new.htm) or [Clerk.House.gov](https://clerk.house.gov/Votes).
                              - `<chamber>` (e.g. Senate)
                                  - The chamber where the recorded (roll call) vote took place.
                                  -	Possible values are "House" and "Senate".
                              - `<congress>` (e.g. 117)
                                  -	The congress during which the recorded (roll call) vote took place.
                              - `<date>` (e.g. 2021-08-09T00:45:48Z)
                                  - The date of the recorded (roll call) vote.
                              - `<sessionNumber>` (e.g. 1)
                                  - The session of congress during which the recorded (roll call) vote took place. 
## Amendments To Amendment Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<amendments>`

Parent container for all amendments to the amendment. An `<amendments>` element may include the following children:
-	`<amendment>`
    -	Container for an amendment to the amendment. An `<amendment>` element is repeatable and may include the following children:
        -	`<number>` (e.g. 2300)
            -	The assigned amendment number. 
        -	`<description>`
            -	The amendment's description.
            -	Only House amendments will have this element populated.
        -	`<purpose>` (e.g. To designate additional high priority corridors on the National Highway system.)
            -	The amendment's purpose.
            -	House amendments and proposed Senate amendments may have this element populated.
        -	`<congress>` (e.g. 117)
            -	The congress during which an amendment was submitted or offered.
        -	`<type>` (e.g. SAMDT)
            -	The type of amendment.
            -	Possible values are "HAMDT", "SAMDT", and "SUAMDT". Note that the "SUAMDT" type value is only available for the 97th and 98th Congresses.
        -	`<latestAction>`
            -	Container for the latest action taken on the amendment. A `<latestAction>` element may include the following children:
                -	`<actionDate>` (e.g. 2021-08-03)
                    -	The date of the latest action taken on the amendment.
                -	`<actionTime>`
                    -	The time of the latest action taken on the amendment.
                    -	Certain actions taken by the House contain this element.
                -	`<text>` (e.g. Amendment SA 2300 agreed to in Senate by Voice Vote.)
                    - The text of the latest action taken on the amendment.
                -	`<url>` (e.g. https://api.congress.gov/v3/amendment/117/samdt/2300)
                    -	A referrer URL to the amendment item in the API.
## Cosponsors Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<cosponsors>`

Parent container for cosponsors of an amendment. Read more [about cosponsors](https://www.congress.gov/help/legislative-glossary#glossary_cosponsor) on Congress.gov. Only Senate amendments will have this deeper level. A `<cosponsors>` element may include the following children:
-	`<item>`
    -	Container for a cosponsor of an amendment. An `<item>` element is repeatable and may include the following children:
        -	`<bioguideId>` (e.g. P000449)
            -	The unique identifier for the amendment cosponsor, as assigned in the [Biographical Directory of the United States Congress, 1774-Present](http://bioguide.congress.gov/).
            -	View a [field values list of Bioguide identifiers](https://www.congress.gov/help/field-values/member-bioguide-ids) for current and former members in Congress.gov.
        -	`<fullName>` (e.g. Sen. Portman, Rob [R-OH])
            -	The display name for the amendment cosponsor.
        -	`<firstName>` (e.g. Rob)
            -	The first name of the amendment cosponsor.
        -	`<middleName>`
            - The middle name or initial of the amendment cosponsor. 
        -	`<lastName>` (e.g. Portman)
            -	The last name of the amendment cosponsor.
        -	`<party>` (e.g. R)
            -	The party code of the amendment cosponsor.
            -	Possible values are "D", "R", "I", "ID", and "L".
        -	`<state>` (e.g. OH)
            -	A two-letter abbreviation for the state, territory, or district represented by the amendment cosponsor.
        -	`<url>` (e.g. https://api.congress.gov/v3/member/P000449)
            -	A referrer URL to the member item in the API. Documentation for the member endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/MemberEndpoint.md).
        -	`<sponsorshipDate>` (e.g. 2021-08-01)
            -	The date the member became a cosponsor of the amendment.
        -	`<isOriginalCosponsor>` (e.g. True)
             - A designation that the member is an original or additional cosponsor of the amendment. If the member cosponsored the amendment on the date of its submission, then this value will be "True". If the member cosponsored the amendment after its date of submission, then this value will be "False".
             - Possible values are "True" or "False".
        -	`<sponsorshipWithdrawnDate>`
             - The date the cosponsor withdrew their cosponsorship of amendment.
  -	`<pagination>` (from https://api.congress.gov/v3/amendment/117/samdt/3892)
      -	`<count>` (e.g. 1)
          -	The current count of cosponsors of the amendment, not including any withdrawn cosponsors.
      -	`<countIncludingWithdrawnCosponsors>` (e.g. 2)
          -	The total number of cosponsors of the amendment, including any withdrawn cosponsors.
