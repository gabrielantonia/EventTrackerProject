## Skills Distillery - SD22 - Event Tracker Project 
### Overview
Restful api and Data JPA used to quickly construct a responsive web app over a weekend.

### Technologies used

* Git
* GitKraken
* Java
* Spring Data JPA
* Hibernate
* RESTful Services
* Spring Boot
* Spring Tool Suite 4
* XAMPP/MAMP
* VSCode
* MySQL/MySQL Workbench

### Endpoints:
| Return Type | Route| Functionality |
| --- | --- | --- |
|String| GET api/ping | Gets "pong" |
|List<Event>| GET api/event | Gets list of all events|
|Optional<Event| Get api/event/{id} | Gets a single event by id |
|Event| POST event/new | Creates new Event |
|Event| Patch api/event/update/{id} | Updates existing event |
|boolean| Delete event/{id} | Deletes existing event  |

### Lessons learned

* Learned how the data flow with Restful api
* Learned to utilize Spring Boot to get a web app up and running quickly
* Learned important Rest, JPA annotations e.g. @Query, @Modifying, @RestController
