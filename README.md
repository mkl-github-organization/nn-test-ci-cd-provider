#### nn-test-ci-cd-provider

This repo contains a single java application. Only purpose: test differend CI/CD providers
Thu Jul 15 15:05:09 UTC 2021
Thu Jul 15 15:22:01 UTC 2021

##### Source:
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
Using maven to package Java

##### Did

- set `JAVA_HOME` to JDK install path
- run mvn generate to trigger project

```
mvn archetype:generate \
  -DgroupId=com.mkl-github-organization.app \
  -DartifactId=hello-world \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.4 \
  -DinteractiveMode=false
```

genrating this file structure
```
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