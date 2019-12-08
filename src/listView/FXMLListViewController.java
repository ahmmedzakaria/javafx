/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listView;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author B5
 */
public class FXMLListViewController implements Initializable {
 @FXML
    private JFXButton btnExpand;

    @FXML
    private JFXButton btnAdd;
    
    
    @FXML
    private JFXListView<Label> listView;
    

    @FXML
    void addNewNode(ActionEvent event) {
        
    }

    @FXML
    void expandListView(ActionEvent event) {
        if(!listView.isExpanded()){
            listView.setExpanded(true);
            listView.depthProperty().set(1);
        }else{
            listView.setExpanded(false);
            listView.depthProperty().set(0);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       for(int i=0; i<2;i++){
           try {
               Label lbl=new Label("Label "+i);
               lbl.setGraphic(new ImageView(new Image(new FileInputStream("E:\\Advance Java\\JavaFXMLPractice\\src\\listView\\apple.png"))));
               listView.getItems().add(lbl);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(FXMLListViewController.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }    
    
}
