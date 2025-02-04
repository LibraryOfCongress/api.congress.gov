This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED. Milestones are also used to tag issues in this repository with expected production release date information.
# UPCOMING March 2025, Part 2 | [Milestone]()
**Expected Production Release Date: March 31, 2025**
## Change #1 
### Impacted endpoint: All committee report endpoints
There is currently a discrepancy between the web and the API for committee reports. The web app does not display reports for which Congress.gov has not yet received text and metadata from GPO, but the API does. This will be addressed and fixed. 
## Change #2
### Impacted endpoint: All committee endpoints 
When calling the /committee endpoint,  a 500 error response when using a `fromDateTime` parameter with certain dates is passed. This will be addressed and fixed. This is related to [Issue #290](https://github.com/LibraryOfCongress/api.congress.gov/issues/290).
## Change #3
### Imapcted endpoint: General API
A user submitted [pull request](https://github.com/LibraryOfCongress/api.congress.gov/pull/300) will be reviewed. This relates to [Issue #299](https://github.com/LibraryOfCongress/api.congress.gov/issues/299) and [Issue #280](https://github.com/LibraryOfCongress/api.congress.gov/issues/280).
## Change #4 
### Imapcted endpoint: /bill/{congress}/{billType}/{billNumber}/text
A CORS error message will be invesigated. This is related to [Issue #292](https://github.com/LibraryOfCongress/api.congress.gov/issues/292). 
# UPCOMING March 2025, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/42)
**Expected Production Release Date: March 10, 2025**
## Change #1 
### Impacted endpoints: NEW Congressional Research Service (CRS) Reports Endpoints
A new list-level endpoint will be created that returns CRS Report data. A new detail-level endpoint will be created that returns detailed information for a particular CRS Report. Updated documentation with relevant information on data elements will be uploaded to the documentation section of this Git repository when the new endpoints go live. These new endpoints are related to [Issue #19](https://github.com/LibraryOfCongress/api.congress.gov/issues/19).
## Change #2
### Impacted endpoint: N/A 
When searching for the Congress.gov API, Google search results currently direct users to gpo.congress.gov. A new canonical URL will solve this issue. This is related to [Issue #302](https://github.com/LibraryOfCongress/api.congress.gov/issues/302).
## Change #3
### Impacted endpoint: /committee-meeting 
An error message for certain committee meetings will be investigated and fixed. This seems to be impacting committee meetings that have a "LC" at the start of their meeting ID.
# UPCOMING February 2025 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/41)
**Expected Production Release Date: February 18, 2025**
## Change #1
### Impacted Endpoints: **NEW** House Roll Call Votes endpoints
New beta House Roll Call Votes API endpoints are targeted for release. The House Roll Call Votes endpoints will consist of a list level, an item level, and a member votes level for 2003-present (beginning with the 108th Congress). The list level is filterable by congress and session. Detailed information about each roll call vote will be available at the item level. Detailed information about member votes will be available at the member vote level. The endpoints, once development work is completed, are planned to be:
1. api.congress.gov/v3/house-vote
2. api.congress.gov/v3/house-vote/{congress}
3. api.congress.gov/v3/house-vote/{congress}/{session}
4. api.congress.gov/v3/house-vote/{congress}/{session}{rollCallVoteNumber}
5. api.congress.gov/v3/house-vote/{congress}/{session}/{rollCallVoteNumber}/members
   
This is related to [Issue #64](https://github.com/LibraryOfCongress/api.congress.gov/issues/64).
## Change #2
### Impacted endpoints: /bill/{congress}/{billType}/{billNumber}, /amendment/{congress}/{amendmentType}/{amendmentNumber}
On behalf of sponsor data will be incorporated into the Congress.gov API where applicable (for certain bills and amendments).
## Change #3
### Impacted endpoint: /committee-report
The date format will be adjusted for consistency so that it is YYYY-MM-DDT00:00:00Z. **This ongoing work from a previous sprint.**
## Change #4
### Impacted endpoint: /committee-meeting
Filters will be added to the /committee-meeting endpoint. Users will have the ability to filter off of the `updateDate` via `fromDateTime` and `toDateTime` parameters. This is related to [Issue #158](https://github.com/LibraryOfCongress/api.congress.gov/issues/158). **This ongoing work from a previous sprint.**
## Change #5
### Impacted endpoint: /committee
Certain committee names are reverting to their older, previous Congress committee names. This bug will be investigated and fixed. 
# COMPLETED January 2025, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/40)
## Change #1
### Impacted endpoints: /treaty/{congress}/{treatyNumber}/{treatySuffix} and /treaty/{congress}/{treatyNumber}/{treatySuffix}/actions
An error message when searching for a treaty with a lower case suffix (e.g., "a") was investigated and fixed. This was related to [Issue #252](https://github.com/LibraryOfCongress/api.congress.gov/issues/252). 
## Change #2
### Impacted endpoint: /daily-congressional-record
When requesting a record from the daily-congressional-record API, links to the "Formatted Text" version of `entireIssue` do not include all of the text from the Daily Congressional Record. Because an HTML version is not made available for the entire issue, this section will be removed. HTML version of individual sections of the Daily Congressional Record will continue to be available in the Congress.gov API. This is related to [Issue #220](https://github.com/LibraryOfCongress/api.congress.gov/issues/220). **This is ongoing work from a previous sprint**. 
# Completed January 2025, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/39)
## Change #1
### Impacted endpoint: /bill/{congress}/{billType}
The bill list-level API endpoint no longer returns at least one item out of order when requested with the sort=updateDate+desc parameter. This was investigated and fixed. This was related to [Issue #231](https://github.com/LibraryOfCongress/api.congress.gov/issues/231).
## Change #2
### Impacted endpoint: /congress
An `<updateDate>` element was added to the Congress endpoint. This was related to [Issue #117](https://github.com/LibraryOfCongress/api.congress.gov/issues/117). 
# COMPLETED December 2024 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/38)
## Change #1
### Impacted endpoint: /daily-congressional-record
The daily Congressional Record API endpoints were adjusted so that the default sort is by `<updateDate>`. This was related to [Issue #223](https://github.com/LibraryOfCongress/api.congress.gov/issues/223). 
## Change #2
### Impacted endpoint: /committee-report
The committee report API endpoints were adjusted so that the default sort is by `<updateDate>`. This was related to [Issue #224](https://github.com/LibraryOfCongress/api.congress.gov/issues/224).
# COMPLETED November 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/37)
## Change #1
### Impacted endpoint: /committee-meeting
The date format was adjusted for consistency so that it is YYYY-MM-DDT00:00:00Z.
## Change #2
### Impacted endpoint: /member/congress/{congress}
A bug in the /member/congress/{congress} endpointwas investigated to ensure that accurate data for member districts is rendering properly. This was partially related to [Issue #243](https://github.com/LibraryOfCongress/api.congress.gov/issues/243). 
# COMPLETED November 2024, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/36)
## Change #1
### Impacted endpoint: /member
The /members endpoint is currently not returning the full set for the requested limit when within the range of the first page. It's currently one member short. For example, requesting with a limit of 20 yields 19 items. This will be investigated and fixed. Related to [Issue #212](https://github.com/LibraryOfCongress/api.congress.gov/issues/212). 
## Change #2
### Impacted endpoint: /senate-communication
The Senate communication API endpoints will be adjusted so that the default sort is by `<updateDate>`. This is related to [Issue #218](https://github.com/LibraryOfCongress/api.congress.gov/issues/218).
## Change #3
### Impacted endpoint: /member/congress/{congress}
A bug with retrieving member data by Congress will be investigated. Pre-118th Congresses appear to be impacted. This is related to [Issue #263](https://github.com/LibraryOfCongress/api.congress.gov/issues/263).
## Change #4
### Impacted endpoint: /house-communication
The House communication API endpoints will be adjusted so that the default sort is by <updateDate>. This is related to [Issue #217](https://github.com/LibraryofCongress/api.congress.gov/issues/217). 
# COMPLETED October 2024 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/35)
## Change #1
### Impacted endpoint: /amendment/{congress}/{amendmentType}/{amendmentNumber}/text
An error message impacting some House amendments was investigated and fixed. This is related to [Issue #205](https://github.com/LibraryOfCongress/api.congress.gov/issues/205). 
## Change #2
### Impacted endpoint: /committee-print
The committee print API endpoints was adjusted so that the default sort is by `<updateDate>`. This is related to [Issue #213](https://github.com/LibraryOfCongress/api.congress.gov/issues/213).
## Change #3
### All member endpoints
An issue related to inaccurate member data when filtering via `currentMember=True` was investigated and fixed. This is related to [Issue #269](https://github.com/LibraryOfCongress/api.congress.gov/issues/269). 
## Change #4
### Impacted endpoint: /committee
An `<updateDate>` element was added to the committee list-level endpoint. This is partially related to [Issue #117](https://github.com/LibraryOfCongress/api.congress.gov/issues/117). 
## Change #5
### DOCUMENTATION
An updated swagger file was uploaded to the Git repository. 
# COMPLETED September 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/34)
## Change #1
### Impacted endpoint: bill/{congress}/{billType}/{billNumber}/cosponsors
For bills in the 1973-1980 (93rd, 94th, 95th, and 96th Congresses) bills for which we do NOT have cosponsorship dates, an error message that appeared in the Congress.gov API was investigated and fixed.
## Change #2
### Impacted endpoint: /member/congress/{congress}/{stateCode}/{district}
Network errors were investigated and fixed in the /member/congress/:congress/:stateCode/:district endpoint. This was related to [Issue #257](https://github.com/LibraryOfCongress/api.congress.gov/issues/257).
**This work is ongoing from a previous sprint**
# COMPLETED September 2024, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/33)
## Change #1
### Impacted endpoint: /bill
14 pieces of legislation from the 118th Congress were missing in the bill list-level API endpoint. This was investigated and fixed. This is related to [Issue #233](https://github.com/LibraryOfCongress/api.congress.gov/issues/233). 
## Change #2
### Impacted endpoint: /bill
The Bill list-level endpoint was showing one <updateDate> element. This automatically defaults to the `<updateDateIncludingText>` when available, which can be confusing to users. 

The following elements were incorporated into the Bill list-level endpoint: 

1. The `<updateDate>` element (without text).
2. The `<updateDateIncludingText>` element.

This is related to [Issue #261](https://github.com/LibraryOfCongress/api.congress.gov/issues/261).
## Change #3
### Impacted endpoint: /hearing
The hearing API endpoints were adjusted so that the default sort is by `<updateDate>`. This is related to [Issue #215](https://github.com/LibraryOfCongress/api.congress.gov/issues/215).
# COMPLETED August 2024 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/32)
**Expected Production Release Date: August 12, 2024**
## Change #1
### Impacted endpoint: /member/congress/{congress}/{stateCode}/{district}
Network errors will be investigated and fixed in the /member/congress/:congress/:stateCode/:district endpoint. This is related to [Issue #257](https://github.com/LibraryOfCongress/api.congress.gov/issues/257). 
## Change #2
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}/subjects
An `<updateDate>` element will be added to each subject term `<name>` element in the bill titles-level endpoint.
## Change #3
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}/titles
An `<updateDate>` element will be added to each `<title>` element in the bill subject-level endpoint.
# COMPLETED JULY 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/30)
## Change #1
### Impacted endpoint: /amendment/{congress}/{amendmentType}/{amendmentNumber}, /amendment/{congress}/{amendmentType}/{amendmentNumber}/actions
Inconsistencies in the count for amendment actions between API endpoints was investigated and fixed. This is related to [Issue #246](https://github.com/LibraryOfCongress/api.congress.gov/issues/246). 
## Change #2
### Impacted endpoint: /bill
The `<updateDate>` on the Bill record is being constantly updated. This was investigated. This is related to [Issue #201](https://github.com/LibraryOfCongress/api.congress.gov/issues/201). 
# COMPLETED July 2024, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/31)
## Change #1
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}/text
Developers adjusted how the API counts <textVersions> so that it includes law texts, slip law texts, and statute texts. 
## Change #2
### Impacted endpoint: /committee-meeting
The 'NoChamberMeetingVideo' API error in the /committee-meeting endpoint was investigated and fixed. 
## Change #3
### Impacted endpoint: /member
When `currentMember` was set to false the API did not return the prop at all. After this patch, the member endpoint now returns `"currentMember": false` in applicable scenarios.
# COMPLETED June Documentation Update
## Change #1
The API's swagger definition file was added to the repository which will allow users to streamline the process of generating a Typescript API service using tools like NSwag. This is related to [Issue #29](https://github.com/LibraryOfCongress/api.congress.gov/issues/29) and [Issue #128](https://github.com/LibraryOfCongress/api.congress.gov/issues/128). You can view the swagger definition file [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/swagger.yaml). 
# COMPLETED JUNE 2024 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/29)
## Change #1
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}/actions
When the bill actions list item included a link to the corresponding Clerk House Roll Call Vote, the link it returned was invalid for roll call votes numbered 70 and higher in the 118th Congress. This was investigated and fixed. This was related to [Issue #210](https://github.com/LibraryOfCongress/api.congress.gov/issues/210).
## Change #2
### Impacted endpoint: /committee
A bug in the Committee list-level endpoint threw an "UnboundLocalError" when including "fromDateTime" and "toDateTime" parameters in the call. This was investigated and fixed. 
## Change #3
### Impacted endpoint: /amendment/{congress}/{admendmentType}/{amendmentNumber}/text
The amendment text-level endpoint's `<URL>` element in the `<textVersions>` container was modified so that it returns the actual text content from the linked webpages. This was related to [Issue #206](https://github.com/LibraryOfCongress/api.congress.gov/issues/206). 
## Change #4
### Impacted endpoint: /member
The API was refined to return current members for particular districts. This was related to work completed in [Issue #30](https://github.com/LibraryOfCongress/api.congress.gov/issues/30).
# COMPLETED May 2024 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/28)
## Change #1
### Impacted endpoint: /member/congress/{congressNumber}/{stateCode}/{district}
The ability to filter members by state, district, and/or whether they are a current member was investigated and implemented within the member endpoint.This is related to [Issue #30](https://github.com/LibraryOfCongress/api.congress.gov/issues/30).
## Change #2
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}/titles
A `<titleTypeCode>` element was added to the /bill/{congress}/{billType}/{billNumber}/titles endpoint. Bill endpoint documentation was updated to account for this new element. Please refer to the updated [documentation](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md) for a list of common title type codes. 
# COMPLETED April 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/27)
## Change #1
### Impacted endpoint: /law/{congress}, /law/{congress}/{lawType}, and /law/{congress}/{lawType}/{lawNumber}
A law endpoint was added to the bill endpoint. Users are now able to filter law by congress, law number, and if the law is public or private. This is related to [Issue #225](https://github.com/LibraryOfCongress/api.congress.gov/issues/225).
## Change #2
### Impacted endpoint: /member/congress/{congress}
A new endpoint now returns member data specified by Congress. This is PARTIALLY related to [Issue #30](https://github.com/LibraryOfCongress/api.congress.gov/issues/30).
## Change #3
### Impacted endpoint: /congress/current
A new /current endpoint now returns detailed information for the current Congress. 
# COMPLETED APRIL 2024 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/26)
## Change #1
### Impacted endpoint: hearing
An error message in the hearing endpoint was investigated and fixed. This is related to [Issue #166](https://github.com/LibraryOfCongress/api.congress.gov/issues/166)
## Change #2
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}/committees 
The bill endpoint's committees level was changed so that it returns a pagination object. This is related to [Issue #56](https://github.com/LibraryOfCongress/api.congress.gov/issues/56) 
# COMPLETED March 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/25)
**Expected Production Release Date: March 18, 2024**
## Change #1
### Impacted endpoint: /committee
The committee endpoint will be investigated to verify that all current committees have "isCurrent" values of "true" and not "false."
## Change #2
### Impacted endpoint: /v3/committee-meeting/118/house/116205
An error message associated with House of Represenatives committee meeting ID 116205 will be investigated and fixed. 
## Change #3
### Impacted endpoint: /committee-meeting/{congress}/{chamber}/{eventId}
For Senate committee meeting video data, there will be two URLs in the API response:

1. Senate.gov URL
2. Congress.gov URL
   
For House of Representatives committee meeting video data, there will be two URLs in the API response:

1. YouTube Video URL
2. Congress.gov URL

This is related to [Issue #141](https://github.com/LibraryOfCongress/api.congress.gov/issues/141). Additionally, [Issue #196](https://github.com/LibraryOfCongress/api.congress.gov/issues/196) will be addressed in this change.
*This work is ongoing from a previous sprint*
## Change #4
### Impacted endpoint: committee-report
Accessing the certain committee report urls throws a 500 error and an error about "NoneType" `('NoneType' object does not support item assignment (TypeError)).` Ideally, if the report doesn't exist, a 403 error should be thrown, with a "No Committee Report matches this query" message. These issues will be investigated and fixed. 
*This work is ongoing from a previous sprint*
# COMPLETED March 2024, Part 1 
## Change #1 
### API Rate Limit
The API rate limit is now 5000 requests per hour. 
## Change #2
### Impacted endpoint: /committee
We are at the beginning of an effort to populate data for the following elements, when available: `<establishingAuthority>`, `<locLinkedDataId>`, `<superintendentDocumentNumber>`, and `<naraId>`
## Change #3
### Impacted endpoint: /committee
We are at the beginning of an effort to produce committee authority records for standing committees terminated prior to 1973. Examples include: 
- U.S. House of Representatives. Committee on Patents. 
- API: https://api.congress.gov/v3/committee/house/n79036852?api_key=[INSERT_KEY]

- U.S. Senate. Committee on Immigration. 
- API: https://api.congress.gov/v3/committee/senate/no00001702?api_key=[INSERT_KEY]

# COMPLETED February 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/24)
## Change #1
### Impacted endpoint: member
Developers will investigate why empty member tags are created and prevent this from happening in the API. This is related to [Issue #183](https://github.com/LibraryOfCongress/api.congress.gov/issues/183).
## Change #2
### Impacted endpoint: /member/L000174/cosponsored-legislation
A bug that is impacting the return of results related to Senator Leahy's cosponsored legislation will be investigated and fixed. 
## Change #3
### Impacted endpoints: ALL
Intermittent API timeout issues reported in [Issue #147](https://github.com/LibraryOfCongress/api.congress.gov/issues/147) will be investigated and fixed. 
##### **This work is ongoing from a previous sprint.**
# COMPLETED February 2024, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/23)
## Change #1
### Impacted endpoint: committee
Related to [Issue #162](https://github.com/LibraryOfCongress/api.congress.gov/issues/162), the API was updated to account for new committee codes. This addressed error messages reported by users regarding the committee endpoint. 
## Change #2
### Impacted endpoint: /senate-communication
The following format is now used throughout the Senate Communications API endpoint at both the list and detail level: YYYY-MM-DDT00:00:00Z.
## Change #3
### Impacted endpoints: ALL
Recurring network errors were investigated and fixed, which relates to ongoing load test work. 
##### **This work is ongoing from a previous sprint.**
## Change #4
### Impacted endpoints: ALL
Load tests were conducted to investigate if it is possible to increase the maximum number of calls per hour in the API.
##### **This work is ongoing from a previous sprint.**
# COMPLETED January 2024, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/22)
## Change #1
### Impacted endpoint: /treaty/{congress}/{treatyNumber}/committees
An error message, which was occuring when calls were made to the /treaty/{congress}/{treatyNumber}/committees, was  investigated and fixed. This is related to [Issue #60](https://github.com/LibraryOfCongress/api.congress.gov/issues/60).
## Change #2
### Impacted endpoint: all /treaty endpoints
When requesting data related to a partioned treaty (e.g., TD 106-37A or TD 106-37B), the lower case suffix is now supported in API calls (e.g., 106-37a). This is related to [Issue #153](https://github.com/LibraryOfCongress/api.congress.gov/issues/153).
## Change #3
### Impacted endpoint: /member
Congress.gov URLs were duplicating for certain members in the /member endpoint. This bug was addressed and fixed.  This was related to [Issue #156](https://github.com/LibraryOfCongress/api.congress.gov/issues/156).
## Change #4
### Impacted endpoint: /bill
The bill endpoint was updated so it can accomodate historical bill data. In earlier Congresses, such as those of the late 18th and early 19th centuries, there will be instances where bill numbering is not clear or evident. At this point in time, Congressional staff had not yet standardized how bills get numbered. Thus, there are instances where two legitimate bills have been assigned the same number. To make a distinction between the first session-introduced bill and the second session-introduced bill we add the “introduction date” to the URLs for these bills on Congress.gov. However, this distinction is not evident when returning data within the Congress.gov API. The API was adjusted to do this. This was related to [Issue #161](https://github.com/LibraryOfCongress/api.congress.gov/issues/161).
# COMPLETED January 2024, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/21)
## Change #1
### Impacted endpoint: /bill/{congress}/{billType}/{billNumber}
The `<originChamberCode>` element was added to the detail level in the bill endpoint. 
## Change #2
### Impacted endpoint: /committee-meeting/{congress}/{chamber}/{eventID}
Error messages associated with specific event IDs in the committee-meeting endpoint were investigated and fixed fixed. This is related to issues https://github.com/LibraryOfCongress/api.congress.gov/issues/129 and https://github.com/LibraryOfCongress/api.congress.gov/issues/173.
## Change #3
### Impacted endpoint: /treaty
Several elements at the list level within the treaty endpoint were renamed. These include: 
1. `<congress>` to be `<congressReceived>`
2. `<endCongressId>` to be `<congressConsidered>`
3. `<treatyNum>` to be `<number>`
4. `<treatySuffix>` to be `<suffix>`
5. `<treatySubject>` to be `<topic>`
   
Several elements at the detail level within the treaty endpoint were renamed. These include: 
1. `<congress>` to be `<congressReceived>`
2. `<endCongressId>` to be `<congressConsidered>`
3. `<treatyNum>` to be `<number>`
4. `<treatySuffix>` to be `<suffix>`
5. `<treatySubject>` to be `<topic>`
6. `<oldTreatyNum>` to be `<oldNumber>`
7. `<oldTreatyNumDisplayStr>` to be `<oldNumberDisplayName>`
8. `<name>` (within relatedDocs.item) to be `<citation>`
9.  referrer URL values to relatedDoc items (within relatedDocs.item.url) will use the current API base URL for v3 - https://api.congress.gov/v3...)
    
These elements were added:
1. A `<countriesParties>` container element (under `<treaty>`).
2. Within each new `<countriesParties>` container element, an `<item>` container was added. In the `<item>` container a `<name>` element is present with the treaty partner name.
3. An `<indexTerms>` container element with an `<item>` for each item. In each `<item>` container, a `<name>` element was added for each index term.
4. A `<titles>` container element under `<treaty>`, which contains an `<item>` container with a `<title>` element and `<titleType>` element.

## Change #4
### Impacted endpoint: all /hearing endpoints
The hearing API endpoints returned the `<updateDate>` element in the following format: `2023-07-14 10:14:22+00:00`. This format differed from other endpoints, which returns in the following format `2023-07-14T10:14:22Z`. The following format is now used throughout the hearings API endpoint at both the list and detail level: `YYYY-MM-DDT00:00:00Z`. 
## Change #5 
### Impacted endpoint: all /amendment detail-level endpoints
The amendments endpoint was investigated so that the `<updateDate>` elements match between the detail and list levels. 
# COMPLETED December 2023| [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/20)
## Change #1
### Impacted endpoints: all /amendment endpoints
The amendments endpoint was investigated so that the updateDate element match between the detail and list levels. This is related to [issue #112](https://github.com/LibraryOfCongress/api.congress.gov/issues/112).
## Change #2
### Impacted endpoints: all /committee-meeting endpoints
URLs in the /committee-meeting endpoint now have the appropriate committee withing the URL. The URLs were investigated and corrected so that the correct committee is labeled within the URL. For example, URLs for the House Agriculture committee now have "house-agriculture."
## Change #3
### Impacted endpoints: all /member endpoints
Developers investigated and fiedx the API code so that members who have resigned but were members of the 118th Congress no longer have the `<currentMember: true>` value in their API call. 
## Change #4
### Impacted endpoint: /amendment/{congress}/{amendmentType}/{amendmentNumber}/text
For the 117th Congress and onwards, a new amendment text endpoint was made available to API users for Senate amendments and some House amendments. This change is related to [issue #18](https://github.com/LibraryOfCongress/api.congress.gov/issues/18).
## Change #5
### Impacted endpoint: /bound-congressional-record
Large bound Congressional Record PDFs were investigated to see how they can be incorporated in the /bound-congressional-record endpoint. 
# COMPLETED October 2023, Part 2| [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/18)
## Change #1 
### Impacted endpoints: /amendment/{congress}/{amendmentType}/{amendmentNumber}/actions
Developers investigated and fixed actions in the /amendment/{congress}/{amendmentType}/{amendmentNumber}/actions endpoint that have just an `<actionDate>` field with no additional elements or additional metadata present. Additional elements, such as `<text>` and `<type>`, weree added for context. This change is related to [issue #109](https://github.com/LibraryOfCongress/api.congress.gov/issues/109). 
## Change #2
### Impacted endpoint: /nomination list level endpoints
The nominations list API returned the `<updateDate>` element in the following format: `2023-07-14 10:14:22+00:00`. This format differed from the nomination details API which returns in the following format `2023-07-14T10:14:22Z`. The following format is now used throughout the nominations API endpoint at both the list and detail level: `YYYY-MM-DDT00:00:00Z`. This relates to [issue #113](https://github.com/LibraryOfCongress/api.congress.gov/issues/113).
## Change #3
##### Impacted endpoints: /committee, /committee/{chamber}, /committee/{congress}, /committee/{congress}/{chamber}, /committee/{chamber}/{committeeCode}, /committee/{chamber}/{committeeCode}/bills, /committee/{chamber}/{committeeCode}/reports, /committee/{chamber}/{committeeCode}/nominations, /committee/{chamber}/{committeeCode}/house-communication, /committee/{chamber}/{committeeCode}/senate-communication
Committees were adjusted and updated in the 118th Congress so that `<isCurrent>` values reflect current, existing committees. This work is related to [issue #95](https://github.com/LibraryOfCongress/api.congress.gov/issues/95).
# COMPLETED October 2023, Part 1| [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/17)
## Change #1
### Impacted endpoints: all committee endpoints 
Certain offset values were returning error messages in the committee endpoint. This error message was investigated and fixed. This change is related to [issue #116](https://github.com/LibraryOfCongress/api.congress.gov/issues/116).  
## Change #2
##### Impacted endpoints: /nomination, /nomination/{congress}, /nomination/{congress}/{nominationNumber}, /nomination/{congress}/{nominationNumber}/{ordinal}, /nomination/{congress}/{nominationNumber}/actions, /nomination/{congress}/{nominationNumber}/committees, /nomination/{congress}/{nominationNumber}/hearings
The API code was reviewed to ensure that we are using the nomination's entityUpdateDate and not just its updateDate (which will only capture the nomination level metadata changes). 
## Change #3
### Impacted endpoints: bill, bill/{congress}, bill/{congress}/{chamber}, bill/{congress}/{chamber}/{billNumber}
A bug related to formerly reserved bills titles and actions was investigated. Title and other actions updates were not being recorded properly for reserved bills that are no longer reserved bills. A reserved bill is, per House of Representatives internal rules of procedure, a bill number reserved for use by the Speaker of the House of Representatives or the Minority Leader in the House of Representatives.
## Change #4
### Impacted endpoint: bill/{congress}
A bug in bill/{congress} endpoint was investigated and fixed. Users are having issues with returning results in the /bill/{congress} API when filtering by `<fromDateTime>` and `<toDateTime>`. This was related to [issue #111](https://github.com/LibraryOfCongress/api.congress.gov/issues/111). Developer research found that the `<fromDateTime>` and `<toDateTime>` parameters specify the date of the last update received for the legislative entity.  It’s not a date corresponding to the legislative date or legislative action date.  For example, if HR 90000 was introduced in early March but was then updated due to a Congressional Research Service (CRS) summary of it in September, a search of bills limited to March-June wouldn't find it because the summary was updated in September. 
## Change #5
### Impacted endpoint: /house-communication/{congress}/{communicationType}/communicationNumber
In response to user feedback, the house-communication endpoint was fixed so that certain communications no longer return a "list index out of range (IndexError)" error message. This is related to [issue #121](https://github.com/LibraryOfCongress/api.congress.gov/issues/121).
# COMPLETED September 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/16)
## Change #1
### Impacted endpoints: /hearing, /hearing/{congress}, /hearing{congress}/{chamber}, /hearing{congress}/{chamber}/{jacketNumber}
In the hearings API, at hearing items, a referrer URL element will be added to the associated committee meeting item in the API (if available). A `<url>` element will be added, when applicable, under the `<associatedMeeting>` container element.
## Change #2
### Impacted endpoints: all committee-meeting endpoints
Committee meeting events with no location (e.g., 'Data will display when it becomes available') specified on Congress.gov (see below) are returning an error message in the API. This error message will be investigated and fixed so that committee meeting events without location data still return relevant data. This change is related to [issue #122](https://github.com/LibraryOfCongress/api.congress.gov/issues/122).
## Change #3
### Impacted endpoints: all endpoints in the congress.gov API
Lower case parameters (e.g., "hr") have been the default in the API and the documentation reflects this on api.congress.gov. However, some endpoints <b>unofficially</b> allowed for upper case parameters (e.g., "HR"). As a result of upgrades in our web framework, which is the underlying library that we use to implement the API, this is no longer available. Please use lower case parameters. For example, in this search (https://api.congress.gov/v3/bill/117/hr/3076?api_key=[INSERT_KEY]), "hr" is lower case.    
# COMPLETED August 2023, Part 2
## Change #1
### Impacted endpoint: bound-congressional-record
Endpoints were created for the bound Congressional Record. The `<bound-congressional-record>` endpoint consists of a list level and a detail page. At the list level (<https://api.congress.gov/v3/bound-congressional-record>);  filtering by year (<https://api.congress.gov/v3/bound-congressional-record/{year}>) and by year and month (<https://api.congress.gov/v3/bound-congressional-record/{year}/{month}>) will be allowed. Data elements at the list level  include: date, volume number, congress, session number, and update date. 
# COMPLETED August 2023, Part 1 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/15)
## Change #1
### Impacted endpoint: house-communication (list level) 
Related to ongoing work on the house-communication endpoint and [issue #103](https://github.com/LibraryOfCongress/api.congress.gov/issues/103), the house-communication list-level endpoint was fixed so that it returns a full list of House communications. 
## Change #2
### Impacted endpoints: bill, bill/{congress}, bill/{congress}/{chamber}, bill/{congress}/{chamber}/{billNumber}
Reserved bill data was re-added to the API. A reserved bill is, per House of Representatives internal rules of procedure, a bill number reserved for use by the Speaker of the House of Representatives or the Minority Leader in the House of Representatives. The Congress.gov API was updated to include these reserved bill numbers. 
## Change #3
### Impacted endpoint: daily-congressional-record/{volumeNumber}/{issueNumber} 
Work on the Daily Congressional Record endpoints continued at the issues level (which also has the section level information). This endpoint now features a list level (created in the previous sprint) and a detail page. The detail page includes:  date, volume number, congress, session number, update date, start and end pages for the Daily Digest, name, type, and URL. 
# COMPLETED July 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/14)
## Change #1
### Impacted endpoint: daily-congressional-record
A list level endpoint was created for the daily Congressional Record. The new endpoint is availabe from <https://api.congress.gov/v3/daily-congressional-record>. At the list level, filtering by volume number (e.g., https://api.congress.gov/v3/daily-congressional-record/168) is now allowed. 
## Change #3
### Impacted endpoint: house-requirement
The `<submittingOfficial/>` was suppressed when empty in the House Requirement API item level (e.g., at <https://api.congress.gov/v3/house-requirement/8070?api_key=DEMO_KEY>).
## Change #4
### Impacted endpoint: committee-print
The `<number/>`, `<associatedBill/>`, and `<committees/>` were supressed when empty in the Committee Print API item level (e.g., at <https://api.congress.gov/v3/committee-print/118/house/50485?api_key=DEMO_KEY>).
## Change #5
### Impacted endpoint: bill
In response to [issue #65](https://github.com/LibraryOfCongress/api.congress.gov/issues/65), the `<date/>`, `<formats/>`, and `<type/>` elements are supressed when empty or when they return a null value (e.g., at <https://api.congress.gov/v3/bill/117/hr/500/text?format=json&api_key=DEMO_KEY>). 
## Change #6
### Impacted endpoint: house-communication
In response to user feedback, the house-communication endpoint was fixed so that when a user requests 81+ records, the appropriate number of records are retrieved. Additionally, URLs derived from pagination `<next>` values were fixed so they return the results requested.  
# COMPLETED June 2023, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/13)
## Change #1
### Impacted endpoints: member & member/{bioguideId}
In response to [issue #71](https://github.com/LibraryOfCongress/api.congress.gov/issues/71), the member API structure were adjusted for consistency. 
Specifically, at the member list level (<https://api.congress.gov/v3/member?api_key=DEMO_KEY>):
1. the extra nested `<member>` was removed,
2. `<party>` was renamed to be `<partyName>`,
3. `<served>` was renamed to be `<terms>` (at members.member.served)
4. `<House>` and/or `<Senate>` was renamed to be `<item>` (at members.member.terms.House/Senate where 'terms' was renamed at number 3),
5. a new `<chamber>` element will be added under `<item>` within `<terms>` (at members.member.terms.item where 'item' was renamed at number 4 and terms was renamed at number 3),
6. `<start>` was renamed to be `<startYear>` (at members.member.terms.item where 'item' was renamed at number 4 and terms was renamed at number 3), and
7. `<end>` was renamed to be `<endYear>` (at members.member.terms.item where 'item' was renamed at number 4 and terms was renamed at number 3).
At the member item level (e.g., at <https://api.congress.gov/v3/member/B001230?api_key=DEMO_KEY>):
1. `<termBeginYear>` was renamed to be `<startYear>` (within each member.terms.item),
2. `<termEndYear>` was renamed to be `<endYear>` (within each member.terms.item),
3. the `<identifiers>` container was removed so that `<bioguideId>` is only nested under member, and
4. the `<officeTelephone>` container was removed so that `<phoneNumber>` is only nested within member.addressInformation.
## Change #2
### Impacted endpoint: amendment/{congress}/{amendmentType}/{amendmentNumber}
In response to [issue #82](https://github.com/LibraryOfCongress/api.congress.gov/issues/82), referrer URLs to treaty items in the API within the amendment API were fixed so that the URLs do not retrieve a 404 and instead retrieve the treaty item. This bug only impacted amendments to treaties where the congresses differ between the items (e.g., https://api.congress.gov/v3/amendment/116/samdt/924?api_key=).   
This work was ongoing from prior releases.
## Change #3
### Impacted endpoint: committee-print
An API response for committee prints without an associated committee was provided. 
## Change #4
### Impacted endpoints: member & member/{bioguideId}
Congress.gov API member items have an updateDate regardless of currentMember=True or False.
## Change #5
Request URLs were updated at API sub-levels to reflect the current domain name, api.congress.gov/v3 instead of the former domain name, api.data.gov/congress/v3.
# COMPLETED June 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/12)
## Change #1
### Impacted endpoint: committee-meeting/{congress}/{chamber}/{eventId}
Empty elements were suppressed in the committee meeting API.
## Change #2
### Impacted endpoints: bill, bill/{congress}/, bill/{congress}/{chamber}, bill/{congress}/{chamber}/{billNumber}
In response to [issues #79](https://github.com/LibraryOfCongress/api.congress.gov/issues/79) and [#83](https://github.com/LibraryOfCongress/api.congress.gov/issues/83), 1/2 bill numbers and bill numbers with roman numerals were made retrievable in the API.
## Change #3
### Impacted endpoints: house-communication & house-communication/{congress}/{communicationType}/{communicationNumber}
At the item level (e.g., https://api.congress.gov/v3/house-communication/118/ec/1), the following elements were be renamed and added:
- `<house-communication>` was renamed to be `<houseCommunication>`
- `<referredToCommitteeDate>` was renamed to be `<referralDate>`
- `<sessionNumber>` was added (with values like 1, 2)
- `<isRulemaking>` was added (with True, False values)
- `<reportNature>` was added (with values like The Department's Major final rule - Mitigating the Spread of COVID-19 in Head Start Programs (RIN: 0970-AC90) received January 9, 2023.)
- `<updateDate>` was added (with values like 2023-01-11 14:05:07-05)
- `<systemCode>` was added (with values like hsed00)
- `<submittingAgency>` was added (with values like Office of Head Start, Administration for Children and Families, Department of Health and Human Services)
- `<submittingOfficial>` wA added (with values like Regulations Coordinator)
- `<legalAuthority>` was added (with values like 5 U.S.C. 801(a)(1)(A); Public Law 104–121, section 251; (110 Stat. 868))
- `<matchingRequirements>` container elementwasadded to House Communications with matching House Communication Requirements. Within `<matchingRequirements>`, an `<item>` container was made present for each matching requirement item. Within `<item>`, the `<number>` (with values like 8070) and `<url>` (with values like https://api.congress.gov/v3/house-requirement/8070) elements were made available.
- `<houseDocument>` container element will be added to House Communications with associated House Documents. Within `<houseDocument>`, a `<citation>` element (with values like H. Doc. 118-5) and `<title>` element (with values like Statement Of Disbursements Of The U.S. House of Representatives For The Period October 1, 2022, Through December 31, 2022) will be available. 
3. At the item level (e.g., https://api.congress.gov/v3/house-communication/118/ec/1), the data format type was added to the end of referrer URLs to committee items in the API (e.g., https://api.congress.gov/v3/committee/house/hsed00?format=json). The data format in the URL was made to be either xml or json, depending on the data format used to view the API response. 
4. Empty elements were suppressed. 
This work was ongoing from prior releases.
# COMPLETED May 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/11)
## Change #1
### Impacted endpoints: senate-communication & senate-communication/{congress}/{communicationType}/{communicationNumber}
1. At the list level (e.g., https://api.congress.gov/v3/senate-communication), an `<updateDate>` element was added to reflect the last update date in Congress.gov for each Senate Communication item.
2. At the item level (e.g., https://api.congress.gov/v3/senate-communication/118/ec/1), the following elements were renamed and added:
- `<senate-communication>` was renamed to be `<senateCommunication>`
- `<sessionNumber>` was added (with values like 1, 2)
- `<updateDate>` was added (with values like 2023-01-25 04:15:17-05)
- `<systemCode>` was added within each `<item>` under `<committees>` (with values like ssag00)
3. Empty elements are suppressed.
## Change #2
### Impacted endpoints: member & member/{bioguideId}
1. At the list level (e.g., https://api.congress.gov/v3/member), an `<updateDate>` element was added to reflect the last update date in Congress.gov for the member record.
2. At the item level (e.g., https://api.congress.gov/v3/S000148), the `<updateDate>` element reflects the most current last update date in Congress.gov for the member record.
## Change #3
### Impacted endpoints: hearing & hearing/{congress}/{chamber}/{jacketNumber}
Empty elements are suppressed.
## Change #4
New Committee Meeting API endpoints were released. The Committee Meetings API consists of a list level and an item level. The list level is filterable by congress and chamber. Data elements at the list level include an event identifier, chamber, congress, referrer URL to the item level, and update date in Congress.gov. Detailed information about each meeting is available at the item level. The new endpoints are available from https://api.congress.gov/v3/committee-meeting, https://api.congress.gov/v3/committee-meeting/{congress}, https://api.congress.gov/v3/committee-meeting/{congress}/{chamber}, and https://api.congress.gov/v3/committee-meeting/{congress}/{chamber}/{eventId}. This work was ongoing from prior releases.
# COMPLETED April 2023, Part 2
## Change #1
A new endpoint was released for the House Requirements API reflecting matching communications to each House Requirement item. The endpoint is available from https://api.congress.gov/v3/house-requirement/{requirementNumber}/matching-communications. For requirements with matching communications, the following elements are available from the new endpoint for each matching communication item: chamber, number, communicationType (including the communicationType code and name), congress, and a referrer URL to the communication item in the API. These elements mirror what is available from the list level of the House Communication API (e.g., at https://api.congress.gov/v3/house-communication?api_key=DEMO_KEY). 
## Change #2
### Impacted endpoint: house-requirement/{requirementNumber}
1. The following new elements were added: 
- `<activeRecord>` (with True, False values)
- `<submittingAgency>` (with values like Environmental Protection Agency)
- `<submittingOfficial>` (with values like Administrator)
2. The `<agency>` element was renamed to be `<parentAgency>`.
3. A `<matchingCommunications>` container was added that includes a referrer `<url>` element (to the new matching-communications endpoint) and a `<count>` element containing the number of matching communications to the requirement item. 
## Change #3
### Impacted endpoint: committee-report/{congress}/{reportType}/{reportNumber}
Empty elements were suppressed. 
## Change #4
### Impacted endpoint: committee-report/{congress}/{reportType}/{reportNumber}
Text containers, with a text count and a URL to the text sub-level, were re-added to committee report items. These elements were inadvertently dropped. For example, at [HRPT117-15](https://api.congress.gov/v3/committee-report/117/hrpt/15?api_key=DEMO_KEY), there is a `<text>` container element with a `<count>` element (with a value of 2) and a `<url>` element (with a value of https://api.congress.gov/v3/committee-report/117/hrpt/15/text). This work was ongoing from a prior release.
# COMPLETED April 2023 
## Change #1
New Hearing API endpoints (for published hearings) were released. The Hearing API consists of a list level and an item level. The list level is filterable by congress and chamber. Data elements at the list level include a jacket number, chamber, congress, hearing number, part number, referrer URL to the item level, and update date in Congress.gov. Detailed information about each published hearing is available at the item level. The new endpoints are available from https://api.congress.gov/v3/hearing, https://api.congress.gov/v3/hearing/{congress}, https://api.congress.gov/v3/hearing/{congress}/{chamber}, and https://api.congress.gov/v3/hearing/{congress}/{chamber}/{jacketNumber}. This work was ongoing from a prior release.
## Change #2
New Committee Print API endpoints were released. The Committee Print API consists of a list level, an item level, and a text sub-level. The list level is filterable by congress and chamber. Data elements at the list level include a jacket number, chamber, congress, referrer URL to the item level, and update date in Congress.gov. Detailed information about each committee print is available at the item level. URLs and descriptive metadata on the text are available at the text sub-level. The new endpoints are available from https://api.congress.gov/v3/committee-print, https://api.congress.gov/v3/committee-print/{congress}/, https://api.congress.gov/v3/committee-print/{congress}/{chamber}, https://api.congress.gov/v3/committee-print/{congress}/{chamber}/{jacketNumber}, and https://api.congress.gov/v3/committee-print/{congress}/{chamber}/{jacketNumber}/text. This work was ongoing from a prior release.
## Change #3
### Impacted endpoints: congress & congress/{congressNumber}
1. Empty elements were suppressed. 
2. At the list level, a `<url>` element was added within each `<item>` container that contains a referrer URL to the congress item within the API. For example, at https://api.congress.gov/v3/congress, the `<item>` container for the 117th Congress has a `<url>` element with a value of https://api.congress.gov/v3/congress/117.
# COMPLETED February 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/10)
## Change #1
### Impacted endpoint: committee/{house-communication}
Within the committee API, a new endpoint was released for House Communications. The endpoint is available at https://api.congress.gov/v3/committee/house/{committeeCode}/house-communication and contains communications available in Congress.gov that are associated with that committee.
## Change #2
### Impacted endpoint: senate-communication/{congress}/{communicationType}/{communicationNumber}
Within the Senate Communications API, the data format type was added to the end of referrer URLs to committee items in the API (e.g., https://api.congress.gov/v3/committee/senate/ssas00?format=json). The data format in the URL will be either xml or json, depending on the data format used to view the API response. 
## Change #3
### Impacted endpoint: member
Empty elements were suppressed. This work was ongoing from a prior release. 
## Change #4
### Impacted endpoint: committee
Empty elements were suppressed. This work was ongoing from a prior release. 
## Change #5
### Impacted endpoint: amendment
Submitted-only Senate amendments are present at the amendment list level. Prior to this fix, only proposed Senate amendments and House amendments were present at the list level (see [issue #52](https://github.com/LibraryOfCongress/api.congress.gov/issues/52)). Note that these submitted-only Senate amendments were available in the API by direct URL. This work was ongoing from a prior release. 
# COMPLETED January 2023, Part 2 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/9)
## Change #1
### Impacted endpoint: member
Referrer URLs at member item levels to the sponsored-legislation and cosponsored-legislation sub-levels were corrected to be https://api.congress.gov and not https://api.data.gov/congress (see [issue #50](https://github.com/LibraryOfCongress/api.congress.gov/issues/50)).
# COMPLETED January 2023
## Change #1
### Impacted endpoint: bill
A `<description>` element was added for CBO cost estimates on bill detail pages. The element is sourced from CBO and provides a brief description on the cost estimate.
# COMPLETED December 2022 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/7)
## Change #1
New House Requirements API endpoints were released. The House Requirements API consists of a list level and an item level.  Data elements at the list level include requirement numbers, referrer URLs to the item level, and update dates in Congress.gov. Detailed information about each House Requirement are available at the item level. The new endpoints are available from https://api.congress.gov/v3/house-requirement. Also see [https://api.congress.gov](https://api.congress.gov/#/house-requirement/house_requirement) for OpenAPI Specification on the endpoints.
## Change #2
### Impacted endpoint: treaty
Treaty pagination URLs are longer be malformed and contain http:// and https:// (see [issue #41](https://github.com/LibraryOfCongress/api.congress.gov/issues/41)). This work was ongoing from prior releases.
# COMPLETED November 2022 Part 2
## Change #1
### Impacted endpoint: committee
The following elements were added to the committee reports sub-level of the committee API:
* `<congress>` (with values like 117, 116)
* `<chamber>` (with values like 'House' and 'Senate')
* `<type>` (with values like 'HRPT', 'SRPT', and 'ERPT')
* `<number>` (with values like 1, 7, 455)
* `<part>` (with values like 1, 2)
## Change #2
### Impacted endpoint: nomination
At the printed hearings endpoint, the following changes were made:
* `<extJacketNumber>` was renamed to `<jacketNumber>`
* `<startDate>` was renamed to `<date>`
* `<hearingNumber>` was renamed to `<number>`
* `<endDate>` was removed
## Change #3
### Impacted endpoint: committee
The following parameters - fromDate and toDate - were added to the committee reports sub-level of the committee API. The parameters can be used to filter results to reports updated within a specified update date time range. This work was ongoing from a prior release.
# COMPLETED November 2022 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/6)
## Change #1
### Impacted endpoint: committeeReport 
This work was ongoing from a prior release.
1. The API endpoint was renamed from committeeReport to committee-report, to conform to other API endpoints. 
2. At the list level, the following elements were added:
* `<congress>` (with values like 117, 116)
* `<chamber>` (with values like 'House' and 'Senate')
* `<type>` (with values like 'HRPT', 'SRPT', and 'ERPT')
* `<number>` (with values like 1, 17, 455)
* `<part>` (with values like 1, 2)
3. At the item level, the following elements were added:
* `<associatedBill>` data, when a committee report is associated with a measure
* `<associatedTreaty>` data, when a committee report is associated with a treaty
4. At the item level, the following elements were renamed:
* `<congSession>` was renamed to `<sessionNumber>`
* `<reportNumber>` was renamed to `<number>`
* `<partNumber>` was renamed to `<part>`
* `<reportTypeCode>` was renamed to `<type>`
5. At the text sub-level, the following changes were made:
* `<textVersions>` was renamed to `<text>`
* `<isErrata>` is present for each text item (with values like Y or N)
* text URLs are absolute, instead of relative
## Change #2
### Impacted endpoint: committee
Within the committee API, a new endpoint was created for Senate Communications. The endpoint is available at https://api.congress.gov/v3/committee/senate/{committeeCode}/senate-communication and contains communications available in Congress.gov associated with that committee.
## Change #3
### Impacted endpoint: nomination
1. At the list level:
* an `<organization>` element was added. This element is currently available at the item level.
* the display of `<latestAction>` data (including `<actionDate>` and `<text>`) was adjusted so that the `<actionDate>` and `<text>` elements are individual data elements.
* the `<name>` element was removed.
2. At the item level: 
* `<positions>` was renamed to `<nominees>`.
* a `<receivedDate>` element was added. This element is currently available at the list level. 
* a `<description>` element was added. This element is currently available at the list level. 
* the `<createDate>` element was removed.
## Change #4
### Impacted endpoint: member
In response to [issue #31](https://github.com/LibraryOfCongress/api.congress.gov/issues/31), the bug causing duplicate members to be returned by certain limits set should be addressed. As a result, regardless of the set limit, the number of unique members returned should not change. 
# COMPLETED October 2022 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/5)
## Change #1
### Impacted endpoint: all
Pagination URLs were corrected to https://api.congress.gov and not https://api.data.gov/congress (see [issue #26](https://github.com/LibraryOfCongress/api.congress.gov/issues/26)). This work was ongoing from a prior release.
## Change #2
### Impacted endpoint: nomination
Empty elements were suppressed from view. This work was ongoing from a prior release.
# COMPLETED September 2022, Part 2
### Change #1
New Senate Communications API endpoints were released. The Senate Communications API consists of a list level and an item level. Data elements are similar to the existing House Communications API. Communications are accessible by congress and by communication type (executive communication, petition or memorial, and presidential message) at the list level. Detailed information about each Senate Communication is available at the item level. The new endpoints are available at https://api.congress.gov/v3/senate-communication.
## Change #2 
### Impacted endpoint: committee
At the bills deeper level of the committee API, the following changes were made:
* `<billType>` was renamed to `<type>`
* `<billNumber>` was renamed to `<number>`
* A referrer URL to each bill item in the API was added
# COMPLETED September 2022
## Change #1
### Impacted endpoint: amendment
An `<updateDate>` element was added to the list level. This element indicates an amendment's last update in Congress.gov.
## Change #2
### Impacted endpoint: member
1. The following elements were removed:
* `<congressName>` within a `<terms>` item at the item level
* `<partyStateDistrictCode>` within a `<terms>` item (if a House member) at the item level
* `<partyStateCode>` within a `<terms>` item (if a Senate member) at the item level
* `<lisId>` within `<identifiers>` at the item level
* `<gpoId>` within `<identifiers>` at the item level
* `<imageUrl>` within `<depiction>` at the list and item level (note that `<thumbnailUrl>` will be renamed to `<imageUrl>`)
* `<createDate>` at the item level
2. The following elements were renamed:
* `<member-lis>` became `<member>` at the item level
* `<officialUrl>` became `<officialWebsiteUrl>` at the item level
* `<thumbnailUrl>` within `<depiction>` became `<imageUrl>` at the list and item level
* `<latestTitle>` became `<title>` at the sponsored-legislation and cosponsored-legislation deeper levels
3. An `<updateDate>` was added at the item level. This element indicates the member record's last update in Congress.gov.
4. A new `<partyHistory>` container was created at the item level. The `<partyName>` and `<partyCode>` elements (currently underneath a `<terms>` item) were moved underneath the new `<partyHistory>` container. Also contained underneath `<partyHistory>` are the `<startDate>` and `<endDate>` elements. This structure better represents members who represented different parties over their congressional service.
## Change #3
### Impacted endpoint: bill
An `<updateDateIncludingText>` element was added to the item level. This element indicates the bill's last update in Congress.gov, including if that update was to the bill text. The existing `<updateDate>` element does not include updates to bill text.
## Change #4
### Impacted endpoints: bill and amendment
At the actions deeper level, the `<fullActionName>` element within a `<recordedVotes>` container was removed. 
# COMPLETED August 2022
## Change #1
### Impacted endpoints: all
In the pagination, the `<total>` element was removed. The `<count>` element remains.
## Change #2
### Impacted endpoints: amendment, congress, member, nomination, treaty, congressional-record, committee, summaries
The `<version>` element was removed.
## Changes #3 and #4
### Impacted endpoint: bill
1. An `<isByRequest>` element (contained within `<sponsors>` at the item level) was added to indicate if a measure was introduced by request. This element is populated with Y or N values. The `<isByRequest>` element replaces `<byRequestType>`.
2. Law text is available in the text deeper level.
## Change #5
### Impacted endpoint: committee
An `<updateDate>` element (within each `<history>` item at the item level) was added to indicate the update date for committee name changes. This change is in response to feedback [issue #16](https://github.com/LibraryOfCongress/api.congress.gov/issues/16). 
## Change #6
### Impacted endpoints: bill and amendment 
The `<totalCount>` element (within `<cosponsors>` at the item level) was removed. This element is duplicative of the `<countIncludingWithdrawnCosponsors>` element, which remains. 
# COMPLETED July 2022, Part 2
## Changes #1 and #2
### Impacted endpoint: amendment
1. Empty elements are suppressed from view. 
2. 97th and 98th Congress Senate Unprinted Amendments are available. 
## Change #3
### Impacted endpoint: bill
Empty elements are suppressed from view. 
# COMPLETED July 2022, Part 1
## Change #1
### Impacted endpoint: bill
A `<billTextVersionName>` (e.g. Introduced in House) and a `<billTextVersionCode>` (e.g. IH) was added to the titles level of the bill endpoint (e.g. https://api.data.gov/congress/v3/bill/117/hr/3076/titles?api_key=). These values are populated when a title (short or official) is associated with a bill text version. Not all titles have these values populated (e.g. a Display Title will never have an associated bill text version).
## Change #2
### Impacted endpoint: congress
1. The following elements were removed from the congress endpoint:
    - `<timezone>` from the list and item levels. 
    - `<name>` from the list and item levels.
    - `<createDate>` from the item level.
    - `<number>` at the list and item levels where the `<type>` is S (for special).
2. The following elements were added to the congress endpoint:
    - `<type>` to the list and item levels. This element will be populated with the following values: 
      - R (for regular)
      - S (for special)
      - J (for joint)
    - `<number>` to the list and item levels. This element is populated with number values 0-6. Note that this element is not present when the `<type>` is S (for special). 
