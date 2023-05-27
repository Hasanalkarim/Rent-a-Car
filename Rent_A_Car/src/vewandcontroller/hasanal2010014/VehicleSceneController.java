/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelClass.hasanal2010014.Reservation;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.VehicleInfo;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class VehicleSceneController implements Initializable {

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
    private CheckBox gasolineCheckBox;
    @FXML
    private CheckBox electricCheckBox;
    @FXML
    private CheckBox hybridCheckBox;
    @FXML
    private CheckBox suvsCheckBox;
    @FXML
    private CheckBox vansCheckBox;
    @FXML
    private CheckBox carsCheckBox;
    @FXML
    private TextField searchVehicleTextField;
    @FXML
    private TableView<VehicleInfo> tableView;
    @FXML
    private TableColumn<VehicleInfo, String> ModelColumn;
    @FXML
    private TableColumn<VehicleInfo, String> seatsColumn;
    @FXML
    private TableColumn<VehicleInfo, String> bagsColumn;
    @FXML
    private TableColumn<VehicleInfo, String> classColumn;
    @FXML
    private TableColumn<VehicleInfo, String> transmissionColumn;
    @FXML
    private TableColumn<VehicleInfo, String> priceColumn;
    @FXML
    private Label pickupInfoLabel;
    @FXML
    private Label dropOffInfoLabel;
    
    Reservation reservation;
    
    String age;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("manager intial start");
        
        
        
        
        File reservedFile = new File("ReservedCar.bin");
        
         File file = new File("Vehicle.bin");
         
     if(file.exists()){
         
           if(reservedFile.exists()){
           
           
           
           }
           else{
           
               try {
                   setVehicle();
               } catch (IOException ex) {
                   Logger.getLogger(VehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(VehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           
     
        loadTable();
     }
     
     
      System.out.println("manager intial end");  
    }    
    
    
        ObservableList<VehicleInfo> vehiclelist = FXCollections.observableArrayList();
    
    
    
        public void loadTable(){
    
       //set up the columns in the table
        ModelColumn.setCellValueFactory(new PropertyValueFactory<VehicleInfo, String>("modelName"));
        
        seatsColumn.setCellValueFactory(new PropertyValueFactory<VehicleInfo, String>("seats"));
        
        bagsColumn.setCellValueFactory(new PropertyValueFactory<VehicleInfo, String>("bags"));
        
         
        classColumn.setCellValueFactory(new PropertyValueFactory<VehicleInfo, String>("classtype"));
        
         transmissionColumn.setCellValueFactory(new PropertyValueFactory<VehicleInfo, String>("transmission"));
         
        priceColumn.setCellValueFactory(new PropertyValueFactory<VehicleInfo, String>("rentalPriceperDat"));
        
        
         
        tableView.setItems(vehiclelist);
         
    
    }//loadtableEnd
    
        
       public void setVehicle() throws FileNotFoundException, IOException, ClassNotFoundException{
       
       
       
    
        //FXCollections.
        //ObservableList<Person> people2 = new ArrayList<Person>();
        
       
           
           
           FileInputStream fs = new FileInputStream("Vehicle.bin");
           
            ObjectInputStream ois=null;     
           ois=  new ObjectInputStream(fs); 
           
           Vehicle s1;
            
         try {
             
           
             
            
            while(true){
                
                s1=(Vehicle)ois.readObject();
                
   //int seats, int bags, String classtype, boolean transmission, float rentalPriceperDat             

                  //for tab
                 vehiclelist.add(
                 
                        new VehicleInfo(
                              s1.getModelName(),

                              s1.getBody().getSeats(),

                              s1.getBags(),

                              s1.getClasstype(),

                              s1.isTransmission()?"Auto":"Manual",

                              s1.getRentalPriceperDat(),
                              s1.getRegistrationInfo().getRegistrationNumber()
                        )
                 
                 
                 );



                //   System.out.println( s1.getModelName()+"\n");

            }
            
                       
        }
        catch(Exception e){
            
            
          System.out.println(e);
        }
        finally{
                ois.close();
      /*
               
                 try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }  
               */
           }
   
      
      
        
        
        
       
    }    
    
       
        
  
     public void getReservation(Reservation reservation, String age){
        
         this.age=age;
         
         
         
        this.reservation=reservation;
        
       
        pickupInfoLabel.setText(this.reservation.getPickupLocation()+" "+this.reservation.getPickupDate().getDate());
        
   
        dropOffInfoLabel.setText(this.reservation.getDropOffLocation()+" "+this.reservation.getDropOffDate().getDate());
        
       
      
      }

    @FXML
    private void showVehicleDetailsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void selectAndGoButtonOnClick(ActionEvent event) {
        
       
        try{
        
       
        
              
             FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("CompleteReservationScene.fxml")); 
             
             Parent vehicleParent = l1.load();//Loading initial and return parent
          
            
             CompleteReservationSceneController vehicleScenecon= l1.getController();
             
             
             
           
             vehicleScenecon.initData( tableView.getSelectionModel().getSelectedItem(),reservation,age);
             
           
             Scene s1 = new Scene( vehicleParent);
           
             Node n1=(Node)event.getSource();
                
             Stage orgStage = (Stage) n1.getScene().getWindow();
 
             orgStage.setScene(s1);
           
             orgStage.setTitle("Reservation");
           
        }
        catch(Exception e){}
    }
    
    
    
     
     
    
}
