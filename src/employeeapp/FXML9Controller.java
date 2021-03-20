/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rifat
 */
public class FXML9Controller implements Initializable {

    @FXML
    private Button back;
    @FXML
    private Button sh;
    @FXML
    private ListView<String> txt;

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
    private void shAction(ActionEvent event) {
         
      connect b= new connect();
      ArrayList<Employee> em=b.showres();
      for(int i=0;i<em.size();i++)
      {
          Employee e=em.get(i);
          String ob= e.display();
          txt.getItems().add(ob);
          
      }

       
    }
    
}
