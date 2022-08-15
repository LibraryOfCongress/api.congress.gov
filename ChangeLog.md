This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED.
# UPCOMING September 2022
**Expected production release date:** September 6th, 2022
## Change #1
### Impacted endpoint: amendment
An `<updateDate>` element will be added to the list level. This element will indicate an amendment's last update in Congress.gov.
## Change #2
### Impacted endpoint: member
1. The following elements will be removed:
* `<congressName>` within a `<terms>` item at the item level
* `<partyStateDistrictCode>` within a `<terms>` (if a House member) at the item level
* `<partyStateCode>` within a `<terms>` (if a Senate member) at the item level
* `<lisId>` within `<identifiers>` at the item level
* `<gpoId>` within `<identifiers>` at the item level
* `<imageUrl>` within `<depiction>` at the list and item level (note that `<thumbnailUrl>` will be renamed to `<imageUrl>`)
* `<createDate>` at the item level
2. The following elements will be renamed:
* `<member-lis>` will become `<member>` at the item level
* `<officialUrl>` will become `<officialWebsiteUrl>` at the item level
* `<thumbnailUrl>` within `<depiction>` will become `<imageUrl>` at the list and item level
* `<latestTitle>` will become `<title>` at the sponsored-legislation and cosponsored-legislation deeper levels
3. An `<updateDate>` will be added at the item level. This element will indicate the member record's last update in Congress.gov.
4. A new `<partyHistory>` container will be created at the item level. The `<partyName>` and `<partyCode>` elements (currently underneath a `<terms>` item) will be moved underneath the new `<partyHistory>` container. Also contained underneath `<partyHistory> will be `<startDate>` and `<endDate>` elements. This structure will better represent members who represented different parties over their congressional service.
## Change #3
### Impacted endpoint: bill
An `<updateDateIncludingText>` element will be added to the item level. This element will indicate the bill's last update in Congress.gov, including if that update was to the bill text. The existing `<updateDate>` element does not include updates to bill text.
## Change #4
### Impacted endpoints: bill and amendment
At the actions deeper level, the `<fullActionName>` element within a `<recordedVotes>` container will be removed. 
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
