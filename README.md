# Congress Dot Gov - Example API Client


Example code for a CDG API Client is located here.


### Important note about the API Authorization Key

The API key assigned to your organization is not meant to be shared.  It should:

- Not be copied directly into source code,
  particularly code that will be committed to source control and uploaded to
  centralized servers and/or cloud hosting services,
  such as github, bitbucket, or others.

- Not be given as an URL?=parameter, which may be recorded in transit and will be in
  server logs and metrics products.

- Nor should it be given as a command-line parameter,
  which are typically recorded to a history file.

Use a secure storage system of your choosing which can deploy the key securely
to your application.  In absence of such system, other reasonable choices are:

- Put the key into a separate configuration file in an external folder with
  tight access permissions, i.e. only readable by the application's user
  account.  This avoids the likelyhood of it being recorded in version control.

- For manually run programs, use the "keyring" functionality of your
  Operating System to store the secret (see Python example).


### Example Code

There are examples in more than one programming language,
see the subfolders in this repository.
Kindly click on the folders to view.


<p>&nbsp;</p>

---
© 2022, Library of Congress via Congress.gov
