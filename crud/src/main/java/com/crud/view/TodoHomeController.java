package com.crud.view;

import java.sql.Date;

import com.crud.controller.Task;
import com.crud.controller.TaskDAO;
import com.crud.model.TaskModel;

import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TodoHomeController {

    @FXML
    private Button buttonCreateTask;

    @FXML
    private TableColumn<TaskModel, Void> delete;

    @FXML
    private TableColumn<TaskModel, String> descriptionTask;

    @FXML
    private TextField fieldFilterTable;

    @FXML
    private TableColumn<TaskModel, Date> finalDate;

    @FXML
    private TableColumn<TaskModel, Date> initialDate;

    @FXML
    private TableView<TaskModel> tableTasks;

    private final TaskDAO taskDAO = new TaskDAO();
    private final ObservableList<TaskModel> taskList = FXCollections.observableArrayList();

    public class DeleteButtonCell extends TableCell<TaskModel, Void> {

        private final Button deleteButton = new Button("Excluir");
        private final TaskDAO taskDAO = new TaskDAO();

        public DeleteButtonCell() {
            deleteButton.setOnAction(event -> {
                TaskModel taskModel = getTableView().getItems().get(getIndex());
                taskDAO.deleteTask(taskModel);
                taskList.remove(taskModel);
            });
        }

        @Override
        protected void updateItem(Void item, boolean empty) {
            super.updateItem(item, empty);

            if (empty) {
                setGraphic(null);
            } else {
                setGraphic(deleteButton);
                setAlignment(Pos.CENTER);
            }
        }
    }

    @FXML
    void initialize() {
        initializeTable();
        loadTaskData();
    }

    private void initializeTable() {
        descriptionTask.setCellValueFactory(new PropertyValueFactory<>("description"));
        initialDate.setCellValueFactory(new PropertyValueFactory<>("creationDate"));
        finalDate.setCellValueFactory(new PropertyValueFactory<>("completionDate"));
        delete.setCellFactory(col -> new DeleteButtonCell());
    }

    private void loadTaskData() {
        taskList.forEach(taskModel -> taskList.remove(taskModel));
        taskDAO.listTasks().forEach(task -> taskList.add(new TaskModel(task)));
        tableTasks.setItems(taskList);
    }

    @FXML
    void buttonCreateTask(ActionEvent event) {
        TodoTask todoTask = new TodoTask();
        try {
            todoTask.showScreenTodoTask("TodoTask.fxml", new Stage());
            Stage currentStage = (Stage) buttonCreateTask.getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void filterTaskOnTable(ActionEvent event) {
        String filterText = fieldFilterTable.getText().toLowerCase();

        ObservableList<TaskModel> filteredList = FXCollections.observableArrayList();
        taskList.stream()
                .filter(task -> task.getDescription().toLowerCase().contains(filterText))
                .forEach(filteredList::add);

        tableTasks.setItems(filteredList);
    }
}
