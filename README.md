# SamTaskApp
# Two tasks received from Sam 

# TASK #1 CRUD 
Project SamTaskApp was made using Spring Boot framework, IntelliJ IDEA ide, using MySQL WorkBench as database tool and Postman as a testing tool for HTTP requests.
App is running by default on localhost:8080 using integrated TomCatWebServer.
Table in which is saved the "Task" entity is called "task".
CRUD operations are implemented in the TaskRestController class.
• CREATE 
POST request is implemented in the Task createTask(Task theTask) method, can be tested by accessing
http://localhost:8080/tasks
• READ 
GET all "Task" entities was implemented in List<Task> findAll() method, can be tested by accessing 
http://localhost:8080/tasks
GET a "Task" entity by Id was implemented in Task findById(int taskId) method, can be tested by accessing 
http://localhost:8080/tasks/id_number
• UPDATE
 PUT request is implemented in the Task updateTask(Task theTask) method, can be tested by accessing 
 http://localhost:8080/tasks 
 POST request is implemented in the Task createTask (Task theTask) method, can be tested by accessing
 http://localhost:8080/tasks
 • DELETE
 DELETE a "Task" entity by Id request is implemented in the String deleteTask(int taskId) method, can be tested by accessing 
 http://localhost:8080/tasks/id_number
 
# TASK #2 TIMEZONE 
Timezone Service was integrated from provider https://timezoneapi.io/developers
The token and the url for accessing the service were specified in the application.properties
The service was implemented in the TimeZoneDTO getTimeZone(String theCity) method of TimeZoneServiceImpl class
Functional can be tested by accessing http://localhost:8080/timezone/city_name
