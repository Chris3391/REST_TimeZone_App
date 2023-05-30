package com.SamTaskApp.SamTaskApp.dao;


import com.SamTaskApp.SamTaskApp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
}
