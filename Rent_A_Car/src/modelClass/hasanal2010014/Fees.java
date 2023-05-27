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
public class Fees implements Serializable{
    

    private static final long serialVersionUID = 6529685098267757690L;


     float concRecoveryCharge= 2; //$2 per day

     float vlcrfCharge= 2; //$2 per day

     float concRecoveryFeeSurch;

     float vlcrf;

     float totalFees;

     int totaldays;

     public Fees() {
     }

     public Fees(int totaldays) {
        this.totaldays = totaldays;
     }




      public boolean calculateFees(int totaldays){

            try{    

              concRecoveryFeeSurch=concRecoveryCharge*totaldays;

              vlcrf=vlcrfCharge*totaldays;

              totalFees=concRecoveryFeeSurch+vlcrf;

            }
            catch(Exception e){
               return false;
                    }

            return true;
     }

      
      
      
      
     public boolean calculateFees(){

            try{    

              concRecoveryFeeSurch=concRecoveryCharge*totaldays;

              vlcrf=concRecoveryFeeSurch*totaldays;

              totalFees=concRecoveryFeeSurch+vlcrf;

            }
            catch(Exception e){
               return false;
                    }

            return true;
     }

    public float getConcRecoveryCharge() {
        return concRecoveryCharge;
    }

    public void setConcRecoveryCharge(float concRecoveryCharge) {
        this.concRecoveryCharge = concRecoveryCharge;
    }

    public float getVlcrfCharge() {
        return vlcrfCharge;
    }

    public void setVlcrfCharge(float vlcrfCharge) {
        this.vlcrfCharge = vlcrfCharge;
    }

    public float getConcRecoveryFeeSurch() {
        return concRecoveryFeeSurch;
    }

    public void setConcRecoveryFeeSurch(float concRecoveryFeeSurch) {
        this.concRecoveryFeeSurch = concRecoveryFeeSurch;
    }

    public float getVlcrf() {
        return vlcrf;
    }

    public void setVlcrf(float vlcrf) {
        this.vlcrf = vlcrf;
    }

    public float getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(float totalFees) {
        this.totalFees = totalFees;
    }

    public int getDays() {
        return totaldays;
    }

    public void setDays(int totaldays) {
        this.totaldays = totaldays;
    }
    
      
        
    
}
