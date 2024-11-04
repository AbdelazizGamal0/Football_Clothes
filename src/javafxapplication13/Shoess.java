package javafxapplication13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.ChoiceBox;
import javax.swing.JOptionPane;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.scene.layout.Pane;


public class Shoess extends Application implements EventHandler<ActionEvent> {
    Stage s4;
    @Override
    public void start(Stage Stage) {
       
        int cart=0; 
        
        Label name=new Label();  Label Size=new Label(); Label color=new Label(); Label price=new Label(); 
        Group root = new Group();
         Pane pane=new Pane();
        
        ImageView image=new ImageView(new Image(getClass().getResourceAsStream ("/Images/barce.jpg")));
            pane.getChildren().add(image);
            root.getChildren().add(pane); 
        
        
        //Creat scene
        Scene scene = new Scene(root, 1460, 740, Color.DARKTURQUOISE);
       Stage.setScene(scene);
        
       Stage.setTitle("Shoes");
        Stage.show();
        Stage.setResizable(false);
        
        //create labels and buttons 
         Label shoes=new Label("shoes");
         shoes.setFont(Font.font("Tahoma", FontWeight.BOLD, 60));
           shoes.setLayoutX(620);
           shoes.setLayoutY(20);
            shoes.setTextFill(Color.WHITE);
            
          //  shoes.setAlignment(Pos.TOP_LEFT);
            root.getChildren().add(shoes);
            
      BorderPane bb=new BorderPane();
            root.getChildren().add(bb);       
      
          HBox h2=new HBox(50);
            bb.setCenter(h2);
            bb.setLayoutX(15);
            bb.setLayoutY(150);
            
      
      //shoes Sotrge sizes    
ChoiceBox c1=new ChoiceBox();      
     root.getChildren().add(c1);
 
ChoiceBox c2=new ChoiceBox();
root.getChildren().add(c2);

ChoiceBox c3=new ChoiceBox();
root.getChildren().add(c3);
ChoiceBox c4=new ChoiceBox();
root.getChildren().add(c4);
ChoiceBox c5=new ChoiceBox();
root.getChildren().add(c5); 

//shoes Colors  
ChoiceBox cc1=new ChoiceBox();
root.getChildren().add(cc1);
ChoiceBox cc2=new ChoiceBox();
root.getChildren().add(cc2);
ChoiceBox cc3=new ChoiceBox();
root.getChildren().add(cc3);
ChoiceBox cc4=new ChoiceBox();
root.getChildren().add(cc4);
ChoiceBox cc5=new ChoiceBox();
root.getChildren().add(cc5);

 //Add buttons to the group
            Button bn1=new Button();
            bn1.setMinSize(200,350);
            h2.getChildren().add(bn1);
            
            Label btn1=new Label();
            btn1.setMinSize(250,50);
            btn1.setLayoutX(1120);
            btn1.setLayoutY(540);
            btn1.setTextFill(Color.WHITE);
            root.getChildren().add(btn1);
            
            c1.setLayoutX(1130);
            c1.setLayoutY(600);
            
            cc1.setLayoutX(1190);
            cc1.setLayoutY(600);
            
            Label l1=new Label();
            l1.setMinSize(250,50);
            l1.setLayoutX(1120);
            l1.setLayoutY(505);
            l1.setTextFill(Color.WHITE);
            root.getChildren().add(l1);
              
            Button bn2=new Button();
            bn2.setMinSize(200,350);
            h2.getChildren().add(bn2);
         
            
            Label btn2=new Label();
            btn2.setMinSize(250,50);
            btn2.setLayoutX(880);
            btn2.setLayoutY(540);
            btn2.setTextFill(Color.WHITE);
            root.getChildren().add(btn2);
            
            Label l2=new Label();
            l2.setMinSize(250,50);
            l2.setLayoutX(880);
            l2.setLayoutY(505);
            l2.setTextFill(Color.WHITE);
            root.getChildren().add(l2);
            
            
            Button bn3=new Button();
            bn3.setMinSize(200,350);
            h2.getChildren().add(bn3);
            
            c2.setLayoutX(860);
            c2.setLayoutY(600);
            
            cc2.setLayoutX(920);
            cc2.setLayoutY(600);
            
            Label btn3=new Label();
            btn3.setMinSize(250,50);
            btn3.setLayoutX(610);
            btn3.setLayoutY(540);
            btn3.setTextFill(Color.WHITE);
            root.getChildren().add(btn3);
            
            Label l3=new Label();
            l3.setMinSize(250,50);
            l3.setLayoutX(610);
            l3.setLayoutY(505);
            l3.setTextFill(Color.WHITE);
            root.getChildren().add(l3);
            
            
            Button bn4=new Button();
            bn4.setMinSize(200,350);
            h2.getChildren().add(bn4);
            
            c3.setLayoutX(590);
            c3.setLayoutY(600);
            
            cc3.setLayoutX(650);
            cc3.setLayoutY(600);
            
            Label btn4=new Label();
            btn4.setMinSize(250,50);
            btn4.setLayoutX(320);
            btn4.setLayoutY(540);
            btn4.setTextFill(Color.WHITE);
            root.getChildren().add(btn4);
            
            Label l4=new Label();
            l4.setMinSize(250,50);
            l4.setLayoutX(320);
            l4.setLayoutY(505);
            l4.setTextFill(Color.WHITE);
            root.getChildren().add(l4);
            
            Button bn5=new Button();
            bn5.setMinSize(200,350);
            h2.getChildren().add(bn5);
          
            c4.setLayoutX(320);
            c4.setLayoutY(600);
            
            cc4.setLayoutX(380);
            cc4.setLayoutY(600);
            
            Label btn5=new Label();
            btn5.setMinSize(250,50);
            btn5.setLayoutX(30);
            btn5.setLayoutY(540);
            btn5.setTextFill(Color.WHITE);
            root.getChildren().add(btn5);
            
            Label l5=new Label();
            l5.setMinSize(250,50);
            l5.setLayoutX(30);
            l5.setLayoutY(505);
            l5.setTextFill(Color.WHITE);
            root.getChildren().add(l5);
            
            c5.setLayoutX(50);
            c5.setLayoutY(600);
            
            cc5.setLayoutX(110);
            cc5.setLayoutY(600);
            //create cart button
            Button cartButton=new Button("Go to Cart");
            cartButton.setLayoutX(1250);
            cartButton.setLayoutY(50);
            root.getChildren().add(cartButton);

            //The bill            
            cartButton.setOnAction((ActionEvent ex)->{
            Hyperlink h1=new Hyperlink("Show Bill");
            h1.setLayoutX(1050);
            h1.setLayoutY(38);
            h1.setFont(Font.font(30));
            root.getChildren().add(h1);
            //when Show Bill is pressed
           
            h1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //The contents of the bill
                JOptionPane.showMessageDialog(null,"Name: "+ name.getText()+"\n"+"Size: "+Size.getText()+"\n"+"Color: "+color.getText()+"\n"+"Price: "+price.getText()+"\n"
                 +"_________"+"\n"
                 +"Telephone:00201000580504 "+"\n"
                 +"Email: FootballClothes@Gmail.com"+"\n" 
                 +"_________"+"\n"
                );     
            }
        });
                    ;});
            
            
            
            
        //create and add Bill label       
        Label bill=new Label();
        bill.setText("Cart:"+cart );
        root.getChildren().add(bill);
        bill.setLayoutY(50);
        bill.setLayoutX(50);
        bill.setFont(Font.font(30));
        bill.setTextFill(Color.WHITE);
        
        
        
        
            
      //shoes images          
ImageView image1=new ImageView(new Image(getClass().getResourceAsStream ("/Shoes/Image1.jpg")));
ImageView image2=new ImageView(new Image(getClass().getResourceAsStream ("/Shoes/Image2.jpg")));
ImageView image3=new ImageView(new Image(getClass().getResourceAsStream ("/Shoes/Image3.jpg")));
ImageView image4=new ImageView(new Image(getClass().getResourceAsStream ("/Shoes/Image4.jpg")));
ImageView image5=new ImageView(new Image(getClass().getResourceAsStream ("/Shoes/Image5.jpg")));      
          


              bn1.setGraphic(image1);
               bn2.setGraphic(image2);
               bn3.setGraphic(image3);
              bn4.setGraphic(image4);
               bn5.setGraphic( image5);
               
                c1.getItems().clear();
                c2.getItems().clear();
                c3.getItems().clear();
                c4.getItems().clear();
                c5.getItems().clear();
                
                cc1.getItems().clear();
                cc2.getItems().clear();
                cc3.getItems().clear();
                cc4.getItems().clear();
                cc5.getItems().clear();
                
                 cc1.setValue("Black");
                cc2.setValue("Green");
                cc3.setValue("White");
                cc4.setValue("Black");
                cc5.setValue("Blue");
                
                c1.setValue("41");
               c2.setValue("41");
                c3.setValue("41");
                c4.setValue("41");
                c5.setValue("41");
                
                
            //set shoes names and prices 
                
                                      
        int AdidasM17=1150;          
        int AdidasMax97=900;          
        int AdidasP6=700;          
        int NikeAirMax=1200;      
        int PumaRSX=830;
                
                
             btn5.setText("Price:"+Integer.toString(AdidasM17)+" EG");
               btn5.setFont(Font.font(24));
               l5.setText("AdidasM17");
               l5.setFont(Font.font(24));
               c5.getItems().addAll("41","42","43","44","45");
               cc5.getItems().addAll("Blue");  
            
            btn4.setText("Price:"+Integer.toString(AdidasMax97)+" EG");
               btn4.setFont(Font.font(24));
               l4.setText("AdidasMax97");
               l4.setFont(Font.font(24));
               c4.getItems().addAll("41","42","43","44","45");
              cc4.getItems().addAll("Black");
               
               btn3.setText("Price:"+Integer.toString(AdidasP6)+" EG");
               btn3.setFont(Font.font(24));
               l3.setText("AdidasP6");
               l3.setFont(Font.font(24));
               c3.getItems().addAll("41","42","43","44","45");
              cc3.getItems().addAll("White");
               
               btn2.setText("Price:"+Integer.toString(NikeAirMax)+" EG");
               btn2.setFont(Font.font(24));
               l2.setText("NikeAirMax ");
               l2.setFont(Font.font(24));
               c2.getItems().addAll("41","42","43","44","45");
               cc2.getItems().addAll("Green");
               
               btn1.setText("Price:"+Integer.toString(PumaRSX)+" EG");
               btn1.setFont(Font.font(24));
               l1.setText("PumaRSX");
               l1.setFont(Font.font(24));
               c1.getItems().addAll("41","42","43","44","45"); 
              cc1.getItems().addAll("Black");
               
             //Add to cart Buttons
        Button p1=new Button("Add to Cart");
        p1.setMinSize(180,50);
        p1.setLayoutX(20);
        p1.setLayoutY(640);
        p1.setFont(Font.font(26));
        
        
        Button p2=new Button("Add to Cart");
        p2.setMinSize(180,50);
        p2.setLayoutX(300);
        p2.setLayoutY(640);
        p2.setFont(Font.font(26));
        
        
        Button p3=new Button("Add to Cart");
        p3.setMinSize(180,50);
        p3.setLayoutX(580);
        p3.setLayoutY(640);
        p3.setFont(Font.font(26));
        
        
        Button p4=new Button("Add to Cart");
        p4.setMinSize(180,50);
        p4.setLayoutX(860);
        p4.setLayoutY(640);
        p4.setFont(Font.font(26));
        
        
        Button p5=new Button("Add to Cart");
        p5.setMinSize(180,50);
        p5.setLayoutX(1120);
        p5.setLayoutY(640);
        p5.setFont(Font.font(26));
        
        
        root.getChildren().addAll(p1,p2,p3,p4,p5);
        
         
       c5.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="42"){
                       Size.setText("42");
                       } else if (newValue=="43"){ 
                   Size.setText("43");}
                       else if (newValue=="44"){ 
                   Size.setText("44");}
                       else if (newValue=="45"){ 
                   Size.setText("45");}
                   else  
                       { Size.setText("41");
                       
                       }};});
       
         p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+AdidasM17)+" EG");price.setText("1150");name.setText("AdidasXplorer");color.setText
                 ("Blue");Size.setText( (String) c5.getValue());});
         
         
         
         c4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="42"){
                       Size.setText("42");
                       } else if (newValue=="43"){ 
                   Size.setText("43");}
                       else if (newValue=="44"){ 
                   Size.setText("44");}
                       else if (newValue=="45"){ 
                   Size.setText("45");}
                   else  
                       { Size.setText("41");
                       
                       }};});
       
         p2.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+AdidasMax97)+" EG");price.setText("900");name.setText("AdidasMax97");color.setText
                 ("Black");Size.setText( (String) c4.getValue());});
        
        
      c3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="42"){
                       Size.setText("42");
                       } else if (newValue=="43"){ 
                   Size.setText("43");}
                       else if (newValue=="44"){ 
                   Size.setText("44");}
                       else if (newValue=="45"){ 
                   Size.setText("45");}
                   else  
                       { Size.setText("41");
                       
                       }};});
       
         p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+AdidasP6)+" EG");price.setText("700");name.setText("AdidasP6");color.setText
                 ("White");Size.setText( (String) c3.getValue());});
               
               
        c2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="42"){
                       Size.setText("42");
                       } else if (newValue=="43"){ 
                   Size.setText("43");}
                       else if (newValue=="44"){ 
                   Size.setText("44");}
                       else if (newValue=="45"){ 
                   Size.setText("45");}
                   else  
                       { Size.setText("41");
                       
                       }};});
       
         p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+NikeAirMax)+" EG");price.setText("1200");name.setText("NikeAirMax");color.setText
                 ("Green");Size.setText( (String) c2.getValue());});       
               
   
         
         
         c1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="42"){
                       Size.setText("42");
                       } else if (newValue=="43"){ 
                   Size.setText("43");}
                       else if (newValue=="44"){ 
                   Size.setText("44");}
                       else if (newValue=="45"){ 
                   Size.setText("45");}
                   else  
                       { Size.setText("41");
                       
                       }};});
       
         p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+PumaRSX)+" EG");price.setText("1200");name.setText("PumaRSX");color.setText
                 ("Black");Size.setText( (String) c5.getValue());});  
         
         
         
         
         
            //create and add Back button
            Button bt=new Button("Back");
            bt.setAlignment(Pos.CENTER);
            bt.setStyle(STYLESHEET_MODENA);
            root.getChildren().add(bt);
            bt.setOnAction(this);
               
         
            bt.setOnAction((ActionEvent e)->{
           FirstPage s=new FirstPage();
            s4.close();
           try{
          s.start(new Stage());
          }catch(Exception ex)
           {}
                    ;});
            
            
            Stage.setScene(scene);
            Stage.show(); 
            s4=Stage;
            
    }
//
//    @Override
//    public void handle(ActionEvent event) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//               
//            
//            
//    }

 @Override
    public void handle(ActionEvent event) {
        FirstPage page=new FirstPage();
        //when back button is pressed
        s4.close();
        try{
         page.start(new Stage());
        }catch(Exception e)
        {
        }
        
    }}