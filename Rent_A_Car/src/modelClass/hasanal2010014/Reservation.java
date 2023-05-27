/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author siam
 */
public class Reservation implements Serializable{

    private static final long serialVersionUID = 6529685098267757690L;
    private String PickupLocation;
    
    private DateAndTime pickupDate;
    
    private  String dropOffLocation;
    
    private DateAndTime dropOffDate;
    
    private int totaldays;
    
    private double totaldaysPrice;
    
    private double totalPrice;
    
    private float vehiclePrice;
    
    private Tax tax;
    
    private Fees fees;
    
    private double totalTaxAndFees;
    
    
    
   
 
    
    private String confermationNumber;
    
     public Reservation() {
    }

    public Reservation(String PickupLocation, DateAndTime pickupDate, String dropOffLocation, DateAndTime dropOffDate, int totaldays, double totaldaysPrice, float vehiclePrice, Tax tax, Fees fees, double totalTaxAndFees, String confermationNumber) {
        this.PickupLocation = PickupLocation;
        this.pickupDate = pickupDate;
        this.dropOffLocation = dropOffLocation;
        this.dropOffDate = dropOffDate;
        this.totaldays = totaldays;
        this.totaldaysPrice = totaldaysPrice;
        this.vehiclePrice = vehiclePrice;
        this.tax = tax;
        this.fees = fees;
        this.totalTaxAndFees = totalTaxAndFees;
        this.confermationNumber = confermationNumber;
    }

     
    public Reservation(String PickupLocation, DateAndTime pickupDate, String dropOffLocation, DateAndTime dropOffDate) {
        this.PickupLocation = PickupLocation;
        this.pickupDate = pickupDate;
        this.dropOffLocation = dropOffLocation;
        this.dropOffDate = dropOffDate;
      
       
    }

     
    
    
    
    public boolean calculateTaxAndFees(){
      try{
        
        tax = new Tax();
        
        fees = new Fees();
          
          
          totaldays=dropOffDate.compare(pickupDate);
        

         totaldaysPrice=totaldays*vehiclePrice;
         
         
         if(!tax.calculateTax(totaldaysPrice)){
             
             System.out.println("tax problem");
         
             return false;
         }
         
         if(!fees.calculateFees(totaldays)){
             
                 System.out.println("fees problem");
         
            return false;
         }
         totalTaxAndFees=tax.getTotalTax()+fees.getTotalFees();
    
    
    
        }
        catch(Exception e){
            
              System.out.println(e.toString());
              return false;
        }
    
    return true;
    }

    public String getPickupLocation() {
        return PickupLocation;
    }

    public void setPickupLocation(String PickupLocation) {
        this.PickupLocation = PickupLocation;
    }

    public DateAndTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(DateAndTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public DateAndTime getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(DateAndTime dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public int getTotaldays() {
        return totaldays;
    }

    public void setTotaldays(int totaldays) {
        this.totaldays = totaldays;
    }

    public double getTotaldaysPrice() {
        return totaldaysPrice;
    }

    public void setTotaldaysPrice(double totaldaysPrice) {
        this.totaldaysPrice = totaldaysPrice;
    }

    public float getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(float vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public double getTotalTaxAndFees() {
        return totalTaxAndFees;
    }

    public void setTotalTaxAndFees(double totalTaxAndFees) {
        this.totalTaxAndFees = totalTaxAndFees;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getTotalPrice() {
        return totalPrice= totalTaxAndFees+totaldaysPrice;
    }
    
    public String getConfermationNumber() {
        return confermationNumber;
    }

    public void setConfermationNumber(String confermationNumber) {
        this.confermationNumber = confermationNumber;
    }
    

    @Override
    public String toString() {
        return "Reservation{" + "PickupLocation=" + PickupLocation + ", pickupDate=" + pickupDate + ", dropOffLocation=" + dropOffLocation + ", dropOffDate=" + dropOffDate + '}';
    }
    
    
       
       
}
