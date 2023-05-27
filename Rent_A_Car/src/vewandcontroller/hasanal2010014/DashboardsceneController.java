/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelClass.hasanal2010014.Reservation;
import user.hasanal2010014.Customer;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class DashboardsceneController implements Initializable {

    @FXML
    private MenuItem reservationMenuItemOnClick;
    @FXML
    private MenuItem onlineCheckInMenuItemOnClick;
    @FXML
    private Menu offerMenuOnClick;
    @FXML
    private Menu memberMenuOnClick;
    @FXML
    private Menu locationMenuOnClick;
    @FXML
    private Menu queriseMenuOnClick;
    @FXML
    private Menu printReceiptMenuOnClick;
    @FXML
    private TextField pickupLocationTextField;
    @FXML
    private DatePicker pickupDateTextField;
    @FXML
    private DatePicker dropOffDateTextField;
    @FXML
    private TextField dropOffLocationTextField;
    @FXML
    private ComboBox<String> ageComboBox;
    @FXML
    private ComboBox<Integer> pickupHOURCombo;
    @FXML
    private ComboBox<Integer> pickupMiniuteCombo;
    @FXML
    private ComboBox<String> pickupAmPmCombo;
    @FXML
    private ComboBox<Integer> dropOffHourCombo;
    @FXML
    private ComboBox<Integer> dropoffMiniuteCombo;
    @FXML
    private ComboBox<String> dropOffAmPmCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ageComboBox.getItems().addAll("18","19","20","21","22","23","23+");
                
       //***************pickup Time initilaize*****************
       
        for (int i = 1; i <13; i++) {
            
             pickupHOURCombo.getItems().add(i);
        }
     
        Integer x=12;
        
       
         for (int i = 1; i <60; i++) {
            
             pickupMiniuteCombo.getItems().add(i);
        }
              
         pickupAmPmCombo.getItems().addAll("AM","PM");
         
         
         //***************Dropoff Time initilaize*****************  
         
        for (int i = 1; i <13; i++) {
            
             dropOffHourCombo.getItems().add(i);
        }
     
        
         for (int i = 1; i <60; i++) {
            
             dropoffMiniuteCombo.getItems().add(i);
        }
              
          dropOffAmPmCombo.getItems().addAll("AM","PM");
          
          
          
          
         
        // TODO
    }    

    @FXML
    private void browseVehicleButtonOnClick(ActionEvent event) {
        
     try{
        
         String age = ageComboBox.getValue();
        
         LocalDate pickupdate=pickupDateTextField.getValue();
        
          LocalDate dropOffdate=dropOffDateTextField.getValue();
          
          Reservation reservation;
        
      reservation=  Customer.makeReservation(
                
                pickupLocationTextField.getText(),
                pickupdate,
                pickupHOURCombo.getValue(), 
                pickupMiniuteCombo.getValue(), 
                pickupAmPmCombo.getValue(),
                dropOffLocationTextField.getText(), 
                dropOffdate, 
                dropOffHourCombo.getValue(), 
                dropoffMiniuteCombo.getValue(), 
                dropOffAmPmCombo.getValue()
        );
      if( reservation!=null){
      
          System.out.println(reservation.toString());
      }
      else{
          System.out.println("reservation is NULL");
      }
      
      
      
      
     //-------------------------------------------------------------------- 
      
             FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("VehicleScene.fxml")); 
             
            Parent vehicleParent = l1.load();//Loading initial and return parent
          
            
           VehicleSceneController vehicleScenecon= l1.getController();
           
            vehicleScenecon.getReservation(reservation,age);
             
           
           Scene s1 = new Scene( vehicleParent);
           
           Node n1=(Node)event.getSource();
                
           Stage orgStage = (Stage) n1.getScene().getWindow();
 
           orgStage.setScene(s1);
           
           orgStage.setTitle("Vehicle");
           
               //-------------------------------------------------------------------- 
      
      
      
     }
     catch(Exception e){
     
     
     }
      
 
        
    }//browes button on click
    
    
    
    
    
    
    
    
}
