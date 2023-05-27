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
public class CV implements Serializable{
    private String ApplicantName;
    private LocalDate dob;
    private double cgpa;
    private String EducationInstitute;

    public CV(String ApplicantName, LocalDate dob, double cgpa, String EducationInstitute) {
        this.ApplicantName = ApplicantName;
        this.dob = dob;
        this.cgpa = cgpa;
        this.EducationInstitute = EducationInstitute;
    }
    
}
