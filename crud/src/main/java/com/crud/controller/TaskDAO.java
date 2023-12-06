package com.crud.controller;

import com.crud.model.TaskModel;
import com.crud.model.connection.ConnectionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    private final Connection connection;

    public TaskDAO() {
        this.connection = new ConnectionDatabase().getConexao();
    }

    public void createTask(Task task) {
        String sql = "INSERT INTO Tarefas (description, creation_date, final_date) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, task.getDescription());
            preparedStatement.setDate(2, task.getCreationDate());
            preparedStatement.setDate(3, task.getCompletionDate());
    
            preparedStatement.executeUpdate();
            System.out.println("Task added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding task.");
            e.printStackTrace();
        }
    }
    

    public List<Task> listTasks() {
        List<Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM Tarefas";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Task task = new Task();
                task.setId(resultSet.getInt("task_id"));
                task.setDescription(resultSet.getString("description"));
                task.setCreationDate(resultSet.getDate("creation_date"));
                task.setCompletionDate(resultSet.getDate("final_date"));

                tasks.add(task);
            }

        } catch (SQLException e) {
            System.out.println("Error listing tasks.");
            e.printStackTrace();
        }
        return tasks;
    }

    public void deleteTask(TaskModel taskModel) {
        int taskId = taskModel.getTask().getId();
        System.out.println("Deleting task with ID: " + taskId); // Verifique o ID antes da exclusão

        String sql = "DELETE FROM Tarefas WHERE task_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, taskId);
            preparedStatement.executeUpdate();
            System.out.println("Task deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting task.");
            e.printStackTrace();
        }
    }
}