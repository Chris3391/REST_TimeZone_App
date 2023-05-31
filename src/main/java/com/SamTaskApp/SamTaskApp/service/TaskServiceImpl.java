package com.SamTaskApp.SamTaskApp.service;

import com.SamTaskApp.SamTaskApp.dao.TaskRepository;
import com.SamTaskApp.SamTaskApp.entity.Task;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository theRepository) {
        taskRepository = theRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task findById(int theId) {

        Optional<Task> theResult = taskRepository.findById(theId);

        return theResult.orElseThrow(() -> new NoSuchElementException
                ("The required Id " + theId + " was not found."));
    }

    @Transactional
    public Task save(Task theTask) {
        return taskRepository.save(theTask);
    }

    @Transactional
    public void deleteById(int theId) {
        taskRepository.deleteById(theId);
    }
}

