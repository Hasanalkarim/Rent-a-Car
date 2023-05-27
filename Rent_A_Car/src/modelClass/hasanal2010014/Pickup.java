/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

import java.io.Serializable;

/**
 *
 * @author siam
 */
public class Pickup extends Vehicle implements Serializable{
    
   private float cabinSize;
   
   private boolean tailgateStairs;

    public Pickup(float cabinSize, boolean tailgateStairs, String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition,  Body body, RegistrationInformation registrationInfo) {
        super(modelName, manufacturer, classtype, fuelType, rentalPriceperDat, milage, bags, transmission, driverpossition, body, registrationInfo);
        this.cabinSize = cabinSize;
        this.tailgateStairs = tailgateStairs;
    }

      public Pickup(String modelName, String manufacturer, String classtype, String fuelType, int milage, int bags, boolean transmission, String driverpossition, Body body) {
        super(modelName, manufacturer, classtype, fuelType,  milage, bags, transmission, driverpossition,  body);
       
    }
    
    public float getCabinSize() {
        return cabinSize;
    }

    public void setRentalPriceperDat(float rentalPriceperDat) {
        this.rentalPriceperDat = rentalPriceperDat;
    }

    
    public void setCabinSize(float cabinSize) {
        this.cabinSize = cabinSize;
    }

    public boolean isTailgateStairs() {
        return tailgateStairs;
    }

    public void setTailgateStairs(boolean tailgateStairs) {
        this.tailgateStairs = tailgateStairs;
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
   
   
    public void setExtra(boolean yes,float measurement, String roof,String vantype,float rentalprice,RegistrationInformation registrationInfo){
    
      this.tailgateStairs =yes; 
        
      this.cabinSize = measurement;
     
   
    
    
    }
    
    public void setRegistrationAndPrice(RegistrationInformation registrationInfo,float rentalPriceperDat){
       
            this.rentalPriceperDat = rentalPriceperDat;
      
             this.registrationInfo = registrationInfo;
       
       
       } ;
    
    public void setExtra(boolean yes,float measurement, String roof,String vantype){
    
      this.tailgateStairs =yes; 
        
      this.cabinSize = measurement;
     
    
    
    
    
    }
}
