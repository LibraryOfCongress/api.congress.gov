# Congress Dot Gov - Sample Java Client

## Table of contents

- [Requirements](#requirements)
- [API Credentials](#api-credentials)
- [Setup](#setup)
- [Config file](#config-file)
- [Execution](#execution)
- [Additional Information](#additional-information)
- [Client arguments](#client-arguments)

## Requirements

Building and running the CDG Sample Java client requires:
1. openJDK v 18.0+ or the equivalent
2. An API Key from https://api.data.gov (TODO: update the to the final URL)

## API Credentials
Sign up for and retrieve your API key from https://api.data.gov (TODO: update the to the final URL)

## Setup
Ensure you have Java installed and the correct version. This sample was compiled using openJDK v 18.0.  Earlier versions may also work, but have not been tested.
````shell
java -version
````

Clone this repository and execute the setup script to create the folder structure, compile the source and move the assets into place
````shell
git clone <TODO add the repository URL>
cd java && ./setup.sh
 ````

Edit the loc.cfg file in the client folder and set the CONFIG.API_KEY value to your API Key you obtained earlier
````shell
cd client && nano loc.cfg
````

## Config file
Some configurable options in the config file are

| Key                      | Description                                                        | Values                                       |
|--------------------------|--------------------------------------------------------------------|----------------------------------------------|
| *CONFIG_API_KEY*         | The API key used to authenticate calls                             | Retrieved from https://api.data.gov          |
| *CONFIG.RESPONSE_FORMAT* | Sets the response format returned by the API                       | xml, json                                    |
| *CONFIG.STORE_RESPONSE*  | Store the response to a text file or not                           | true, false                                  |
| *CONFIG.OUTPUT_FOLDER*   | The folder to store the xml or json output if storing the response | a valid folder name                          |
| *BILL.CONGRESS*          | The numerical value of the congress to query                       | 1 - 117 (or current congress)                |
| *BILL.CHAMBER*           | The congressional chamber                                          | hr, s, sjres, hjres                          |
| *BILL.NUMBER*            | The bill number to query                                           | A valid bill number from https://congres.gov |
| *BILL.URL*               | The bill url for the API to query                                  | bill                                         |


## Execution
To display the help message execute the following:
````shell
java sample.Main help
````
Execute the sample application using the sample Bill definitions in loc.cfg.  Upon successful execution, check the contents of the client/output folder and you will see the results of the API call stored in text files 
````shell
java sample.Main bill
````

## Client arguments
Other options allowed as arguments to java sample.Main are:

| Argument             | Description                              |
|----------------------|------------------------------------------|
| *help*               | Displays the help message                |
| *all_bill_calls*     | Runs all of the defined bill API calls   |
| *bills_get_all*      | Gets all bills                           |
| *bills_by_congress*  | Gets all bills by the specified congress |
| *bills_by_chamber*   | Gets all bills by the specified chamber  |
| *bill*               | Gets a specific bill                     |
| *bill_actions*       | Gets a bills actions                     |
| *bill_amendments*    | Gets a bills amendments                  |
| *bill_committees*    | Gets a bills committees                  |
| *bill_cosponsors*    | Gets a bills cosponsors                  |
| *bill_related_bills* | Gets a bills related bills               |
| *bill_subjects*      | Gets a bills subjects                    |
| *bill_summaries*     | Gets a bills summaries                   |
| *bill_texts*         | Gets a bills texts                       |
|  *bill_titles*       | Gets a bills titles                      |

## Additional Information
- For more information and the full API reference, please visit TODO INSERT API DOC LINK HERE
- Alternative ways to make use of your API key when making calls can be found here: https://api.data.gov/docs/api-key/