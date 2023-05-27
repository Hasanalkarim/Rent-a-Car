/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass.shafin1921531;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Price implements Serializable {
     private String vehicleModel ; 
    private final int partsId ;
    private final String item;
    private final float price;
    private int milage;

    public Price(String vehicleModel, int partsId, String item, float price, int milage) {
        this.vehicleModel = vehicleModel;
        this.partsId = partsId;
        this.item = item;
        this.price = price;
        this.milage = milage;
    }

  

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getPartsId() {
        return partsId;
    }


    public String getItem() {
        return item;
    }

   
    public float getPrice() {
        return price;
    }

   
    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
    
    
}
