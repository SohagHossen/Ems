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
public class FXML5Controller implements Initializable {

    @FXML
    private Button back;
    @FXML
    private TextField name2;
    @FXML
    private TextField id2;
    @FXML
    private TextField com;
    @FXML
    private TextField sa;
    @FXML
    private Button sb1;
    @FXML
    private Label label;
    @FXML
    private TextField des1;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
      

    @FXML
    private void back3(ActionEvent event) throws IOException{
    
     Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
    
    @FXML
     private void sb1(ActionEvent event) {
     
     
            try {
                String name = name2.getText();
                String id = id2.getText();
                String des = des1.getText();
                String comsionRate = com.getText();
                String comisionSale = sa.getText();
                double comrateToDouble = Double.parseDouble(comsionRate);
                double comSaleToDouble = Double.parseDouble(comisionSale);
              
                connect c = new connect();
                c.commission(name, id, des, comrateToDouble, comSaleToDouble);

            } catch (NumberFormatException e) {
                //  showWarningAlert();
            }
 
     
     }
     }

