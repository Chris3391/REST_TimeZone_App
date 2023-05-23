package com.SamTaskApp.SamTaskApp.entity;

import jakarta.persistence.*;


@Entity
@Table(name="task_objects")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; //id field for entity
    @Column(name="description")
    private String description; //description field for the entity

    public Task() { //no argument constructor
    }

    public Task(int id, String description) { //constructor
        this.id = id;
        this.description = description;
    }

    //getters and setters for accesing/retrieving entity info
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //toString method for displaying entity info
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
