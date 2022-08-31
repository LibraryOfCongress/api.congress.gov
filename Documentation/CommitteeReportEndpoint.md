# Committee Report endpoint
## Coverage
Coverage information for committee reports data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about committee reports data at [About Committee Reports of the U.S. Congress](https://www.congress.gov/help/committee-reports) on Congress.gov.
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level
Note that committee report items at the list level can be filtered down by congress (e.g. 117) and by report type (e.g. hrpt) – https://api.congress.gov/v3/committeeReport/117/hrpt?api_key=.

`<api-root>`

The `<api-root>` is only present in the XML format. 

`<reports>`

 Parent container for committee reports. A `<reports>` element may include the following children:
 - `<item>`
   - Container for an individual committee report. An `<item>` element is repeatable and may include the following children: 
     - `<citation>` (e.g., H. Rept. 117-351)
	   - The report's citation, which consists of the report type, congress number, and the assigned report number. 
	 - `<url>` (e.g., https://api.congress.gov/v3/committeeReport/117/HRPT/351)
	 	- A referrer URL to the report item in the API.
     - `<updateDate>` (e.g., 2022-08-13 19:26:27+00:00)
       -  The date of update in Congress.gov

### Item Level
`<api-root>`

The `<api-root>` is only present in the XML format. 

`<committeeReports>`

Parent container for multiple committee report parts within a single report. A `<committeeReports>` element may include the following children:
 -  `<committeeReport>`
    - Container for a single report or report part. A `<committeeReport>` element may include the following children:
	  - `<committees>`
        - Container for the committees associated with a report. A `<committees>` element may include the following children, which are repeatable:
        	- `<item>` 
        		- Container for an individual committee associated with a report. An `<item>` element is repeatable and may include the following children:
        			- `<url>` (e.g, https://api.congress.gov/v3/committee/house/hsba00)
        				- A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
        			- `<systemCode>` (e.g., hsba00)
        				- Unique ID value for the committee.
        			- `<name>` Financial Services Committee
        				- The name of the committee.
	  - `<congress>` (e.g., 117)
	  	- The Congress in which the committee report was produced. 
	  - `<chamber>` (e.g., House)
	  	- The chamber where the committee report was produced.
	  	- Possible values are "House" and "Senate".
	  - `<congSession>` (e.g., 2)
	  	- The session of congress during which the report was produced.
	  	- Possible values are "1" and "2".
	  - `<citation>` (e.g., H. Rept. 117-351)
	  	- The report's citation, which consists of the report type, congress number, and the assigned report number. 
	  - `<reportNumber>` (e.g., 351)
		- The assigned committee report number.
	  - `<partNumber>` (e.g., 1)
		- The part number of the report. 
		- Committee reports without parts will have a value of 1. If there are multiple parts, the number value may be 2, 3, etc.
	  - `<reportTypeCode>` (e.g, HRPT)
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
	 		- `<url>` (e.g., http://api.congress.gov/v3/committeeReport/117/hrpt/351/text)
	 			- A referrer URL to the text level of the committee report API. Click [here](#text-level) for more information about the text level. 
		      
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
		    - `<url>` (e.g., 117/crpt/hrpt351/generated/CRPT-117hrpt351.htm)
			  - The URL for the text version format for the committee report. 
			  - Work is scheduled to make the URL absolute, instead of relative.
			- `<type>` (e.g., Formatted Text)
			  - The format type for the committee report text. 
			  - Possible values are "Formatted Text" and "PDF".
