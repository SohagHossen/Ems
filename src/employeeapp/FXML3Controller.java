/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rifat
 */
public class FXML3Controller implements Initializable {

    @FXML
    private Button back;
    @FXML
    private Button submit;
    
    @FXML
    private TextField id1;
    @FXML
    private TextField desig1;
    @FXML
    private TextField salary1;
    @FXML
    private Label label;
    @FXML
    private TextField nam1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void submit1(ActionEvent event) {
    
    
    try {
                    String name = nam1.getText();
                    
                    String id = id1.getText();
                    String salary = salary1.getText();
                    String des = desig1.getText();
                    double salaryToDouble = Double.parseDouble(salary);
                    connect c = new connect();
                    c.salaried(name, id, des, salaryToDouble);
                    
                    

                } catch (Exception e) {
                    // showWarningAlert();
                }

    }
}
