/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;



import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.RegistrationInformation;
import modelClass.hasanal2010014.Suv;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.VehicleData;
import modelClass.hasanal2010014.vehicleController;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class AddNewVehicle2SceneController implements Initializable {

    private RadioButton frontWheelRadioButton;
    private TextField milageTextField;
    @FXML
    private DatePicker dateFirstRegistration;
    @FXML
    private TextField registrationTextField;
    @FXML
    private TextField engineTextField;
    @FXML
    private TextField chesisTextField;
    @FXML
    private TextField rentalTextField;

    private ComboBox<String> vehicleClassTypeComboBox;
    @FXML
    private TextField yearTextField;
    @FXML
    private TextField countryTextField;
    private AnchorPane ancorPaneVehicle;   
    @FXML
    private BorderPane borderPaneVehicle;
    

    
      
    
    Vehicle vehicle;
    
    RegistrationInformation reg;
    
    String type;
    
    
     Parent vehicleParent ;
      
    
    FXMLLoader l1= new FXMLLoader();
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
        
   
    }    
    
    
     public void loadData(){
     
       loadDataOrLoadScene();
        
        
        borderPaneVehicle.setCenter(vehicleParent);
     
     
     }
    
    
    public void loadDataOrLoadScene(){
        
    
            
       
      try{  
          
        
       
       if(type.equals("Suv")){
       
          
            l1.setLocation( getClass().getResource("SuvScene.fxml")); 
            
            vehicleParent = l1.load();
        
         
           System.out.println("class= "+type);
       
        
       }
       else if(type.equals("Pickup")){
           
            
             l1.setLocation( getClass().getResource("PickupScene.fxml")); 
            
              vehicleParent = l1.load();
          
        
       }
       else{
       

              l1.setLocation( getClass().getResource("VansScene.fxml")); 
            
              vehicleParent = l1.load();        
             
             
              
              
       } 
        
        
      }
      catch(Exception e){
      
          System.out.println("problem"+e);
      }
       
       
      
    
    
    
    
    }
    

    
    public void vehicleData(Vehicle v,String type){
    
        vehicle=v;
        
        this.type=type;
        
        System.out.println("inFunction= "+this.type);
    
    }
    
    
      public void addregistration(){
      
        //String registrationNumber, LocalDate firstDateregistration, String engineNumber, String chesisNumber, String country, int year       

       reg = new  RegistrationInformation(

            registrationTextField.getText(),

            dateFirstRegistration.getValue(),

            engineTextField.getText(),

            chesisTextField.getText(),

            countryTextField.getText(),

            Integer.parseInt( yearTextField.getText())


       );

      vehicle.setRegistrationAndPrice(reg, Float.parseFloat(rentalTextField.getText()));
     
      
      }
      
    
    
    @FXML
    private void addButtonOnClick(ActionEvent event) throws IOException {
    
        //    addtoBin();
     
           addregistration();
           
          
           
           
           
           vehicleController vec=  l1.getController();
           
           
                         vec.vehicleData(vehicle);
           
          
         
    
           
          
                   
                   
                   
                   
        
        
                
     
            FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("ManagerVehicleScene.fxml")); 
            
              Parent vehicleParent = l1.load();
            
             
            ManagerVehicleSceneController vehicleScenecon= l1.getController();
            
       
             vehicleScenecon.status(vehicle.getModelName());
            
               vehicleScenecon.loadTable();
         
           
           Scene s1 = new Scene( vehicleParent);
           
           Node n1=(Node)event.getSource();
           
           Stage orgStage = (Stage) n1.getScene().getWindow();
           
           orgStage.setScene(s1);
           
            orgStage.setTitle("Add Vehicle");
           
           orgStage.show();
         
        
       
        
    }
    
    

    
    
}
