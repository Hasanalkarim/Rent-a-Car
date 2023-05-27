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
public class Review implements Serializable {
    
    private String reviewerID;
    private String itemtToReview;
    private int reviewStars;
    private String comment;
    private LocalDate reviewDate;

    public Review(String reviewerID, String itemtToReview, int reviewStars, String comment, LocalDate reviewDate) {
        this.reviewerID = reviewerID;
        this.itemtToReview = itemtToReview;
        this.reviewStars = reviewStars;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }
    
}
