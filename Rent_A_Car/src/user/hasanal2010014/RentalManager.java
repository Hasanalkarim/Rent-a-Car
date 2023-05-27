/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.hasanal2010014;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.User;
import modelClass.hasanal2010014.Vehicle;
import vewandcontroller.hasanal2010014.SuvSceneController;

/**
 *
 * @author siam
 */
public class RentalManager extends User implements Serializable {

   private static final long serialVersionUID = 6529685098267757690L;  
   
   
    public RentalManager(String id, String firstName, String secondName, String lastName, String email, String phoneNumber, String password, LocalDate dateofBirth) {
        super(id, firstName, secondName, lastName, email, phoneNumber, password, dateofBirth);
    }


   
    
    
    public static void add(Vehicle vehicle){
    
    
      
               File file = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
         
        
            try{
                file=new File("Vehicle.bin");
                if(file.exists()){
                fos = new FileOutputStream(file,true);
                oos = new MyObjectOutputStream(fos);                
                }
                else{
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);               
                }
                
                
                
            
                    oos.writeObject(vehicle);
                 
                    
                   
                    
            }
            catch(Exception e){
                System.out.println("infile "+e);
            }
            finally{
               
                
                   try {
                       oos.close();
                       
                       
                       
                       
                       
                       /*
                       
                       try {
                       if(ois!=null)
                       ois.close();
                       } catch (IOException ex1) {  }
                   */  } catch (IOException ex) {
                       Logger.getLogger(SuvSceneController.class.getName()).log(Level.SEVERE, null, ex);
                   }
           }            
            
      
      
      
        
      
       System.out.println("addd to bin");
      
      
      
      
    
    }
    
    
    
    
}
