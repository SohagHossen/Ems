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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXML6Controller implements Initializable {

    @FXML
    private Button back;
    @FXML
    private TextField eid;
    @FXML
    private TextArea sinfo;
    @FXML
    private Button search;
   

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back4(ActionEvent event) throws IOException{
    
     Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void search1(ActionEvent event) {
        
  
        try {
        connect c= new connect();
        c.searchId=eid.getText();
        String res=c.Salary();
        sinfo.setText(res);
        } 
        catch (Exception e) 
        {
         //  showWarningAlert();
        }
        
        
    }
    }


