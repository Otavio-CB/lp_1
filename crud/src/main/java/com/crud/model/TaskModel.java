package com.crud.model;

import com.crud.controller.Task;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Date;

public class TaskModel {
    private Task task;

    public TaskModel(Task task) {
        this.task = task;
    }

    public int getId() {
        return task.getId();
    }

    public Task getTask() {
        return task;
    }

    public String getDescription() {
        return task.getDescription();
    }

    public Date getCreationDate() {
        return task.getCreationDate();
    }

    public Date getCompletionDate() {
        return task.getCompletionDate();
    }

    public SimpleStringProperty descriptionProperty() {
        return new SimpleStringProperty(getDescription());
    }

    public SimpleObjectProperty<Date> creationDateProperty() {
        return new SimpleObjectProperty<>(getCreationDate());
    }

    public SimpleObjectProperty<Date> completionDateProperty() {
        return new SimpleObjectProperty<>(getCompletionDate());
    }
}