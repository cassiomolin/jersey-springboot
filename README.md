# REST API using Spring Boot and Jersey

[![Build Status](https://travis-ci.org/cassiomolin/spring-jersey.svg?branch=master)](https://travis-ci.org/cassiomolin/spring-jersey)
[![MIT Licensed](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/cassiomolin/spring-jersey/master/LICENSE.txt)

This sample application demonstrates how to create a REST API using Spring Boot, Jersey and Jackson.

## How to build and run this application?

To build and run this application, follow these steps:

1. Open a command line window or terminal.
1. Navigate to the root directory of the project, where the `pom.xml` resides.
1. Compile the project: `mvn clean compile`.
1. Package the application: `mvn package`.
1. Change into the `target` directory: `cd target`
1. You should see a file with the following or a similar name: `spring-jersey-1.0.jar`.
1. Execute the JAR: `java -jar spring-jersey-1.0.jar`.
1. The application should be available at `http://localhost:8080/api`.

## What will you find in this application?

This application provides a REST API that currently supports the following operations:


### Get a greeting

```bash
curl -X GET \
  http://localhost:8080/api/greetings \
  -H 'Accept: text/plain'
```

### Get the current date

```bash
curl -X GET \
  http://localhost:8080/api/current-date \
  -H 'Accept: application/json'
```

## Targeting the API with Postman

Alternatively to cURL, you can use [Postman][] to target the REST API. The Postman files are available in the [`postman`][postman GitHub directory] directory.


[Postman]: https://www.getpostman.com/
[postman GitHub directory]: https://github.com/cassiomolin/spring-jersey/tree/master/postman
