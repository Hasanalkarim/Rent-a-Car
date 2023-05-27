/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.vehicleController;
import user.hasanal2010014.RentalManager;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class SuvSceneController implements Initializable ,vehicleController{

    @FXML
    private TextField suvHightTextField;
    @FXML
    private RadioButton yesRadioButton;
    @FXML
    private RadioButton noRadioButton;

     Vehicle  vehicle ;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
   
    public void vehicleData(Vehicle v){
        if(!suvHightTextField.getText().isBlank()){
          
            
            vehicle=v; 
            
           
            vehicle.setExtra(yesRadioButton.isSelected()?true:false,
                 
                    
                      Float.parseFloat(suvHightTextField.getText()),
                     
                     null, null);
            
            
              RentalManager.add(vehicle);
          
        }
    
    }
        
  
    
    


    
        
}
