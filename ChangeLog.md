This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED. Milestones are also used to tag issues in this repository with expected production release date information.
# UPCOMING December 2022 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/7)
**Expected production release date:** December 19, 2022
## Change #1
New House Requirements API endpoints will be released. The House Requirements API will consist of a list level and an item level. At the list level, requirements should be filterable by congress. Data elements at the list level will include  requirement numbers, referrer URLs to the item level, and update dates in Congress.gov. Detailed information about each House Requirement will be available at the item level. The new endpoints will be available at https://api.congress.gov/v3/house-requirement.
## Change #2
### Impacted endpoint: treaty
Treaty pagination URLs will no longer be malformed and contain http:// and https:// (see [issue #41](https://github.com/LibraryOfCongress/api.congress.gov/issues/41)). This work is ongoing from prior releases.
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
