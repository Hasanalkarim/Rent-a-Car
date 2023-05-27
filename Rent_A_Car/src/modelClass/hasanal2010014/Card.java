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
public class Card implements Serializable {
    
    
    private String cardNumber;
            
    private String securityCode;
    
            
    private LocalDate expiretionDate;

    public Card() {
    }

    public Card(String cardNumber, String securityCode, LocalDate expiretionDate) {
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expiretionDate = expiretionDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public LocalDate getExpiretionDate() {
        return expiretionDate;
    }

    public void setExpiretionDate(LocalDate expiretionDate) {
        this.expiretionDate = expiretionDate;
    }
    
    
    
    
}
