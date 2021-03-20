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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rifat
 */
public class FXML8Controller implements Initializable {

     @FXML
    private Button search;

    @FXML
    private Button back;

    @FXML
    private TextArea det;

    @FXML
    private TextField eid;

  



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back1(ActionEvent event) throws IOException{
    
     Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void searchAction(ActionEvent event) {
        
        
         try {
             String id = eid.getText();
        connect c = new connect();
        c.searchId = id;
        String searchOut=c.searchID();
        det.setText(searchOut);
        } 
        
        catch (Exception e) {
           // showWarningAlert();
            
        }
        
        
        
    }
    
}
