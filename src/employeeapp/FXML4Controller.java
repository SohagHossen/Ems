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

public class FXML4Controller implements Initializable {

    @FXML
    private Button back;

    @FXML
    private TextField des1;
    @FXML
    private TextField name01;
    @FXML
    private TextField id01;
    @FXML
    private TextField hr1;
    @FXML
    private TextField hw1;
    @FXML
    private Button sb;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void back2(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void sb(ActionEvent event) {

        try {
            String name = name01.getText();
            String id = id01.getText();
            String des = des1.getText();
            String hourwork = hw1.getText();
            String hourRate = hr1.getText();
            int hw = Integer.parseInt(hourwork);
            double hr = Double.parseDouble(hourRate);

            //showSuccesAlert();
            connect c = new connect();
            c.hourly(name, id, des, hr, hw);
//                System.out.println(id);
        } catch (Exception e) {
            // showWarningAlert();
        }
    }

}
