# Analytics
A simple analytics package to track progress towards accomplishing personal goals.

This is a simple project to teach myself about Spring Boot and eventually Java 1.8's streaming Collection features.  Some aspects are quick-and-dirty; if I end up finding this web application's functionality useful, there will be significant refactoring involved.

## How to Build and Run the RESTful API (SpringBoot) app

This can be built by downloading the repo and running `mvn clean install`from the project root directory (should have a `pom.xml` file).
Then, run from the `target` subdirectory with `java -jar "<jar file name>.jar"`.  The SpringBoot app is now available running on `localhost:8080`.

The ReactJS app can be run with `yarn start` from the appropriate directory; more detailed instructions TBD....

### Update 9.4.2019

I've added a simple ReactJS app that displays the in memory goals and records.  There's no add/update/delete functionality through the ReactJS app at this time, but I'm shooting to have support for that by Monday 9.9.2019.  The API has some functionality that can be accessed via Postman or cURL.  Due to the original learning objective of this project, there's a big need for documentation and some refactoring.
