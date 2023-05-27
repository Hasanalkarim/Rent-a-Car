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
public class TravelInfo implements Serializable{
    
      private static final long serialVersionUID = 6529685098267757690L;
    
    private String flightNumber;
            
     private String airLine;

    public TravelInfo() {
    }

    public TravelInfo(String flightNumber, String airLine) {
        this.flightNumber = flightNumber;
        this.airLine = airLine;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }
    
    
    
}
