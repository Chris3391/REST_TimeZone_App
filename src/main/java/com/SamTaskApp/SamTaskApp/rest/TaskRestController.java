package com.SamTaskApp.SamTaskApp.rest;


import com.SamTaskApp.SamTaskApp.entity.Task;
import com.SamTaskApp.SamTaskApp.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskRestController {

private TaskService taskService;

public TaskRestController (TaskService taskService) { //constructor injection
    this.taskService = taskService;
}

@GetMapping("/resttask") // get all Task objects
public List<Task> findAll() {
    return taskService.findAll();
}

@GetMapping ("/resttask/{taskId}") //get Task object by Id
public Task findById (@PathVariable int taskId) {
      if (taskService == null) {                              //if Task object is not found
       throw new RuntimeException("Required Id not found" + taskId);} //throw message with id number
        return taskService.findById(taskId); //return Task object
      }

@PostMapping ("/resttask") //create new Task object
public Task createTask (@RequestBody Task theTask) {  //request a Task object
    Task tempTask = taskService.save(theTask);
    return tempTask;
}

@PutMapping ("/resttask") //update Task object
public Task updateTask (@RequestBody Task theTask) { //request a Task object
    Task tempTask = taskService.save(theTask);
    return tempTask;
}

@DeleteMapping("/resttask/{taskId}") //detele Task object by Id
    public String deleteTask (@PathVariable int taskId) {
    Task tempTask = taskService.findById(taskId); //find the required Task object by Id

    if (tempTask == null) { //if the object is null (meaning the required id wasn't found)
    throw new RuntimeException("Required Id not found" + taskId);} //throw exception with that id number
    taskService.deleteById(taskId); //if object was found delete it by
    return "Task Id " + taskId + " was succesufully deleted"; //return a message with deleted id number
    }


}
