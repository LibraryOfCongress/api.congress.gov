# House Roll Call Votes endpoints (Beta)

## Coverage

Beta House Roll Call Vote data in the API currently includes all House roll call votes in the 118th and 119th Congresses associated with a piece of legislation. Non-legislation related votes (e.g., "Election of the Speaker") will be added at a later date. Read more about the [Electronic Voting System in the House of Representatives: History and Usage](https://www.congress.gov/crs-product/R41862) and [Votes in the House and Senate.](https://www.congress.gov/help/votes-in-the-house-and-senate)

## OpenAPI Specification

View OpenAPI Specification on the amendment API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/[BETA]_house-vote).

## Elements and Descriptions

### List Level

Note that House roll call vote items at the list level can be filtered down by congress and by session number (e.g. <https://api.congress.gov/v3/house-vote/118/2?api_key=INSERT_KEY>).

`<api-root>`

The `<api-root>` is only present in the XML format.

`<houseRollCallVotes>`

Parent container for all House roll call votes entries. A <houserRollCallVotes> element may include the following children:

- `<houseRollCallVote>`
  - Container for an individual House roll call vote’s entry. A <houseRollCallVote> element may include the following children:
    - `<startDate>` (e.g., 2024-03-05T18:57:00-05:00)
      - Start date and time for the roll call vote. 
    - `<updateDate>`(e.g., 2024-03-05T18:57:00-05:00)
      - The date of update in Congress.gov.
    - `<identifier>` (e.g. 1182202460)
      - The House roll call vote's identifier. 
      - The identifier is the three digital Congress number, the session number (e.g., 1 or 2), the year of the vote, and the vote number.
    - `<congress>` (e.g. 118)
      - The congress during which the House roll call vote took place. 
    - `<sessioNumber>` (e.g. 2)
      - The session number of the House roll call vote.
      - Possible values are "1" or "2". 
    - `<rollCallNumber>` (e.g., 80)
      - The roll call vote's assigned number.
     - `<voteType>` (e.g., Recorded Vote)
      - The type of vote.
      - Options include: "2/3 Recorded Vote", "2/3 Yea-And-Nay", "3/5 Recorded Vote", "3/5 Yea-And-Nay", "Quorum", "Recorded Vote", and "Yea and Nay".
    - `<result>` (e.g., Failed)
       - The result of the House roll call vote.
       - Options include: "Passed", "Failed", and "Agreed to".
    - `<legislationType>` (e.g., HR) or `<amendmentType>` (e.g., HAMDT)
      - The legislation type associated with the roll call vote.
      - `<legislationType>` is applicable for the following values: "HR", "HJRES", "HCONRES", or "HRES".
      - `<amendmentType>` is applicable for the following value: "HAMDT".
    - `<legislationNumber>` or `<amendmentNumber>`
      - The assigned number of thelegislation associated with the roll call vote.
      - `<legislationNumber>` is applicable for the following values: "HR", "HJRES", "HCONRES", or "HRES".
      - `<amendmentNumber>` is applicable for the following value: "HAMDT".
    - `<amendmentAuthor>` (e.g., "Tlaib of Michigan Amendment No. 6")
      - The author of the House amendment.
      - This element will only populate for House roll call votes associated with an amendment. 
    - `<legislationUrl>`
      - The referrer URL to the piece of legislation in Congress.gov.
    - `<url>`
      - The referrer URL to the House roll call vote's detail level in the Congress.gov API.

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<houseRollCallVote>`
  - Container for an individual House roll call vote's detailed information. A <houseRollCallVote> element may include the following children:
    - `<startDate>` (e.g., 2024-03-05T18:57:00-05:00)
      - Start date and time for the roll call vote. 
    - `<updateDate>`(e.g., 2024-03-05T18:57:00-05:00)
      - The date of update in Congress.gov.
    - `<identifier>` (e.g. 1182202460)
      - The House roll call vote's identifier. 
      - The identifier is the three digital Congress number, the session number (e.g., 1 or 2), the year of the vote, and the vote number.
    - `<congress>` (e.g. 118)
      - The congress during which the House roll call vote took place. 
    - `<sessionNumber>` (e.g. 2)
      - The session number of the House roll call vote.
      - Possible values are "1" or "2". 
    - `<rollCallNumber>` (e.g., 80)
      - The roll call vote's assigned number.
    - `<voteType>` (e.g., Recorded Vote)
      - The type of vote.
      - Options include: "2/3 Recorded Vote", "2/3 Yea-And-Nay", "3/5 Recorded Vote", "3/5 Yea-And-Nay", "Quorum", "Recorded Vote", and "Yea and Nay".
    - `<result>` (e.g., Failed)
       - The result of the House roll call vote.
       - Options include: "Passed", "Failed", and "Agreed to".
    - `<legislationType>` (e.g., HR) or `<amendmentType>` (e.g., HAMDT)
       - The legislation type associated with the roll call vote.
       - `<legislationType>` is applicable for the following values: "HR", "HJRES", "HCONRES", or "HRES".
       - `<amendmentType>` is applicable for the following value: "HAMDT".
    - `<legislationNumber>` or `<amendmentNumber>`
      - The assigned number of thelegislation associated with the roll call vote.
      - `<legislationNumber>` is applicable for the following values: "HR", "HJRES", "HCONRES", or "HRES".
      - `<amendmentNumber>` is applicable for the following value: "HAMDT".
    - `<amendmentAuthor>` (e.g., "Tlaib of Michigan Amendment No. 6")
      - The author of the House amendment.
      - This element will only populate for House roll call votes associated with an amendment. 
    - `<votePartyTotal>`
      - Container for votes by party total. A <votesPartyTotal> element may include the following children:
      - `<item>`
        - Container element for a party within the House of Representatives. This element is repeatable and may contain the following children:
        - `<party>`
          - Container element for party data associated with the House roll call vote. This element is repeatable and may contain the following children:
          - `<type>` (e.g., R)
             - The party's abbreviated code.
             - Options include: "R" for "Republican", "D" for "Democratic", and "I" for "Independent".
          - `<name>`
             - The name of the political party.
             - Options include: "Republican", "Democratic", and "Independent".
        - `<yeaTotal>`
          - Total number of "yes" or "yea" votes by party for the individual vote.
        - `<nayTotal>`
          - Total number of "no" or "nay" votes by party for the individual vote.
        - `<presentTotal>`
          - Total number of "present" votes by party for the individual vote.
        - `<notVotingTotal>`
           - Total number of members not voting by party for the individual vote.
     - `<legislationUrl>`
       - The referrer URL to the piece of legislation in Congress.gov.

### Member Votes Level

`<houseRollCallVoteMemberVotes>`
  - Container for how members voted on an individual House roll call vote. A <houseRollCallVote> element may include the following children:
    - `<startDate>` (e.g., 2024-03-05T18:57:00-05:00)
      - Start date and time for the roll call vote. 
    - `<updateDate>`(e.g., 2024-03-05T18:57:00-05:00)
      - The date of update in Congress.gov.
    - `<identifier>` (e.g. 1182202460)
      - The House roll call vote's identifier. 
      - The identifier is the three digital Congress number, the session number (e.g., 1 or 2), the year of the vote, and the vote number.
    - `<congress>` (e.g. 118)
      - The congress during which the House roll call vote took place. 
    - `<sessionNumber>` (e.g. 2)
      - The session number of the House roll call vote.
      - Possible values are "1" or "2". 
    - `<rollCallNumber>` (e.g., 80)
      - The roll call vote's assigned number.
    - `<voteType>` (e.g., Recorded Vote)
      - The type of vote.
      - Options include: "2/3 Recorded Vote", "2/3 Yea-And-Nay", "3/5 Recorded Vote", "3/5 Yea-And-Nay", "Quorum", "Recorded Vote", and "Yea and Nay".
    - `<result>` (e.g., Failed)
       - The result of the House roll call vote.
       - Options include: "Passed", "Failed", and "Agreed to".
    - `<legislationType>` (e.g., HR) or `<amendmentType>` (e.g., HAMDT)
       - The legislation type associated with the roll call vote.
       - `<legislationType>` is applicable for the following values: "HR", "HJRES", "HCONRES", or "HRES".
       - `<amendmentType>` is applicable for the following value: "HAMDT".
    - `<legislationNumber>` or `<amendmentNumber>`
      - The assigned number of thelegislation associated with the roll call vote.
      - `<legislationNumber>` is applicable for the following values: "HR", "HJRES", "HCONRES", or "HRES".
      - `<amendmentNumber>` is applicable for the following value: "HAMDT".
    - `<amendmentAuthor>` (e.g., "Tlaib of Michigan Amendment No. 6")
      - The author of the House amendment.
      - This element will only populate for House roll call votes associated with an amendment.
    - `<results>`
      - Container for vote results. A <results> element may contain the following children:
      - `<item>`
         - Container for an individual member's vote data on a particular House roll call vote. This item is repeatable and may contain the following children:
         - `<bioguideId>`
           - The unique ID value that originates in the [Biographical Directory of the United States Congress, 1774-Present.](https://bioguide.congress.gov/)
           - View a [field values list of Bioguide identifiers for current and former members in Congress.gov.](https://www.congress.gov/help/field-values/member-bioguide-ids)
         - `<voteCast>` (e.g., Aye)
           - The vote cast by the member.
           - Options include: "Aye", "Nay", "Present", and "Not Voting".
        - `<firstName>`
           - The member's given name.
        - `<lastName>`
           - The member's surname.
        - `<voteParty>` (e.g., D)
          - The member's political party
          - Common options include: "R" for "Republican", "D" for "Democratic", "I" for "Independent".
        - `<voteState>` (e.g., MI)
          - The two digit abbreviation for the member's home state or territory. 
