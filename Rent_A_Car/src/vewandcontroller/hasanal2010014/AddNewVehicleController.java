/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelClass.hasanal2010014.Body;
import modelClass.hasanal2010014.Pickup;
import modelClass.hasanal2010014.RegistrationInformation;
import modelClass.hasanal2010014.Suv;
import modelClass.hasanal2010014.Vans;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.VehicleData;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class AddNewVehicleController implements Initializable {

    @FXML
    private ImageView carImgView;
    @FXML
    private TextField modelNameTextField;
    @FXML
    private ComboBox<String> manufacturerCombo;
    private TextField countryTextField;
    private TextField yearTextField;
    @FXML
    private TextField colourTextField;
    @FXML
    private RadioButton autoRadioButton1;
    @FXML
    private RadioButton manualRadioButton;
    @FXML
    private RadioButton leftRadioButton;
    @FXML
    private RadioButton rightRadioButton;
    @FXML
    private TextField doorTextField;
    @FXML
    private TextField seatsTextField;
    @FXML
    private TextField bagsTextField;
    private RadioButton yesRadioButton;
    private TextField suvHightTextField;
    @FXML
    private TextField milageTextField;
    @FXML
    private ComboBox<String> fuelTypeComboBox;
    @FXML
    private ComboBox<String> vehicleClassTypeComboBox;
    @FXML
    private ComboBox<String> vehicleTypeComboBox;


    
  
    Vehicle vehicle;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        manufacturerCombo.getItems().addAll("Tesla","mitsubisi","mersidis");
       
        fuelTypeComboBox.getItems().addAll("Gasoline","Electric","Hybrid");
        
        vehicleTypeComboBox.getItems().addAll("Suv","Pickup","Vans");
        
        vehicleClassTypeComboBox.getItems().addAll("Economy","Compact","Premium");
        
       
    }    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
        
      
     Body body;
     
     RegistrationInformation reg;
     
     
     
     
     
     
    
     
     //colour, int seats, int doors, String bodyTypes
     body = new Body(
                    colourTextField.getText(),
             
                     Integer.parseInt(seatsTextField.getText()) ,
             
                     Integer.parseInt(doorTextField.getText()) 
            
                       
     );
     
     
     
                 FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("AddNewVehicle2Scene.fxml")); 
             
            Parent vehicleParent = l1.load();//Loading initial and return parent
          
            
           AddNewVehicle2SceneController vehicleScenecon= l1.getController();
           
     
             
           
           Scene s1 = new Scene( vehicleParent);
           
           Node n1=(Node)event.getSource();
                
           Stage orgStage = (Stage) n1.getScene().getWindow();
 
           orgStage.setScene(s1);
           
           orgStage.setTitle("Add Vehicle");
           
           
          
           

//Vehicle(modelName,Str manufacturer,Str classtype, Str fuelType,  milage,  bags, bool transmission, Str driverpossition, Str drivetrain, Body    
     
     if( vehicleTypeComboBox.getValue().equals("Suv")){
         
         System.out.println("entering suv block");
     
     vehicle = new Suv(
     
                         modelNameTextField.getText(),
             
                         manufacturerCombo.getValue(),
     
                         vehicleClassTypeComboBox.getValue(),
                         fuelTypeComboBox.getValue(),
                            
                         Integer.parseInt(milageTextField.getText()),
             
                         Integer.parseInt(bagsTextField.getText()),
             
                         autoRadioButton1.isSelected()?true:false,
             
                         leftRadioButton.isSelected()?"left":"right",

                         body 
     );
     
      vehicleScenecon.vehicleData(vehicle,"Suv");
     
     }
     else if(vehicleTypeComboBox.getValue().equals("Pickup")){
     
     
          vehicle = new Pickup(
     
                         modelNameTextField.getText(),
             
                         manufacturerCombo.getValue(),
     
                         vehicleClassTypeComboBox.getValue(),
                         fuelTypeComboBox.getValue(),
                            
                         Integer.parseInt(milageTextField.getText()),
             
                         Integer.parseInt(bagsTextField.getText()),
             
                         autoRadioButton1.isSelected()?true:false,
             
                         leftRadioButton.isSelected()?"left":"right",
                  
           
                         body 
        );
     
     
      vehicleScenecon.vehicleData(vehicle,"Pickup");
     
     
     
     
     }
     else{
     
     
          vehicle = new Vans(
     
                         modelNameTextField.getText(),
             
                         manufacturerCombo.getValue(),
     
                         vehicleClassTypeComboBox.getValue(),
                         fuelTypeComboBox.getValue(),
                            
                         Integer.parseInt(milageTextField.getText()),
             
                         Integer.parseInt(bagsTextField.getText()),
             
                         autoRadioButton1.isSelected()?true:false,
             
                         leftRadioButton.isSelected()?"left":"right",

                         body 
     );
     
     
       
     
       vehicleScenecon.vehicleData(vehicle,"Vans");
     
     
     
     
     
     }



    
          
           vehicleScenecon.loadData();
          
           orgStage.show();
         
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    //handlerMETHOD END  
    }
    
}
