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
public class Body implements Serializable{
    
     String colour;
 
     final int  seats;
    
    final int doors;
   
    
    

    
      public Body() {
        this.colour = "";
        this.seats = 0;
        this.doors = 0;
  
    }

    public Body(String colour, int seats, int doors) {
        this.colour = colour;
        this.seats = seats;
        this.doors = doors;
  
    }

    public String getColour() {
        return colour;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

   

    @Override
    public String toString() {
        return "Body{" + "colour=" + colour + ", seats=" + seats + ", doors=" + doors + '}';
    }

   
    
    
    
    
}
