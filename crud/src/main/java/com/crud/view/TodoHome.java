package com.crud.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TodoHome extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        showScreenTodoHome("TodoHome.fxml", primaryStage);
    }

    public void showScreenTodoHome(String fxmlFile, Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}