/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vewandcontroller.hasanal2010014;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import modelClass.hasanal2010014.Reservation;
import modelClass.hasanal2010014.Reserved;
import modelClass.hasanal2010014.User;
import modelClass.hasanal2010014.Vehicle;
import user.hasanal2010014.Customer;

/**
 * FXML Controller class
 *
 * @author siam
 */
public class ReservationConfirmedSceneController implements Initializable {

    @FXML
    private MenuItem reservationMenuItemOnClick;
    @FXML
    private MenuItem onlineCheckInMenuItemOnClick;
    @FXML
    private Menu offerMenuOnClick;
    @FXML
    private Menu memberMenuOnClick;
    @FXML
    private Menu locationMenuOnClick;
    @FXML
    private Menu queriseMenuOnClick;
    @FXML
    private Menu printReceiptMenuOnClick;
    @FXML
    private Label dropOffDetailsOutputlabel;
    @FXML
    private Label pickupDetailsOutputlabel;
    @FXML
    private Label driverNameTextField;
    @FXML
    private Label emailTextField;
    @FXML
    private Label phoneTextField;
    @FXML
    private Label ageTextField;
    @FXML
    private Label vehicleClassTextField;
    @FXML
    private Label concessionTextField;
    @FXML
    private Label lessorTextField;
    @FXML
    private Label vlcrfTextField;
    @FXML
    private Label autoRentalTextField;
    @FXML
    private Label totalTextField;
    @FXML
    private Label confermationNumberOutputlabel;
    @FXML
    private Label totalDaysOutputLabel;
    @FXML
    private Label totalDaysPriceOutputLabel;
    
    //*****private field***************
    Reserved reserved;
    
    User user;
    
     Customer customer;
       Vehicle  vehicle=null;
    String confermationNumber;
   
      Reservation  reservation=null;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }    

    
    
    public void setData(String str){
    
     confermationNumber=str;
 
    
    
                   
        
           FileInputStream fs = null;          
           ObjectInputStream ois=null; 
           
            try{
               fs = new  FileInputStream("Reserved.bin");
               
               ois = new ObjectInputStream(fs);
               
               while(true){
               
                    reserved= (Reserved)ois.readObject();

                    if( reserved.getConfermationNumber().equals(confermationNumber)){

                         break;

                    }
               
               }
               
            
            
            }//try End
            catch(Exception e){
            
                System.out.println("Resreved read"+e.toString());
            }
            finally{
               try {
                   ois.close();
               } catch (IOException ex) {
                   Logger.getLogger(CompleteReservationSceneController.class.getName()).log(Level.SEVERE, null, ex);
               }
               }//finally end
        
        
           confermationNumberOutputlabel.setText( reserved.getConfermationNumber());
           
           
        //----------------Reading user.bin to get Customer--Start-----------------
             try{
               fs = new  FileInputStream("User.bin");
               
               ois = new ObjectInputStream(fs);
               
               while(true){
               
               user= (User)ois.readObject();
               
               if( reserved.getCustomerId().equals(user.getId())){
                   
                   System.out.println("Asslamualikum "+user.getFirstName());
               
                    break;
               
               }
               
               }
               
            
            
            }//try End
            catch(Exception e){
            
              System.out.println("User read"+e.toString());
            
            }
            finally{
               try {
                   ois.close();
               } catch (IOException ex) {
                   Logger.getLogger(CompleteReservationSceneController.class.getName()).log(Level.SEVERE, null, ex);
               }
               }//finally end
        //----------------Reading user.bin to get Customer--END-----------------
        
    
        
         //----------------Reading Reservation.bin-------Start----------------------
        
        
         
           try{
               fs = new  FileInputStream("Reservation.bin");
               
               ois = new ObjectInputStream(fs);
               
               while(true){
               
                    reservation= (Reservation)ois.readObject();

                    if( reserved.getConfermationNumber().equals( reservation.getConfermationNumber())){

                         break;

                    } 
               }
            
            }//try End
            catch(Exception e){
            
              System.out.println("Reservation read"+e.toString());
            
            }
            finally{
               try {
                   ois.close();
               } catch (IOException ex) {
                   Logger.getLogger(CompleteReservationSceneController.class.getName()).log(Level.SEVERE, null, ex);
               }
               }//finally end
        //----------------Reading Reservation.bin------End----------------------

        
        
        
                
         //----------------Reading Vehicle.bin-------Start----------------------
        
       
         
           try{
               fs = new  FileInputStream("Vehicle.bin");
               
               ois = new ObjectInputStream(fs);
               
               while(true){
               
                     vehicle= (Vehicle)ois.readObject();

                    if( reserved.getVehicleId().equals(vehicle.getRegistrationInfo().getRegistrationNumber())){

                         break;

                     } 
               }
            
            }//try End
            catch(Exception e){
            
              System.out.println("Reservation read"+e.toString());
            
            }
            finally{
               try {
                   ois.close();
               } catch (IOException ex) {
                   Logger.getLogger(CompleteReservationSceneController.class.getName()).log(Level.SEVERE, null, ex);
               }
               }//finally end
        //----------------Reading Vehicle.bin------End----------------------

        
        
        
        
        
        
        
        
        
        
         pickupDetailsOutputlabel.setText("    "+reservation.getPickupLocation()+
         
                                          "\n\n\n    "+reservation.getPickupDate().getDateTime()
         
         
         );
         dropOffDetailsOutputlabel.setText("    "+reservation.getDropOffLocation()+
         
                                          "\n\n\n    "+reservation.getDropOffDate().getDateTime()
         
         
         );
        
         driverNameTextField.setText(user.getFirstName()+" "+user.getLastName());
         
         emailTextField.setText(user.getEmail());
         
         phoneTextField.setText(user.getPhoneNumber());
         
        customer=(Customer)user;
         
         
         
         ageTextField.setText(customer.getAge());
         
         vehicleClassTextField.setText(vehicle.getClasstype());
         
       
         totalDaysOutputLabel.setText(reservation.getTotaldays()+" Days Price ");
         
        
         totalDaysPriceOutputLabel.setText("$"+reservation.getTotaldaysPrice());
         
         concessionTextField.setText("$"+reservation.getFees().getConcRecoveryFeeSurch());
         
         vlcrfTextField.setText("$"+reservation.getFees().getVlcrf());
         
       
         lessorTextField.setText("$"+reservation.getTax().getLessorTax());
         
         autoRentalTextField.setText("$"+reservation.getTax().getCarRentalTax());
         
         totalTextField.setText("$"+reservation.getTotalPrice());
         
        
    }// method end----------------------------------------------------
    
    
    
    
    @FXML
    private void printButtonOnClick(ActionEvent event) {
        
              try{
           
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
          //  fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){              
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                //PdfWriter pw = new PdfWriter(new FileOutputStream("testPDF.pdf"));
                PdfDocument pdf =  new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                //----------------------------------------------------
                //adding paragrapg to the pdf
                String newline = "\n";
                Paragraph lineSpace = new Paragraph(newline);
                lineSpace.setHeight(8);
                
                String paraText1 
                        = "Your Information                                                             \n"
                        + "-----------------------------------------------------------------------------\n";
                       
         
                 String paraText2 
                        = "Vehicle                                                                      \n"
                        + "-----------------------------------------------------------------------------\n";
                        
                 
                     String paraText3
                        = "Tax And Fees                                                            \n"
                        + "-----------------------------------------------------------------------------\n";
                
                    String paraText4
                        = "Total                                                           \n"
                        + "-----------------------------------------------------------------------------\n";
                        
                     
                Paragraph para1 = new Paragraph(paraText1);
                Paragraph para2 = new Paragraph(paraText2);
                Paragraph para3 = new Paragraph(paraText3);
                Paragraph para4 = new Paragraph(paraText4);
                
                
                
                  float colWidthArr[] = {245f, 170f};
                  
                  
                   Table table1 = new Table(colWidthArr); 
                   
                    table1.addCell(new Cell().add("Driver Name").setBorder(Border.NO_BORDER));
                    table1.addCell(  new Cell().add(user.getFirstName()+" "+user.getSecondName()+" "+user.getLastName()).setBorder(Border.NO_BORDER));
             
                    
                    table1.addCell(new Cell().add(   "Email").setBorder(Border.NO_BORDER));
                    table1.addCell(new Cell().add(user.getEmail()).setBorder(Border.NO_BORDER));
                
                    table1.addCell(new Cell().add("Phone").setBorder(Border.NO_BORDER));
                    table1.addCell(new Cell().add(user.getPhoneNumber()).setBorder(Border.NO_BORDER));
                
                    table1.addCell(new Cell().add("Age").setBorder(Border.NO_BORDER));
                    table1.addCell(new Cell().add(customer.getAge()).setBorder(Border.NO_BORDER));
                
                
             //****************Vehicle Table*************************************************************************   
                    
                    Table table2 = new Table(colWidthArr); 
                    
                
                    table2.addCell(new Cell().add("Vehicle Class").setBorder(Border.NO_BORDER));
                    table2.addCell(new Cell().add(vehicle.getClasstype()).setBorder(Border.NO_BORDER));
                
                    
                    table2.addCell(new Cell().add(reservation.getTotaldays()+" Days Price ").setBorder(Border.NO_BORDER));
                    table2.addCell(new Cell().add(reservation.getTotaldaysPrice()+"").setBorder(Border.NO_BORDER));
               
              //**************************Tax AND FEES TABLE***********************************      
                
                               
                     Table table3 = new Table(colWidthArr); 
                
                    table3.addCell(new Cell().add("LESSOR TAX 2%").setBorder(Border.NO_BORDER));
                    table3.addCell(new Cell().add(reservation.getTax().getLessorTax()+"").setBorder(Border.NO_BORDER));
              
                    table3.addCell(new Cell().add("AUTO RENTAL TAX (12.0%)").setBorder(Border.NO_BORDER));
                    table3.addCell(new Cell().add(reservation.getTax().getCarRentalTax()+"").setBorder(Border.NO_BORDER));
              
                    table3.addCell(new Cell().add("CONC RECOVERY FEE $2/Day").setBorder(Border.NO_BORDER));
                    table3.addCell(new Cell().add(reservation.getFees().getConcRecoveryFeeSurch()+"").setBorder(Border.NO_BORDER));
              
                   
                    table3.addCell(new Cell().add("VLCRF $2/Day").setBorder(Border.NO_BORDER));
                    table3.addCell(new Cell().add(reservation.getFees().getVlcrf()+"").setBorder(Border.NO_BORDER));
                    
                    //********************************Totall Table**********************
                    
                     
                      
                                
                                 
                    Table table4 = new Table(colWidthArr); 
                
                   table4.addCell(new Cell().add("Total due at the counter").setBorder(Border.NO_BORDER));
                   table4.addCell(new Cell().add(reservation.getTotalPrice()+"").setBorder(Border.NO_BORDER));
              
                    
                    
                    
                Text titleText = new Text("Renter Detailes");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();    //OR titleText.setBold();

                PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                PdfFont fontBold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
                Text title = new Text("Thinking in Java (4th Ed)").setFont(fontBold);
                Text author = new Text("Bruce Eckel").setFont(font2);
                author.setFontColor(Color.RED);
                Paragraph bookInfo = new Paragraph().add(title).add(" -- by ").add(author);
                
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(table1);
                doc.add(lineSpace);
                doc.add(para2);
                doc.add(table2);
                doc.add(lineSpace);
                doc.add(para3);
                doc.add(table3);
                doc.add(lineSpace);
                doc.add(para4);
                doc.add(table4);
      
                doc.close();

               Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                
                a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("The PDF is saved successfully.");
                a.showAndWait();    
            }
            else{
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Saving as PDF: cancelled!");
                a.showAndWait();               
            }
        }
        catch(Exception e){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Oops! Exception: " + e.toString()+ " occured.");
            a.showAndWait(); 
            //System.out.println("Something went wrong...");
            //System.out.println(e);
        }                 
        
        
    }

    
    
    
    @FXML
    private void printAndSwitchSceneButtonOnClick(ActionEvent event) {
        
              try{
           
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){              
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                //PdfWriter pw = new PdfWriter(new FileOutputStream("testPDF.pdf"));
                PdfDocument pdf =  new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                //----------------------------------------------------
                //adding paragrapg to the pdf
                String newline = "\n";
                Paragraph lineSpace = new Paragraph(newline);
                lineSpace.setHeight(8);
                
                
                
                String paraText1   = "Your Information                                                             \n"
                        + "-----------------------------------------------------------------------------\n"
                        + "Driver Name                    "+user.getFirstName()+" "+user.getLastName()+"\n"
                        + "Email                          "+user.getEmail()+"                           \n"
                        + "Phone                          "+user.getPhoneNumber()+"                     \n"
                        + "Age                            "+customer.getAge()+"                     \n"
                        
                         ;
               
                      
                
                
                Paragraph para1 = new Paragraph(paraText1);
                
                Text titleText = new Text("This is the TITLE of the pdf");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();    //OR titleText.setBold();

                PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                PdfFont fontBold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
                Text title = new Text("Thinking in Java (4th Ed)").setFont(fontBold);
                Text author = new Text("Bruce Eckel").setFont(font2);
                author.setFontColor(Color.RED);
                Paragraph bookInfo = new Paragraph().add(title).add(" -- by ").add(author);
                
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
             //   doc.add(lineSpace);
               // doc.add(bookInfo);
               // doc.add(lineSpace);
                
                //----------------------------------------------------
                
                //adding a list
                
                /*
                List progLangList = new List();
                progLangList.add("C");
                progLangList.add("C++");
                progLangList.add("Java");
                progLangList.add("Python");
                progLangList.add("C#");          
                doc.add(progLangList);
                doc.add(lineSpace);
                  */
                //----------------------------------------------------
                //adding an image
               Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Do you want to add an Image?");
                Optional<ButtonType> result = a.showAndWait();
                if(result.get() == ButtonType.OK){ 
                    File imageFile = fc.showOpenDialog(null);
                    String imagePath = imageFile.getAbsolutePath();
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image image = new Image(data);  
                    image.setAutoScale(true);
                    
                    doc.add(image);
                    doc.add(lineSpace);
                    a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("The image is added successfully.");
                    a.showAndWait();
                }
                
                
                //----------------------------------------------------
                
                //adding table in pdf
                float colWidthArr[] = {70f, 200f, 100f};
                Table pdfTable = new Table(colWidthArr); 
                
                //adding header row
                Cell cell_00 = new Cell(); 
                cell_00.add("Product ID");
                cell_00.setBackgroundColor(Color.YELLOW);
                pdfTable.addCell(cell_00);
                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Product Name"));
                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Price"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("111"));
                pdfTable.addCell(new Cell().add("Lux Soap"));
                pdfTable.addCell(new Cell().add("34.0"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("222"));
                pdfTable.addCell(new Cell().add("Aarong Yougart"));
                pdfTable.addCell(new Cell().add("75.0"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("333"));
                pdfTable.addCell(new Cell().add("Brown Bread"));
                pdfTable.addCell(new Cell().add("85.0"));

                doc.add(pdfTable);
                
                doc.close();
                
                a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("The PDF is saved successfully.");
                a.showAndWait();    
            }
            else{
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Saving as PDF: cancelled!");
                a.showAndWait();               
            }
        }
        catch(Exception e){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Oops! Exception: " + e.toString()+ " occured.");
            a.showAndWait(); 
            //System.out.println("Something went wrong...");
            //System.out.println(e);
        }                 
        
        
        
    }
    
}
