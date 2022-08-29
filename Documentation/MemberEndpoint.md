# Member endpoint
## Coverage
Coverage information for member data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about member data at [About Congressional Member Profiles](https://www.congress.gov/help/members) on Congress.gov.
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
Note that member items at the list level cannot be filtered.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<members>`

Parent container for all member entries. A `<members>` element may include the following children:
- `<member>`
  - Container for an individual member’s entry.  A `<member>` element may include the following children:
    - `<bioguideID>` (e.g., L000174)
      - The unique ID value that originates in the [Biographical Directory of the United States Congress, 1774-Present](https://bioguide.congress.gov/). 
      - View a [field values list of Bioguide identifiers](https://www.congress.gov/help/field-values/member-bioguide-ids) for current and former members in Congress.gov.
     - `<state>` (e.g., Vermont)
       - The state represented by the member.
     - `<party>`  (e.g., Democrat)
        - The political party of the member.
        - Possible values are "Democratic", "Independent", "Independent Democrat", "Libertarian", or "Republican".
    - `<district>`  
      - The Congressional district represented by the member (exclusive to House). The value of zero indicates the state, district or territory has only one member in the House.
     - `<name>`  (e.g.,  Leahy, Patrick J.)
        - The name of the member in last-name-first order.
      - `<served>`
        - Container for service history of the member. A `<served>` element may include the following children:
            - `<House>` or `<Senate>`
                - The chamber in which the member served. A `<House>` or `<Senate>` element may include the following children:
                    - `<item>`
                        - Container for member’s years of service in the designated chamber. An `<item>` element may include the following children:
                             - `<start>` (e.g., 1975)
                                  - The year in which the member began serving in the designated chamber.
                             - `<end>` (e.g., 1990)
                                  - The year in which the member ceased serving in the designated chamber.
      - `<url>`  (e.g., https://api.congress.gov/v3/member/L000174)
          - A referrer URL to the member item in the API.
      - `<depiction>`
          -	Container for the member’s current official portrait. The `<depiction>` element may include the following children:
              - `<imageUrl>` (e.g. https://www.congress.gov/img/member/l000174_200.jpg)
                  - The member's current portrait on Congress.gov.
              - `<attribution>` (e.g. `<a href="http://www.senate.gov/artandhistory/history/common/generic/Photo_Collection_of_the_Senate_Historical_Office.htm">Courtesy U.S. Senate Historical Office</a>`)
                  - The source of the image.
### Item Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<member-lis>`

Parent container for an individual member’s entry. A `<member>` element may include the following children:
- `<currentMember>` (e.g., True)  
  - Indicator of whether the member is currently serving. 
  - Possible values are "True" or "False".
- `<birthYear>` (e.g., 1940)  
  - Member’s year of birth.
- `<deathYear>` 
  - Member’s year of death. 
- `<updateDate>` (e.g., 2022-05-17T18:44:02Z) 
  - The date of update in Congress.gov.
- `<depiction>`
  - Container for the member’s current official portrait. A `<depiction>` element may include the following children:
    - `<imageUrl>` (e.g., https://www.congress.gov/img/member/l000174_200.jpg)
      - The member's current portrait on Congress.gov.
    - `<attribution>` (e.g., `<a href="http://www.senate.gov/artandhistory/history/common/generic/Photo_Collection_of_the_Senate_Historical_Office.htm">Courtesy U.S. Senate Historical Office</a>`)
      - The source of the image. 
- `<terms>`
  - Container of a member’s terms of service in chronological order. A `<terms>` element may include the following child, which is repeatable: 
    - `<item>` 
      - Container for the member’s service in an individual Congress. An `<item>` element is repeatable and may include the following children: 
        - `<memberType>` (e.g., Senator)
          - The membership type.
          - Possible values are "Representative", "Resident Commissioner", "Delgate", or "Senator".
        - `<congress>` (e.g., 94)
          - The Congress during which the member served.  
          - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
        - `<chamber>` (e.g., Senate)
          - The chamber in which the member served during that Congress.
          - Possible values are "House of Representatives" and "Senate".
        - `<stateCode>` (e.g., VT)
          - The two-digit postal code abbreviation for the state represented by the member. 
        - `<stateName>` (e.g., Vermont)
          - The name of the state represented by the member. 
        - `<partyName>` (e.g., Democratic)
          - The political party of the member.
          - Possible values are "Democratic", "Independent", "Independent Democrat", "Libertarian", and "Republication".
        - `<partyCode>` (e.g., D)
          - The single letter abbreviation for the political party of the member.
          - Possible values are "D", "I", "ID", "L", and "R". 
        - `<termBeginYear>` (e.g., 1975)
          - The year in which the member’s service in that Congress began. 
        - `<termEndYear>` (e.g., 1977)
          - The year in which the member’s service in that Congress ended. 
        - `<district>`  
          - The Congressional district represented by the member (exclusive to the House). The value of zero indicates the state, district or territory has only one member in the House.
- `<identifiers>`
  - Container for member’s identifying information. The `<identifiers>` element may include the following child: 
  - `<bioguideID>` (e.g., L000174)
    - The unique ID value that originates in the [Biographical Directory of the United States Congress, 1774-Present](https://bioguide.congress.gov/). 
    - View a [field values list of Bioguide identifiers](https://www.congress.gov/help/field-values/member-bioguide-ids) for current and former members in Congress.gov. 
- `<party>` (e.g., Democatic)
  - The current political party of the member. Note: This does not currently reflect party changes. 
  - Possible values are "Democratic", "Independent", "Independent Democrat", "Libertarian", and "Republication".
- `<state>` (e.g., Vermont)
  - The state represented by the member.
- `<district>`   
  - The Congressional district represented by the member (exclusive to House). The value of zero indicates the state, district or territory has only one member in the House.
- `<officialUrl>` (e.g., https://www.leahy.senate.gov/)
  - The member’s official website.
- `<honorificName>` (e.g., Mr.)  
  - The honorific title of the member.
- `<firstName>` (e.g., Patrick)  
  - The member’s first name.
- `<middleName>` (e.g., Jospeh)
  - The member’s middle name.
- `<lastName>` (e.g., Leahy) 
  - The member’s last name.
- `<suffixName>`  
  - The member’s suffix. 
- `<nickName>`  
  - The member’s nickname. 
- `<directOrderName>` (e.g., Patrick J. Leahy)
  - The member’s name in first-name-first order. 
- `<invertedOrderName>` (e.g., Leahy, Patrick J.)
  - The member’s name in last-name-first order. 
- `<addressInformation>`
  - Container for the member’s contact information. An `<addressInformation>` container may include the following children:
    - `<officeAddress>` (e.g, 437 Russell Senate Office Building Washington, DC 20510) 
      - The member’s mailing and physical office address in Washington, D.C. The `<officeAddress>` element provides the full address for Senate members and only the House office building information for House members. 
    - `<city>` Washington
      - The city of Washington. 
    - `<district>` DC 
      - The two letter postal abbreviation for the District of Columbia. 
    - `<zipCode>` (e.g., 20510)
      - The postal zip code for the member’s office in Washington, D.C. 
    - `<officeTelephone>`
      - Container for the member’s telephone contact information. An `<officeTelephone>` container may include the following child:
        - `<phoneNumber>` (e.g., (202) 224-4242)
          - The telephone number for the member’s office in Washington, D.C. 
- `<leadership>`
  - Container for the leadership positions available on Congress.gov that the member has held during their membership/tenure of service. A `<leadership>` container may include the following child, which is repeatable:
    - `<item>`
      - Container for individual leadership positions held by the member during a Congress. An `<item>` container is repeatable and may include the following children:
      - `<type>` (e.g., President Pro Tempore)
        - The title of the leadership position held by the member. 
      - `<congress>` (e.g., 113)
        - The Congress during which the specified leadership position was held by the member. 
      - `<current>` (e.g., False)
        - Indicator whether the leadership position is currently held by the member. NOTE: This value may change from True to False during a Congress.
        - Possible values are "True" or "False".
- `<sponsoredLegislation>`
  - Container for bills and resolutions sponsored by member. A `<sponsoredLegislation>` container may include the following children:
    - `<count>` (e.g., 1753)
      - The total number of bills and resolutions sponsored by the member. 
    - `<url>` (e.g., https://api.congress.gov/v3/member/L000174/sponsored-legislation)
      - A referrer URL to the sponsored-legislation level of the API. Click [here](#sponsored-legislation-level) for more information about the sponsored-legislation level.
- `<cosponsoredLegislation>`
  - Container for bills and resolutions cosponsored by member. A `<cosponsoredLegislation>` container may include the following children:
    - `<count>` (e.g., 7470)  
      - The total number of bills and resolutions cosponsored by the member. 
    - `<url>` (e.g., https://api.congress.gov/v3/member/L000174/cosponsored-legislation) 
      - A referrer URL to the cosponsored-legislation level of the API. Click [here](#cosponsored-legislation-level) for more information about the cosponsored-legislation level.  
- `<updateDate>` (e.g., 2022-07-22T18:44:02Z)
  - The date of last update in Congress.gov.

### Sponsored-Legislation Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<sponsoredLegislation>`

Parent container for all sponsored bills and resolutions. A `<sponsoredLegislation>` element may include the following children:
- `<item>`
  - Container for an individual bill or resolution sponsored by the member. An `<item>` element may include the following children:
    - `<introducedDate>` (e.g., 2022-06-16)
      - The date the bill or resolution was introduced. 
    - `<type>` (e.g., S)
      - The type of bill or resolution.
      - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
    - `<congress>` (e.g., 117)
      - The congress during which a bill or resolution was introduced or submitted.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov
    - `<latestTitle>` (e.g., Patent Trial and Appeal Board Reform Act of 2022)
      - The display title for the bill or resolution on Congress.gov.
    - `<number>` (e.g., 4417)
      - The assigned bill or resolution number.
    - `<policyArea>`
      - Container for the policy area term of the bill or resolution. Every bill and resolution is assigned one policy area term; view the [field values list of policy area terms](https://www.congress.gov/help/field-values/policy-area) on Congress.gov. Read more about [policy area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) on Congress.gov. A `<policyArea>` element may include the following child:
        - `<name>` (e.g., Commerce)
          - The policy area term assigned to the bill or resolution by CRS.
    - `<latestAction>`
      - Container for the latest action taken on the bill or resolution. A `<latestAction>` element may include the following children:
        - `<actionDate>` (e.g., 2022-06-16)
          - The date of the latest action taken on the bill or resolution.
        - `<text>` (e.g., Read twice and referred to the Committee on the Judiciary.)
          - The text of the latest action taken on the bill or resolution.
    - `<url>` (e.g., https://api.congress.gov/v3/bill/117/s/4417)
      - A referrer URL to the bill item in the API. Documentation for the bill endpoint is [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).


### Cosponsored-Legislation Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<cosponsoredLegislation>`

Parent container for all sponsored bills and resolutions. A `<cosponsoredLegislation>` element may include the following children:
- `<item>`
  - Container for an individual bill or resolution sponsored by the member. An `<item>` element may include the following children:
    - `<introducedDate>` (e.g., 2022-07-20)
      - The date the bill or resolution was introduced. 
    - `<type>` (e.g., SRES)
      - The type of bill or resolution.
      - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
    - `<congress>` (e.g., 117)
      - The congress during which a bill or resolution was introduced or submitted.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<latestTitle>` (e.g., A resolution recognizing the importance of independent living for individuals with disabilities made possible by the Americans with Disabilities Act of 1990 and calling for further action to strengthen home and community living for individuals with disabilities.)
      - The display title for the bill or resolution on Congress.gov.
    - `<number>` (e.g., 714)
      - The assigned bill or resolution number.
    - `<policyArea>`
      - Container for the policy area term of the bill or resolution. Every bill and resolution is assigned one policy area term; view the [field values list of policy area terms](https://www.congress.gov/help/field-values/policy-area) on Congress.gov. Read more about [policy area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) on Congress.gov. The `<policyArea>` element may include the following child:
        - `<name>` (e.g., Health)
          - The policy area term assigned to the bill or resolution by CRS.
    - `<latestAction>`
      - Container for the latest action taken on the bill or resolution. A `<latestAction>` element may include the following children:
        - `<actionDate>` (e.g., 2022-07-20)
          - The date of the latest action taken on the bill or resolution.
        - `<text>` (e.g., Referred to the Committee on Health, Education, Labor, and Pensions. (text: CR S3547-3548))
          - The text of the latest action taken on the bill or resolution.
    - `<url>` (e.g., https://api.congress.gov/v3/bill/117/sres/714)
      - A referrer URL to the bill item in the API. Documentation for the bill endpoint is [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).
