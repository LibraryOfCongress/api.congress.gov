# Treaty endpoints

## Coverage

Coverage information for treaty data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about treaty data at [About Treaty Documents](https://www.congress.gov/help/treaty-documents) on Congress.gov.

## OpenAPI Specification

View OpenAPI Specification on the treaty API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/treaty/treaty_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that treaty document items at the list level can be filtered down by congress of submission (e.g. 117) – <https://api.congress.gov/v3/treaty?api_key>=.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<treaties>`  

Parent container for treaties. A `<treaties>` element may include the following children:

- `<item>`
  - Container for an individual treaty. An `<item>` element is repeatable and may include the following children:
    - `<congressReceived>` (e.g., 117)
      - The congress during which the treaty was submitted.
      - Unlike bills and resolutions, treaties remain active in a congress until they are ratified or returned to the President.
      - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
    - `<congressConsidered>` (e.g., 117)
      - The congress during which the treaty was ratified or returned to the President.
    - `<number>` (e.g., 3)
      - The assigned treaty number.
    - `<suffix>`
      - The treaty part, if the treaty was partitioned.
      - Possible values include "A", "B", "C", etc.
    - `<transmittedDate>` (e.g., 2022-07-11T00:00:00Z)
      - The date the treaty was transmitted to the Senate.
    - `<resolutionText>` (e.g., `<![CDATA[<!DOCTYPE html><html xmlns="http://www.w3.org/1999/xhtml" lang="en"><head><meta name="meta:creation-date" content="2022/08/03 18:28:08" /><meta name="dc:title" content="[117] TreatyRes. 6 for TreatyDoc. 117 - 3" /><meta name="Creation-Date" content="2022/08/03 18:28:08" /><meta name="dcterms:created" content="2022/08/03 18:28:08" /><meta name="Content-Type" content="application/rtf" /><title>[117] TreatyRes. 6 for TreatyDoc. 117 - 3</title></head><body><p>As approved by the Senate: </p><p><i>Resolved (two-thirds of the Senators present concurring therein),</i></p><p></p><p><b>SECTION 1. SENATE ADVICE AND CONSENT SUBJECT TO DECLARATIONS AND CONDITIONS.</b></p><p></p><p>The Senate advises and consents to the ratification of the Protocols to the North Atlantic Treaty of 1949 on the Accession of the Republic of Finland and the Kingdom of Sweden, which were signed on July 5, 2022, by the United States of America and other parties to the North Atlantic Treaty of 1949 (Treaty Doc. 117-3), subject to the declarations of section 2 and the condition of section 3.</p><p><b>SEC. 2. DECLARATIONS.</b></p><p></p><p>The advice and consent of the Senate under section 1 is subject to the following declarations:</p><p>(1)Reaffirmation That United States Membership in NATO Remains a Vital National Security Interest of the United States.- The Senate declares that-</p><p>(A)for more than 70 years the North Atlantic Treaty Organization (NATO) has served as the preeminent organization to defend the countries in the North Atlantic area against all external threats;</p><p>(B)through common action, the established democracies of North America and Europe that were joined in NATO persevered and prevailed in the task of ensuring the survival of democratic government in Europe and North America throughout the Cold War;</p><p>(C)NATO enhances the security of the United States by embedding European states in a process of cooperative security planning and by ensuring an ongoing and direct leadership role for the United States in European security affairs;</p><p>(D)the responsibility and financial burden of defending the democracies of Europe and North America can be more equitably shared through an alliance in which specific obligations and force goals are met by its members;</p><p>(E)the security and prosperity of the United States is enhanced by NATO's collective defense against aggression that may threaten the security of NATO members; and</p><p>(F)United States membership in NATO remains a vital national security interest of the United States.</p><p>(2)Strategic Rationale for NATO Enlargement.- The Senate declares that-</p><p>(A)the United States and its NATO allies face continued threats to their stability and territorial integrity;</p><p>(B)an attack against Finland or Sweden, or the destabilization of either arising from external subversion, would threaten the stability of Europe and jeopardize United States national security interests;</p><p>(C)Finland and Sweden, having established democratic governments and having demonstrated a willingness to meet the requirements of membership, including those necessary to contribute to the defense of all NATO members, are in a position to further the principles of the North Atlantic Treaty and to contribute to the security of the North Atlantic area; and</p><p>(D)extending NATO membership to Finland and Sweden will strengthen NATO, enhance stability in Europe, and advance the interests of the United States and its NATO allies.</p><p>(3)Support for NATO's Open Door Policy.- The policy of the United States is to support NATO's Open Door Policy that allows any European country to express its desire to join NATO and demonstrate its ability to meet the obligations of NATO membership.</p><p>(4)Future Consideration of Candidates for Membership in NATO.-</p><p>(A)Senate Finding.-The Senate finds that the United States will not support the accession to the North Atlantic Treaty of, or the invitation to begin accession talks with, any European state (other than Finland and Sweden), unless-</p><p>(i)the President consults with the Senate consistent with Article II, section 2, clause 2 of the Constitution of the United States (relating to the advice and consent of the Senate to the making of treaties); and</p><p>(ii)the prospective NATO member can fulfill all of the obligations and responsibilities of membership, and the inclusion of such state in NATO would serve the overall political and strategic interests of NATO and the United States.</p><p>(B)Requirement for Consensus and Ratification.-The Senate declares that no action or agreement other than a consensus decision by the full membership of NATO, approved by the national procedures of each NATO member, including, in the case of the United States, the requirements of Article II, section 2, clause 2 of the Constitution of the United States (relating to the advice and consent of the Senate to the making of treaties), will constitute a commitment to collective defense and consultations pursuant to Articles 4 and 5 of the North Atlantic Treaty.</p><p>(5)Influence of Non-NATO Members on NATO Decisions.- The Senate declares that any country that is not a member of NATO shall have no impact on decisions related to NATO enlargement.</p><p>(6)Support for 2014 Wales Summit Defense Spending Benchmark.--The Senate declares that all NATO members should spend a minimum of 2 percent of their Gross Domestic Product (GDP) on defense and 20 percent of their defense budgets on major equipment, including research and development, by 2024, as outlined in the 2014 Wales Summit Declaration.</p><p><b>SEC. 3. CONDITION.</b></p><p></p><p>The advice and consent of the Senate under section 1 is subject to the following conditions</p><p>(1)Presidential Certification.-Prior to the deposit of the instrument of ratification, the President shall certify to the Senate as follows:</p><p>(A)The inclusion of Finland and Sweden in NATO will not have the effect of increasing the overall percentage share of the United States in the common budgets of NATO.</p><p>(B)The inclusion of Finland and Sweden in NATO does not detract from the ability of the United States to meet or to fund its military requirements outside the North Atlantic area.</p><p><b>SEC. 4. DEFINITIONS.</b></p><p></p><p>In this resolution:</p><p>(1)NATO Members.-The term &ldquo;NATO members&rdquo; means all countries that are parties to the North Atlantic Treaty.</p><p>(2)Non-NATO Members.-The term &ldquo;non-NATO members&rdquo; means all countries that are not parties to the North Atlantic Treaty.</p><p>(3)North Atlantic Area.-The term &ldquo;North Atlantic Area&rdquo; means the area covered by Article 6 of the North Atlantic Treaty, as applied by the North Atlantic Council.</p><p>(4)North Atlantic Treaty.-The term &ldquo;North Atlantic Treaty&rdquo; means the North Atlantic Treaty, signed at Washington April 4, 1949 (63 Stat. 2241; TIAS 1964), as amended.</p><p>(5)United States Instrument of Ratification.-The term &ldquo;United States instrument of ratification&rdquo; means the instrument of ratification of the United States of the Protocols to the</p><p>North Atlantic Treaty of 1949 on the Accession of the Republic of Finland and the Kingdom of Sweden.</p></body></html>]]>`)
      - The text of the resolution of ratification.
      - Note that the text is encased in CDATA and includes HTML codes.
    - `<topic>` (e.g., International Law and Organization)
      - The assigned topic of the treaty.  
    - `<updateDate>` (e.g., 2022-08-04T02:46:11Z)
      - The date of update on Congress.gov.
    - `<parts>`
      - Container for treaty part information. A `<parts>` element may include the following children (the below data is taken from <https://api.congress.gov/v3/treaty/114/13>):
        - `<count>` (e.g., 2)
          - The number of treaty parts.
        - `<urls>`
          - Container for the referrer URLs to the treaty part items in the API. A `<urls>` element may include the following children:
            - `<item>` (e.g., <https://api.congress.gov/v3/treaty/114/13/B>)
              - A referrer URL to the treaty part item in the API.
    - `<url>` (e.g., <http://https://api.congress.gov/v3/treaty/117/3>)
      - A referrer URL to the treaty item on the API.

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<treaty>`

- Parent container for an individual treaty. A `<treaty>` element may include the following children:
  - `<congressReceived>` (e.g., 117)
    - The congress during which the treaty was submitted.
    - Unlike bills and resolutions, treaties remain active in a congress until they are ratified or returned to the President.
    - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
  - `<congressConsidered>` (e.g., 117)
    - The congress during which the treaty was ratified or returned to the President.
  - `<number>` (e.g., 3)
    - The assigned treaty number.
  - `<suffix>`
    - The treaty part, if the treaty was partitioned.
    - Possible values include "A", "B", "C", etc.
  - `<countriesParties>`
    - The country/ies associated with a particular treaty.
    - `<item>`
      - Container element for individual countries/parties associated with the treaty. An <item> element may include the following children:
         - `<name>` (e.g., Sweden)
           - The name of the associated country or party.
  - `<oldNumber>`
    - The number assigned to treaties ratified prior to the 97th Congress.
    - To allow for searching by treaty document number on Congess.gov, old treaty numbers were converted. View the table that converts the old numbering to a new one at the [Treaty Numbers Conversion Table](https://www.congress.gov/help/treaty-documents#conversion) on Congress.gov.
  - `<oldNumberDisplayName>`
    - The original treaty number display string, prior to conversion, for treaties ratified prior to the 97th Congress.
    - To allow for searching by treaty document number on Congess.gov, old treaty numbers were converted. View the table that converts the old numbering method to a new one at the [Treaty Numbers Conversion Table](https://www.congress.gov/help/treaty-documents#conversion) on Congress.gov.
  - `<transmittedDate>` (e.g., 2022-07-11T00:00:00Z)
    - The date the treaty was transmitted to the Senate.
  - `<inForceDate>`
    - The date when the treaty agreement takes effect.
  - `<indexTerms>`
    - The index terms associated with a particular treaty.
    - `<item>`
      - Container element for individual index terms associated with the treaty. An <item> element may include the following children:
         - `<name>` (e.g., Maritime)
           - The name of the associated index term.
  - `<relatedDocs>`
    - Container for executive reports associated with the treaty. A `<relatedDocs>` element may include the following children (the data below is taken from <https://api.congress.gov/v3/treaty/116/1>):
      - `<item>`
        - Container element for individual executive reports associated with the treaty. An `<item>` element may include the following children:
          - `<name>` (e.g., Ex. Rept. 116-5)
            - The citation for the associated executive report.
          - `<url>` (e.g., <https://api.congress.gov/v3/committee-report/116/ERPT/5>)
            - A referrer URL to the executive report item in the API. Documentation on committee reports is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeReportEndpoint.md).
  - `<resolutionText>` (e.g., `<![CDATA[<!DOCTYPE html><html xmlns="http://www.w3.org/1999/xhtml" lang="en"><head><meta name="meta:creation-date" content="2022/08/03 18:28:08" /><meta name="dc:title" content="[117] TreatyRes. 6 for TreatyDoc. 117 - 3" /><meta name="Creation-Date" content="2022/08/03 18:28:08" /><meta name="dcterms:created" content="2022/08/03 18:28:08" /><meta name="Content-Type" content="application/rtf" /><title>[117] TreatyRes. 6 for TreatyDoc. 117 - 3</title></head><body><p>As approved by the Senate: </p><p><i>Resolved (two-thirds of the Senators present concurring therein),</i></p><p></p><p><b>SECTION 1. SENATE ADVICE AND CONSENT SUBJECT TO DECLARATIONS AND CONDITIONS.</b></p><p></p><p>The Senate advises and consents to the ratification of the Protocols to the North Atlantic Treaty of 1949 on the Accession of the Republic of Finland and the Kingdom of Sweden, which were signed on July 5, 2022, by the United States of America and other parties to the North Atlantic Treaty of 1949 (Treaty Doc. 117-3), subject to the declarations of section 2 and the condition of section 3.</p><p><b>SEC. 2. DECLARATIONS.</b></p><p></p><p>The advice and consent of the Senate under section 1 is subject to the following declarations:</p><p>(1)Reaffirmation That United States Membership in NATO Remains a Vital National Security Interest of the United States.- The Senate declares that-</p><p>(A)for more than 70 years the North Atlantic Treaty Organization (NATO) has served as the preeminent organization to defend the countries in the North Atlantic area against all external threats;</p><p>(B)through common action, the established democracies of North America and Europe that were joined in NATO persevered and prevailed in the task of ensuring the survival of democratic government in Europe and North America throughout the Cold War;</p><p>(C)NATO enhances the security of the United States by embedding European states in a process of cooperative security planning and by ensuring an ongoing and direct leadership role for the United States in European security affairs;</p><p>(D)the responsibility and financial burden of defending the democracies of Europe and North America can be more equitably shared through an alliance in which specific obligations and force goals are met by its members;</p><p>(E)the security and prosperity of the United States is enhanced by NATO's collective defense against aggression that may threaten the security of NATO members; and</p><p>(F)United States membership in NATO remains a vital national security interest of the United States.</p><p>(2)Strategic Rationale for NATO Enlargement.- The Senate declares that-</p><p>(A)the United States and its NATO allies face continued threats to their stability and territorial integrity;</p><p>(B)an attack against Finland or Sweden, or the destabilization of either arising from external subversion, would threaten the stability of Europe and jeopardize United States national security interests;</p><p>(C)Finland and Sweden, having established democratic governments and having demonstrated a willingness to meet the requirements of membership, including those necessary to contribute to the defense of all NATO members, are in a position to further the principles of the North Atlantic Treaty and to contribute to the security of the North Atlantic area; and</p><p>(D)extending NATO membership to Finland and Sweden will strengthen NATO, enhance stability in Europe, and advance the interests of the United States and its NATO allies.</p><p>(3)Support for NATO's Open Door Policy.- The policy of the United States is to support NATO's Open Door Policy that allows any European country to express its desire to join NATO and demonstrate its ability to meet the obligations of NATO membership.</p><p>(4)Future Consideration of Candidates for Membership in NATO.-</p><p>(A)Senate Finding.-The Senate finds that the United States will not support the accession to the North Atlantic Treaty of, or the invitation to begin accession talks with, any European state (other than Finland and Sweden), unless-</p><p>(i)the President consults with the Senate consistent with Article II, section 2, clause 2 of the Constitution of the United States (relating to the advice and consent of the Senate to the making of treaties); and</p><p>(ii)the prospective NATO member can fulfill all of the obligations and responsibilities of membership, and the inclusion of such state in NATO would serve the overall political and strategic interests of NATO and the United States.</p><p>(B)Requirement for Consensus and Ratification.-The Senate declares that no action or agreement other than a consensus decision by the full membership of NATO, approved by the national procedures of each NATO member, including, in the case of the United States, the requirements of Article II, section 2, clause 2 of the Constitution of the United States (relating to the advice and consent of the Senate to the making of treaties), will constitute a commitment to collective defense and consultations pursuant to Articles 4 and 5 of the North Atlantic Treaty.</p><p>(5)Influence of Non-NATO Members on NATO Decisions.- The Senate declares that any country that is not a member of NATO shall have no impact on decisions related to NATO enlargement.</p><p>(6)Support for 2014 Wales Summit Defense Spending Benchmark.--The Senate declares that all NATO members should spend a minimum of 2 percent of their Gross Domestic Product (GDP) on defense and 20 percent of their defense budgets on major equipment, including research and development, by 2024, as outlined in the 2014 Wales Summit Declaration.</p><p><b>SEC. 3. CONDITION.</b></p><p></p><p>The advice and consent of the Senate under section 1 is subject to the following conditions</p><p>(1)Presidential Certification.-Prior to the deposit of the instrument of ratification, the President shall certify to the Senate as follows:</p><p>(A)The inclusion of Finland and Sweden in NATO will not have the effect of increasing the overall percentage share of the United States in the common budgets of NATO.</p><p>(B)The inclusion of Finland and Sweden in NATO does not detract from the ability of the United States to meet or to fund its military requirements outside the North Atlantic area.</p><p><b>SEC. 4. DEFINITIONS.</b></p><p></p><p>In this resolution:</p><p>(1)NATO Members.-The term &ldquo;NATO members&rdquo; means all countries that are parties to the North Atlantic Treaty.</p><p>(2)Non-NATO Members.-The term &ldquo;non-NATO members&rdquo; means all countries that are not parties to the North Atlantic Treaty.</p><p>(3)North Atlantic Area.-The term &ldquo;North Atlantic Area&rdquo; means the area covered by Article 6 of the North Atlantic Treaty, as applied by the North Atlantic Council.</p><p>(4)North Atlantic Treaty.-The term &ldquo;North Atlantic Treaty&rdquo; means the North Atlantic Treaty, signed at Washington April 4, 1949 (63 Stat. 2241; TIAS 1964), as amended.</p><p>(5)United States Instrument of Ratification.-The term &ldquo;United States instrument of ratification&rdquo; means the instrument of ratification of the United States of the Protocols to the</p><p>North Atlantic Treaty of 1949 on the Accession of the Republic of Finland and the Kingdom of Sweden.</p></body></html>]]>`)
    - The text of the resolution of ratification.
    - Note that the text is encased in CDATA and includes HTML codes.
  - `<topic>` (e.g., International Law and Organization)
    - The assigned topic of the treaty.  
  - `<updateDate>` (e.g., 2022-08-04T02:46:11Z)
    - The date of update on Congress.gov.
  - `<parts>`
    - Container for treaty part information. A `<parts>` element may include the following children (the below data is taken from <https://api.congress.gov/v3/treaty/114/13>):
      - `<count>` (e.g., 2)
        - The number of treaty parts.
      - `<urls>`
        - Container for the referrer URLs to the treaty part items in the API. A `<urls>` element may include the following children:
      - `<item>` (e.g., <https://api.congress.gov/v3/treaty/114/13/B>)
        - A referrer URL to the treaty part item in the API.
 - `<titles>`
    - Container for title information for the treaty. An `<titles>` element may include the following children:
      - `<title>` 
        - The title of the treeaty.
      - `<titleType>` (e.g., https://api.congress.gov/v3/treaty/114/13/B)
        - Type of title (e.g., Treaty- Formal Title)
  - `<actions>`
    - Container for actions on the treaty. An `<actions>` element may include the following children:
      - `<count>` (e.g., 7)
        - The number of actions on the treaty.
      - `<url>` (e.g., <https://api.congress.gov/congress/v3/treaty/117/3/actions>)
        - A referrer URL to the actions level of the treaty API. Click [here](#actions-level) for more information about the actions level.
   
         
### Actions Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<actions>` (the example below is based on <https://api.congress.gov/v3/treaty/114/13/A/actions>. While this example is a treaty with parts, the same structure exists for treaties without parts.)

- Parent container for actions on a treaty. An `<actions>` element may include the following children:
  - `<item>`
    - Container for an individual action on a treaty. An `<item>` element is repeatable and may include the following children:
      - `<type>` (e.g., IntroReferral)
        - A short name representing stages or categories of more detailed actions. Most types condense actions into sets. Some types are used for data processing and do not represent Senate processes.
        - Possible values include "Calendars", "Committee", "Discharge", "Floor", and "IntroReferral".
      - `<committee>`
        - Container for committee information. A `<committee>` element may include the following children:
          - `<systemCode>` (e.g., ssfr00)
            - Unique ID value for the committee.
          - `<name>` (e.g., Foreign Relations Committee)
            - The name of the committee.
          - `<url>` (e.g., <https://api.congress.gov/v3/committee/senate/ssfr00>)
            - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
      - `<actionCode>` (e.g, S05120)
        - A Senate-provided action code associated with the action taken on a treaty.
      - `<actionDate>` (e.g., 2016-12-09)
        - The date of action taken on the treaty.
      - `<text>` (e.g., Received in the Senate and referred to the Committee on Foreign Relations by unanimous consent removing the injunction of secrecy.)
        - The text of the action taken on the treaty.

### Committees Level  

`<api-root>`

The `<api-root>` is only present in the XML format.

`<treatyCommittees>` (the example below is based on <https://api.congress.gov/v3/treaty/116/3/committees>.)

- Parent container for committees with activity associated with the treaty. A `<treatyCommittees>` element may include the following children:
  - `<item>`
    - Container for the individual elements associated with a committee taking action on a treaty. An `<item>` element is repeatable and may include the following children:
      - `<url>` (e.g., <https://api.congress.gov/v3/committee/senate/ssfr00>)
        - A referrer URL to the committee item in the API. Documentation for the committee endpoint is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
      - `<systemCode>` (e.g, ssfr00)
        - Unique ID value for the committee.
      - `<name>` (e.g, Foreign Relations Committee)
        - The name of the committee or subcommittee.
      - `<chamber>` (e.g., Senate)
        - The chamber where the committee operates. This value will always be set to "Senate".
      - `<type>` (e.g., Standing)
        - The type or status of the committee. This value will always be set to "Standing".
      - `<subcommittees>`
        - Container for subcommittees with activity associated with the nomination.
      - `<activities>`
        - Container for the committee or subcommittee activities associated with the treaty. An `<activities>` element may include the following children:
          - `<item>`
            - Container for a committee or subcommittee activity. An `<item>` element is repeatable and may include the following children:
              - `<name>` (e.g., Referred to)
                - The committee or subcommittee activity.
                - Possible values are "Referred to", "Re-Referred to", "Reported by", and "Discharged from".
              - `<date>` (e.g., 2020-06-18T20:19:22Z)
                - The date of the committee or subcommittee activity.
