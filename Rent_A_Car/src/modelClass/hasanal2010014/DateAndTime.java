/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelClass.hasanal2010014;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author siam
 */
public class DateAndTime implements Serializable{

    
       private LocalDateTime date;
       
       private int day;
       
       private int month;
         
       private int year;
      
       private int hours;
       
       private int miniute;
     
       private  String aa;
       
       

    public DateAndTime() {
    }

       
       

    public DateAndTime(int day, int month, int year, int hours, int miniute, String aa) {
        
        this.date = date;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hours = hours;
        this.miniute = miniute;
        this.aa = aa;
        
 
          if(aa.equals("PM")){//for PM
               
               if(hours==12){
                 hours=12;
              }
               else{
                  hours=hours+12;
               }     
           
           
            date = LocalDateTime.of(year, month, day, hours, miniute);
         }
          else{// for AM
              
              if(hours==12){
                 hours=00;
              }
          
             date = LocalDateTime.of(year, month, day, hours, miniute);
          }
        
        
      
       
    }
  
  
     
       
    public static void  showTime( int hours, int miniute,String aa) {
        
        
       
        
        
          if(aa.equals("PM")){
          
              if(hours==12){
                 hours=12;
              }
               else{
                  hours=hours+12;
               }     
           
           
              System.out.println("Time is"+hours+":"+miniute);
         }
          else{
              
               if(hours==12){
                 hours=00;
              }
          
              System.out.println("Time is"+hours+":"+miniute);
          }
        
    
    }
  
    
      public String getDateTimeCode(){
    
            DateTimeFormatter dateTimeStyle = DateTimeFormatter.ofPattern("ddMMYYYYhm");
       
       
         return dateTimeStyle.format(date);
       
    
    }
    
    
    public String getTime(){
    
       
         
         
        
           
      DateTimeFormatter time = DateTimeFormatter.ofPattern("h:m a");
      
      
      return time.format(date);
    
    }
    
    
     public String getDate(){
    
     DateTimeFormatter dateStyle = DateTimeFormatter.ofPattern("dd/MM/YYYY");
       
       
      return dateStyle.format(date);
    
    }
     
     public String getDateTime(){
    
     DateTimeFormatter dateTimeStyle = DateTimeFormatter.ofPattern("dd/MM/YYYY h:m a");
       
       
      return dateTimeStyle.format(date);
    
    }
     
     
   public int compare(DateAndTime daate){
     
    return  date.compareTo(daate.date);
      
   }

     
      
   public int getAge(){
    
   
      return  LocalDate.now().compareTo(date.toLocalDate());
   }
   
   
    
}
