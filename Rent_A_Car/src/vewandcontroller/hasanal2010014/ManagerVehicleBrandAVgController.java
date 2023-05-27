/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.VehicleList;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class ManagerVehicleBrandAVgController implements Initializable {

    @FXML
    private PieChart brandAvgPie;
    
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
    
        
    
   public void loadpieChart(){
    
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
   
       
         
        ObservableList <PieChart.Data> list2 = FXCollections.observableArrayList();
      
    double   teslaAvg= teslaPrice/ teslaCount;
    
    double  mitsubisiAvg= mitsubisiPrice/mitsubisiCount;
    
    double mersidisAvg=mersidisPrice/ mersidisCount;
        
    
    
        
        
           list2.add( new PieChart.Data("Tesla", teslaAvg));
           
               list2.add( new PieChart.Data("mitsubisi", mitsubisiAvg));
               
                   list2.add( new PieChart.Data("mersidis", mersidisAvg));
        
        
      
          brandAvgPie.setData(list2);
       
   }//load pie chart method end
 


   
    
}
