# Congressional Research Service (CRS) Reports endpoint

## Coverage

Coverage information for Congressional Research Service report data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates).  Read more about Congressional Research Service report data at [About Congressional Research Service (CRS) Products
](https://www.congress.gov/help/crs-products) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the Congressional Research Service Reports API and available parameters at [https://api.congress.gov](https://api.congress.gov/#/crsreport).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<CRSreports>`

Parent container for Congressional Research Service (CRS) product data. A '<CRSreports>' element may include the following children:
- `<CRSreport>`
  - Container for an individual Congressional Research Service (CRS) product. A <CRSreport> element may include the following children:
    - `<status>`
      - The status of the publication (e.g., active or archived). 
    - `<id>`
      - The identification number assigned to the individual CRS product (e.g., R40097).
    - `<publishDate>`
      - The date that the CRS product was published.
      - The format is YYYY-MM-DDT00:00:00Z. 
    - `<version>`
      - The publication’s version number.
    - `<contentType>` 
       - The type of content the CRS product is classified as.
       - The types of content are: reports, posts, resources, infographics, and testimony. 
    - `<updateDate>`
       - The date that the product was updated.
       - Please note this element is not always the same as the date of publishing.
       - The format is YYYY-MM-DDT00:00:00Z.
    - `<title>`
       - The title of the CRS product.
    - `<url>`
       - Referrer URL to the item level for an individual CRS product.
     
### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.
- `<CRSreport>`
  - Container for an individual Congressional Research Service (CRS) product.
  - A `<CRSreport>` element may include the following children:
    - `<status>`
      - The status of the publication (e.g., active or archived). 
    - `<id>`
      - The identification number assigned to the individual CRS product (e.g., R40097).
    - `<publishDate>`
      - The date that the CRS product was published.
      - The format is YYYY-MM-DDT00:00:00Z. 
    - `<version>`
      - The publication’s version number.
    - `<contentType>` 
       - The type of content the CRS product is classified as.
       - The types of content are: reports, posts, resources, infographics, and testimony. 
    - `<updateDate>`
       - The date that the product was updated.
       - Please note this element is not always the same as the date of publishing.
       - The format is YYYY-MM-DDT00:00:00Z.
    - `<title>`
       - The title of the CRS product.
    - `<url>`
       - Referrer URL to the item level for an individual CRS product.   
    - `<authors>`
       - Container for author data.
       - An `<authors>` container may include the following children:
          - `<author>`
          - The author of the CRS product. This element is repeatable.
    -  `<formats>`
       - Container for CRS product format data.
       - A `<formats>` container may include the following children:
          - `<format>`
          -  The product's individual format type. This element is repeatable.
          - `<URL>`
          -  Referrer URL to the format type of the CRS product on Congress.gov.
     -  `<relatedMaterials>`
        - Container for all related materials for an individual CRS product.
        - A `<relatedMaterials>` container may include the following children: 
          - `<item>`
          -  A container for individual related material. This element is repeatable and may contain the following children: 
              - `<title>`
              - The title of the related material. For example, a bill title.
              - `<congress>`
              - The congress during which a bill, resolution, or law was introduced, submitted, or passed.
              - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov.
              - Read more about [Congresses on Congress.gov](https://www.congress.gov/help/legislative-glossary#glossary_congress).
              - `<number>`
              - The assigned bill, resolution, or law number.
              - `<type>`
              - The type of bill, resolution, or law.
              - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", "SRES" “PUB”, and “PRIV”.
              - `<url>`
              - Referrer URL to the bill, resolution, or law data in the Congress.gov API.
       -  `<topics>`
         - Container for CRS product topics data.
         - A `<topics>` container may include the following children:
           - `<item>`
           -  Container for an individual CRS product topic. This element is repeatable and may contain the following children:
              - `<topic>`
              -  An individual product topic assigned to the CRS product.
     -  `<summary>`
         - The summary of the individual CRS product. 
            
