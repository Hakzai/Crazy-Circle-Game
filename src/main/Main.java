/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.actions.main.MainActions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Codeiro
 */
public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main/MainScreen.fxml"));
        Pane root = loader.load();
        
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(MainActions.getInstance());
        primaryStage.setTitle("The Crazy Circle Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
