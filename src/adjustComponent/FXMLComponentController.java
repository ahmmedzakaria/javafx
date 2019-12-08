/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjustComponent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
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
    private AnchorPane anchor;
        private HBox hBox;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextField textField = new TextField();

        hBox.getChildren().add(textField);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));

        // Set Hgrow for TextField
        hBox.setHgrow(textField, Priority.ALWAYS);
        

    }

}
