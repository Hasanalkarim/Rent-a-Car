/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package mainpkg;

import com.itextpdf.kernel.pdf.PdfWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *s
 * @author siam
 */
public class Rent_A_Car extends Application {
    
    @Override                                                         
    public void start(Stage stage) throws Exception {
        
        // 
        
        //   taxfee.fxml
        Parent root = FXMLLoader.load(getClass().getResource("/vewandcontroller/hasanal2010014/loginscene.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
       
        launch(args);
    }
    
}
