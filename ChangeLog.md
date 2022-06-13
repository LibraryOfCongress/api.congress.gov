This change log will contain information on updates to the Congress.gov API, the impacted endpoints, and the expected production release date. Changes not yet in production will be prefaced by UPCOMING. Once in production, that preface will be changed to COMPLETED.

## UPCOMING July 2022
**Expected production release date:** July 5, 2022

**Impacted endpoint:** bill

**Changes:**

A ```billTextVersionName``` (e.g. Introduced in House) and a ```billTextVersionCode``` (e.g. IH) will be added to the titles level of the bill endpoint. These values will be populated when a title (short or official) is associated with a bill text version. Not all titles will have these values populated (e.g. a Display Title will never have an associated bill text version).
