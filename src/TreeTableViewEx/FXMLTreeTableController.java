package TreeTableViewEx;

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
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.FlowPane;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author B5
 */
public class FXMLTreeTableController implements Initializable {
    @FXML
    private FlowPane flowPane;

    @FXML
    private JFXTreeTableView<User> treeTableView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //System.out.println("TEst");
        JFXTreeTableColumn<User,String> colDeptName=new JFXTreeTableColumn<>("Department");
        colDeptName.setPrefWidth(150);
//        colDeptName.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User, String>, ObservableValue<String>>() {
//            @Override
//            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<User, String> param) {
//                return param.getValue().getValue().department;
//            }
//        });
        colDeptName.setCellValueFactory((param)->{return param.getValue().getValue().department;});
        
        JFXTreeTableColumn<User,String> colAge=new JFXTreeTableColumn<>("Age");
        colAge.setPrefWidth(150);
        colAge.setCellValueFactory((param)->{return param.getValue().getValue().age;});
        
        JFXTreeTableColumn<User,String> colName=new JFXTreeTableColumn<>("Name");
        colName.setPrefWidth(150);
        colName.setCellValueFactory((param)->{return param.getValue().getValue().userName;});
        
        ObservableList<User> users=FXCollections.observableArrayList();
        users.add(new User("Zakaria", "28", "J2EE"));
        users.add(new User("Riaz", "28", "J2EE"));
        users.add(new User("Jalal", "28", "J2EE"));
        
        final TreeItem<User> rootx=new RecursiveTreeItem<User>(users,RecursiveTreeObject::getChildren);
        treeTableView.getColumns().setAll(colDeptName,colAge,colName);
        treeTableView.setRoot(rootx);
        treeTableView.setShowRoot(false);
        
       // treeTableView
    }    
    
}
class User extends RecursiveTreeObject<User>{
    StringProperty userName;
    StringProperty age;
    StringProperty department;

    public User(String userName, String age, String department) {
        this.userName = new SimpleStringProperty(userName);
        this.age = new SimpleStringProperty(age);
        this.department = new SimpleStringProperty(department);
    }
}
