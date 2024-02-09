/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.actions.test;

import controller.actions.BasicActions;
import controller.view.TestScreenController;

/**
 *
 * @author Codeiro
 */
public class TestScreenActions extends BasicActions{
    
    private static TestScreenActions instance;
    
    private TestScreenActions() {}
    
    public static synchronized TestScreenActions getInstance()
    {
        if(null == instance)
            instance = new TestScreenActions();
        
        return instance;
    }
    
    private static TestScreenController testScreenInstance;
    
    public void startAction()
    {
        super.startAction();
        testScreenInstance = (TestScreenController) TestScreenController.getInstance();

        changeBlueCircleVisible();
    }
    
    public void changeBlueCircleVisible()
    {
        if(testScreenInstance.getBlueCircle().isVisible())
            testScreenInstance.getBlueCircle().setVisible(false);
        else
            testScreenInstance.getBlueCircle().setVisible(true);
    }
}
