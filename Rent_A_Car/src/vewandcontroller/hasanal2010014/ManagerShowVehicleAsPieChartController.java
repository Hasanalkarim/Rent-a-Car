/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import modelClass.hasanal2010014.Vehicle;
import modelClass.hasanal2010014.VehicleList;


public class ManagerShowVehicleAsPieChartController implements Initializable {

    
    @FXML
    private PieChart vehiclePie;
  
     ArrayList<VehicleList> vlist;
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          vlist= new ArrayList<VehicleList>();
    
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
               
                   if(vlist.isEmpty()){ // if list is empty add
                        
                      vlist.add( new VehicleList(1,s1.getModelName(),s1.getClasstype()));
                   }
                   else{
                        chk=0;                  
                        for(i=0; i<vlist.size(); i++){

                            if(vlist.get(i).getModelName().equals(s1.getModelName())){ //checking is duplicate exist

                                  vlist.get(i).setVehicleCount(vlist.get(i).getVehicleCount()+1);
                                 chk=1;
                                 break;

                            }
                        }//loop end

                        if(chk==0){ // if no duplicate exist then add

                        vlist.add( new VehicleList(1,s1.getModelName(),s1.getClasstype()));

                        }
                     }
          
            
            }//while loop end        
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
      
        for(VehicleList v: vlist){
           list2.add( new PieChart.Data(v.getModelName(),v.getVehicleCount()));
         }
        
        //list2.add(new PieChart.Data("Java",50));
        //...
        vehiclePie.setData(list2);
       
   }//load pie chart method end
 


   
    
    
}//Class end