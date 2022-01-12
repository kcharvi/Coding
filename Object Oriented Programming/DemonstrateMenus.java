package objectorientedprogramming;

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
public class DemonstrateMenus extends Application{
    Label response;
    public static void main(String arg[]){
        launch(arg);
    }
    public void start(Stage myStage){
        myStage.setTitle("Demonstrate Menus");
        BorderPane rootNode = new BorderPane();
        Scene myScene = new Scene(rootNode,300,300);
        myStage.setScene(myScene);
        response = new Label("Menu Demo");
        
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        fileMenu.getItems().addAll(open,close,save,exit);
        
        mb.getMenus().add(fileMenu);
        
        Menu optionsMenu = new Menu("Options");
        mb.getMenus().add(optionsMenu);
        Menu help = new Menu("Help");
        mb.getMenus().add(help);
        
        EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                String name = ((MenuItem)ae.getTarget()).getText();
            response.setText(name+ " selected");
            
        }};
        
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        
        rootNode.setTop(mb);
        rootNode.setCenter(response);
        
        myStage.show();
        
    }
}
