/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions.main;

import controller.actions.BasicActions;
import controller.actions.test.TestScreenActions;
import controller.view.MainScreenController;
import controller.view.TestScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Codeiro
 */
public class MainActions extends BasicActions {
    
    private static MainActions instance;
    
    private MainActions() {}
    
    public static synchronized MainActions getInstance()
    {
        if(null == instance)
            instance = new MainActions();
        
        return instance;
    }
    
    private static MainScreenController mainInstance;
    private boolean mainStart = false;
    
    public void startAction()
    {
        super.startAction();
        if(!mainStart)
        {
            mainInstance = (MainScreenController) MainScreenController.getInstance();
            System.out.println("System START!");
            mainStart = true;
            
            mainInstance.getLbPressStart().setVisible(false);
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/test/TestScreen.fxml"));
            Pane root = null;
            try{ root = loader.load(); } catch (Exception e)  {  }
            
            Stage main = (Stage) mainInstance.getLbPressStart().getScene().getWindow();
            main.hide(); // ESCONDE A TELA MAIN

            Scene scene = new Scene(root);
            scene.setOnKeyPressed(TestScreenActions.getInstance());
            Stage stage = new Stage();
            stage.setTitle("Test Screen");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

            main.show(); // APÓS FECHAR A JANELA MOSTRA A TELA MAIN NOVAMENTE
        }
        else
        {
            System.out.println("System already started...");
        }
    }
    
}
