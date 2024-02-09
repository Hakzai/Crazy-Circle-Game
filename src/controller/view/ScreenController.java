/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.view;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

/**
 *
 * @author Codeiro
 */
public class ScreenController {
    
    protected static ScreenController activeScreenInstance;
    
    public static synchronized ScreenController getInstance()
    {
        if(null == activeScreenInstance)
        {
            activeScreenInstance = new ScreenController();
        }
        
        return activeScreenInstance;
    }
    
    @FXML
    protected Circle circleCursor;
    
            
    
}
