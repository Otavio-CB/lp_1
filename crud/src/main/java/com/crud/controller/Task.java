package com.crud.controller;

import java.sql.Date;

public class Task {
    private int id;
    private String description;
    private Date creationDate;
    private Date completionDate;

    public Task() {
    }

    public Task(String description, Date creationDate, Date completionDate) {
        this.description = description;
        this.creationDate = creationDate;
        this.completionDate = completionDate;
    }

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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }
}
