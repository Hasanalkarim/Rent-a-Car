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
public class Vans  extends Vehicle implements Serializable{
    
    private String roofType; //low roof, hitop roof, popUp roof
    
    private String vanType; //campervan,cargovan,multivan

    public Vans(String roofType, String vanType, String modelName, String manufacturer, String classtype, String fuelType, float rentalPriceperDat, int milage, int bags, boolean transmission, String driverpossition,  Body body, RegistrationInformation registrationInfo) {
        super(modelName, manufacturer, classtype, fuelType, rentalPriceperDat, milage, bags, transmission, driverpossition,  body, registrationInfo);
        this.roofType = roofType;
        this.vanType = vanType;
    }

      public Vans(String modelName, String manufacturer, String classtype, String fuelType,  int milage, int bags, boolean transmission, String driverpossition,  Body body) {
        super(modelName, manufacturer, classtype, fuelType,  milage, bags, transmission, driverpossition,  body);
       
    }
    public String getRoofType() {
        return roofType;
    }

    public void setRentalPriceperDat(float rentalPriceperDat) {
        this.rentalPriceperDat = rentalPriceperDat;
    }

    
    
    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getVanType() {
        return vanType;
    }

    public void setVanType(String vanType) {
        this.vanType = vanType;
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
     
     
         this.roofType = roof;
          
         this.vanType =vantype;
          
         this.rentalPriceperDat =rentalprice;
           
         this.registrationInfo =registrationInfo;
           
           
           
         
     }
    
    
    public void setRegistrationAndPrice(RegistrationInformation registrationInfo,float rentalPriceperDat){
       
            this.rentalPriceperDat = rentalPriceperDat;
      
             this.registrationInfo = registrationInfo;
       
       
       } ;
    
    
     public void setExtra(boolean yes,float measurement, String roof,String vantype){
     
        this.roofType = roof;
          
         this.vanType =vantype;
     
     
     
     }
    
    
}
