package com.SamTaskApp.SamTaskApp.service;

import com.SamTaskApp.SamTaskApp.dao.TaskRepository;
import com.SamTaskApp.SamTaskApp.entity.Task;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//in this class will be implemented the logic
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository; //create a DAO instance for constructor injection

    @Autowired //constructor injection for entity object
    public TaskServiceImpl (TaskRepository theRepository) {
        taskRepository = theRepository;
    }

    //implement the interface methods
    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    @Transactional
    public Task findById(int theId) {
        Task theTask = null; //create an entity object with null value
        Optional<Task> theResult = taskRepository.findById(theId); //result will contain the Task object found by id
        if (theResult.isPresent()) { //if the object is found
            theTask = theResult.get(); } //get this object
        else {  //if the object is not found
            throw new RuntimeException("The required id is not found" + theId);} //throw a RunTimeException
        return theTask; // return the object
    }

    @Override
    @Transactional
    public Task save(Task theTask) { //save method that takes Task object as the parameter
        return taskRepository.save(theTask); //apply the save method on Task object
    }

    @Override
    @Transactional
    public void deleteById(int theId) { //delete method that will delete Task object by Id
        taskRepository.deleteById(theId); //apply the delete method on Task object
    }
}

