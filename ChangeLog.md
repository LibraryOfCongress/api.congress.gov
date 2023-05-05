This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED. Milestones are also used to tag issues in this repository with expected production release date information.
# UPCOMING June 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/12)
**Expected production release date:** June 5, 2023
## Change #1
### Impacted endpoint: amendment/{congress}/{amendmentType}/{amendmentNumber}
In response to [issue #82](https://github.com/LibraryOfCongress/api.congress.gov/issues/82), referrer URLs to treaty items in the API within the amendment API will be fixed so that the URLs do not retrieve a 404 and instead retrieve the treaty item. This bug only impacts amendments to treaties where the congresses differ between the items (e.g., https://api.congress.gov/v3/amendment/116/samdt/924?api_key=).  
## Change #2
### Impacted endpoint: committee-meeting/{congress}/{chamber}/{eventId}
Empty elements will be suppressed in the committee meeting API.
## Change #3
### Impacted endpoints: bill, bill/{congress}/, bill/{congress}/{chamber}, bill/{congress}/{chamber}/{billNumber}
In response to [issues #79](https://github.com/LibraryOfCongress/api.congress.gov/issues/79) and [#83](https://github.com/LibraryOfCongress/api.congress.gov/issues/83), 1/2 bill numbers and bill numbers with roman numerals will be retrievable in the API.
# UPCOMING May 2023 | [Milestone](https://github.com/LibraryOfCongress/api.congress.gov/milestone/11)
**Expected production release date:** May 15, 2023
## Change #1
### Impacted endpoints: senate-communication & senate-communication/{congress}/{communicationType}/{communicationNumber}
1. At the list level (e.g., https://api.congress.gov/v3/senate-communication), an `<updateDate>` element will be added to reflect the last update date in Congress.gov for each Senate Communication item.
2. At the item level (e.g., https://api.congress.gov/v3/senate-communication/118/ec/1), the following elements will be renamed and added:
- `<senate-communication>` will be renamed to be `<senateCommunication>`
- `<sessionNumber>` will be added (with values like 1, 2)
- `<updateDate>` will be added (with values like 2023-01-25 04:15:17-05)
- `<systemCode>` will be added within each `<item>` under `<committees>` (with values like ssag00)
3. Empty elements will be suppressed.
## Change #2
### Impacted endpoints: house-communication & house-communication/{congress}/{communicationType}/{communicationNumber}
1. At the list level (e.g., https://api.congress.gov/v3/house-communication), an `<updateDate>` element will be added to reflect the last update date in Congress.gov for each House Communication item. 
2. At the item level (e.g., https://api.congress.gov/v3/house-communication/118/ec/1), the following elements will be renamed and added:
- `<house-communication>` will be renamed to be `<houseCommunication>`
- `<referredToCommitteeDate>` will be renamed to be `<referralDate>`
- `<sessionNumber>` will be added (with values like 1, 2)
- `<isRulemaking>` will be added (with True, False values)
- `<reportNature>` will be added (with values like The Department's Major final rule - Mitigating the Spread of COVID-19 in Head Start Programs (RIN: 0970-AC90) received January 9, 2023.)
- `<updateDate>` will be added (with values like 2023-01-11 14:05:07-05)
- `<systemCode>` will be added (with values like hsed00)
- `<submittingAgency>` will be added (with values like Office of Head Start, Administration for Children and Families, Department of Health and Human Services)
- `<submittingOfficial>` will be added (with values like Regulations Coordinator)
- `<legalAuthority>` will be added (with values like 5 U.S.C. 801(a)(1)(A); Public Law 104–121, section 251; (110 Stat. 868))
- `<matchingRequirements>` container element will be added to House Communications with matching House Communication Requirements. Within `<matchingRequirements>`, an `<item>` container will be present for each matching requirement item. Within `<item>`, the `<number>` (with values like 8070) and `<url>` (with values like https://api.congress.gov/v3/house-requirement/8070) elements will be available.
- `<houseDocument>` container element will be added to House Communications with associated House Documents. Within `<houseDocument>`, a `<citation>` element (with values like H. Doc. 118-5) and `<title>` element (with values like Statement Of Disbursements Of The U.S. House of Representatives For The Period October 1, 2022, Through December 31, 2022) will be available. 
3. At the item level (e.g., https://api.congress.gov/v3/house-communication/118/ec/1), the data format type will be added to the end of referrer URLs to committee items in the API (e.g., https://api.congress.gov/v3/committee/house/hsed00?format=json). The data format in the URL will be either xml or json, depending on the data format used to view the API response. 
4. Empty elements will be suppressed. 
## Change #3
### Impacted endpoints: member & member/{bioguideId}
1. At the list level (e.g., https://api.congress.gov/v3/member), an `<updateDate>` element will be added to reflect the last update date in Congress.gov for the member record.
2. At the item level (e.g., https://api.congress.gov/v3/S000148), the `<updateDate>` element will reflect the most current last update date in Congress.gov for the member record.
## Change #4
### Impacted endpoints: hearing & hearing/{congress}/{chamber}/{jacketNumber}
Empty elements will be suppressed.
## Change #5
New Committee Meeting API endpoints will be released. The Committee Meetings API will consist of a list level and an item level. The list level will be filterable by congress and chamber. Data elements at the list level will include an event identifier, chamber, congress, referrer URL to the item level, and update date in Congress.gov. Detailed information about each meeting will be available at the item level. The new endpoints will be available from https://api.congress.gov/v3/committee-meeting, https://api.congress.gov/v3/committee-meeting/{congress}, https://api.congress.gov/v3/committee-meeting/{congress}/{chamber}, and https://api.congress.gov/v3/committee-meeting/{congress}/{chamber}/{eventId}. This work is ongoing from prior releases.
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
