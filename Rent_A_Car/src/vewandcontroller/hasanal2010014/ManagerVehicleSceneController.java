/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import modelClass.hasanal2010014.Suv;
import modelClass.hasanal2010014.Vehicle;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class ManagerVehicleSceneController implements Initializable {

    @FXML
    private Menu vehicleButttonOnClick1;
    @FXML
    private Menu membershipButttonOnClick1;
    @FXML
    private Menu offerButttonOnClick1;
    @FXML
    private Menu equipmentButttonOnClick1;
    @FXML
    private Menu logOutButttonOnClick;
    @FXML
    private Label notificationOutputLabel;
    @FXML
    private AnchorPane crossAncorpnae;
    @FXML
    private TableColumn<Vehicle, String> vehicelName;
    @FXML
    private TableColumn<Vehicle, String> vehicleClass;
    @FXML
    private TableColumn<Vehicle, String> vehiclePrice;
    @FXML
    private TableView<Vehicle> tablevieww;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private AnchorPane centerAncorpaneTable;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("manager intial start");
       
     File file = new File("Vehicle.bin");
         
     if(file.exists()){
     
        loadTable();
     }
         
        System.out.println("manager intial end");  
    }    

    @FXML
    private void addNewVehicleButtonOnClick(ActionEvent event) throws IOException {
        
        
          FXMLLoader l1= new FXMLLoader();
            
             l1.setLocation( getClass().getResource("AddNewVehicle.fxml")); 
            
              Parent manageroot = l1.load();
        
           Scene s1 = new Scene(manageroot);
           
           Node n1=(Node)event.getSource();
           
           Stage orgStage = (Stage) n1.getScene().getWindow();
           
           orgStage.setScene(s1);
           
           orgStage.setTitle("Add Vehicle");
           
           orgStage.show();
        
        
    }
    
    
    
     public ObservableList<Vehicle> getVehicle() throws FileNotFoundException, IOException, ClassNotFoundException{
       
       
       
        ObservableList<Vehicle> vehiclelist = FXCollections.observableArrayList();
        //FXCollections.
        //ObservableList<Person> people2 = new ArrayList<Person>();
        
       
           
           
           FileInputStream fs = new FileInputStream("Vehicle.bin");
           
            ObjectInputStream ois=null;     
           ois=  new ObjectInputStream(fs); 
           
           Vehicle s1;
            
         try {
             
           
             
            
            while(true){
                
                s1=(Vehicle)ois.readObject();

                  //for table
                 vehiclelist.add(s1);



                //   System.out.println( s1.getModelName()+"\n");

            }
            
                       
        }
        catch(Exception e){
            
            
          System.out.println(e);
        }
        finally{
                ois.close();
                
                return vehiclelist; 
               
         /*
               
                 try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }  
               */
           }
   
      
      
        
        
        
       
    }    
    
    
    
    
    
    
    public void loadTable(){
    
       //set up the columns in the table
        vehicelName.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("modelName"));
        vehicleClass.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("classtype"));
        vehiclePrice.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("rentalPriceperDat"));
        
        
        
        try {
            
          
            tablevieww.setItems(getVehicle());
            
             
            
        } catch (IOException ex) {
            Logger.getLogger(ManagerVehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagerVehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    
    }//loadtableEnd
    
    
    
    
    
    
    
    
  
  public void status(String str){
  
    notificationOutputLabel.setText("New Vehicle "+str+" added");
  
  
  }   

    @FXML
    private void vehiclePieChartOnClick(ActionEvent event) {
        
        
            FXMLLoader l1= new FXMLLoader();
            
            l1.setLocation( getClass().getResource("ManagerShowVehicleAsPieChart.fxml")); 
                      
          
            
          
           
         
               
             try {
            
              Parent vehicleParent = l1.load();
              
              
             ManagerShowVehicleAsPieChartController vehicleScenecon= l1.getController();
              
              vehicleScenecon.loadpieChart();
              
             mainBorderPane.setCenter(vehicleParent);
             
             
           
           
        } catch (IOException ex) {
            Logger.getLogger(ManagerVehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
        
    }

    
    
    
    
    @FXML
    private void showVehicleListOnClick(ActionEvent event) {
        
        
        
         mainBorderPane.setCenter(centerAncorpaneTable);
        
    }

    @FXML
    private void manufactureVehiclePieChartOnClick(ActionEvent event) {
        
                
            FXMLLoader l1= new FXMLLoader();
            
            l1.setLocation( getClass().getResource("ManagerManufacturePieChartScene.fxml")); 
                      
          
            
          
           
         
               
             try {
            
              Parent vehicleParent = l1.load();
              
              
             ManagerManufacturePieChartSceneController vehicleScenecon= l1.getController();
              
              vehicleScenecon.loadpieChart();
              
             mainBorderPane.setCenter(vehicleParent);
             
             
           
           
        } catch (IOException ex) {
            Logger.getLogger(ManagerVehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
    }

    @FXML
    private void vehicleBrandAvgPieRadioButtonOnClick(ActionEvent event) {
        
             FXMLLoader l2= new FXMLLoader();
             
               l2.setLocation( getClass().getResource("ManagerVehicleBrandAVg.fxml")); 
        
                 try {
            
              Parent vehicleParent = l2.load();
              
              
             ManagerVehicleBrandAVgController vehicleScenecon= l2.getController();
              
              vehicleScenecon.loadpieChart();
              
             mainBorderPane.setCenter(vehicleParent);
             
             
           
           
        } catch (IOException ex) {
            Logger.getLogger(ManagerVehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
               
               
        
    }

    @FXML
    private void VehicleBrandAvgListRadioButtonOnClick(ActionEvent event) {
                    FXMLLoader l2= new FXMLLoader();
             
        l2.setLocation( getClass().getResource("ManagerVehicleBrandAvgList.fxml")); 
        
               try {
            
              Parent vehicleParent = l2.load();
              
              
             ManagerVehicleBrandAvgListController vehicleScenecon= l2.getController();
              
              vehicleScenecon.loadTable();
              
             mainBorderPane.setCenter(vehicleParent);
             
             
           
           
        } catch (IOException ex) {
            Logger.getLogger(ManagerVehicleSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
               
               
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
