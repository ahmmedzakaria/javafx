/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjustLayout;


import adjustComponent.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author B5
 */
public class Component extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
       Parent root=FXMLLoader.load(getClass().getResource("FXMLComponent.fxml"));
        
//        TextField textField = new TextField();
//
//        HBox container  = new HBox(textField);
//        container.setAlignment(Pos.CENTER);
//        container.setPadding(new Insets(10));
//
//        // Set Hgrow for TextField
//        HBox.setHgrow(textField, Priority.ALWAYS);
//
//        BorderPane pane = new BorderPane();
//        pane.setCenter(container);
        Scene scene = new Scene(root, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
