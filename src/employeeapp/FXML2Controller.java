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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rifat
 */
public class FXML2Controller implements Initializable {

    @FXML
    private Button salary;
    @FXML
    private Button hourly;
    @FXML
    private Button commission;
    @FXML
    private Button back;

     @FXML
    private void salary1(ActionEvent event) throws IOException{
          
        Parent root = FXMLLoader.load(getClass().getResource("FXML3.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
        
    }

    @FXML
    private void hourly1(ActionEvent event) throws IOException{
    
     Parent root = FXMLLoader.load(getClass().getResource("FXML4.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();

    }
    @FXML
    private void commission1(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("FXML5.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
     @FXML
   
    private void back1(ActionEvent event)  throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }  
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

   
}
