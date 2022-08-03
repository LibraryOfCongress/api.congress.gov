# Committee endpoint:  IN PROGRESS; NOT COMPLETE
## Coverage
Coverage information for committee data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about committee data at [About Committees and Committee Materials]( https://www.congress.gov/help/committee-materials) on Congress.gov.
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
`<api-root>`
The `<api-root>` is only present in the XML format. 

`<committees>`

 Parent container for committees and subcommittees. A `<committees>` element may contain the following children:
 - `<item>`
   - Container for an individual committee or subcommittee. An `<item>` element is repeatable and may contain the following children: 
     - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw00?format=xml
       - The referrer URL to the committee or subcommittee item in the API.     
     - `<systemCode>` (e.g., hspw00)
        -	Unique ID value for the committee or subcommittee. The first letter represents the chamber, i.e., House, Senate, or Joint. The two numerals at the end of the `<systemCode>` indicate whether the entity is a parent or subcommittee. Parent committees are represented by a double zero and subcommittees will have an identical systemCode as the parent but with numerals other than the double zero.  
     - `<name>` Transportation and Infrastructure Committee
        -	The name of the committee or subcommittee.
     - `<parent>`
       - Indicator of whether the committee has a parent, and what that parent is.
       - `<url>`
         - The referrer URL to the parent committee item in the API.
       - `<systemCode>`
         - The unique ID value for the parent committee. Parent committee `<systemCode>` values end in a double zero.      
       - `<name>`
         - The name of the parent committee.
     - `<subcommittees>`
       - Indicator of the subcommittees to which the committee is a parent. The `<subcommittees>` element is repeatable and may contain the following children: 
       - `<item>`
         - Container for an individual subcommittee of the committee.
         - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw14?format=xml)
           - The referrer URL to the subcommittee item in the API. 
         - `<systemCode>` (e.g., hspw14)
           -  The unique iD value for the subcommittee. Subcommittee `<systemCode>` values contain numerals other than a double zero. 
         - `<name>` (e.g., Railroads, Pipelines, and Hazardous Materials Subcommittee)
           - The name of the subcommittee.
     - `<chamber>` (e.g., House)
       -  The committee's chamber of origin.
       -  Possible values are "House", "Senate", and "Joint".
     - `<committeeTypeCode>` (e.g., Standing)
       - The type of committee.
       - Possible values are "Commission or Caucus", "Joint", "Other", "Select", "Special", "Standing", "Subcommittee", and "Task Force".

### Committee Item Level
`<api-root>`
The `<api-root>` is only present in the XML format. 

`<committee>`

Parent container for an individual committee's entry. A `<committee>` element may contain the following children:
- `<systemCode>` (e.g., hspw00)
  - The unique ID value for the committee. Parent committee `<systemCode>` values end in a double zero.
    - `<parent>`  WOULD THIS HAVE A PARENT IF THE LEVEL IS COMMITTEE?? DO WE NEED THIS?????
      - Indicator whether the committee has a parent. 
      - `<url>`
        - The referrer URL to the committee's parent in the API.
      - `<systemCode>`
        - The unique ID of the committee's parent. Parent committee `<systemCode>` values end in a double zero. 
      - `<name>`
        - The name of the committee's parent.  
    - `<updateDate>` (e.g., 2020-02-04T00:07:37Z)
      - The date of update in Congress.gov.
    - `<isCurrent>` (e.g., True)
      - Indicator of whether the committee is currently active.
      - Possible values are "True" and "False". 
    - `<hasHearingVideos>` (e.g., Yes)  THIS FIELD DOES NOT CURRENTLY APPEAR IN THE API. DOES IT NEED TO BE ADDED?
      - Indicator whether the committee has videos of hearings.
      - Possible vales are "Yes" or "No". 
    - `<subcommittees>`
      - Parent container for all of the committee's subcommittee's. The `<subcommittee>` element may contain the following children, which are repeatable:  
      - `<item>`
        - The container for an individual subcommittee under the committee. The `<item>` element is repeatable and may contain the following children:
          - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw14?format=xml)
            - The refferer URL to the subcommittee's item level in the API.
        - `<systemCode>` (e.g., hspw14)
          - The unique ID of the subcommittee. Subcommittee `<systemCode>` values contain numerals other than a double zero.   
        - `<name>` (e.g., Railroads, Pipelines, and Hazardous Materials Subcommittee)
          - The name of the subcommittee. 
    - `<reports>`
      - Indicator of whether there are reports issued by the committee.    
        - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw00/reports?format=xml)
          - Refferer URL to the committee's reports in the API. 
        - `<count>` (e.g., 1373)
          - The number of reports present in the committee's reports API endpoint.  
    - `<bills>`
      - Indicator of whether there are bills associated with the committee. 
      - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw00/bills?format=xml)
        - Refferer URL to the committee's bills in the API. 
      - `<count>` (e.g., 25313)
       - The number of bills in the committee's bills API endpoint.  
    - `<nominations>`
      - Indicator of whether there are nominations considered by the committee. Exclusive to the Senate.  
      - `<url>`
        - Referrer URL to the committee's nominations in the API. 
      - `<count>`
        - The number of nominations in the committee's nominations API endpoint. 
    - `<history>`
      - Container for the committee's activity/identification history across Congresses. The `<history>` element may contain the following children, which are repeatable:  
      - `<item>`
        - Container for a committee's activity/identification. The `<item>` element is repeatable and may contain the following children:
          - `<endDate>`
            - The date the committee, as named, ceased to exist. 
        - `<officialName>` (e.g., Committee on Transportation and Infrastructure)
          - The full official name of the committee.  
        - `<libraryOfCongressName>` (e.g., Transportation and Infrastructure)
          - The shortened name of the committee. 
        - `<startDate>` (e.g., 1995-01-04T05:00:00Z)
          - The date the committee, as named, was formed. 
        - `<committeeTypeCode>`
          - The type of committee.
          - Possible values are "Commission or Caucus", "Joint", "Other", "Select", "Special", "Standing", "Subcommittee", and "Task Force".
        - `<establishingAuthority>`
          - The legislative authority for the committee. 
        - `<locLinkedDataId>`
          - ID value to support linking with Library of Congress data. NOTE: Not currently in use.
        - `<superintendentDocumentNumber>`
          - ID value to support linking with GPO data. NOTE: Not currently in use. 
        - `<naraId>`
          - ID value to support linking with NARA data. NOTE: Not currently in use. 
- `<type>`  (e.g., Standing)
  - Type of committee. 
  - Possible values are "Commission or Caucus", "Joint", "Other", "Select", "Special", "Standing", and "Task Force".

### Subcommittee Item Level
`<api-root>`
The `<api-root>` is only present in the XML format. 

`<committee>` SHOULD THIS BE COMMITTEE OR SUBCOMMITTEE??????

- Parent container for an individual subcommittee's entry. The `<committee>` element may contain the following children:
  - `<systemCode>` (e.g., hspw14)
    - The unique ID of the subcommittee. All subcommittee systemCodes end with two digits other than zeros.
  - `<parent>`
    - Container for the subcommittee's parent information. The `<parent>` element may contain the following children:  
      - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw00?format=xml)
        - The referrer URL to the parent committee's API endpoint. 
      - `<systemCode>` (e.g., hspw00)
       - The unqiue ID for the parent committee. Parent committee `<systemCode>` values end with a double zero.   
      - `<name>` (e.g., Transportation and Infrastructure Committee)
        - The name of the parent committee.  
  - `<updateDate>` (e.g., 2020-02-20T23:59:48Z)
    - The date of update in Congress.gov.
  - `<isCurrent>` (e.g., True)
    - Indicator whether the subcommittee is currently active.
    - Possible values are "True" or "False". 
  - `<hasHearingVideos>` (e.g., Yes)  THIS FIELD DOES NOT CURRENTLY APPEAR IN THE API. DOES IT NEED TO BE ADDED?
    - Indicator whether the committee has videos of hearings.
    - Possible vales are "Yes" or "No". 
  - `<subcommittees>` DO WE NEED THIS SINCE THIS IS THE SUBCOMMITTEE LEVEL? ARE THERE SUBSOMMITTEES TO SUBCOMMITTEES?
  - `<reports>` DO WE NEED THIS SINCE THIS IS THE SUBCOMMITTEE LEVEL? 
  - `<bills>` 
    - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw14/bills?format=xml)
    - `<count>` (e.g., 762)
  - `<nominations>` DO WE NEED THIS SINCE THIS IS THE SUBCOMMITTEE LEVEL? I have not seen it populated thus far.
  - `<history>`
      - Container for the subcommittee's activity/identification history across Congresses. The `<history>` element may contain the following children, which are repeatable:  
    - `<item>`
      - Container for a subcommittee's activity/identification. The `<item>` element is repeatable and may contain the following children:
      - `<endDate>`
        - The date the subcommittee, as named, ceased to exist.  
      - `<officialName>` (e.g., House Transportation and Infrastructure Subcommittee on Railroads, Pipelines, and Hazardous Materials)
        - The full official name of the subcommittee. 
      - `<libraryOfCongressName>` (e.g., Railroads, Pipelines, and Hazardous Materials)
        - The shortened name of the subcommittee.  
      - `<startDate>` 2017-01-03T05:00:00Z
        - The date the subcommittee, as named, was formed.  
      - `<committeeTypeCode>`
        - `<establishingAuthority>`
          - The legislative authority for the committee. 
        - `<locLinkedDataId>`
          - ID value to support linking with Library of Congress data. NOTE: Not currently in use.
        - `<superintendentDocumentNumber>`
          - ID value to support linking with GPO data. NOTE: Not currently in use. 
        - `<naraId>`
          - ID value to support linking with NARA data. NOTE: Not currently in use. 
  - `<type>` (e.g., Standing)
    - The type of subcommittee.
    - Possible vales are  


### Committee Reports Item Level
`<api-root>`
The `<api-root>` is only present in the XML format. 

`<reports>`

Parent container for reports issued by a committee. The `<reports>` element may contain the following children, which are repeatable:
 - `<item>`
   - Container for individual reports issued by the committee. The `<item>` container is repeatable and may contain the following children: 
   - `<citation>` (e.g., H. Rept. 109-570)
     - The citation of the report issued by the committee.  
   - `<url>` (e.g., https://api.data.gov/congress/v3/committeeReport/109/HRPT/570?format=xml)
     - The referrer URL to the committee report level in the API. 
   - `<updateDate>` (e.g., 2021-07-10 16:19:06+00:00)
     - The update date of the committee report. 

### Committee Bills Item Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<committee-bills>`
Parent container for measures considered before the committee. The `<committee-bills>` element may contain the following children:
 - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw00/bills?format=xml)
   - The referrer URL to the committee's bills item level in the API.
 - `<count>` (e.g., 25313)
   - The number of measures in the bills level API. 
 - `<bills>`
   - Container for all measures before the committee. The `<bill>` element is repeatable and may contain the following children:
   - `<bill>`
     -  Container for individual measures before the committee. The `<bill>` element is repeatable and may contain the following children:
     - `<congress>` (e.g., 112)
       - The Congress during which the measure was introduced.  
     - `<billType>` (e.g., HCONRES)
       - The type of measure. 
     - `<billNumber>` (e.g., 117)
       - The number assigned to the measure.  
     - `<relationshipType>` (e.g., Referred to)
       - The measure's relationship/status with the committee. 
     - `<actionDate>` (e.g., 2012-04-19T13:01:00Z)
       -  The date the `<relationshipType>` occurred.
     - `<updateDate>` (e.g., 2019-02-17T21:10:13Z)
       - The update date of the ????????? HOW DOES THIS RELATE TO THE <actionDate?????

### Subcommittee Bills Item Level 
`<api-root>`
The `<api-root>` is only present in the XML format. 
`<committee-bills>`
 - `<url>` (e.g., https://api.data.gov/congress/v3/committee/house/hspw14/bills?format=xml) 
 - `<count>` (e.g., 762) 
   - `<bills>`
     - `<bill>`
     - `<congress>` (e.g., 112) 
     - `<billType>` (e.g, HR) 
     - `<billNumber>` (e.g., 4000) 
     - `<relationshipType>` (e.g., Referred to) 
     - `<actionDate>` (e.g., 2012-02-10T19:15:03Z)  
     - `<updateDate>` (e.g., 2019-02-17T21:05:45Z) 


### Nominations Item Level
`<api-root>`
The `<api-root>` is only present in the XML format. 
`<nominations>`
 - `<item>`
    - `<congress>` (e.g., 117)
    - `<number>` (e.g., 2439)
    - `<partNumber>` (e.g., 00)
    - `<citation>` (e.g., PN2439)
    - `<description>` (e.g., Araceli Martinez-Olguin, of California, to be United States District Judge for the Northern District of California, vice Jeffrey S. White, retired.”)
    - `<receivedDate>` (e.g., 2022-08-01)
    - `<nominationType>`
      - `<name>` (e.g., Government Policy and Supporting Positions)
      - `<isCivilian>` (e.g., True)
      - `<inMilitary>` (e.g., False)
      - `<updateDate>` (e.g., 2022-08-02 04:25:19+00:00)
      - `<latestAction>`
        - `<actionDate>`(e.g., 2022-08-01)
        - `<text>` (e.g., Received in the Senate and referred to the Committee on the Judiciary.)
      - `<url>` (e.g., https://api.data.gov/congress/v3/nomination/117/2439?format=xml)
