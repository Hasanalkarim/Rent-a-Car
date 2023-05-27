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
public class User implements Serializable {
     
    private static final long serialVersionUID = 6529685098267757690L;
     
    String id;
    
    String firstName;
    
    String secondName;
     
    String lastName;
    
    String email;
    
    String phoneNumber;
   
    String password;
   
    LocalDate dateofBirth;

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    
    public User() {
    }
    
    
    
    public User(String id, String firstName, String secondName, String lastName, String email, String phoneNumber, String password, LocalDate dateofBirth) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.dateofBirth = dateofBirth;
    }

    
    
    
    public User(String id, String firstName, String secondName, String lastName, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
      
    }


    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password=" + password + '}';
    }

   
     
    
    
    
    
    
}
