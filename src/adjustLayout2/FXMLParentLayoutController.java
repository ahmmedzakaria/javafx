/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjustLayout2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class FXMLParentLayoutController implements Initializable {

    AnchorPane anc;

    @FXML
    private HBox hBox;

    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("parent Controler");
        try {
            anc = FXMLLoader.load(getClass().getResource("FXMLChild.fxml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        TextField textField = new TextField();

        hBox.getChildren().add(anc);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));

        // Set Hgrow for TextField
        hBox.setHgrow(anc, Priority.ALWAYS);
        

    }

}
