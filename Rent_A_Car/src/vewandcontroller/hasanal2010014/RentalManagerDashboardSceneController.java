/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

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
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import modelClass.hasanal2010014.ManagerDashboardTable;
import modelClass.hasanal2010014.Reservation;
import modelClass.hasanal2010014.Reserved;
import modelClass.hasanal2010014.User;
import modelClass.hasanal2010014.Vehicle;
import user.hasanal2010014.Customer;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class RentalManagerDashboardSceneController implements Initializable {

    @FXML
    private Label notificationOutputLabel;
    @FXML
    private AnchorPane crossAncorpnae;
    private Menu vehicle;
    @FXML
    private BorderPane mainBorferpane;
    
  
    @FXML
    private TableView<ManagerDashboardTable> tableView;
    @FXML
    private TableColumn<ManagerDashboardTable, String> reservationidColumn;
    @FXML
    private TableColumn<ManagerDashboardTable, String> customerIdColumn;
    @FXML
    private TableColumn<ManagerDashboardTable, String> pickupDateColumn;
    @FXML
    private TableColumn<ManagerDashboardTable, String> dropOffDateColumn;
    @FXML
    private TableColumn<ManagerDashboardTable, String> vehicleColumn;

         Reserved reserved;
    
    User user;
    
     Customer customer;
     
     
     
    String confermationNumber;
   
      Reservation  reservation=null;
    
     Vehicle v1;
     
     
       ManagerDashboardTable tableData;
       
       
         int x=0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadTable();
      /*  
        try {
           seeReserved();
        } catch (IOException ex) {
            Logger.getLogger(RentalManagerDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
    }    


   
    
    @FXML
    private void manageVehicleButttonOnClick(ActionEvent event) throws IOException {
        
        
   //**************************************SceneSwitching From MenuItem****************************************         
        FXMLLoader l2= new FXMLLoader();
            
            l2.setLocation( getClass().getResource("ManagerVehicleScene.fxml")); 
            
              Parent manageroot = l2.load();
        
           Scene s1 = new Scene(manageroot);
           
           
           
           
           Stage orgStage = (Stage) mainBorferpane.getScene().getWindow() ;
           
           orgStage.setScene(s1);
           
           orgStage.setTitle("Vehicle Manager");
           
           orgStage.show();
         
       
        
        
        
 //**************************************SceneSwitching From MenuItem****************************************                
        
        
    }
    
      public void loadTable(){
    
          
      
       //set up the columns in the table
        reservationidColumn.setCellValueFactory(new PropertyValueFactory<ManagerDashboardTable, String>("reservationid"));
        customerIdColumn.setCellValueFactory(new PropertyValueFactory<ManagerDashboardTable, String>("customerId"));
        pickupDateColumn.setCellValueFactory(new PropertyValueFactory<ManagerDashboardTable, String>("pickupDate"));
        
        dropOffDateColumn.setCellValueFactory(new PropertyValueFactory<ManagerDashboardTable, String>("dropOffDate"));
        vehicleColumn.setCellValueFactory(new PropertyValueFactory<ManagerDashboardTable, String>("vehicleName"));
        
        try {
            
          
           tableView.setItems(getVehicle());
            
             
            
        } catch (Exception ex) {
            Logger.getLogger(RentalManagerDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
      
        }
    
    }//loadtableEnd
    
 
     public ObservableList<ManagerDashboardTable> getVehicle() throws FileNotFoundException, IOException, ClassNotFoundException{
       
       
       
        ObservableList<ManagerDashboardTable> vehiclelist = FXCollections.observableArrayList();
        //FXCollections.
        //ObservableList<Person> people2 = new ArrayList<Person>();
        
       
           
           
           FileInputStream vec = new FileInputStream("Vehicle.bin");
           
           FileInputStream revation = new FileInputStream("Reservation.bin");
           
        
           
           FileInputStream resed = new FileInputStream("Reserved.bin");
           
            ObjectInputStream vecOis=null;     
            
             ObjectInputStream revationOis=null;     
             
            
              
               ObjectInputStream reservedOis=null;     
            
            
        
         
           
            try{
              
              vecOis=  new ObjectInputStream(vec); 
           
           
             revationOis=  new ObjectInputStream(revation); 
         
           
     
           
                              
            reservedOis=  new ObjectInputStream(resed ); 
                
                
             
               while(true){
               
                    reserved= (Reserved) reservedOis.readObject();

                   
                    
                    try{
                    
                      while(true){
                          
                          
                          x=2;
                       reservation= (Reservation) revationOis.readObject();
                       
                          if( reserved.getConfermationNumber().equals( reservation.getConfermationNumber())){
                            break;
                          }
                      
                      }
                    
                    
                    }
                    catch(Exception e){
                        
                        System.out.println("reservation exception");
                    
                    
                    }
                    
                    
                      try{
                      
                      
                        while(true){
                            
                            
                            
                           v1= (Vehicle) vecOis.readObject();
                           
                           
                       
                          if(reserved.getVehicleId().equals(v1.getRegistrationInfo().getRegistrationNumber())){
                              
                               System.out.println(v1.getModelName());
                            break;
                          }
                      
                      }
                      }
                    catch(Exception e){
                    
                         System.out.println("vehicle exception");
                    }
                    
                    
                      
                      
                        
   //reservationid, String customerId, String pickupDate, String dropOffDate, String vehicleName            
                   
                        
                     vehiclelist.add(
                     
                        new ManagerDashboardTable(
                     
                      reservation.getConfermationNumber(),
                       
                      reserved.getCustomerId(),
                             
                             
                       reservation.getPickupDate().getDate(),
                             
                        reservation.getDropOffDate().getDate(),
                             
                        v1.getModelName()
                     
                     
                          )
                     
                     );
                     
                     
                    
               }
               
            
            
            }//try End
            catch(Exception e){
                
              
            
                System.out.println("Resreved read"+e.toString());
            }
            finally{
              
                  vecOis.close();
           
           
             revationOis.close();
                            
            reservedOis.close();
                
                
               }//finally end
        
        
           return  vehiclelist;
        
        
       
    }    
    
    
    
    
    public void seeReserved() throws IOException{
        
        
          FileInputStream resed = null;
          
             ObjectInputStream reservedOis=null;
        try {
            resed = new FileInputStream("Reserved.bin");     
         
           
            
            
            
           reservedOis=  new ObjectInputStream(resed ); 
                
                
             
               while(true){
               
                reserved= (Reserved) reservedOis.readObject();
                
                   System.out.println("Reserved="+reserved.getVehicleId());
                   
                   System.out.println("conId="+reserved.getConfermationNumber()+"\n");
                   
                  

            
               }
            
            
            
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RentalManagerDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch(Exception e){
        
        }
        finally {
            try {
                resed.close();
            } catch (IOException ex) {
                Logger.getLogger(RentalManagerDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
           
           
            
    
    }
        
     
     
     
     
        
          @FXML
    private void membershipButttonOnClick(ActionEvent event) {
    }

    @FXML
    private void offerButttonOnClick(ActionEvent event) {
    }

    @FXML
    private void equipmentButttonOnClick(ActionEvent event) {
    }
  
    
}
