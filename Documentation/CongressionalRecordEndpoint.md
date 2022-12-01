# Congressional Record endpoint
## Coverage
Coverage information for congressional record data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Note that while the Bound Congressional Record is available in Congress.gov, it is not yet available in the API. Read more about Congressional Record data at [About the Congressional Record](https://www.congress.gov/help/congressional-record) on Congress.gov. 
## OpenAPI Specification
View OpenAPI Specification on the congressional record API and available parameters at [https://api.congress.gov](https://api.congress.gov/#/congressional-record/congressional_record_list).
## Elements and Descriptions
The section below details available element names, their description, and possible values.
### List Level

Note that congressional record items can be filtered down to a specific year, month, or date by adding ?y=YYYY&m=MM&d=DD to the request URL (e.g., https://api.congress.gov/v3/congressional-record/?y=2022&m=8&d=16&api_key=)

`<api-root>`

The `<api-root>` is only present in the XML format. 

`<Results>` 

Parent container for congressional record issues. A `<Results>` element may include the following children:
 - `<Issues>`
   - Container for congressional record issues. An `<Issues>` element may include the following children:
     - `<item>`
       - Container for an individual congressional record issue. An `<item>` element is repeatable and may include the following children: 
           - `<Congress>` (e.g., 117)
              - The congress associated with the congressional record issue.
              - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
           - `<Issue>` (e.g., 136)
              - The congressional record's issue number.
           - `<Links>`
              - Container for links to the individual sections of the issue. A `<Links>` element may include the following children:
                 - `<Digest>`
                      - Container for the Daily Digest section of the issue. A `<Digest>` element may include the following children:
                          - `<Label>` (e.g., Daily Digest)
                             - The name of the section.
                           - `<Ordinal>` (e.g., 1)
                             - The sort order number used for the section's placement on Congress.gov.
                           - `<PDF>`
                             - Container for the PDF text format for the section. A `<PDF>` element may include the following children:
                                - `<item>`
                              - Container for the individual PDF text format for the section. Multiple PDFs may be used to deliver the entire section. An `<item>` element is repeatable and may include the following children:
                             - `<Part>` (e.g., 1)
                               - Number assigned to individual PDFs that comprise a single section. If there are multiple Daily Digest section parts, the numbers will be sequential.
                             - `<Url>` (e.g, https://www.congress.gov/117/crec/2022/08/16/168/136/CREC-2022-08-16-dailydigest.pdf)
                               - The URL to the individual Daily Digest section PDF.
                  - `<Remarks>`
                      - Container for the Extension of Remarks section of the issue. A `<Remarks>` element may include the following children:
                          - `<Label>` (e.g., Extension of Remarks Section)
                             - The name of the section.
                           - `<Ordinal>` (e.g., 4)
                             - The sort order number used for the section's placement on Congress.gov.
                           - `<PDF>`
                             - Container for the PDF text format for the section. A `<PDF>` element may include the following children:
                                - `<item>`
                              - Container for the individual PDF text format for the section. Multiple PDFs may be used to deliver the entire section. An `<item>` element is repeatable and may include the following children:
                             - `<Part>` (e.g., 1)
                               - Number assigned to individual PDFs that comprise a single section. If there are multiple Extension of Remarks section parts, the numbers will be sequential.
                             - `<Url>` (e.g, https://www.congress.gov/117/crec/2022/08/16/168/136/CREC-2022-08-16-extensions.pdf)
                               - The URL to the individual Extension of Remarks section PDF.
                 - `<House>`
                      - Container for the House section of the issue. A `<House>` element may include the following children:
                          - `<Label>` (e.g., House Section)
                             - The name of the section.
                           - `<Ordinal>` (e.g., 3)
                             - The sort order number used for the section's placement on Congress.gov.
                           - `<PDF>`
                             - Container for the PDF text format for the section. A `<PDF>` element may include the following children:
                                - `<item>`
                              - Container for the individual PDF text format for the section. Multiple PDFs may be used to deliver the entire section. An `<item>` element is repeatable and may include the following children:
                             - `<Part>` (e.g., 1)
                               - Number assigned to individual PDFs that comprise a single section. If there are multiple House section parts, the numbers will be sequential.
                             - `<Url>` (e.g, https://www.congress.gov/117/crec/2022/08/16/168/136/CREC-2022-08-16-house.pdf)
                               - The URL to the individual House section PDF.
                 - `<Senate>`
                      - Container for the Senate section of the issue. A `<Senate>` element may include the following children:
                          - `<Label>` (e.g., Senate Section)
                             - The name of the section.
                           - `<Ordinal>` (e.g., 2)
                             - The sort order number used for the section's placement on Congress.gov.
                           - `<PDF>`
                             - Container for the PDF text format for the section. A `<PDF>` element may include the following children:
                                - `<item>`
                              - Container for the individual PDF text format for the section. Multiple PDFs may be used to deliver the entire section. An `<item>` element is repeatable and may include the following children:
                             - `<Part>` (e.g., 1)
                               - Number assigned to individual PDFs that comprise a single section. If there are multiple Senate section parts, the numbers will be sequential.
                             - `<Url>` (e.g, https://www.congress.gov/117/crec/2022/08/16/168/136/CREC-2022-08-16-senate.pdf)
                               - The URL to the individual Senate section PDF.
                 - `<FullRecord>`
                      - Container for the Entire Issue section of the issue. A `<FullRecord>` element may include the following children:
                          - `<Label>` (e.g., Entire Issue)
                             - The name of the section.
                           - `<Ordinal>` (e.g., 5)
                             - The sort order number used for the section's placement on Congress.gov.
                           - `<PDF>`
                             - Container for the PDF text format for the section. A `<PDF>` element may include the following children:
                                - `<item>`
                              - Container for the individual PDF text format for the section. Multiple PDFs may be used to deliver the entire section. An `<item>` element is repeatable and may include the following children:
                             - `<Part>` (e.g., 1)
                               - Number assigned to individual PDFs that comprise a single section. If there are multiple Entire Issue section parts, the numbers will be sequential.
                             - `<Url>` (e.g, https://www.congress.gov/117/crec/2022/08/16/168/136/CREC-2022-08-16.pdf)
                               - The URL to the individual Entire Issue section PDF.
		 - `<PublishDate>` (e.g., 2022-08-16)
		   - The publication date of the issue.
		 - `<Session>` (e.g., 2)
		   - The session of Congress.
		   - Possible values are "1" and "2".
		 - `<Volume>` (e.g., 168)
		   - The volume number of the issue. 
			- View a [field values list of Congressional Record Volumes](https://www.congress.gov/help/field-values/congressional-record-volumes) on Congress.gov.
