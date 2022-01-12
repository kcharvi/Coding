/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogramming;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Charvi
 */
 
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class ExamMenuQuestion extends Application{
    public static void main(String arg[]){
        launch(arg);
    }
    public void start(Stage myStage){
        myStage.setTitle("Menu Look Demo");
        BorderPane rootNode = new BorderPane();
        Scene myScene = new Scene(rootNode,300,300);
        myStage.setScene(myScene);
               
        MenuBar mb = new MenuBar();
        Menu AMenu = new Menu("A Menu");
               
        // ADD TEXT MENU ITEM
        
        
        RadioMenuItem radio = new RadioMenuItem("A radio Button Menu Item");
        RadioMenuItem radio2 = new RadioMenuItem("Another One");
        AMenu.getItems().addAll(radio,radio2);
        
        
        CheckMenuItem checkMenuItem = new CheckMenuItem("A Check Box Menu Item");
        CheckMenuItem checkMenuItem2 = new CheckMenuItem("Another One");
        AMenu.getItems().addAll(checkMenuItem,checkMenuItem2);
               
        mb.getMenus().add(AMenu);
        
         
        EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                //ADD ACTION EVENT FOR RADIO AND CHECK BOX
            
            
        }};
          
        rootNode.setTop(mb);
        myStage.show();
        
    }
}

