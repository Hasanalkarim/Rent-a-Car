/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.hasanal2010014;

import java.io.Serializable;
import java.time.LocalDate;
import modelClass.hasanal2010014.Address;
import modelClass.hasanal2010014.Card;
import modelClass.hasanal2010014.DateAndTime;
import modelClass.hasanal2010014.Reservation;
import modelClass.hasanal2010014.TravelInfo;
import modelClass.hasanal2010014.User;

/**
 *
 * @author siam
 */
public class Customer extends User implements Serializable {
  
     private static final long serialVersionUID = 6529685098267757690L;
    
     private String  country;   
    
     private Address address;
  
     private Card    card;
     
     private TravelInfo travelInfo;
     
     private String age;

    public Customer() {
    }

    public Customer(String country, Address address, Card card, TravelInfo travelInfo, String id, String firstName, String secondName, String lastName, String email, String phoneNumber, String password, LocalDate dateofBirth) {
        super(id, firstName, secondName, lastName, email, phoneNumber, password, dateofBirth);
        this.country = country;
        this.address = address;
        this.card = card;
        this.travelInfo = travelInfo;
    }
  
     
    public Customer(String id, String firstName, String secondName, String lastName, String email, String phoneNumber, TravelInfo travelInfo,String age) {
        super(id, firstName, secondName, lastName, email, phoneNumber);
          this.travelInfo = travelInfo;
          
          this.age=age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public TravelInfo getTravelInfo() {
        return travelInfo;
    }

    public void setTravelInfo(TravelInfo travelInfo) {
        this.travelInfo = travelInfo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

  
   
     
     
  
  public static  Reservation  makeReservation(String pickupLocation,LocalDate pickDate,int pickuphour,int  pickupminiute,String pickupAmPm,String dropOffLocation,LocalDate dropDate,int dropOffhour,int  dropOffminiute,String dropOffAmPm){
  
      
     Reservation reservation =null;
     try{
     
     DateAndTime pickupDate= new  DateAndTime(
             
             pickDate.getDayOfMonth(),
             pickDate.getMonthValue(),
             pickDate.getYear(),   
             pickuphour,
             pickupminiute,
             pickupAmPm
              
     );
     
     
     DateAndTime dropOffDate= new  DateAndTime(
             
             dropDate.getDayOfMonth(),
             dropDate.getMonthValue(),
             dropDate.getYear(),   
             dropOffhour,
             dropOffminiute,
             dropOffAmPm
              
     );
    
     
     
  //String PickupLocation, DateAndTime pickupDate, String dropOffLocation, DateAndTime dropOffDate, String confermationNumber)
    
     reservation= new Reservation(
                          pickupLocation,
                          pickupDate,
                          dropOffLocation,
                          dropOffDate
  
    );
  
  
  
     }
     catch(Exception e){
         
         System.out.println(e);
     
        return null;
     }
  
    return reservation;
  
  }//make reservation method end
  
  
   
}
