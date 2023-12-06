package com.crud.view;

import java.time.LocalDate;

import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

import com.crud.controller.Task;
import com.crud.controller.TaskController;
import com.crud.controller.TaskDAO;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TodoTaskController {

    @FXML
    private Button buttonAddTask;

    @FXML
    private DatePicker finalDate;

    @FXML
    private DatePicker initialDate;

    @FXML
    private TextField nameDescription;

    @FXML
    void initialize() {

        BooleanProperty anyFieldEmpty = new SimpleBooleanProperty();

        buttonAddTask.disableProperty().bind(
                Bindings.or(
                        Bindings.or(
                                Bindings.isNull(initialDate.valueProperty()),
                                Bindings.isNull(finalDate.valueProperty())),
                        Bindings.createBooleanBinding(() -> nameDescription.getText().isEmpty(),
                                nameDescription.textProperty())));

        finalDate.setDayCellFactory(createDayCellFactory(finalDate, LocalDate.now()));

        initialDate.valueProperty().addListener((observable, oldValue, newValue) -> {

            finalDate.setDayCellFactory(createDayCellFactory(finalDate, newValue));
        });
    }

    private Callback<DatePicker, DateCell> createDayCellFactory(DatePicker datePicker, LocalDate startDate) {
        return param -> new DateCell() {
            @Override
            public void updateItem(LocalDate item, boolean empty) {
                super.updateItem(item, empty);

                if (item.isBefore(startDate)) {
                    setDisable(true);
                    setStyle("-fx-background-color: #ffc0cb;");
                }
            }
        };
    }

    @FXML
    void addFinalDate(ActionEvent event) {

    }

    @FXML
    void addInitialDate(ActionEvent event) {

    }

    @FXML
    void addNameDescription(ActionEvent event) {

    }

    @FXML
    void addTaskOnTable(ActionEvent event) {
        String description = nameDescription.getText();
        LocalDate initialDateValue = initialDate.getValue();
        LocalDate finalDateValue = finalDate.getValue();

        TaskController taskController = new TaskController();
        taskController.createTask(description, initialDateValue, finalDateValue);

        nameDescription.clear();
        initialDate.setValue(null);
        finalDate.setValue(null);

        Stage currentStage = (Stage) buttonAddTask.getScene().getWindow();
        currentStage.close();
    }
}