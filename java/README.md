# Congress Dot Gov - Example Java Client

### Compiling:

Compile java source files in src:

```shell
javac src/gov/loc/*.java src/sample/*.java
```

---
### Set Up

Create a folder structure:

```shell
mkdir -p output/gov/loc output/sample
```

Copy loc.cfg from the root of the repo to the root of the 'output' folder

```shell
cp loc.cfg output
```

- Edit loc.cfg and make sure the CONFIG.AUTH_KEY value is set
- Adjust the response format to your preferred format (xml | json), default is json

Move all .class files to the correct folders
```shell
mv src/gov/loc/*.class output/gov/loc && mv src/sample/*.class output/sample
```

---
### Usage:
From the root of the 'output' folder run app with the 'help' parameter to view the available options

```shell
java sample.Main help

java sample.Main bill
```

```java
import gov.loc.CDGClient;

public class TestCDG {

    public static void main(String[] args) {
        String url = "the api url endpoint";
        String response = CDGClient.makeRequestGetResponse(url).body();
        System.out.println(response);
    }
}
```

<p>&nbsp;</p>

---
© 2022, Library of Congress via Congress.gov