# SamTaskApp
# Two tasks received from Sam 

# TASK #1 CRUD 
Project SamTaskApp was made using Spring Boot framework, IntelliJ IDEA ide, using MySQL WorkBench as database tool and Postman as a testing tool for creating HTTP requests.
App is running by default on localhost:8080 using TomCatWebServer integrated in Spring Boot framework.
Table in which is saved the "Task" entity is called "task_objects".
CRUD operations are implemented in the TaskRestController class.
• CREATE 
POST request is implemented in the Task createTask(Task theTask) method, can be tested by accessing
http://localhost:8080/api/resttask
• READ 
GET all "Task" entities was implemented in List<Task> findAll() method, can be tested by accessing 
http://localhost:8080/api/resttask 
GET a "Task" entity by Id was implemented in Task findById(int taskId) method, can be tested by accessing 
http://localhost:8080/api/resttask/id_number
• UPDATE
 PUT request is implemented in the Task updateTask(Task theTask) method, can be tested by accessing 
 http://localhost:8080/api/resttask 
 POST request is implemented in the Task createTask (Task theTask) method, can be tested by accessing
 http://localhost:8080/api/resttask
 • DELETE
 DELETE a "Task" entity by Id request is implemented in the String deleteTask(int taskId) method, can be tested by accessing 
 http://localhost:8080/api/resttask/id_number
 
# TASK #2 TIMEZONE 
Timezone Service was integrated from provider https://timezoneapi.io/developers
The token for accessing the service was specified in the application.properties
The service was implemented in the String getTimeZone(String theCity) method of TimeZoneServiceImpl class, 
can be tested by accessing http://localhost:8080/timezone/city_name
 
 
 
 
 
 
 
 
 
