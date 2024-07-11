# Java Maven Example Project

Prerequisites:
- Java installation (`java --version`)
- Maven installation (`mvn --version`)


# Usage

## Build and run

```bash
mvn dependency:resolve
mvn package
java -cp target/my-app-1.0-SNAPSHOT.jar com.company.myapp.App
```

or

```bash
mvn exec:java -Dexec.mainClass="com.company.myapp.App"
```

## Adding dependencies

1. Search in maven repositories: https://mvnrepository.com/
2. Add dependency to `pom.xml`:
```
    <!-- https://mvnrepository.com/artifact/org.json/json -->
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20240303</version>
    </dependency>
```
3. Resolve dependencies via `mvn dependency:resolve`