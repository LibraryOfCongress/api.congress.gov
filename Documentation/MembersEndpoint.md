# Members endpoint
## Coverage
Coverage information for member data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about member data at [About Congressional Member Profiles](https://www.congress.gov/help/members) on Congress.gov.
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
Note that member items at the list level cannot be filtered.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<members>`

Parent container for all member entries. A `<members>` element will include the following children:
- `<member>`
  - Container for an individual member’s entry.  The `<member>` element will contain the following children:
  - `<bioguideID>` (e.g., L000174)
     - The unique ID value that originates in the [Biographical Directory of the United States Congress, 1774-Present](https://bioguide.congress.gov/). 
  - `<state>` (e.g., Vermont)
     - The state represented by the member.
  - `<party>`  (e.g., Democrat)
     - The political party of the member.
     - Possible values are "Democrat", "Independent", or "Republican".
  - `<district>`  (e.g., 4)
     - The Congressional district represented by the member (exclusive to House).  
  - `<name>`  (e.g.,  Leahy, Patrick J.)
     - The name of the member in last-name-first order.
  - `<served>`
     - Container for service history of the member. The `<served>` element may include the following children:
     - `<House>` or `<Senate>`
       - The chamber in which the member served.
       - `<item>`
       - Container for member’s years of service in the designated chamber. The `<item>` element will contain the following children:
         - `<start>` (e.g., 1975)
           - The year in which the member began serving in the designated chamber.
         - `<end>` (e.g., 1990)
           - The year in which the member ceased serving in the designated chamber.
  - `<url>`  (e.g., [https://api.data.gov/congress/v3/member/L000174?format=xml](https://api.data.gov/congress/v3/member/L000174?format=xml))
      - The URL of the member’s item level endpoint in the API.
  - `<depiction>`
      -	Container for the member’s current official portrait. The `<depiction>` element may contain the following children:
        - `<imageUrl>` (e.g., [https://www.congress.gov/img/member/l000174_200.jpg](https://www.congress.gov/img/member/l000174_200.jpg))
          - The member’s current official portrait.
        - `<attribution>` (e.g., [Courtesy U.S. Senate Historical Office](http://www.senate.gov/artandhistory/history/common/generic/Photo_Collection_of_the_Senate_Historical_Office.htm))
          - The linked source of the image. 



# Item Level
`<api-root>`

The `<api-root>` is only present in the XML format.

`<member>`

Parent container for an individual member’s entry. A `<member>` element may include the following children:
- `<currentMember>` (e.g., True)  
  - Indicator of whether the member is currently serving. 
  - Possible values are "True" or "False".
- `<birthYear>` (e.g., 1940)  
  - Member’s year of birth.
- `<deathYear>` (e.g., 2012)
  - Member’s year of death.
- `<updateDate>` (e.g., 2022-05-17T18:44:02Z) 
  - The date of update in Congress.gov. This date has no legislative significance.
- `<depiction>`
  - Container for the member’s current official portrait. The `<depiction>` element may contain the following children:
    - `<imageUrl>` (e.g., [https://www.congress.gov/img/member/l000174_200.jpg](https://www.congress.gov/img/member/l000174_200.jpg))
      - The member’s current official portrait.
    - `<attribution>` (e.g., [Courtesy U.S. Senate Historical Office](http://www.senate.gov/artandhistory/history/common/generic/Photo_Collection_of_the_Senate_Historical_Office.htm))
      - The linked source of the image. 
- `<terms>`
  - Container of a member’s terms of service in chronological order. The `<terms>` element will contain the following child, which is repeatable: 
   - `<item>` 
     - Container for the member’s service in an individual Congress. The `<item>` element is repeatable and may contain the following children: 
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
       - `<termBeginYear>` (e.g., 1975)
         - The year in which the member’s service in that Congress began. 
       - `<termEndYear>` (e.g., 1977)
         - The year in which the member’s service in that Congress ended. 
       - `<district>` (e.g., 4)
         - The Congressional district represented by the member (exclusive to the House). The value of zero indicates the state has only one member in the House.
- `<identifiers>`
  - Container for member’s identifying information. The `<identifiers>` element will include the following child: 
  - `<bioguideID>` (e.g., L000174)
    - The unique ID value that originates in the [Biographical Directory of the United States Congress, 1774-Present](https://bioguide.congress.gov/).  
- `<partyHistory>`
  - Container for member’s party affiliation over time. The `<partyHistory>` element will contain the following children:
    - `<partyName>` (e.g., Democrat)
      - The political party of the member.
      - Possible values are "Democrat", "Independent", or "Republican".
     - `<partyCode>` (e.g., D)
       - The single-letter abbreviation for the party of the member. 
       - Possible values are "D", "I", and "R".
     - `<startYear>` (e.g., 1975)
       - The year the member began affiliation with the political party.
     - `<endYear>` (e.g., 2020)
       - The year the member ceased affiliation with the political party.
- `<state>` (e.g., Vermont)
  - The state represented by the member.
- `<district>`  (e.g., 4)
  - The Congressional district represented by the member (exclusive to House). 
- `<officialWebsiteUrl>` (e.g., [https://www.leahy.senate.gov/](https://www.leahy.senate.gov/))
  - The member’s official website.
- `<honorificName>` (e.g., Mr.)  
  - The honorific title of the member.
- `<firstName>` (e.g., Patrick)  
  - The member’s first name.
- `<middleName>` (e.g., Jospeh)
  - The member’s middle name.
- `<lastName>` (e.g., Leahy) 
  - The member’s last name.
- `<suffixName>` (e.g., Jr.)
  - The member’s suffix. 
- `<nickName>` (e.g., Mike)
  - The member’s nickname. 
- `<directOrderName>` (e.g., Patrick J. Leahy)
  - The member’s name in first-name-first order. 
- `<invertedOrderName>` (e.g., Leahy, Patrick J.)
  - The member’s name in last-name-first order. 
- `<addressInformation>`
  - Container for the member’s contact information. The `<addressInformation>` container will include the following children:
    - `<officeAddress>` (e.g, 437 Russell Senate Office Building Washington, DC 20510) 
      - The member’s mailing and physical office address in Washington, D.C. The `<officeAddress>` element provides the full address for Senate members and only the House office building information for House members. 
    - `<city>` Washington
      - The city of Washington. 
    - `<district>` DC 
      - The two letter postal abbreviation for the District of Columbia. 
    - `<zipCode>` (e.g., 20510)
      - The postal zip code for the member’s office in Washington, D.C. 
    - `<officeTelephone>`
      - Container for the member’s telephone contact information. The `<officeTelephone>` container will include the following child:
      - `<phoneNumber>` (e.g., (202) 224-4242)
        - The telephone number for the member’s office in Washington, D.C. 
- `<leadership>`
  - Container for all leadership positions the member has held during their membership/tenure of service. The `<leadership>` container will contain the following child, which is repeatable:
    - `<item>`
      - Container for individual leadership positions held by the member during a Congress. The `<item>` container is repeatable and will include the following children:
      - `<type>` (e.g., President Pro Tempore)
        - The title of the leadership position held by the member. 
      - `<congress>` (e.g., 113)
        - The Congress during which the specified leadership position was held by the member. 
      - `<current>` (e.g., False)
        - Indicator whether the leadership position is currently held by the member. NOTE: This value may change from True to False during a Congress.
        - Possible values are "True" or "False".
- `<sponsoredLegislation>`
  - Container for legislation sponsored by member. The `<sponsoredLegislation>` container will include the following children:
    - `<count>` (e.g., 1753)
      - The total number of measures sponsored by the member. 
    - `<url>` (e.g., https://api.data.gov/congress/v3/member/L000174/sponsored-legislation)
      - The URL of the item level endpoint listing the measures sponsored by the member. 
- `<cosponsoredLegislation>`
  - Container for legislation cosponsored by member. The `<cosponsoredLegislation>` container will include the following children:
    - `<count>` (e.g., 7470)  
      - The total number of measures cosponsored by the member. 
    - `<url>` (e.g., https://api.data.gov/congress/v3/member/L000174/cosponsored-legislation) 
      - The URL of the item level endpoint listing the measures cosponsored by the member.  
- `<updateDate>` (e.g., 2022-07-22)
  - The date of last update of the record. This date has no legislative meaning. 

### Sponsored-Legislation Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<sponsoredLegislation>`

Parent container for all sponsored legislation entries. A `<sponsoredLegislation>` element will include the following children:
- `<item>`
  - Container for an individual legislative measure sponsored by the member. The `<item>` element may include the following children:
    - `<introducedDate>` (e.g., 2022-06-16)
      - The date the measure was introduced. 
    - `<type>` (e.g., S)
      - The type of bill or resolution.
      - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
    - `<congress>` (e.g., 117)
      - The congress during which a bill or resolution was introduced or submitted.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov
    - `<title>` (e.g., Patent Trial and Appeal Board Reform Act of 2022)
      - The display title for the bill or resolution.
    - `<number>` (e.g., 4417)
      - The assigned bill or resolution number.
    - `<policyArea>`
      - Container for the policy area term of the bill or resolution. Every bill and resolution is assigned one policy area term; view the [field values list of policy area terms](https://www.congress.gov/help/field-values/policy-area) on Congress.gov. Read more about [policy area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) on Congress.gov. The `<policyArea>` element may include the following child:
        - `<name>` (e.g. Commerce)
          - The policy area term assigned to the bill or resolution by CRS.
    - `<latestAction>`
      - Container for the latest action taken on the bill or resolution. A `<latestAction>` element may include the following children:
        - `<actionDate>` (e.g. 2022-06-16)
          - The date of the latest action taken on the bill or resolution.
        - `<text>` (e.g. Read twice and referred to the Committee on the Judiciary.)
          - The text of the latest action taken on the bill or resolution.
    - `<url>` (e.g., [https://api.data.gov/congress/v3/bill/117/s/4417?format=xml](https://api.data.gov/congress/v3/bill/117/s/4417?format=xml))
      - A referrer URL to the bill level API for the measure.  


### Cosponsored-Legislation Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<cosponsoredLegislation>`

Parent container for all sponsored legislation entries. A `<cosponsoredLegislation>` element will include the following children:
- `<item>`
  - Container for an individual legislative measure sponsored by the member. The `<item>` element may include the following children:
    - `<introducedDate>` (e.g., 2022-07-20)
      - The date the measure was introduced. 
    - `<type>` (e.g., SRES)
      - The type of bill or resolution.
      - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
    - `<congress>` (e.g., 117)
      - The congress during which a bill or resolution was introduced or submitted.
      - View the field values list of Congresses on Congress.gov. Read more about Congresses on Congress.gov.
    - `<title>` (e.g., A resolution recognizing the importance of independent living for individuals with disabilities made possible by the Americans with Disabilities Act of 1990 and calling for further action to strengthen home and community living for individuals with disabilities.)
      - The display title for the bill or resolution.
    - `<number>` (e.g., 714)
      - The assigned bill or resolution number.
    - `<policyArea>`
      - Container for the policy area term of the bill or resolution. Every bill and resolution is assigned one policy area term; view the [field values list of policy area terms](https://www.congress.gov/help/field-values/policy-area) on Congress.gov. Read more about [policy area terms](https://www.congress.gov/help/legislative-glossary#glossary_policyareaterm) on Congress.gov. The `<policyArea>` element may include the following child:
        - `<name>` (e.g. Health)
          - The policy area term assigned to the bill or resolution by CRS.
    - `<latestAction>`
      - Container for the latest action taken on the bill or resolution. A `<latestAction>` element may include the following children:
        - `<actionDate>` (e.g. 2022-07-20)
          - The date of the latest action taken on the bill or resolution.
        - `<text>` (e.g. , Referred to the Committee on Health, Education, Labor, and Pensions. (text: CR S3547-3548))
          - The text of the latest action taken on the bill or resolution.
    - `<url>` (e.g., https://api.data.gov/congress/v3/bill/117/sres/714?format=xml)
      - A referrer URL to the bill level API for the measure.  
