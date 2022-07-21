This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED.
# UPCOMING July 2022, Part 2
**Expected production release date:** July 25, 2022
## Changes #1 and #2
### Impacted endpoint: amendment
- Empty elements will be suppressed from view. 
- 97th and 98th Congress Senate Unprinted Amendments will be available. 
## Change #3
### Impacted endpoint: congress
A referrer URL to a congress item (e.g. **api.data.gov/congress/v3/congress/117**) will be added to the list level (**api.data.gov/congress/v3/congress**).
## Change #4
### Impacted endpoint: bill
Empty elements will be suppressed from view. 
# COMPLETED July 2022, Part 1
## Change #1
### Impacted endpoint: bill
A `<billTextVersionName>` (e.g. Introduced in House) and a `<billTextVersionCode>` (e.g. IH) will be added to the titles level of the bill endpoint (e.g. **api.data.gov/congress/v3/bill/117/hr/3076/titles?api_key=**). These values will be populated when a title (short or official) is associated with a bill text version. Not all titles will have these values populated (e.g. a Display Title will never have an associated bill text version).
## Change #2
### Impacted endpoint: congress
1. The following elements will be removed from the congress endpoint:
    - `<timezone>` from the list and item levels. 
    - `<name>` from the list and item levels.
    - `<createDate>` from the item level.
    - `<number>` at the list and item levels where the `<type>` is S (for special).
2. The following elements will be added to the congress endpoint:
    - `<type>` to the list and item levels. This element will be populated with the following values: 
      - R (for regular)
      - S (for special)
      - J (for joint)
    - `<number>` to the list and item levels. This element will be populated with number values 0-6. Note that this element is not present when the `<type>` is S (for special). 
