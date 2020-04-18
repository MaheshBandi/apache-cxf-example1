# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)

1. Create a Endpoint Bean through configurations
2. We can access all the webservices using http://localhost:8080/services
3. By default Springboot will not create a webapplication context, so we need to add a webapplication context so that we can access the webservices application name
4. To Add the application context add the below properties to spring properties
	server.servlet.context-path=/hellows
5. To Tell apache CXF Runtime to take the discover the webservices from root
	cxf.path=/
