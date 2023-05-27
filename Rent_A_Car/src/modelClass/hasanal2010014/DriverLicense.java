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
public class DriverLicense implements Serializable{
    
    private String driverId;
            
     private String licenseId;

    public DriverLicense() {
    }

    public DriverLicense(String driverId, String licenseId) {
        this.driverId = driverId;
        this.licenseId = licenseId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
     
     
}
