/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siam
 */
public abstract class Vehicle implements Serializable{
    
    
      private static final long serialVersionUID = 6529685098267757690L;  
    
    protected final String modelName;
    
    protected final String manufacturer;
    
    protected final String classtype;
     
    protected final String fuelType;
    
    protected  float rentalPriceperDat;
       
    protected final int milage;
        
    protected final int bags;
         
    protected final boolean transmission;
          
    protected final String driverpossition;
    
    
    
    
  
  
     protected  Body body;
     
     protected  RegistrationInformation registrationInfo;

    public Vehicle(String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition, Body body, RegistrationInformation registrationInfo) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.classtype = classtype;
        this.fuelType = fuelType;
        this.rentalPriceperDat = rentalPriceperDat;
        this.milage = milage;
        this.bags = bags;
        this.transmission = transmission;
        this.driverpossition = driverpossition;
     
        this.body = body;
        this.registrationInfo = registrationInfo;
    }
    
    
    
     public Vehicle(String modelName, String manufacturer, String classtype, String fuelType, int milage, int bags, boolean transmission, String driverpossition, Body body) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.classtype = classtype;
        this.fuelType = fuelType;
       
        this.milage = milage;
        this.bags = bags;
        this.transmission = transmission;
        this.driverpossition = driverpossition;
  
        this.body = body;
        this.registrationInfo = null;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setRentalPriceperDat(float rentalPriceperDat) {
        this.rentalPriceperDat = rentalPriceperDat;
    }

  
     
    public String getModelName() {
        return modelName;
    }

    public String getClasstype() {
        return classtype;
    }

    public String getFuelType() {
        return fuelType;
    }

    public float getRentalPriceperDat() {
        return rentalPriceperDat;
    }

    public int getMilage() {
        return milage;
    }

    public int getBags() {
        return bags;
    }

    public boolean isTransmission() {
        return transmission;
    }

    public String getDriverpossition() {
        return driverpossition;
    }

   

    
    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    
  
    public RegistrationInformation getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInformation registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    
    abstract public void setRegistrationAndPrice(RegistrationInformation registrationInfo,float rentalPriceperDat) ;
    
    
    
    abstract public void setExtra(boolean yes,float measurement, String roof,String vantype,float rentalprice,RegistrationInformation registrationInfo);
    
    
    abstract public void setExtra(boolean yes,float measurement, String roof,String vantype);
    
    
    public static void  markReservedVehicle(String modelName){
        
    
    
                        
         FileOutputStream fos=null;
         ObjectOutputStream oos = null;
         File f =null;
      
        try{
              f = new File("ReservedCar.bin");
             if(f.exists()){
                fos = new FileOutputStream(f,true);
                 oos = new MyObjectOutputStream(fos);  
              }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos); 
   
            }
        
            
              oos.writeObject(modelName);
             
        }// try end
        catch (IOException ex) {
     
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                
            }
        }//finally end      
       
           
    
    
    }        
            
           
     public static boolean  isReserved(String modelName){
     
             String str;
           FileInputStream fs = null;          
           ObjectInputStream ois=null; 
           
            try{
               fs = new  FileInputStream("ReservedCar.bin");
               
               ois = new ObjectInputStream(fs);
               
               while(true){
               
                    str= (String)ois.readObject();

                    if(str.equals(modelName)){

                       return true;
                    }
               
               }
               
            
            
            }//try End
            catch(Exception e){}
            finally{
               try {
                   ois.close();
               } catch (IOException ex) {
                   Logger.getLogger(Vehicle.class.getName()).log(Level.SEVERE, null, ex);
               }
               }//finally end
        
         
         
     
     
     
      return false;
     }
         
      
    
}
