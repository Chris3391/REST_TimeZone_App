package com.SamTaskApp.SamTaskApp.rest;


import com.SamTaskApp.SamTaskApp.entity.Task;
import com.SamTaskApp.SamTaskApp.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskRestController {

    private TaskService taskService;

    public TaskRestController(TaskService taskService) { //constructor injection
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @GetMapping("/tasks/{taskId}")
    public ResponseEntity<Object> findById(@PathVariable int taskId) {
        Task task = taskService.findById(taskId);

        if (task == null) {
            String errorMessage = "Task Id " + taskId + " was not found.";
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(errorMessage);
        }

        return ResponseEntity.ok(task);
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task theTask) {
        Task tempTask = taskService.save(theTask);
        return tempTask;
    }

    @PutMapping("/tasks")
    public Task updateTask(@RequestBody Task theTask) {
        Task tempTask = taskService.save(theTask);
        return tempTask;
    }

    @DeleteMapping("/tasks/{taskId}")
    public String deleteTask(@PathVariable int taskId) {
        Task tempTask = taskService.findById(taskId);

        if (tempTask == null) {
            throw new RuntimeException("Required Id not found" + taskId);
        }

        taskService.deleteById(taskId);
        return "Task Id " + taskId + " was succesufully deleted";
    }


}
