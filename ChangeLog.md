This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED.
# UPCOMING August 2022
**Expected production release date:** August 15th, 2022
## Change 1
### Impacted endpoints: all
In the pagination, `<total>` will be removed. The `<count>` will remain.
## Change 2
### Impacted endpoints: amendment, congress, member, nomination, treaty, congressional-record, committee
The `<version>` element will be removed.
## Change 3
### Impacted endpoint: bill
An `<isByRequest>` element (contained within `<sponsors>` at the item level) will be added to indicate if a measure was introduced by request. This element will be populated with Y or N values. The `<isByRequest>` element will replace `<byRequestType>`.
## Change 4
### Impacted endpoint: committee
An `<updateDate>` element (within each `<history>` item at the item level) will be added to indicate the update date for committee name changes. This change is in response to feedback [issue #16](https://github.com/LibraryOfCongress/api.congress.gov/issues/16). 
## Change 5
### Impacted endpoints: bill and amendment 
The `<totalCount>` (within `<cosponsors>` at the item level) will be removed. This element is duplicative of `<countIncludingWithdrawnCosponsors>`, which will remain. 
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
A `<billTextVersionName>` (e.g. Introduced in House) and a `<billTextVersionCode>` (e.g. IH) was added to the titles level of the bill endpoint (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/titles?api_key=**). These values are populated when a title (short or official) is associated with a bill text version. Not all titles have these values populated (e.g. a Display Title will never have an associated bill text version).
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
