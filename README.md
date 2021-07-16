# Setup GH Action CI on mini Java project with Maven
## nn-test-ci-cd-provider

This repo contains a single java application. Only purpose: test Github Action as CI/CD provider

[![Java CI with Maven](https://github.com/mkl-github-organization/nn-test-ci-cd-provider/actions/workflows/build-java-with-maven.yml/badge.svg?branch=main)](https://github.com/mkl-github-organization/nn-test-ci-cd-provider/actions/workflows/build-java-with-maven.yml)


### Source
[maven-in-five-minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
Using maven to package Java

#### Linter
- [super-linter](https://github.com/github/super-linter#how-it-works)


#### Did

- set `JAVA_HOME` to JDK install path
- run mvn generate to trigger project

```bash
mvn archetype:generate \
  -DgroupId=com.mkl-github-organization.app \
  -DartifactId=hello-world \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.4 \
  -DinteractiveMode=false
```
- genrating this file structure
```bash
hello-world
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── mkl-github-organization
    │               └── app
    │                   └── App.java
    └── test
        └── java
            └── com
                └── mkl-github-organization
                    └── app
                        └── AppTest.java
```
- created `.github/workflows/build-java-with-maven.yml`
- tweaked the actions

