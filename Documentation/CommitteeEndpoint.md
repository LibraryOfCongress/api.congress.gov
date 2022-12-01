# Committee endpoint
## Coverage
Coverage information for committee data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about committee data at [About Committees and Committee Materials](https://www.congress.gov/help/committee-materials) and committee name data at [Committee Name History](https://www.congress.gov/help/committee-name-history) on Congress.gov.
## OpenAPI Specification
View OpenAPI Specification on the committee API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/committee/committee_list). 
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
Note that committee items at the list level can be filtered down by congress (e.g. 117) and by chamber (e.g. House) – https://api.congress.gov/v3/committee/117/house?api_key=).

`<api-root>`

The `<api-root>` is only present in the XML format. 

`<committees>`

 Parent container for committees and subcommittees. A `<committees>` element may contain the following children:
 - `<item>`
   - Container for an individual committee or subcommittee. An `<item>` element is repeatable and may contain the following children: 
     - `<url>` (e.g., https://api.congress.gov/v3/committee/house/hspw00)
       - A referrer URL to the committee or subcommittee item in the API.     
     - `<systemCode>` (e.g., hspw00)
        -	Unique ID value for the committee or subcommittee. The first letter represents the chamber, i.e., House, Senate, or Joint. The two numerals at the end of the `<systemCode>` indicate whether the entity is a full committee or subcommittee. Full committees are represented by a double zero and subcommittees will have an identical systemCode as its parent committee but with numerals other than the double zero.  
     - `<name>` (e.g., Transportation and Infrastructure Committee)
        -	The name of the committee or subcommittee.
     - `<parent>`
       - Container for parent committee information providing an indication of whether the subcommittee has a parent. A `<parent>` element may contain the following children:
       		- `<url>`
         		- A referrer URL to the parent committee item in the API.
       		- `<systemCode>`
         		- Unique ID value for the parent committee. Parent committee `<systemCode>` values end in a double zero.      
       		- `<name>`
         		- The name of the parent committee.
     - `<subcommittees>`
       - Container for subcommittee information and indication of whether a parent committee has subcommittees. A `<subcommittees>` element is repeatable and may contain the following children: 
       		- `<item>`
         		- Container for an individual subcommittee of the committee. An `<item>` element is repeatable and may contain the following children:
        			 - `<url>` (e.g., https://api.congress.gov/v3/committee/house/hspw14)
        			 	- A referrer URL to the subcommittee item in the API. 
         			- `<systemCode>` (e.g., hspw14)
           				-  The unique ID value for the subcommittee. Subcommittee `<systemCode>` values contain numerals other than a double zero. 
         			- `<name>` (e.g., Railroads, Pipelines, and Hazardous Materials Subcommittee)
           				- The name of the subcommittee.
     - `<chamber>` (e.g., House)
       -  The committee's chamber of origin.
       -  Possible values are "House", "Senate", and "Joint".
     - `<committeeTypeCode>` (e.g., Standing)
       - The type of committee.
       - Possible values are "Commission or Caucus", "Joint", "Other", "Select", "Special", "Standing", "Subcommittee", and "Task Force".
### Item Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<committee>`

Parent container for an individual committee or subcommittee entry. A `<committee>` element may contain the following children:
- `<systemCode>` (e.g., hspw00)
  - The unique ID value for the committee. Parent committee `<systemCode>` values end in a double zero while those for a subcommittee end with numerals other than a double zero.
 - `<parent>`  
 	- Container for parent committee information providing an indication of whether the subcommittee has a parent. A `<parent>` element may contain the following children:
      - `<url>`
        - A referrer URL to the committee's parent in the API.
      - `<systemCode>`
		- The unique ID of the committee's parent. Parent committee `<systemCode>` values end in a double zero. 
      - `<name>`
      	- The name of the committee's parent.  
  - `<updateDate>` (e.g., 2020-02-04T00:07:37Z)
     - The date of update in Congress.gov.
  - `<isCurrent>` (e.g., True)
  	- Flag indicating whether the committee is currently active.
  	- Possible values are "True" or "False". 
  - `<subcommittees>`
      - Container for all of the committee's subcommittee's. The `<subcommittee>` element may contain the following children, which are repeatable:  
      	- `<item>`
       	 	- Container for an individual subcommittee under the committee. The `<item>` element is repeatable and may contain the following children:
         		- `<url>` (e.g., https://api.congress.gov/v3/committee/house/hspw14)
           			- A referrer URL to the subcommittee item in the API.
        		- `<systemCode>` (e.g., hspw14)
          			- The unique ID of the subcommittee. Subcommittee `<systemCode>` values contain numerals other than a double zero.   
        		- `<name>` (e.g., Railroads, Pipelines, and Hazardous Materials Subcommittee)
          			- The name of the subcommittee. 
- `<reports>`
     - Container for committee reports issued by a committee. A `<reports>` element may contain the following children: 
        - `<url>` (e.g., https://api.congress.gov/v3/committee/house/hspw00/reports)
        	- A referrer URL to the committee reports level of the committee API. Click [here](#committee-reports-level) for more information about the committee reports level.
        - `<count>` (e.g., 1373)
          - The number of reports present in the committee's reports API endpoint.  
- `<communications>` 
	- Container for Senate communications associated with a committee. A `<communications>` element may contain the following children (the below data is taken from https://api.congress.gov/v3/committee/senate/ssas00):
		- `<url>` (e.g., https://api.congress.gov/v3/committee/senate/ssas00/senate-communication)
			- A referrer URL to the Senate communications level of the committee API. Click [here](#senate-communications-level) for more information about the Senate communications level. 
		- `<count>` (e.g., 11117)
			- The number of Senate communications in the committee's Senate communications API endpoint.  
- `<bills>`
	- Container for bills associated with a committee. A `<bills>` element may contain the following children:
		- `<url>` (e.g., https://api.congress.gov/v3/committee/house/hspw00/bills)
			- A referrer URL to the bills level of the committee API. Click [here](#bills-level) for more information about the bills level. 
		- `<count>` (e.g., 25313)
			- The number of bills in the committee's bills API endpoint.  
- `<nominations>`
	- Container for nominations associated with a committee. This is exclusive to the Senate. A `<nominations>` element may contain the following children (the below data is taken from https://api.congress.gov/v3/committee/senate/ssas00):
		- `<url>` (e.g., https://api.congress.gov/v3/committee/senate/ssas00/nominations)
			- A referrer URL to the nominations level of the committee API. Click [here](#nominations-level) for more information about the nominations level. 
		- `<count>` (e.g., 20126)
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
  	- Possible values are "Commission or Caucus", "Joint", "Other", "Select", "Special", "Standing", "Subcommittee" and "Task Force".
### Committee Reports Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<reports>`

Parent container for reports issued by a committee. The `<reports>` element may contain the following children, which are repeatable:
 - `<item>`
   - Container for individual reports issued by the committee. The `<item>` container is repeatable and may contain the following children:
   		- `<citation>` (e.g., H. Rept. 109-570)
   			- The citation of the report issued by the committee.  
   		- `<url>` (e.g., https://api.congress.gov/v3/committee-report/109/HRPT/570)
   			- A referrer URL to the committee report item in the API. Documentation for the committee report endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeReportEndpoint.md). 
   		- `<updateDate>` (e.g., 2021-07-10 16:19:06+00:00)
   			- The date of update in Congress.gov. 
   		- `<congress>` (e.g., 109)
   		    - The congress during which the committee report was produced.
   		- `<chamber>` (e.g., House)
   		    - The chamber where the committee report was produced.
   		    - Possible values are "House" and "Senate".
   		- `<type>` (e.g., HRPT)
   		    - The type of report.
   		    - Possible values are "HRPT", "SRPT", and "ERPT".
   		- `<number>` (e.g., 570)
   		    - The assigned committee report number.
   		- `<part>` (e.g., 1)
   		    - The part number of the report.
   		    - Committee reports without parts will have a value of 1. If there are multiple parts, the number value may be 2, 3, etc.

### Bills Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<committee-bills>`

Parent container for bills and resolutions associated with the committee or subcommittee. The `<committee-bills>` element may contain the following children:
 - `<url>` (e.g., https://api.congress.gov/v3/committee/house/hspw00/bills)
   - A referrer URL to the committee's bills level in the API.
 - `<count>` (e.g., 25313)
   - The number of bills and resolutions in the bills level API. 
 - `<bills>`
   - Container for all bills and resolutions associated with the committee. The `<bills>` element may contain the following children:
   		- `<bill>`
   			- Container for individual bills and resolutions associated with the committee. The `<bill>` element is repeatable and may contain the following children:
   				- `<congress>` (e.g., 112)
   					- The Congress during which the bill or resolution was introduced.  
     			- `<billType>` (e.g., HCONRES)
       				- The type of bill or resolution.
       				- Possible values are “HR”, “S”, “HJRES”, “SJRES”, “HCONRES”, “SCONRES”, “HRES” or “SRES”. House committees will not have a bill type value of “SRES” and Senate committees will not have a bill type value of “HRES”.  	   
     			- `<billNumber>` (e.g., 117)
       				- The assigned bill or resolution number.  
     			- `<relationshipType>` (e.g., Referred to)
       				- The relationship of the bill or resolution to the committee. 
     			- `<actionDate>` (e.g., 2012-04-19T13:01:00Z)
       				-  The date the `<relationshipType>` occurred.
    	 		- `<updateDate>` (e.g., 2019-02-17T21:10:13Z)
       				- The date of update in Congress.gov. 
### Nominations Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<nominations>`

Parent container for nominations associated with a Senate committee (the below data is taken from https://api.congress.gov/v3/committee/senate/ssju00/nominations?api_key=). The `<nominations>` element may contain the following children, which are repeatable:
 - `<item>`
 	- Container for individual nominations considered by the Senate committee. The `<item>` element is repeatable and may contain the following children: 
 		- `<congress>` (e.g., 117)
 			- The Congress during which the nomination was received.	  
 		- `<number>` (e.g., 2439)
 			- The assigned nomination number.
 			- Read more about nomination numbering at [About Nominations by the U.S. President](https://www.congress.gov/help/nominations) on Congress.gov. 	  
 		- `<partNumber>` (e.g., 00)
 			- The part number for the individual nomination. Nominations with multiple nominees may be partitioned if the nominees follow different confirmation paths.
 		- `<citation>` (e.g., PN2439)
 			- The citation identifying the nomination. PN indicates "Presidential Nomination" and the digits are the nominations assigned number. If the nomination was partitioned, the citation will include a dash and the partition number (e.g. PN78-4).  
 		- `<description>` (e.g., Araceli Martinez-Olguin, of California, to be United States District Judge for the Northern District of California, vice Jeffrey S. White, retired.)
 			- The description of the nomination.
 		- `<receivedDate>` (e.g., 2022-08-01)
 			- The date the nomination was received from the President.
 		- `<nominationType>`
			- Container for nomination type data. A `<nominationType>` element may contain the following children:
				- `<isCivilian>` (e.g., True)
					- Flag indicating whether the nomination is for a civilian position. 
					- Possible values are "True" or "False".
				- `<inMilitary>` (e.g., False)
					- Flag indicating whether the nomination is for a military position.
					- Possible values are "True" or "False".
		- `<updateDate>` (e.g., 2022-08-02 04:25:19+00:00)
			- Date of update in Congress.gov
		- `<latestAction>`
			- Container for the latest action taken on the nomination. A `<latestAction>` element may contain the following children:
				- `<actionDate>`(e.g., 2022-08-01)
					- The date of the latest action on the nomination.
				- `<text>` (e.g., Received in the Senate and referred to the Committee on the Judiciary.)
					- The text of the latest action taken on the nomination. 
				- `<url>` (e.g., https://api.congress.gov/v3/nomination/117/2439)
					- A referrer URL to the nomination item in the API. Documentation for the nomination endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/NominationEndpoint.md).

### Senate Communications Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<senateCommunications>`

Parent container for communications associated with a Senate committee (the below data is taken from https://api.congress.gov/v3/committee/senate/ssas00/senate-communication?api_key=). The `<senateCommunications>` element may contain the following children, which are repeatable:
 - `<item>`
   - `<chamber>` (e.g., Senate)
     - The chamber where the communication was received. This value will always be set to "Senate".
   - `<number>` (e.g., 1944)
     - The assigned communication number.
   - `<communicationType>`
     - Container for communication type information. A `<communicationType>` element may include the following children:
       - `<code>` (e.g., EC)
         - The code for the type of communication.
         - Possible values are "EC", "POM", and "PM".
       - `<name>` (e.g., Executive Communication)
         - The name of the type of communication.
         - Possible values are "Executive Communication", "Petition or Memorial", and "Presidential Message".
       - `<congress>` (e.g., 117)
         - The congress during which the communication was received.
       - `<referralDate>` (e.g., 2021-09-14)
         - The date the communication was referred to the committee.
       - `<updateDate>` (e.g., 2021-09-15)
         - The date of update in Congress.gov.
       - `<url>` (e.g., https://api.congress.gov/v3/senate-communication/117/ec/1944)
         - A referrer URL to the Senate communication item in the API. Documentation for the Senate communication endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/SenateCommunicationEndpoint.md).
