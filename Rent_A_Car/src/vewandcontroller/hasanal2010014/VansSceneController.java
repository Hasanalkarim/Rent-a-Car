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
import javafx.scene.control.ComboBox;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.vehicleController;
import user.hasanal2010014.RentalManager;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class VansSceneController implements Initializable ,vehicleController{

    @FXML
    private ComboBox<String> roofTypeComboBox;
    @FXML
    private ComboBox<String> vanTypeComboBox;
    Vehicle  vehicle ;
    /**
     * Initializes the controller class.//low roof, hitop roof, popUp roof
    
    private String vanType; //campervan,cargovan,  multivan
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        roofTypeComboBox.getItems().addAll("low roof"," hitop roof","popUp roof");
        vanTypeComboBox.getItems().addAll("campervan","cargovan","multivan");
    }    
     
    public void vehicleData(Vehicle v){
    
               if(roofTypeComboBox.getValue()!=null){
        
            
            vehicle=v;
            
            vehicle.setExtra(false,
                   
                   
            0, roofTypeComboBox.getValue(), vanTypeComboBox.getValue());
        
           
            RentalManager.add(vehicle);
     } 
        
       
    
    }
    

}
