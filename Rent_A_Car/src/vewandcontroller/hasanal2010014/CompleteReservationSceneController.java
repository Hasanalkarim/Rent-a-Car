/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.Reservation;
import modelClass.hasanal2010014.Reserved;
import modelClass.hasanal2010014.TravelInfo;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.VehicleInfo;
import user.hasanal2010014.Customer;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class CompleteReservationSceneController implements Initializable {

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
    private Label pickupDateAndTimeOutputLabel;
    @FXML
    private Label dropOffDateAndTimeOutputLabel;
    @FXML
    private Label pickAndDropOffLocationOutputLabel;
    @FXML
    private Label ageOutputLabel;
    @FXML
    private Label carNameOutputLabel;
    @FXML
    private Label taxAndFeesOutputLabel;
    @FXML
    private Label totallFeesOutputLabel;
    @FXML
    private AnchorPane customerId;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField middleNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField emailTextFiled;
    @FXML
    private TextField airlineNameTextField;
    @FXML
    private TextField flightNumberTextField;
    @FXML
    private Label totalDaysPriceOutputLabel;
    @FXML
    private Label totalDaysOutputLabel;
    
    
   
    
    Reservation reservation;
    
    VehicleInfo vehicleInfo;
    
    String age;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    public void initData( VehicleInfo vehicleInfo, Reservation reservation, String age){
    
      this.vehicleInfo=vehicleInfo;
      
     
      this.reservation=reservation;
         
      this.age=age;
       pickupDateAndTimeOutputLabel.setText(reservation.getPickupDate().getDateTime());
      
     
       dropOffDateAndTimeOutputLabel.setText( reservation.getDropOffDate().getDateTime());
        
   
       pickAndDropOffLocationOutputLabel.setText(reservation.getPickupLocation()+" \n\n"+reservation.getDropOffLocation());
        
       ageOutputLabel.setText(age);
        
        
       carNameOutputLabel.setText(vehicleInfo.getModelName());
        
       reservation.setVehiclePrice(vehicleInfo.getRentalPriceperDat());
        
        
        if(!reservation.calculateTaxAndFees()){
        
            System.out.println("calculate taxAndFees problem");
            
        }
          
        totalDaysOutputLabel.setText("Total "+reservation.getTotaldays()+" Days Price");
    
        totalDaysPriceOutputLabel.setText("$"+reservation.getTotaldaysPrice());
    
        taxAndFeesOutputLabel.setText("$"+reservation.getTotalTaxAndFees());
       
        totallFeesOutputLabel.setText("$"+reservation.getTotalPrice());
        
        
    }
    
    
    @FXML
    private void reserveNowButtonOnClick(ActionEvent event) {
        
        
     Customer customer;   
     
         Random rand = new Random(); 
         
        int id = rand.nextInt(900000)+100000;
        
         TravelInfo travelInfo;
      
      travelInfo = new  TravelInfo(
      
          flightNumberTextField.getText(),
           airlineNameTextField.getText()
      );
       
        
        
        
        
     //id, firstName, secondName, lastName, email, phoneNumber
        customer = new  Customer(
        
                  "2"+id,
                  firstNameTextField.getText(),
                  middleNameTextField.getText(),
                  lastNameTextField.getText(),
                  emailTextFiled.getText(),
                  phoneNumberTextField.getText(),
                   travelInfo,
                   age
                 );
        
        
        id = rand.nextInt(9000)+1000;
          reservation.setConfermationNumber(reservation.getPickupDate().getDateTimeCode()+id);
        
        Reserved reserved;
        
        
        //String confermationNumber, String customerId, String vehicleId
        reserved = new  Reserved(
                       reservation.getConfermationNumber(),
                      customer.getId(),
                      vehicleInfo.getRegistrationNumber()
                
        
        );
        
        
    //----------------Custmer Write File---Start----------------------------------------------
       
     
        
           FileOutputStream fos=null;
        
         ObjectOutputStream oos = null;
        
         File f =null;
      
        try{
              f = new File("User.bin");
             if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new MyObjectOutputStream(fos);  
              }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos); 
   
            }
        
            
               oos.writeObject(customer);
             
        }
        catch (Exception e) {
            System.out.println("Customer Write prob "+e.toString());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (Exception e) {
                      System.out.println("Customer file close "+e.toString());
            }
        }         
       
             
    
    
        
    //-----------Customer---Write---File--END--------------------------------------------------   
        
        
        
        
    //----------------Reserved--Write--File-Start-----------------------    
        
        
        
        try{
              f = new File("Reserved.bin");
             if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new MyObjectOutputStream(fos);  
              }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos); 
   
            }
        
            
               oos.writeObject(reserved);
             
        }
        catch (Exception e) {
            System.out.println("Reserved Write prob "+e.toString());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (Exception e) {
                      System.out.println("  Reserved file close "+e.toString());
            }
        }         
     //----------------Reserved--Write--File End------------------------      
        
     
     
     //-----------------Writing Reservation----Start-----------------------
     
              
        try{
              f = new File("Reservation.bin");
             if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new MyObjectOutputStream(fos);  
              }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos); 
   
            }
        
            
               oos.writeObject(reservation);
             
        }
        catch (Exception e) {
            System.out.println("Reservation Write prob "+e.toString());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (Exception e) {
                      System.out.println("  Reservation file close "+e.toString());
            }
        }         
       
             
     
       //-----------------Writing Reservation----End-----------------------
     
     
     
     
     
     
     
     
        
        
        
      //--------------Scene Switch---------------------------
      
              
        try{
        
       
        
              
             FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("ReservationConfirmedScene.fxml")); 
             
             Parent vehicleParent = l1.load();//Loading initial and return parent
          
            
            ReservationConfirmedSceneController vehicleScenecon= l1.getController();
           
             vehicleScenecon.setData(reserved.getConfermationNumber());
             
           
             Scene s1 = new Scene( vehicleParent);
           
             Node n1=(Node)event.getSource();
                
             Stage orgStage = (Stage) n1.getScene().getWindow();
 
             orgStage.setScene(s1);
           
             orgStage.setTitle("Reservation Confermed");
           
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
     //-------------------Sence Switch------------------------------------------ 
    }//Reserve now method handler END
    
}
