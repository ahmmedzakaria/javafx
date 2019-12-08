/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjustLayout;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

/**
 * FXML Controller class
 *
 * @author B5
 */
public class FXMLComponentController implements Initializable {

    @FXML
    private HBox hBox;

    @FXML
    private AnchorPane topAnchor, loadAnchor;

    @FXML
    private JFXButton btnLoad;


    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("text");
//        try {
//            loadAnchor = FXMLLoader.load(getClass().getResource("FXMLChildAnchorController.fxml"));
//            hBox.getChildren().add(loadAnchor);
//            hBox.setAlignment(Pos.CENTER);
//            hBox.setPadding(new Insets(10));
//            // Set Hgrow for TextField
//           HBox.setHgrow(loadAnchor, Priority.ALWAYS);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

TextField textField = new TextField();

        //HBox container  = new HBox(textField);
        hBox.getChildren().add(textField);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));

        // Set Hgrow for TextField
        HBox.setHgrow(textField, Priority.ALWAYS);
    }

}
