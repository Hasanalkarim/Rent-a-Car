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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelClass.hasanal2010014.BrandAvg;
import modelClass.hasanal2010014.Vehicle;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class ManagerVehicleBrandAvgListController implements Initializable {

    @FXML
    private TableView<BrandAvg> tableView;
    @FXML
    private TableColumn<BrandAvg, String> vehicleBrandColumn;
    @FXML
    private TableColumn<BrandAvg, String> vehicleAvgColumn;

      
    int teslaCount=0;
    
    int mitsubisiCount=0;
    
    int mersidisCount=0;
    
    
    double teslaPrice=0;
    
    double mitsubisiPrice=0;
    
    double mersidisPrice=0;
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   
    
      public void loadTable(){
    
       //set up the columns in the table
        vehicleBrandColumn.setCellValueFactory(new PropertyValueFactory<BrandAvg, String>("modelName"));
        vehicleAvgColumn.setCellValueFactory(new PropertyValueFactory<BrandAvg, String>("avg"));
       
        
        
        try {
            
          
            tableView.setItems(getVehicle());
            
             
            
        } catch (Exception e) {
            System.out.println("Table Set item Exception");
        } 
     
    
    }//loadtableEnd
      
      
       public ObservableList<BrandAvg> getVehicle() throws FileNotFoundException, IOException, ClassNotFoundException{
       
       
             ObservableList<BrandAvg> vehiclelist = FXCollections.observableArrayList();
        //FXCollections.
        //ObservableList<Person> people2 = new ArrayList<Person>();
           Vehicle s1 = null;

        FileInputStream fs=null;
       
        ObjectInputStream ois=null; 
       
               try {
             
           
              fs = new FileInputStream("Vehicle.bin");
              ois=  new ObjectInputStream(fs); 
           
             
           
             int i=0;
             int chk=0;
            
             
             
            while(true){
                
                s1=(Vehicle)ois.readObject(); //reading from file 1 by 1
              
                
                //("Tesla","mitsubisi","mersidis")
                
               
                
                
                if( s1.getManufacturer().equals("Tesla")){
                    
                   
                    
                  teslaPrice= s1.getRentalPriceperDat()+teslaPrice;  
                
                   teslaCount++;
                         
                }
                else if(s1.getManufacturer().equals("mitsubisi")){
                    
                    
                    mitsubisiPrice=s1.getRentalPriceperDat()+mitsubisiPrice;
                     mitsubisiCount++;
                
                }
                else{
                
                    mersidisPrice=s1.getRentalPriceperDat()+mersidisPrice;
                mersidisCount++;
                
                }
                
                
                

            }// file reading while loop end        
        }
        catch(Exception e){}
        finally{
           
            try{
                ois.close(); 
            } 
            catch (IOException ex){
               
            }
           
        }//finaly end
               
               
               
               
                   
    double   teslaAvg= teslaPrice/ teslaCount;
    
    double  mitsubisiAvg= mitsubisiPrice/mitsubisiCount;
    
    double mersidisAvg=mersidisPrice/ mersidisCount;
    
    
    vehiclelist.add(
    
                new BrandAvg(
                  "Tesla",

                     ""+ teslaAvg   


                )
    
    
    );
        
   
         vehiclelist.add(
    
                new BrandAvg(
                  "mitsubisi",

                     ""+mitsubisiAvg  


                )
    
    
    );
         
         
           vehiclelist.add(
    
                    new BrandAvg(
                      "mersidis",

                         ""+ mersidisAvg  


                    )
    
    
    );
           
        return vehiclelist;
       }
      
}
