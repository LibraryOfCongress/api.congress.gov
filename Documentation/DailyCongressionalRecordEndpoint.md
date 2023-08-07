# Daily Congressional Record endpoint

## Coverage

Coverage information for daily congressional record data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates).  Read more about Congressional Record data at [About the Congressional Record](https://www.congress.gov/help/congressional-record) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the congressional record API and available parameters at [https://api.congress.gov](https://api.congress.gov/#/daily-congressional-record/daily-congressional-record_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that date congressional record items can be filtered down to volume by adding /{VOLUME_NUMBER}?api_key=[INSERT_KEY] to your search (e.g.,<https://api.congress.gov/v3/daily-congressional-record/166?api_key=[INSERT_KEY]>).

`<api-root>`

The `<api-root>` is only present in the XML format.

`<dailyCongressionalRecord>`

Parent container for congressional record issues. A `<dailyCongressionalRecord>` element may include the following children:

- `<Issue>`
  - Container for a daily congressional record issue. An `<Issue>` element may include the following children:
    - `<issueNumber>`
      - The daily congressional record's issue number.
    - `<volumeNumber>`
      - The daily congressional record's volume number. 
    - `<congress>`
      - The congress associated with the daily congressional record issue.
    - `<SessionNumber>`
      - The session number. Possible values are "1" and "2". 
    - `<URL>` 
      - The URL to the entire issue of the daily congressional record. 
    - `<UpdateDate>` 
       - The date that the daily congressional record was updated.
      
### Item Level

`<api-root>`

 The `<api-root>` is only present in the XML format.

 `<issue>`

 Parent container for the daily congressional record issues. An `<issue>` element may include the following children:

   - `<issueNumber>`
      - The daily congressional record's issue number.
   - `<volumeNumber>`
      - The daily congressional record's volume number.
   - `<issueNumber>`
      - The daily congressional record's issue number. 
   - `<congress>`
      - The congress associated with the daily congressional record issue.
   - `<SessionNumber>`
      - The session number. Possible values are "1" and "2". 
   - `<URL>` 
      - The URL to the entire issue of the daily congressional record. 
    - `<UpdateDate>` 
       - The date that the daily congressional record was updated.

`<fullIssue>`

  Container for full issue and sections. A `<fullIssue>` element may include the following children:

  - `<entireIssue>`
      - Container for entire issue items. An `<entireIssue>` element may include the following children:
  - `<item>`
      - Container for an entire issue item. An `<item>` element may include the following children:
      - `<part>`
         - The part of the daily Congressional Record issue.
      -`<type>`
         - The type of document that the daily Congressional Record is (e.g., PDF).
      - `<URL> `
         - The daily Congressional Record's URL.
  - `<item>`
      - Container for an entire issue item. An `<item>` element may include the following children:
      - `<name>`
         - The section name of the daily Congressional Record issue.
      -`<startPage>`
         - The start page of the daily Congressional Record section. 
      - `<endPage>`
         - The end page of the daily Congressional Record section. 
- `<text>`
      - Container for section textx. A `<text>` element may include the following children:
  - `<item>`
      - Container for an entire issue item. An `<item>` element may include the following children:
      - `<part>`
         - The part of the daily Congressional Record issue.
      - `<type>`
         - The type of document that the daily Congressional Record is (e.g., PDF).
      - `<URL> `
         - The daily Congressional Record's URL for the section. 
- `<text>`
      - Container for section textx. A `<text>` element may include the following children:
  - `<articles>`
      - Container for Container for articles in the congressional record issue. An `<articles>` element may include the following children:
      - `<count>`
         - The number of articles in the daily Congressional Record issue.
      - `<URL> `
         - The daily Congressional Record's URL for articles. 
  
### Articles Sub-Level

  `<api-root>`

  The `<api-root>` is only present in the XML format.

 `<articles>`

 Parent container for the daily congressional record articles. An `<articles>` element may include the following children:

   - `<section>`
      - The container for articles in a section. A `<section>` container may include: 
        - `<name>`
           - The section name (e.g., Senate).
        - `<sectionArticles>`
          
           Container for section artices. A `<sectionArticles>` element may include the following children:
           - `<title>`
             - The title of the article.
           - `<sectionName>`
              - The section name of the daily Congressional Record article.
          - `<startPage>`
             - The start page of the daily Congressional Record article. 
           - `<endPage>`
              - The end page of the daily Congressional Record article.
                
      `<text>`
      - The container for article text  A `<text>` container may include: 
        - `<item>`
           - Container for an article text item. An `<item>` element may include the following children:
           - `<type>`
              - The type of document that the daily Congressional article is (e.g., PDF).
           - `<URL>`
              - The article URL.
     
