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
public class VehicleData  implements Serializable {
     
        protected final String modelName;
        
       protected final String manufacturer;
        
        private final boolean towingCapability;
    
       private final float suvHight;
       
        protected final int bags;
        
          protected final boolean transmission;
          
            protected final String country;
    
           protected final int year; 
    
                protected final String driverpossition;

                protected  Body body;
                
                
                
                

    public VehicleData(String modelName, String manufacturer, boolean towingCapability, float suvHight, int bags, boolean transmission, String country, int year, String driverpossition, Body body) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.towingCapability = towingCapability;
        this.suvHight = suvHight;
        this.bags = bags;
        this.transmission = transmission;
        this.country = country;
        this.year = year;
        this.driverpossition = driverpossition;
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isTowingCapability() {
        return towingCapability;
    }

    public float getSuvHight() {
        return suvHight;
    }

    public int getBags() {
        return bags;
    }

    public boolean isTransmission() {
        return transmission;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getDriverpossition() {
        return driverpossition;
    }
                
                
                
                
                
}
