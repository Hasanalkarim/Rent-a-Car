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
public class Order implements Serializable {
 private String itemType;
 private int itemQuantity;
 private LocalDate dateOfOrder;

    public Order(String itemType, int itemQuantity, LocalDate dateOfOrder) {
        this.itemType = itemType;
        this.itemQuantity = itemQuantity;
        this.dateOfOrder = dateOfOrder;
    }

    public void printRawList(){
    }

}
