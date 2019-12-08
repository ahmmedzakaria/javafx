package TreeTableDynamic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;

import javafx.scene.layout.FlowPane;


/**
 * FXML Controller class
 *
 * @author B5
 */
public class FXMLTreeTableController implements Initializable {

    @FXML
    private FlowPane flowPane;

    @FXML
    private JFXTreeTableView<?> treeTableView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List employees=DatabaseHalper.getEmployees();
        List employee=(List) employees.get(0);
        JFXTreeTableColumn<List, String> colDeptName = createColumn("Department");
        colDeptName.setText((String)employee.get(0));
        
        JFXTreeTableColumn<List, String> colAge = createColumn("Age");
        colAge.setText((String)employee.get(1));

        JFXTreeTableColumn<List, String> colName =createColumn("Name");
        colName.setText((String)employee.get(2));



        //treeTableView.getColumns().setAll(colDeptName, colAge, colName);
        treeTableView.setShowRoot(false);
    }

    public JFXTreeTableColumn createColumn(String conName) {
        JFXTreeTableColumn<List, String> colDeptName = new JFXTreeTableColumn<>(conName);
        colDeptName.setPrefWidth(150);
        return colDeptName;
    }

}


