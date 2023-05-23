package com.SamTaskApp.SamTaskApp.service;

import com.SamTaskApp.SamTaskApp.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task>findAll(); //find all entities
    Task findById(int theId); //find entity by Id
    Task save(Task theTask); //save the entity
    void deleteById(int theId); //remove the entity using Id

}
