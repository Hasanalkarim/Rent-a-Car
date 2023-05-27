/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

/**
 *
 * @author siam
 */
public class VehicleInfo {
    
    private static final long serialVersionUID = 6529685098267757690L;    
   
    private String modelName;
    
    private  int  seats;
            
    private int bags;
    
    private String classtype;
     
    private String transmission;
          
    private float rentalPriceperDat;
            
     private String registrationNumber;    
    
    

    public VehicleInfo() {
    }

    public VehicleInfo(String modelName, int seats, int bags, String classtype, String transmission, float rentalPriceperDat, String registrationNumber) {
        this.modelName = modelName;
        this.seats = seats;
        this.bags = bags;
        this.classtype = classtype;
        this.transmission = transmission;
        this.rentalPriceperDat = rentalPriceperDat;
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    public String isTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public float getRentalPriceperDat() {
        return rentalPriceperDat;
    }

    public void setRentalPriceperDat(float rentalPriceperDat) {
        this.rentalPriceperDat = rentalPriceperDat;
    }
       
  
   
      
      
  
    
    
    
    
}
