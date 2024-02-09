/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.inputs;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Codeiro
 */
public abstract class BasicInputs implements EventHandler{
    
    @Override
    public void handle(Event event) {
        if(event.getEventType().toString().equals("KEY_PRESSED"))
        {
            handle((KeyEvent) event);
        }
    }
    public void handle(KeyEvent event) {
        KeyCode key = event.getCode();
        switch(key)
        {
            case ENTER:
                startAction();
                break;
            case SPACE:
                spaceAction();
                break;
            case ESCAPE:   
                escAction();
                break;
            case RIGHT:
                actionRight();
                break;
            case LEFT:
                actionLeft();
                break;
            case UP:
                actionUp();
                break;
            case DOWN:
                actionDown();
                break;
        }
    }
    
    public abstract void startAction();
    
    public abstract void actionRight();
    
    public abstract void actionLeft();
    
    public abstract void actionUp();
    
    public abstract void actionDown();
    
    public abstract void spaceAction();
    
    public abstract void escAction();    
}
