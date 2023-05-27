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
public class Diagnosis implements Serializable {
    private int diagnosisID;
    private String diagnosisName;
    private String diagnosisType;

    public Diagnosis(int diagnosisID, String diagnosisName, String diagnosisType) {
        this.diagnosisID = diagnosisID;
        this.diagnosisName = diagnosisName;
        this.diagnosisType = diagnosisType;
    }
 
    public void addDiagnosis(){
    }
    
    public void editDiagnosis(){
    }
    
    public void deleteDiagnosis(){
    }

}
