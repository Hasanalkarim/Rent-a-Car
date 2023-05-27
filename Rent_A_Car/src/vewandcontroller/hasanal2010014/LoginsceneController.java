/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

//import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import modelClass.hasanal2010014.MyObjectOutputStream;
import modelClass.hasanal2010014.User;
import user.hasanal2010014.RentalManager;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class LoginsceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwardTextField;
    @FXML
    private Label statusLabel;
    @FXML
    private AnchorPane ancorpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
//int id, String firstName, String secondName, String lastName, String email, int phoneNumber, String password
   
  /*
  
 
     LocalDate ld=  LocalDate.now();
     
        RentalManager r1 = new RentalManager(
        
                    "RentalManager",
                   "Hasanal",
                   "karim",  
                   "Rahman",
                  "hasana@gmail.com",
                "01677878755",
                "RentalManager",
                ld
                
                
             
        
           );

        
           FileOutputStream fos=null;
        
         ObjectOutputStream oos = null;
        
         File f =null;
      
        try{
              f = new File("User.bin");
             if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new MyObjectOutputStream(fos);  
              }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos); 
   
            }
        
            
               oos.writeObject(r1);
             
        }
        catch (IOException ex) {
            Logger.getLogger(AddNewVehicle2SceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(AddNewVehicle2SceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         
       
           
       */
  
  //*****************************************************************************
      

  
  
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event)  {
        
        
      User user=getUser();
     
     if(user!=null){
     
         String fxml= getFxml(user.getId());
     
         loadScene(fxml);
     }
     else{
     
         statusLabel.setText("Wrong id or passwoard try again");  
     }
      
    }
    
    
    
    
    
    
    private void loadScene(String fxml){
        
       try {
            
              
            //**************************************SceneSwitching****************************************
            FXMLLoader l1= new FXMLLoader();
            
            l1.setLocation( getClass().getResource(fxml)); 
            
            Parent manageroot = l1.load();
            
            Scene s1 = new Scene(manageroot);
            
            
            Stage orgStage = (Stage)ancorpane.getScene().getWindow();
            
            orgStage.setScene(s1);
            
            orgStage.show();
            //**************************************SceneSwitching**************************************** 
        } catch (Exception ex) {
            Logger.getLogger(LoginsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         }
    
    
    private User getUser(){
    
      User user=null;
      
      
               
           FileInputStream fs = null;          
           ObjectInputStream ois=null; 
           
            
            try{
               fs = new  FileInputStream("User.bin");
               
               ois = new ObjectInputStream(fs);
               
               while(true){
                   
                   
                  user = (User)ois.readObject(); // typecasting working just fine
                  
                  
                  if(user!=null){
                      System.out.println("user is Not NULL");
                  }
                  else{
                     System.out.println("user NULL");
                  }
                 
                 //   System.out.println("pass="+user.getPassword());
                  
                  if(user.getId().equals(idTextField.getText()) && user.getPassword().equals(passwardTextField.getText())){
                  break;
                  }
                  
               
               }
               
            
            
            }//try End
            catch(Exception e){
                  statusLabel.setText("Wrong id or passwoard try again"); 
                  
                  System.out.println(e.toString());
                  
                  user=null;
            }
            finally{
               try {
                   ois.close();
               } catch (IOException ex) {
                   
               }
               }//finally end
        
  
    
    
      return user;
    }//getUser End
    
    
    
    
    
    
    private String getFxml(String fx){
    
     
        if(fx.equals("RentalManager")){
        
         return fx="RentalManagerDashboardScene.fxml";
        
        }
       return fx;
    
    }

    @FXML
    private void joinAsGuestButtonOnClick(ActionEvent event) {
        
        loadScene("Dashboardscene.fxml");
        
    }

    @FXML
    private void signUpButtonOnClick(ActionEvent event) {
    }
    
}
