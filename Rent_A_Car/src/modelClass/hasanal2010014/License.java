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
public class License implements Serializable{
    
    private String driverId;

    private String licenseNumber;
     
    private String issuingCountry;
             
    private LocalDate issueDate;
             
    private LocalDate expirationDate;

    public License() {
    }

    public License(String driverId, String licenseNumber, String issuingCountry, LocalDate issueDate, LocalDate expirationDate) {
        this.driverId = driverId;
        this.licenseNumber = licenseNumber;
        this.issuingCountry = issuingCountry;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    
       
       
}
