# Congress Dot Gov - Example API Client

Example code for a CDG API Client is located here.

## Important note about the API Authorization Key

The API key assigned to your organization is not meant to be shared.  It should:

- Not be copied directly into source code,
  particularly code that will be committed to source control and uploaded to
  centralized servers and/or cloud hosting services,
  such as github, bitbucket, or others.

- Nor should it be given as a command-line parameter,
  which are typically recorded to a history file.

Your API key may be passed to the service in a few different ways. Pick which ever method is easiest for you:

 - The API may support passing the API key into the api_key GET query string parameter:
   - curl 'https://api.congress.gov/v3/bill/117/hr/3076/titles?api_key=[INSERT_KEY]’
   - https://api.congress.gov/v3/bill/117/hr/3076/titles?api_key=[INSERT_KEY]

- Pass the API key into the X-Api-Key header:
  - curl -H 'API_KEY': [INSERT_KEY]' ''https://api.congress.gov/v3/bill/117/hr/3076/titles?limit=1'

Use a secure storage system of your choosing which can deploy the key securely
to your application.  In absence of such system, other reasonable choices are:

- Put the key into a separate configuration file in an external folder with
  tight access permissions, i.e. only readable by the application's user
  account.  This reduces the likelihood of it being recorded in version control.

- For manually run programs, use the "keyring" functionality of your
  Operating System to store the secret (see Python example).

### Example Code

There are examples in more than one programming language,
see the subfolders in this repository.
Kindly click on the folders to view.

---
© 2025, Library of Congress via Congress.gov
