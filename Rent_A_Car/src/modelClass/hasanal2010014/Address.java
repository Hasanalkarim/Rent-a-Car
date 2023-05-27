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
public class Address implements Serializable{
    
    private String state;
    
     private String city;
     
      private String zipCode;

    public Address() {
    }

    public Address(String state, String city, String zipCode) {
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
      
      
    
    
    
}
