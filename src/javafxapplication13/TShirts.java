package javafxapplication13;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_MODENA;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class TShirts extends Application implements EventHandler<ActionEvent> {
Stage s3;
    @Override
    public void start(Stage stage) throws Exception {
        //Real T_Shirts Prices      //Barcelona T_Shirts Prices    //juventus T_Shirts Prices  //Bayran T_Shirts Prices //Parsi T_Shirts Prices
        int priceRealH=1000;       int priceBarcH=1200;           int pricejuventusH=900;   int priceBayranH=700;   int priceParsiH=800;
        int priceRealA=1000;       int priceBarcA=1200;           int pricejuventusA=900;  int priceBayranA=700;   int priceParisA=800;
        //Liver T_Shirts Prices      //Man T_Shirts Prices         //Inter T_Shirts Prices     //Zamalak T_Shirts Prices //Ahly T_Shirts Prices
        int priceLivH=950;          int priceManH=850;         int priceInterH=600;       int priceZamalkH=500;    int priceAhlyH=150;
        int priceLivA=950;          int priceManA=850;         int priceInterA=600;       int priceZamalkA=500;    int priceAhlyA=150;
      
        int cart=0; 
        
        Label name=new Label();  Label Size=new Label(); Label price=new Label(); 
        Group root = new Group();
            Pane pane=new Pane();
            Pane pane1=new Pane();
            pane1.getChildren().addAll(name,Size,price);
            //import BackGround image
             ImageView image=new ImageView(new Image(getClass().getResourceAsStream ("/Images/sss1.jpg")));
            pane.getChildren().add(image);
            root.getChildren().add(pane); 
            //create scene
            Scene scene = new Scene(root, 1240, 800, Color.DARKTURQUOISE);
            stage.setTitle("T-Shirts");
            
            BorderPane bb=new BorderPane();
            root.getChildren().add(bb);
            
            BorderPane bb1=new BorderPane();
            root.getChildren().add(bb1);
            
//            HBox h3=new HBox(100);
//            bb1.setBottom(h3);
//            bb1.setLayoutX(15);
//            bb1.setLayoutY(0);
            
            ToggleGroup tg=new ToggleGroup();
            
            HBox h=new HBox();
            bb.setTop(h);
            bb.setLayoutX(250);
  
            HBox h2=new HBox(50);
            bb1.setCenter(h2);
            bb1.setLayoutX(15);
            bb1.setLayoutY(150);
            h2.setVisible(false);
//T-Shirts sizes    
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


            //Page1 T-Shirts
            ToggleButton b1=new ToggleButton("Page1T-Shirts");
            h.getChildren().add(b1);
            b1.setMinSize(250,100);
            b1.setFont(Font.font(30));
            //Page2-Shirts Button
            ToggleButton b2=new ToggleButton("Page2T-Shirts");
            h.getChildren().add(b2);
            b2.setMinSize(250,100);
            b2.setFont(Font.font(30));
            
            //Add buttons to the group
            tg.getToggles().addAll(b1,b2);
            h.setAlignment(Pos.TOP_RIGHT);
            //create and add Labels and Button to the scene
            
            Button bn1=new Button();
            bn1.setMinSize(200,350);
            h2.getChildren().add(bn1);
            
            Label btn1=new Label();
            btn1.setMinSize(250,50);
            btn1.setLayoutX(1080);
            btn1.setLayoutY(550);
            btn1.setTextFill(Color.WHITE);
            root.getChildren().add(btn1);
            
            c1.setLayoutX(1080);
            c1.setLayoutY(600);
            
            Label l1=new Label();
            l1.setMinSize(250,50);
            l1.setLayoutX(1080);
            l1.setLayoutY(500);
            l1.setTextFill(Color.WHITE);
            root.getChildren().add(l1);
              
            Button bn2=new Button();
            bn2.setMinSize(200,350);
            h2.getChildren().add(bn2);
         
            
            Label btn2=new Label();
            btn2.setMinSize(250,50);
            btn2.setLayoutX(800);
            btn2.setLayoutY(550);
            btn2.setTextFill(Color.WHITE);
            root.getChildren().add(btn2);
            
            Label l2=new Label();
            l2.setMinSize(250,50);
            l2.setLayoutX(800);
            l2.setLayoutY(500);
            l2.setTextFill(Color.WHITE);
            root.getChildren().add(l2);
            
            
            Button bn3=new Button();
            bn3.setMinSize(200,350);
            h2.getChildren().add(bn3);
            
            c2.setLayoutX(800);
            c2.setLayoutY(600);
            
            Label btn3=new Label ();
            btn3.setMinSize(250,50);
            btn3.setLayoutX(580);
            btn3.setLayoutY(550);
            btn3.setTextFill(Color.WHITE);
            root.getChildren().add(btn3);
            
            Label l3=new Label();
            l3.setMinSize(250,50);
            l3.setLayoutX(580);
            l3.setLayoutY(500);
            l3.setTextFill(Color.WHITE);
            root.getChildren().add(l3);
            
            Button bn4=new Button();
            bn4.setMinSize(200,350);
            h2.getChildren().add(bn4);
            
            c3.setLayoutX(580);
            c3.setLayoutY(600);
            
            Label btn4=new Label();
            btn4.setMinSize(250,50);
            btn4.setLayoutX(340);
            btn4.setLayoutY(550);
            btn4.setTextFill(Color.WHITE);
            root.getChildren().add(btn4);
            
            Label l4=new Label();
            l4.setMinSize(250,50);
            l4.setLayoutX(340);
            l4.setLayoutY(500);
            l4.setTextFill(Color.WHITE);
            root.getChildren().add(l4);
            
            Button bn5=new Button();
            bn5.setMinSize(200,350);
            h2.getChildren().add(bn5);
            
            c4.setLayoutX(340);
            c4.setLayoutY(600);
            
            Label btn5=new Label();
            btn5.setMinSize(250,50);
            btn5.setLayoutX(60);
            btn5.setLayoutY(550);
            btn5.setTextFill(Color.WHITE);
            root.getChildren().add(btn5);
            
            Label l5=new Label();
            l5.setMinSize(250,50);
            l5.setLayoutX(60);
            l5.setLayoutY(500);
            l5.setTextFill(Color.WHITE);
            root.getChildren().add(l5);
            
            c5.setLayoutX(60);
            c5.setLayoutY(600);   
               //create cart button
            Button cartButton=new Button("Go to Cart");
            cartButton.setLayoutX(1100);
            cartButton.setLayoutY(50);
            root.getChildren().add(cartButton);

            //The bill            
            cartButton.setOnAction((ActionEvent ex)->{
            Hyperlink h1=new Hyperlink("Show Bill");
            h1.setLayoutX(850);
            h1.setLayoutY(38);
            h1.setFont(Font.font(30));
            root.getChildren().add(h1);
            //when Show Bill is pressed
            h1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //The contents of the bill
                JOptionPane.showMessageDialog(null,"Name: "+ name.getText()+"\n"+"Size: "+Size.getText()+"\n"+"Price: "+price.getText()+"\n"
                 +"_________________________"+"\n"
                 +"Telephone:00201000580504 "+"\n"
                 +"Email: FootballClothes@Gmail.com"+"\n" 
                 +"_________________________"+"\n"
                        
                );     
            }
        });
                    ;});
            
            
//            //To invisible labels and buttons
               l1.setVisible(false);
               l2.setVisible(false);
               l3.setVisible(false);
               l4.setVisible(false);
               l5.setVisible(false);
            
               btn1.setVisible(false);
               btn2.setVisible(false);
               btn3.setVisible(false);
               btn4.setVisible(false);
               btn5.setVisible(false);
//               
               c1.setVisible(false);
               c2.setVisible(false);
               c3.setVisible(false);
               c4.setVisible(false);
               c5.setVisible(false);
//               
        //create and add Bill label       
        Label bill=new Label();
        bill.setText("Cart:"+cart );
        root.getChildren().add(bill);
        bill.setLayoutX(50);
        bill.setLayoutY(50);
        bill.setFont(Font.font(30));
        bill.setTextFill(Color.WHITE);

        //Add to cart Buttons
        Button p1=new Button("Add to Cart");
        p1.setMinSize(170,50);
        p1.setLayoutX(1050);
        p1.setLayoutY(640);
        p1.setFont(Font.font(26));
        
        
        Button p2=new Button("Add to Cart");
        p2.setMinSize(170,50);
        p2.setLayoutX(310);
        p2.setLayoutY(640);
        p2.setFont(Font.font(26));
        
        
        Button p3=new Button("Add to Cart");
        p3.setMinSize(170,50);
        p3.setLayoutX(550);
        p3.setLayoutY(640);
        p3.setFont(Font.font(26));
        
        Button p4=new Button("Add to Cart");
        p4.setMinSize(170,50);
        p4.setLayoutX(800);
        p4.setLayoutY(640);
        p4.setFont(Font.font(26));
      
        
        Button p5=new Button("Add to Cart");
        p5.setMinSize(170,50);
        p5.setLayoutX(20);
        p5.setLayoutY(640);
        p5.setFont(Font.font(26));
        
        
      //  h3.getChildren().addAll(p1,p2,p3,p4,p5);
        
        root.getChildren().addAll(p1,p2,p3,p4,p5);
        //To invisible Add to cart buttons
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
  
//Home T -Shirt images          
ImageView imageBarc=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/BarcelonaHo.jpg")));
ImageView imageReal=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/RealHo.jpg")));
ImageView imageBayarn=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/BayranHo.jpg")));
ImageView imageJuvent=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/juventusHo.jpg")));
ImageView imageInter=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/InterHo.jpg")));
ImageView imageMan=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/ManHo.jpg")));
ImageView imageParsi=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/ParisHo.jpg")));
ImageView imageLiver=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/LiverHo.jpg")));
ImageView imageZamalak=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/ZamalakHo.jpg")));
ImageView imageAhly=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/AhlyHo.jpg")));
//Away T-Shirt images 
 ImageView imageBarcc=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/BarcelonaAw.jpg")));
ImageView imageReall=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/RealAw.jpg")));
ImageView imageBayarnn=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/BayranAw.jpg")));
ImageView imageJuvents=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/juventusAw.jpg")));
ImageView imageInterr=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/InterAw.jpg")));
ImageView imageManu=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/ManAw.jpg")));
ImageView imageParsis=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/ParisAw.jpg")));
ImageView imageLiverp=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/LiverAw.jpg")));
ImageView imageZamalakS=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/ZamalakAw.jpg")));
ImageView imageAhlyS=new ImageView(new Image(getClass().getResourceAsStream ("/ImagesTshirts/AhlyAw.jpg")));





            //when Page1 T-Shirt Model button is selected
            b1.setOnAction((ActionEvent e)->{
               stage.setTitle("Page T-Shirt Model");
               h2.setVisible(true);
                 bn1.setGraphic(imageBarc);
                 bn2.setGraphic(imageReal);
                 bn3.setGraphic(imageBayarn);
                 bn4.setGraphic(imageJuvent);
                 bn5.setGraphic(imageInter);
               
                c1.getItems().clear();
                c2.getItems().clear();
                c3.getItems().clear();
                c4.getItems().clear();
                c5.getItems().clear();
               
                
         p1.setVisible(true);
         p2.setVisible(true);
         p3.setVisible(true);
         p4.setVisible(true);
         p5.setVisible(true);
               //set T-Sshirts names and prices
        p1.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceInterH)+" EG");});
        p2.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceRealH)+" EG");});
        p3.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceBayranH)+" EG");});
          p4.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+pricejuventusH)+" EG");});
          p5.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceBarcH)+" EG");});
               bn1.setOnAction((ActionEvent ex)->{
  bn1.setGraphic(imageBarcc);
});
                  
               bn2.setOnAction((ActionEvent ex)->{
  bn2.setGraphic(imageReall);
});
                  
               bn3.setOnAction((ActionEvent ex)->{
  bn3.setGraphic(imageBayarnn);
});
                  
               bn4.setOnAction((ActionEvent ex)->{
  bn4.setGraphic(imageJuvents);
});
                  
               bn5.setOnAction((ActionEvent ex)->{
  bn5.setGraphic(imageInterr);
});
               
               btn5.setText("Price:"+Integer.toString(priceBarcH)+" EG");
               btn5.setFont(Font.font(24));
               l5.setText("Barcelona");
               l5.setFont(Font.font(24));
               c5.getItems().addAll("68S","70M","72L","75XL","80LG");
             
               
               
                       
               btn4.setText("Price:"+Integer.toString(priceRealH)+" EG");
               btn4.setFont(Font.font(24));
               l4.setText("RealMadrid");
               l4.setFont(Font.font(24));
               c4.getItems().addAll("68S","70M","72L","75XL","80LG");
            
               
               btn3.setText("Price:"+Integer.toString(priceBayranH)+" EG");
               btn3.setFont(Font.font(24));
               l3.setText("Bayran");
               l3.setFont(Font.font(24));
               c3.getItems().addAll("68S","70M","72L","75XL","80LG");
             
               
               btn2.setText("Price:"+Integer.toString(pricejuventusH)+" EG");
               btn2.setFont(Font.font(24));
               l2.setText("Jventus");
               l2.setFont(Font.font(24));
               c2.getItems().addAll("68S","70M","72L","75XL","80LG");
             
               
               btn1.setText("Price:"+Integer.toString(priceInterH)+" EG");
               btn1.setFont(Font.font(24));
               l1.setText("Inter");
               l1.setFont(Font.font(24));
               c1.getItems().addAll("68S","70M","72L","75XL","80LG"); 
              
              c5.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue== "75XL"){
                       btn5.setText("Price:"+Integer.toString(priceBarcH+100)+" EG");
                       p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceBarcH+100)+" EG");
                       name.setText("Barcelona"); Size.setText((String) c5.getValue()); price.setText(priceBarcH+100+"EG");
                       });
                       }else if(newValue== "80LG"){
                       btn5.setText("Price:"+Integer.toString(priceBarcH+200)+" EG");
                       p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceBarcH+200)+" EG");
                       name.setText("Barcelona"); Size.setText((String) c5.getValue()); price.setText(priceBarcH+200+"EG");
                       });
                       }else{
                           btn5.setText("Price:"+Integer.toString(priceBarcH)+" EG");
                           p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceBarcH)+" EG");
                           name.setText("Barcelona"); Size.setText((String) c5.getValue());  price.setText(priceBarcH+"EG");
                           });
                       }}
               });
                  
               
            
               
               c4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="75XL"){
                       btn4.setText("Price:"+Integer.toString(priceRealH+100)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceRealH+100)+" EG");
                       name.setText("RealMadid"); Size.setText((String) c4.getValue());  price.setText(priceRealH+100+"EG");
                       });           
                       }else  if(newValue=="80LG"){
                       btn4.setText("Price:"+Integer.toString(priceRealH+200)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceRealH+200)+" EG");
                       name.setText("RealMadid"); Size.setText((String) c4.getValue());  price.setText(priceRealH+200+"EG");
                       });            
                       }else{
                           btn4.setText("Price:"+Integer.toString(priceRealH)+" EG");
                           p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceRealH)+" EG");
                            name.setText("RealMadid"); Size.setText((String) c4.getValue());  price.setText(priceRealH+"EG");
                           }); 
                       }}
                   
               });
                   
                     
             c3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="75XL,80LG"){
                       btn3.setText("Price:"+Integer.toString(priceBayranH+100)+" EG");
                       p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceBayranH+100)+" EG");
                       name.setText("Bayarn"); Size.setText((String) c3.getValue());  price.setText(priceBayranH+100+"EG");
                       });    
                       }else if(newValue=="75XL,80LG"){
                       btn3.setText("Price:"+Integer.toString(priceBayranH+200)+" EG");
                       p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceBayranH+200)+" EG");
                       name.setText("Bayarn"); Size.setText((String) c3.getValue());  price.setText(priceBayranH+200+"EG");
                       });                                
                       }else{
                           btn3.setText("Price:"+Integer.toString(priceBayranH)+" EG");
                           p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceBayranH)+" EG");
                            name.setText("Bayran"); Size.setText((String) c3.getValue());  price.setText(priceBayranH+"EG");
                           }); 
                       }}
                   
               });
                  
                  
                     c2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="75XL,80LG"){
                       btn2.setText("Price:"+Integer.toString(pricejuventusH+100)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+pricejuventusH+100)+" EG");
                       name.setText("Juventus"); Size.setText((String) c2.getValue());  price.setText(pricejuventusH+100+"EG");
                       });       
                       }else if(newValue=="75XL,80LG"){
                       btn2.setText("Price:"+Integer.toString(pricejuventusH+200)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+pricejuventusH+200)+" EG");
                       name.setText("Juventus"); Size.setText((String) c2.getValue());  price.setText(pricejuventusH+200+"EG");
                       });       
                       }else{
                           btn2.setText("Price:"+Integer.toString(pricejuventusH)+" EG");
                           p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+pricejuventusH)+" EG");
                            name.setText("Juventus"); Size.setText((String) c2.getValue());  price.setText(pricejuventusH+"EG");
                           }); 
                       }}
                   
               });
                  
              
              
            
                 
                  c1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue == "75XL"){
                       btn1.setText("Price:"+Integer.toString(priceInterH+100)+" EG");
                       p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceInterH+100)+" EG");
                       name.setText("Inter"); Size.setText((String) c1.getValue());  price.setText(priceInterH+100+"EG");
                       });
                       } else if(newValue == "80LG"){
                       btn1.setText("Price:"+Integer.toString(priceInterH+100)+" EG");
                       p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceInterH+100)+" EG");
                       name.setText("Inter"); Size.setText((String) c1.getValue());  price.setText(priceInterH+100+"EG");
                       });
                       }else{
                           btn1.setText("Price:"+Integer.toString(priceInterH)+" EG");
                           p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceInterH)+" EG");
                            name.setText("Inter"); Size.setText((String) c1.getValue());  price.setText(priceInterH+"EG");
                           }); 
                       }}
                   
               });
                  
               
              
               btn1.setVisible(true);
               btn2.setVisible(true);
               btn3.setVisible(true);
               btn4.setVisible(true);
               btn5.setVisible(true);
               
               
               l1.setVisible(true);
               l2.setVisible(true);
               l3.setVisible(true);
               l4.setVisible(true);
               l5.setVisible(true);
               
               c1.setVisible(true);
               c2.setVisible(true);
               c3.setVisible(true);
               c4.setVisible(true);
               c5.setVisible(true);
               
              
                    ;});
            
            //Whene Page2 T-Shirt Model button is selected
             b2.setOnAction((ActionEvent e)->{
                stage.setTitle("Page2 T-Shirt Model");
                c1.getItems().clear();
                c2.getItems().clear();
                c3.getItems().clear();
                c4.getItems().clear();
                c5.getItems().clear();
                
                
               bn1.setGraphic(imageMan);
               bn2.setGraphic(imageParsi);
               bn3.setGraphic(imageLiver);
              bn4.setGraphic(imageZamalak);
               bn5.setGraphic(imageAhly);
               
         p1.setVisible(true);
         p2.setVisible(true);
         p3.setVisible(true);
         p4.setVisible(true);
         p5.setVisible(true);
              
          p1.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceAhlyH)+" EG");});
          p4.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceZamalkH)+" EG");});
          p3.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceLivH)+" EG");});
          p2.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceParsiH)+" EG");});
          p5.setOnAction((ActionEvent ex)->{bill.setText("Cart:"+Integer.toString(cart+priceManH)+" EG");});
         
         
         
                      
               bn1.setOnAction((ActionEvent ex)->{
  bn1.setGraphic(imageManu);
});
                  
               bn2.setOnAction((ActionEvent ex)->{
  bn2.setGraphic(imageParsis);
});
                  
               bn3.setOnAction((ActionEvent ex)->{
  bn3.setGraphic(imageLiverp);
});
                  
               bn4.setOnAction((ActionEvent ex)->{
  bn4.setGraphic(imageZamalakS);
});
                  
               bn5.setOnAction((ActionEvent ex)->{
  bn5.setGraphic(imageAhlyS);
});
         
               btn5.setText("Price:"+Integer.toString(priceManH)+" EG");
               btn5.setFont(Font.font(24));
               l5.setText("ManUnited");
               l5.setFont(Font.font(24));
               c5.getItems().addAll("68S","70M","72L","75XL","80LG");
             
               
               
                       
               btn4.setText("Price:"+Integer.toString(priceParsiH)+" EG");
               btn4.setFont(Font.font(24));
               l4.setText("Paris");
               l4.setFont(Font.font(24));
               c4.getItems().addAll("68S","70M","72L","75XL","80LG");
            
               
               btn3.setText("Price:"+Integer.toString(priceLivH)+" EG");
               btn3.setFont(Font.font(24));
               l3.setText("LiverPool");
               l3.setFont(Font.font(24));
               c3.getItems().addAll("68S","70M","72L","75XL","80LG");
             
               
               btn2.setText("Price:"+Integer.toString(priceZamalkH)+" EG");
               btn2.setFont(Font.font(24));
                 l2.setText("ZamalakSC");
               l2.setFont(Font.font(24));
               c2.getItems().addAll("68S","70M","72L","75XL","80LG"); 
               
               btn1.setText("Price:"+Integer.toString(priceAhlyH)+" EG");
               btn1.setFont(Font.font(24));
               l1.setText("AhlySC");
               l1.setFont(Font.font(24));
               c1.getItems().addAll("68S","70M","72L","75XL","80LG"); 
      c5.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue== "75XL"){
                       btn5.setText("Price:"+Integer.toString(priceManH+100)+" EG");
                       p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceManH+100)+" EG");
                       name.setText("ManUnited"); Size.setText((String) c5.getValue()); price.setText(priceManH+100+"EG");
                       });
                       }else if(newValue== "80LG"){
                       btn5.setText("Price:"+Integer.toString(priceManH+200)+" EG");
                       p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceManH+200)+" EG");
                       name.setText("ManUnited"); Size.setText((String) c5.getValue()); price.setText(priceManH+200+"EG");
                       });
                       }else{
                           btn5.setText("Price:"+Integer.toString(priceManH)+" EG");
                           p5.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceManH)+" EG");
                           name.setText("ManUnited"); Size.setText((String) c5.getValue());  price.setText(priceManH+"EG");
                           });
                       }}
               });
                  
               
            
               
               c4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="75XL"){
                       btn4.setText("Price:"+Integer.toString(priceParsiH+100)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceParsiH+100)+" EG");
                       name.setText("Paris"); Size.setText((String) c4.getValue());  price.setText(priceParsiH+100+"EG");
                       });           
                       }else  if(newValue=="80LG"){
                       btn4.setText("Price:"+Integer.toString(priceParsiH+200)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceParsiH+200)+" EG");
                       name.setText("Paris"); Size.setText((String) c4.getValue());  price.setText(priceParsiH+200+"EG");
                       });            
                       }else{
                           btn4.setText("Price:"+Integer.toString(priceParsiH)+" EG");
                           p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceParsiH)+" EG");
                            name.setText("Paris"); Size.setText((String) c4.getValue());  price.setText(priceParsiH+"EG");
                           }); 
                       }}
                   
               });
                   
                     
             c3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="75XL"){
                       btn3.setText("Price:"+Integer.toString(priceLivH+100)+" EG");
                       p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceLivH+100)+" EG");
                       name.setText("LiverPool"); Size.setText((String) c3.getValue());  price.setText(priceLivH+100+"EG");
                       });    
                       }else if(newValue=="80LG"){
                       btn3.setText("Price:"+Integer.toString(priceLivH+200)+" EG");
                       p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceLivH+200)+" EG");
                       name.setText("LiverPool"); Size.setText((String) c3.getValue());  price.setText(priceLivH+200+"EG");
                       });                                
                       }else{
                           btn3.setText("Price:"+Integer.toString(priceLivH)+" EG");
                           p3.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceLivH)+" EG");
                            name.setText("LiverPool"); Size.setText((String) c3.getValue());  price.setText(priceLivH+"EG");
                           }); 
                       }}
                   
               });
                  
                  
                     c2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue=="75XL"){
                       btn2.setText("Price:"+Integer.toString(priceZamalkH+100)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceZamalkH+100)+" EG");
                       name.setText("ZamalekSC"); Size.setText((String) c2.getValue());  price.setText(priceZamalkH+100+"EG");
                       });       
                       }else if(newValue=="80LG"){
                       btn2.setText("Price:"+Integer.toString(priceZamalkH+200)+" EG");
                       p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceZamalkH+200)+" EG");
                       name.setText("ZamalekSC"); Size.setText((String) c2.getValue());  price.setText(priceZamalkH+200+"EG");
                       });       
                       }else{
                           btn2.setText("Price:"+Integer.toString(priceZamalkH)+" EG");
                           p4.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceZamalkH)+" EG");
                            name.setText("ZamalekSC"); Size.setText((String) c2.getValue());  price.setText(priceZamalkH+"EG");
                           }); 
                       }}
                   
               });
                  
              
              
            
                 
                  c1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                   @Override
                   public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                       if(newValue == "75XL"){
                       btn1.setText("Price:"+Integer.toString(priceAhlyH+100)+" EG");
                       p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceAhlyH+100)+" EG");
                       name.setText("AhlySC"); Size.setText((String) c1.getValue());  price.setText(priceAhlyH+100+"EG");
                       });
                       } else if(newValue == "80LG"){
                       btn1.setText("Price:"+Integer.toString(priceAhlyH+150)+" EG");
                       p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceAhlyH+150)+" EG");
                       name.setText("AhlySC"); Size.setText((String) c1.getValue());  price.setText(priceAhlyH+150+"EG");
                       });
                       }else{
                           btn1.setText("Price:"+Integer.toString(priceAhlyH)+" EG");
                           p1.setOnAction((ActionEvent e)->{bill.setText("Cart:"+Integer.toString(cart+priceAhlyH)+" EG");
                            name.setText("AhlySC"); Size.setText((String) c1.getValue());  price.setText(priceAhlyH+"EG");
                           }); 
                       }}
                   
               });
                  
               
               h2.setVisible(true);
               btn1.setVisible(true);
               btn2.setVisible(true);
               btn3.setVisible(true);
               btn4.setVisible(true);
               btn5.setVisible(true);
               
               l1.setVisible(true);
               l2.setVisible(true);
               l3.setVisible(true);
               l4.setVisible(true);
               l5.setVisible(true);
               
               c1.setVisible(true);
               c2.setVisible(true);
               c3.setVisible(true);
               c4.setVisible(true);
               c5.setVisible(true);
              
            
                    ;});
            
            //create and add Back button
            Button bt=new Button("Back");
            bt.setAlignment(Pos.CENTER);
            bt.setStyle(STYLESHEET_MODENA);
            root.getChildren().add(bt);
            bt.setOnAction(this);
           //When Back button is pressed
           bt.setOnAction((ActionEvent e)->{
           FirstPage s=new FirstPage();
            s3.close();
           try{
          s.start(new Stage());
          }catch(Exception ex)
           {}
                    ;});
            
            
            stage.setScene(scene);
            stage.show(); 
            s3=stage;
            
    }

    @Override
    public void handle(ActionEvent event) {
        FirstPage page=new FirstPage();
        //when back button is pressed
        s3.close();
        try{
         page.start(new Stage());
        }catch(Exception e)
        {
        }
        
    }
}


