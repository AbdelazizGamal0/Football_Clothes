package javafxapplication13;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Login extends Application implements EventHandler<ActionEvent> {
    Stage s1;
    private FirstPage FirstPage;
    @Override
    public void start(Stage primaryStage) {
        
        
  Group root = new Group();
 //Creat scene
            Scene scene = new Scene(root, 1240, 740, Color.DARKTURQUOISE);
            primaryStage.setTitle("Login");
// //insert background image           
            Pane pane=new Pane();
            ImageView image=new ImageView(new Image(getClass().getResourceAsStream ("/Images/mmm.jpg")));
            pane.getChildren().add(image);
            root.getChildren().add(pane);         
//create labels and buttons            
            Label login=new Label("Login");
            login.setFont(Font.font("Tahoma", FontWeight.BOLD, 28));
            login.setLayoutX(1000);
            login.setLayoutY(300);
            login.setTextFill(Color.WHITE);
            root.getChildren().add(login);
            
            Label l = new Label();
            l.setLayoutX(900);
            l.setLayoutY(350);
            l.setText("Username");
            l.setTextFill(Color.WHITE);
            root.getChildren().add(l);
            
            TextField text = new TextField();
            text.setLayoutX(1000);
            text.setLayoutY(350);
            root.getChildren().add(text);
            
            Label l2 = new Label();
            l2.setLayoutX(900);
            l2.setLayoutY(390);
            l2.setText("Password");
            l2.setTextFill(Color.WHITE);
            root.getChildren().add(l2);
            
            PasswordField pass=new PasswordField();
            pass.setLayoutX(1000);
            pass.setLayoutY(390);
            root.getChildren().add(pass);
            
            Button btn = new Button();
            btn.setLayoutX(1050);
            btn.setLayoutY(430);
            btn.setText("Next");
            root.getChildren().add(btn);
            
            Button tn = new Button();
            tn.setLayoutX(1100);
            tn.setLayoutY(430);
            tn.setText("Enter");
            root.getChildren().add(tn);
            
             btn.setDisable(true);
             
             tn.setOnAction((ActionEvent e)->{
             String Pass=pass.getText();
             String Name=text.getText();
                if(Pass.isEmpty()||Name.isEmpty()){    
                 btn.setDisable(true);
                  JOptionPane.showMessageDialog(null,"Please enter your username and password ");    
                }
                else if(Pass.matches(Name)){   
                    
                btn.setDisable(false);
                JOptionPane.showMessageDialog(null,"Welcome Mr."+Name); 
                  
                }
                else{
                    
               btn.setDisable(true);
                
                JOptionPane.showMessageDialog(null,"The password must be the same as the user name ");  
                }
                
                ;});
            //To open next scene
            btn.setOnAction((EventHandler<ActionEvent>) this);
            
            Font f = new Font("century gothic", 14.5);
            text.setFont(f);
            l.setFont(f);
            l2.setFont(f);
            
            Label l1 = new Label();
            l1.setLayoutX(1100);
            l1.setLayoutY(470);
            root.getChildren().add(l1);
            
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
            s1=primaryStage;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        launch(args);
      

    }


    @Override
    public void handle(ActionEvent event) {
        FirstPage  =new FirstPage();
        //when back button is pressed
        s1.close();
        try{
      FirstPage.start(new Stage());
        }catch(Exception ex)
        {
        }
    }
//    
    
}
