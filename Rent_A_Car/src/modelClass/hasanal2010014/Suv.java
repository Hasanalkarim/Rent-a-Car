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
public class Suv extends Vehicle implements Serializable{
    
    private  boolean towingCapability;
    
     private  float suvHight;

    public Suv(boolean towingCapability, float suvHight, String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition,  Body body, RegistrationInformation registrationInfo) {
        super(modelName, manufacturer, classtype, fuelType, rentalPriceperDat, milage, bags, transmission, driverpossition, body, registrationInfo);
        this.towingCapability = towingCapability;
        this.suvHight = suvHight;
    }

public Suv( String modelName, String manufacturer, String classtype, String fuelType,  int milage, int bags, boolean transmission, String driverpossition,  Body body) {
        super(modelName, manufacturer, classtype, fuelType,  milage, bags, transmission, driverpossition,  body);
      
    }

    public void setRentalPriceperDat(float rentalPriceperDat) {
        this.rentalPriceperDat = rentalPriceperDat;
    }

    public void setTowingCapability(boolean towingCapability) {
        this.towingCapability = towingCapability;
    }

    public void setSuvHight(float suvHight) {
        this.suvHight = suvHight;
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

 
     public void setExtra(boolean yes,float measurement, String roof,String vantype,float rentalprice,RegistrationInformation registrationInfo){
     
     
          this.towingCapability = yes;
          
          this.suvHight = measurement;
          
           this.rentalPriceperDat =rentalprice;
           
           this.registrationInfo =registrationInfo;
           
           
           
         
     }

     
     public void setRegistrationAndPrice(RegistrationInformation registrationInfo,float rentalPriceperDat){
       
            this.rentalPriceperDat = rentalPriceperDat;
      
             this.registrationInfo = registrationInfo;
       
       
       } ;
    
     public void setExtra(boolean yes,float measurement, String roof,String vantype){
     
     
      
          this.towingCapability = yes;
          
          this.suvHight = measurement;
     
     
     }
   
     
    
}
