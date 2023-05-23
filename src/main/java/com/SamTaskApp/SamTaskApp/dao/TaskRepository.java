package com.SamTaskApp.SamTaskApp.dao;


import com.SamTaskApp.SamTaskApp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//this interface will inherit the JpaRepository common usedmethods
//save, findById, findAll, delete, etc . . .
public interface TaskRepository extends JpaRepository<Task, Integer>{
}
