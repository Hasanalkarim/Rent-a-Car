/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author siam
 */
public class RegistrationInformation implements Serializable{
    
    protected final String registrationNumber;
    
    protected final LocalDate firstDateregistration;
    
    protected final String engineNumber;
    
    protected final String chesisNumber;
     
    protected final String country;
    
     protected final int year; 

    public RegistrationInformation(String registrationNumber, LocalDate firstDateregistration, String engineNumber, String chesisNumber, String country, int year) {
        this.registrationNumber = registrationNumber;
        this.firstDateregistration = firstDateregistration;
        this.engineNumber = engineNumber;
        this.chesisNumber = chesisNumber;
        this.country = country;
        this.year = year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public LocalDate getFirstDateregistration() {
        return firstDateregistration;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public String getChesisNumber() {
        return chesisNumber;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

  
     
    
    
    
    
    
}
