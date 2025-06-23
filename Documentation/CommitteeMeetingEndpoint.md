# Committee Meeting endpoint

## Coverage

Coverage information for committee meeting data in the API can be found at [Coverage Dates for Congress.gov Collections](https://www.congress.gov/help/coverage-dates). Read more about committee meeting data at [About Committees and Committee Materials](https://www.congress.gov/help/committee-materials#committee-schedule) on Congress.gov. For information on conference committees, please click [here](https://www.congress.gov/help/legislative-glossary#c). 

## OpenAPI Specification

View OpenAPI Specification on the committee meeting API, supported endpoints, and available parameters at [https://api.congress.gov](https://api.congress.gov/#/committee-meeting/committee_meeting_list).

## Elements and Descriptions

The section below details available element names, their description, and possible values.

### List Level

Note that committee meeting items at the list level can be filtered down by congress (e.g., 118) and by chamber (e.g., house) - <https://api.congress.gov/v3/committee-meeting/118/house?api_key>=.

`<api-root>`

The `<api-root>` is only present in the XML format.

`<committeeMeetings>`

Container for committee meetings. A `<committeeMeetings>` container may include the following children:

- `<item>`
  - Container for an individual committee meeting. An `<item>` element is repeatable and may include the following children:
     - `<eventId>` (e.g., 115538)
         - The event identifier of the committee meeting.
     - `<url>` (e.g., <https://api.congress.gov/v3/committee-meeting/118/house/115538>)
         - A referrer URL to the committee meeting item in the API.
     - `<updateDate>` (e.g., 2023-03-27T18:11:19Z)
         - The date of update in Congress.gov.
     - `<congress>` (e.g., 117)
         - The congress during which the committee meeting took place.
         - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
     - `<chamber>` (e.g., House)
         - The chamber where the committee meeting was held.
         - Possible values are "House", "Senate" and "NoChamber".

### Item Level

`<api-root>`

The `<api-root>` is only present in the XML format.

`<committeeMeeting>`

Parent container for a single committee meeting. A `<committeeMeeting>` element may include the following children:
- `<eventId>` (e.g., 115538)
    - The event identifier of the committee meeting.
- `<updateDate>` (e.g., 2023-03-27 18T11:19:00Z)
    - The date of update in Congress.gov.
- `<congress>` (e.g., 117)
    - The congress during which the committee meeting took place.
    - View the [field values list of Congresses](https://www.congress.gov/help/field-values/congresses) on Congress.gov. Read more [about Congresses](https://www.congress.gov/help/legislative-glossary#glossary_congress) on Congress.gov.
- `<type>` (e.g., Hearing)
    - The type of meeting.
    - Possible values for House meetings are "Meeting", "Hearing", and "Markup". Senate meetings are all tagged as a "Meeting".
- `<title>` (e.g., Legislative hearing on: •H.R. 1246 (Rep. Hageman), To authorize leases of up to 99 years for land held in trust for federally recognized Indian tribes; and•H.R. 1532 (Rep. Hageman), To authorize any Indian Tribe to lease, sell, convey, warrant, or otherwise transfer real property to which that Indian Tribe holds fee title without the consent of the Federal Government, and for other purposes.)
    - The title of the meeting.
- `<meetingStatus>` (e.g., Scheduled)
    - The status of the meeting.
    - Possible values are "Scheduled", "Canceled", "Postponed", and "Rescheduled".
- `<date>` (e.g., 2023-03-24 13T00:00:00Z)
    - The date of the meeting.
- `<chamber>` (e.g., House)
    - The chamber where the committee meeting was held.
    - Possible values are "House", "Senate" and "NoChamber".
- `<committees>` 
    - Container for the committees or subcommittees the held the meeting. A `<committees>` element may include the following children:
        - `<item>`
            - Container for an individual committee or subcommittee that held the meeting. An `<item>` element is repeatable and may include the following children:
                - `<systemCode>` (e.g., hsii24)
                    - Unique ID value for the committee or subcommittee.
                - `<url>` (e.g., <https://api.congress.gov/v3/committee/house/hsii24>)
                    - A referrer URL to the committee or subcommittee item in the API. Documentation for the committee API is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/CommitteeEndpoint.md).
                - `<name>` (e.g., House Natural Resources Subcommittee on Indian and Insular Affairs)
                    - The name of the committee or subcommittee.
- `<continuations>`
   - Container for an continuation data for an individual meeting. An `<continuations>` container element is repeatable and may include the following children:
      - `<meeting_dt>`
        - Date ant time of the meeting continuation (e.g., 2023-03-24 13T00:00:00Z).
- `<location>` 
    - Container for the location of the meeting. A `<location>` element may include the following children:
        - `<room>` (e.g., 1324)
            - The room number where the meeting will be or was held. If the meeting was held virtually using 'Webex', the value for `<room>` will be 'WEBEX'. 
            - This element is not present for field meetings.
        - `<building>` (e.g., Longworth House Office Building)
            - The building name where the meeting will be or was held. If the meeting was held virtually using 'Webex', the value for `<building>` may be '----------'. 
            - This element is not present for field meetings.
        - `<address>`
            - The address for the meeting, including the building's name, postal code, state, street address, and city.
            - This element is only present for field meetings.
- `<videos>`
    - Container for videos on the meeting. A `<videos>` element may include the following children:
        - `<item>`
            - Container for a video on the meeting. An `<item>` element may include the following children:
                - `<name>` (e.g., Securing Our Communities: Federal Support to High-Risk Urban Areas)
                    - The title of the video.
                - `<url>` (e.g., <https://www.congress.gov/committees/video/house-appropriations/hshm12/yv8VUIRAm7k>)
                    - The URL for the video on Congress.gov.
- `<witnesses>`
    - Container for witnesses associated with the meeting. A `<witnesses>` element may include the following children:
        - `<item>`
            - Container for a witness associated with the meeting. An `<item>` element may include the following children:
                - `<name>` (e.g., Mr. Thomas DiNanno)
                    - The name of the witness.
                - `<position>` (e.g., Assistant Administrator, Grant Programs Directorate, Federal Emergency Management Agency)
                    - The witness's professional position.
                - `<organization>` (e.g., U.S. Department of Homeland Security)
                    - The witness's organization.
- `<witnessDocuments>`
    - Container for documents provided by witnesses. A `<witnessDocuments>` element may include the following children:
        - `<item>`
            - Container for a witness document. An `<item>` element may include the following children:
                - `<documentType>` (e.g., Witness Statement)
                    - The type of witness document. 
                    - Possible values are "Witness Biography", "Witness Supporting Document", "Witness Statement", and "Witness Truth in Testimony".
                - `<format>` (e.g., PDF)
                    - The format type for the witness document.
                - `<url>` (e.g., https://www.congress.gov/118/meeting/house/115538/witnesses/HHRG-118-II24-Wstate-OsceolaM-20230324.pdf)
                    - The URL for the witness document in Congress.gov.
- `<meetingDocuments>`
    - Container for meeting-related documents, provided by committees or subcommittees. A `<meetingDocuments>` element may include the following children:
        - `<item>`
            - Container for a meeting document. An `<item>` element may include the following children:
                - `<name>` (e.g., Hearing Notice)
                    - The name of the meeting document. 
                - `<description>`
                    - A description of the meeting document. 
                - `<documentType>` (e.g., Support Document)
                    - The type of meeting document.
                    - Possible values are "Activity Report", "Bills and Resolutions", "Committee Amendment", "Committee Recorded Vote", "Committee Report", "Committee Rules", "Conference Report", "Floor Amendment", "Generic Document", "Hearing: Cover Page", "Hearing: Member Roster", "Hearing: Questions for the Record", "Hearing: Table of Contents", "Hearing: Transcript", "Hearing: Witness List", "House or Senate Amendment", "Member Statements", and "Support Document".
                - `<url>` (e.g., <https://www.congress.gov/118/meeting/house/115538/documents/HHRG-118-II24-20230324-SD001.pdf>)
                    - The URL for the meeting document on Congress.gov.
                - `<format>` (e.g., PDF)
                    - The format type for the meeting document.
- `<hearingTranscript>`
    - Container for associated hearing transcripts to committee meetings. A `<hearingTranscript>` element may include the following children:
        - `<jacketNumber>` 
            - The jacket identifier of the hearing transcript. The `<jacketNumber>` is printed on the front page of a hearing transcript and is usually five digits.
        - `<url>` 
            - A referrer URL to the hearing item in the API. Documentation for the hearing API is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/HearingEndpoint.md).
- `<relatedItems>`
    - Container for associated bills, resolutions, treaties or nominations to the meeting. A `<relatedItems>` element may include the following children:
        - `<bills>`
            - Container for associated bills and resolutions to the meeting. A `<bills>` element may include the following children:
                - `<bill>`
                    - Container for an associated bill or resolution to the meeting. A `<bill>` element may include the following children:
                        - `<type>` (e.g., HR)
                            - The type of bill or resolution.
                            - Possible values are "HR", "S", "HJRES", "SJRES", "HCONRES", "SCONRES", "HRES", and "SRES".
                        - `<number>` (e.g., 1532)
                            - The assigned bill or resolution number.
                        - `<congress>` (e.g., 118)
                            - The congress during which a bill or resolution was introduced or submitted.
                        - `<url>` (e.g., <https://api.congress.gov/v3/bill/118/hr/1532>)
                            - A referrer URL to the bill or resolution item in the API. Documentation for the bill API is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/BillEndpoint.md).
        - `<treaties>`
            - Container for associated treaties to the meeting. A `<treaties>` element may include the following children:
                - `<item>`
                    - Container for an associated treaty to the meeting. An `<item>` element may include the following children:
                        - `<part>`
                            - The part number for the treaty, if partitioned.
                        - `<number>` 
                            - The assigned treaty number.
                        - `<congress>`
                            - The congress during which the treaty was submitted.
                        - `<url>`
                            - A referrer URL to the treaty item in the API. Documentation for the treaty API is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/TreatyEndpoint.md).
        - `<nominations>`
            - Container for associated nominations to the meeting. A `<nominations>` element may include the following children:
                - `<item>`
                    - Container for an associated nomination to the meeting. An `<item>` element may include the following children:
                        - `<part>`
                            - The part number for the nomination. 
                            - If the nomination wasn't partitioned, the value will be 00.
                        - `<number>` 
                            - The assigned nomination number.
                        - `<congress>`
                            - The congress during which the nomination was received.
                        - `<url>`
                            - A referrer URL to the nomination item in the API. Documentation for the nomination API is available [here](https://github.com/LibraryOfCongress/api.congress.gov/blob/main/Documentation/NominationEndpoint.md).
