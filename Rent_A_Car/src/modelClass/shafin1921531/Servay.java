/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass.shafin1921531;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Servay implements Serializable {
    private String counsilTimes;
    private LocalDate dateOfAppoinment;

    public Servay(String counsilTimes, LocalDate dateOfAppoinment) {
        this.counsilTimes = counsilTimes;
        this.dateOfAppoinment = dateOfAppoinment;
    }
    
    public void sendApproval(){
    }

}
