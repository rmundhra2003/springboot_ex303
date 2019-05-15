package com.example.springboot_ex303;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Todo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=4)
    private String taskname;

    @NotNull
    @Size(min=3)
    private String duedate;

    @NotNull
    @Min(1)
    private int priority;

    public Todo() {
    }

    public Todo(@NotNull @Size(min = 4) String taskname, @NotNull @Size(min = 3) String duedate, @NotNull @Min(1) int priority) {
        this.taskname = taskname;
        this.duedate = duedate;
        this.priority = priority;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
