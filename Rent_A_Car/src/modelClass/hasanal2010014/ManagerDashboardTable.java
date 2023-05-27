/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

/**
 *
 * @author siam
 */
public class ManagerDashboardTable {
    
      private static final long serialVersionUID = 6529685098267757690L;
    
       private  String reservationid;
       
        private  String customerId;
        
         private  String pickupDate;
         
          private  String dropOffDate;
          
           private  String vehicleName;

    public ManagerDashboardTable(String reservationid, String customerId, String pickupDate, String dropOffDate, String vehicleName) {
        this.reservationid = reservationid;
        this.customerId = customerId;
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.vehicleName = vehicleName;
    }

    public String getReservationid() {
        return reservationid;
    }

    public void setReservationid(String reservationid) {
        this.reservationid = reservationid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(String dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
       
       
       
       
    
}
