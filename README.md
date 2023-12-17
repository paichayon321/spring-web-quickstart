
Quarkus guide: https://quarkus.io/guides/spring-web dev7


# spring-web-quickstart


# Compile with Swagger-UI and Build as uber-jar: 
```
mvn -Dquarkus.platform.artifact-id=quarkus-universe-bom -Dmaven.test.skip -Dquarkus.package.type=uber-jar  -Dquarkus.swagger-ui.always-include=true clean package
```
# Run 
```
java -jar target/spring-web-quickstart-1.0.0-SNAPSHOT-runner.jar 
```

# Verify Result 
http://localhost:8080/greeting

```
hello
```
# Open swagger-ui
http://localhost:8080/q/swagger-ui/


