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
public class Tax implements Serializable{
    
       private static final long serialVersionUID = 6529685098267757690L;
    
       
      double  RentalTaxPercent = 0.12; //12%
 
      double lessorTaxPercent = 0.02; //2%
      
      double carRentalTax;
      
      double lessorTax;
      
      double totalTax;
      
      float totalDaysprice;
      
      

      public Tax() {
      }

        public Tax(float totalDaysprice) {
            this.totalDaysprice = totalDaysprice;
        }
      
      
      public boolean calculateTax(double totalDaysprice){
      
          try{
          
         carRentalTax= RentalTaxPercent*totalDaysprice; 
         
         lessorTax=lessorTaxPercent*totalDaysprice;
      
         totalTax= carRentalTax+ lessorTax;
          }
          catch(Exception e){
          
            return false;
          }
          
           return true;
      }
      
      
      
      
      
      
       public boolean calculateTax(){
      
          try{
          
         carRentalTax= RentalTaxPercent*totalDaysprice; 
         
         lessorTax=lessorTaxPercent*totalDaysprice;
      
         totalTax= carRentalTax+ lessorTax;
          }
          catch(Exception e){
          
            return false;
          }
          
           return true;
      }   
      
      
      

    public double getRentalTaxPercent() {
        return RentalTaxPercent;
    }

    public void setRentalTaxPercent(double RentalTaxPercent) {
        this.RentalTaxPercent = RentalTaxPercent;
    }

    public double getLessorTaxPercent() {
        return lessorTaxPercent;
    }

    public void setLessorTaxPercent(double lessorTaxPercent) {
        this.lessorTaxPercent = lessorTaxPercent;
    }

    public double getCarRentalTax() {
        return carRentalTax;
    }

    public void setCarRentalTax(double carRentalTax) {
        this.carRentalTax = carRentalTax;
    }

    public double getLessorTax() {
        return lessorTax;
    }

    public void setLessorTax(double lessorTax) {
        this.lessorTax = lessorTax;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

   
      
      
          
}
