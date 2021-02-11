# temporal-boilerplate-modular
Temporal Boilerplat code base, where Spring Java and Golang is being used 

##To install all the dependencies
`mvn clean install`

##To build the project
`mvn package spring-boot:repackage`

###Library-Shared
- Interface
- Model
- Constant

##Listener Service
- Spring Web
- REST Controller
- Service  
- Library-Shared

##Worker Service
- Spring Boot
- Implementations  
- Temporal Worker
- Library-Shared
