# spring-cloud-slingshot

Spring Cloud Slingshot project that extends from spring-boot-slingshot

# Architecture

The system consists of the following component

* sbs-eureka-server: this is the eureka server which serves as the server registry for the micro-services
* sbs-syslog4j-server: this is the syslog4j server that servers as the centralized logging system for the micro-services
* sbs-eureka-app: this is application server, which can be considered as one of the micro-service which serves as the service prodvider
* sbs-eureka-web: this is web server, which can consumes service provided by application servers such as sbs-eureka-app

# sbs-eureka-web

* Embedded tomcat server
* Spring Data JPA and Spring Security for Authentication
* Spring Data JPA configuration for database
* Jest for ElasticSearch
* Websocket + sockjs + stompjs
* Bootstrap + thymeleaf
* Language (cn + en)

## Configuration

To use this project create a database named spring_boot_slingshot in your mysql database (make sure it is running at localhost:3306)

```sql
CREATE DATABASE spring_boot_slingshot CHARACTER SET utf8 COLLATE utf8_unicode_ci;
```

Note that the default username and password for the mysql is configured to 

* username: root
* password: chen0469

If your mysql or mariadb does not use these configuration, please change the settings in src/resources/config/application-default.properties

## Usage

This is just a template project that provides slingshot for spring cloud. Just use it as the starting point for your spring cloud project development.

Note that the application will generate two accounts in the database on startup if they don't exist:

ADMIN:

* username: admin
* password: admin

DEMO:

* username: demo
* password: demo

