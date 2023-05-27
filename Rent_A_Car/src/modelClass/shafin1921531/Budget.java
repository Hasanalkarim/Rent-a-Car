/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass.shafin1921531;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Budget implements Serializable {
   private float balance;
   public float setAmount;

    public Budget(float balance, float setAmount) {
        this.balance = balance;
        this.setAmount = setAmount;
    }
     
}
