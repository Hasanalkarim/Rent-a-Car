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
public class  VehicleList implements Serializable{
    
    
  private   int vehicleCount;
  
    private   String modelName;
    
    
  private   String vehicleClass;

    public VehicleList(int vehicleCount, String modelName, String vehicleClass) {
        this.vehicleCount = vehicleCount;
        this.modelName = modelName;
        this.vehicleClass = vehicleClass;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

      public String getManufacturerlName() {
        return modelName;
    }

    public void setManufacturerName(String modelName) {
        this.modelName = modelName;
    }
    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }
  
  
 
  
  
  
  
    
}
