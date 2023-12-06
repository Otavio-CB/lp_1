package com.crud.controller;

import java.time.LocalDate;
import java.util.List;

import com.crud.view.TodoHome;
import com.crud.view.TodoTask;

import javafx.stage.Stage;

public class TaskController {
    private final TaskDAO taskDAO;

    public TaskController() {
        this.taskDAO = new TaskDAO();
    }

    public void createTask(String description, LocalDate initialDate, LocalDate finalDate) {
        Task task = new Task(description,
                java.sql.Date.valueOf(initialDate),
                java.sql.Date.valueOf(finalDate));
        taskDAO.createTask(task);
        TodoHome todoHome = new TodoHome();
        try {
            todoHome.showScreenTodoHome("TodoHome.fxml", new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Task> getAllTasks() {
        return taskDAO.listTasks();
    }
}
