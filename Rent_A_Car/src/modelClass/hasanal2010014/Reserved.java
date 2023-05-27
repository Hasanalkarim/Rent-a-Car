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
public class Reserved implements Serializable{
    
      private static final long serialVersionUID = 6529685098267757690L;
    
       private final String confermationNumber;
       
        private final String customerId;
        
         private  String vehicleId;

    public Reserved(String confermationNumber, String customerId, String vehicleId) {
        this.confermationNumber = confermationNumber;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getConfermationNumber() {
        return confermationNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    
       
    
}
