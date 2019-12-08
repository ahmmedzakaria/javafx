/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicComponent;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author B5
 */
public class FXMLComponentsController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Group group;

    @FXML
    private VBox vBox,vBoxlbl;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnClear;

    @FXML
    void clear(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {
        for (Node node : vBox.getChildren()) {
            if (node instanceof JFXTextField) {
                System.out.println(((JFXTextField) node).getText());
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vBoxlbl.getChildren().setAll();
        for (int i = 0; i < 5; i++) {
            Label lbl=createLabelFild();
            lbl.setText("Label "+i);
            vBoxlbl.getChildren().add(lbl);
        }
        
        vBox.getChildren().setAll();
        for (int i = 0; i < 5; i++) {
            vBox.getChildren().add(createTextFild());
        }

    }

    private JFXTextField createTextFild() {
        JFXTextField txt1 = new JFXTextField();
        txt1.setPrefSize(200, 40);
        txt1.setStyle("-fx-text-fill: green; -fx-font-size: 16; -fx-background-color: white;-fx-padding: 5px;\n"
                + "    -fx-border-insets: 5px;\n"
                + "    -fx-background-insets: 5px;");

        return txt1;

    }
    
    private Label createLabelFild() {
        Label txt1 = new Label();
        txt1.setPrefSize(200, 40);
        txt1.setStyle("-fx-text-fill: green; -fx-font-size: 16; -fx-background-color: white;-fx-padding: 5px;\n"
                + "    -fx-border-insets: 5px;\n"
                + "    -fx-background-insets: 5px;");

        return txt1;

    }

}
