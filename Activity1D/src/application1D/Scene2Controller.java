/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1D;

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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Marius
 */
public class Scene2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
	 
	    @FXML
	    private Button button;
	    
   @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent p= FXMLLoader.load(getClass().getResource("/application1D/FXML.fxml"));
        Scene s=new Scene(p);
        
        Stage stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();
        System.out.println("changed");
        
    }    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
