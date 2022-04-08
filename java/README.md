# Congress Dot Gov - Example Java Client

### Set Up

Create a folder structure:

```shell
mkdir -p some_folder/gov/loc
mkdir -p some_folder/sample
```

Copy loc.cfg from the root of the repo to the root of 

```shell
cp loc.cfg some_folder
```

- Edit the loc.cfg and make sure the CONFIG.AUTH_KEY is set
- Adjust the response format to your preferred format (xml | json), default is json

---
### Compiling:

Compile java source files in src: 

```shell
javac src/gov/loc/*.java /src/sample/*.java
```

Move all .class files to the loc folder
```shell
mv src/gov/loc/*.class some_folder/gov/loc
mv src/sample/*.class some_folder/class
```

---
### Usage:
From 'some_folder' run app with the 'help' parameter to view the available options

```shell
java -classpath ./ sample.Main help
java -classpath ./ sample.Main bill
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