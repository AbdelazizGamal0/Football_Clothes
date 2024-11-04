/*
 /** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_MODENA;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafxapplication13.FirstPage;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class SoccerBalls extends Application implements EventHandler<ActionEvent> {
Stage s5;
    @Override
    public void start(Stage primaryStage) {
        Button b = new Button();
        b.setLayoutX(50);
        b.setLayoutY(0);
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/ImagesFootballs/Adidas.jpg")));
        ImageView image1 = new ImageView(new Image(getClass().getResourceAsStream("/ImagesFootballs/Buma.jpg")));
        ImageView image2 = new ImageView(new Image(getClass().getResourceAsStream("/ImagesFootballs/Mikasa.jpg")));
        ImageView image3 = new ImageView(new Image(getClass().getResourceAsStream("/ImagesFootballs/Molten.jpg")));
        ImageView image4 = new ImageView(new Image(getClass().getResourceAsStream("/ImagesFootballs/Wilson.jpg")));
        Group root = new Group();

         ImageView image5 = new ImageView(new Image(getClass().getResourceAsStream("/Images/mn.jpg")));
         root.getChildren().add(image5);
         Button bt1 = new Button();
         bt1.setLayoutX(100);
         bt1.setLayoutY(100);

        
       
        
        
        b.setGraphic(image);
        bt1.setGraphic(image1);
        root.getChildren().add(bt1);
        root.getChildren().add(b);
        Scene scene = new Scene(root, 1400, 800);

        bt1.setMinSize(250, 250);
         b.setMinSize(250, 250);

        BorderPane bb1 = new BorderPane();
        root.getChildren().add(bb1);

        BorderPane bb3 = new BorderPane();
        root.getChildren().add(bb3);

        BorderPane bb2 = new BorderPane();
        root.getChildren().add(bb2);

        HBox h3 = new HBox(20);
        bb3.setCenter(h3);
        bb3.setLayoutX(60);
        bb3.setLayoutY(430);

        HBox h2 = new HBox(20);
        bb1.setCenter(h2);
        bb1.setLayoutX(15);
        bb1.setLayoutY(150);

        h2.getChildren().addAll(b, bt1);

        HBox h = new HBox(20);
        bb2.setCenter(h);
        bb2.setLayoutX(60);
        bb2.setLayoutY(400);

        //HBox h4=new HBox(30);
        //  bb1.setBottom(h4);
        // bb1.setLayoutX(150);
        //name
        
        
        Label name = new Label();
        Label price  = new Label();
        
        Label l = new Label("Adidas");
        l.setMinSize(250, 50);
        l.setTextFill(Color.WHEAT);
        h.getChildren().add(l);
        l.setFont(Font.font(24));
        Label l2 = new Label("Buma");
        l2.setMinSize(250, 50);
        l2.setTextFill(Color.WHEAT);
        h.getChildren().add(l2);

        l2.setFont(Font.font(24));
        Label l3 = new Label("Mikasa");
        l3.setMinSize(250, 50);
        l3.setTextFill(Color.WHEAT);
        h.getChildren().add(l3);

        l3.setFont(Font.font(24));
        Label l4 = new Label("Molten");
        l4.setMinSize(250, 50);
        l4.setTextFill(Color.WHEAT);
        h.getChildren().add(l4);

        l4.setFont(Font.font(24));
        Label l5 = new Label("Wilson");
        l5.setMinSize(250, 50);
        l5.setTextFill(Color.WHEAT);
        h.getChildren().add(l5);
        l5.setFont(Font.font(24));

        //sallariy
        Label ll = new Label("Price:800 PEG");
        ll.setMinSize(250, 50);
        ll.setTextFill(Color.WHEAT);
         ll.setFont(Font.font(24));
       
        Label ll2 = new Label("Price:1400 PEG");
        ll2.setMinSize(250, 50);
        ll2.setTextFill(Color.WHEAT);
        ll2.setFont(Font.font(24));


        Label ll3 = new Label("Price:1000 PEG");
        ll3.setMinSize(250, 50);
        ll3.setTextFill(Color.WHEAT);
         ll3.setFont(Font.font(24));

      
        Label ll4 = new Label("Price:450PEG");
        ll4.setMinSize(250, 50);
        ll4.setTextFill(Color.WHEAT);
        ll4.setFont(Font.font(24));

       
        Label ll5 = new Label("Price:1200 PEG");
        ll5.setMinSize(250, 50);
        ll5.setTextFill(Color.WHEAT);
       
        ll5.setFont(Font.font(24));
        
        Label cart=new Label("Cart:0 EG");
       root.getChildren().add(cart);
       cart.setLayoutX(100); 
       cart.setFont(Font.font(26));
       cart.setTextFill(Color.WHITE);
        h3.getChildren().addAll(ll, ll2, ll3, ll4, ll5);

        Button c = new Button("Go to Cart");
        c.setLayoutX(1200);
        root.getChildren().add(c);
        c.setTextFill(Color.BLACK);
          c.setFont(Font.font(24));
        
        Button bt2 = new Button();
        bt2.setMinSize(250, 250);
        h2.getChildren().add(bt2);
        bt2.setGraphic(image2);

        Button bt3 = new Button();
        bt3.setMinSize(250, 250);
        h2.getChildren().add(bt3);
        bt3.setGraphic(image3);

        Button bt4 = new Button();
        bt4.setMinSize(250, 250);
        h2.getChildren().add(bt4);
        bt4.setGraphic(image4);

        //Add to cart Buttons
        Button p1 = new Button("Add to Cart");
        p1.setMinSize(100, 50);
        p1.setLayoutX(15);
        p1.setLayoutY(480);
        p1.setFont(Font.font(26));
       
        Button p2 = new Button("Add to Cart");
        p2.setMinSize(100, 50);
        p2.setLayoutX(315);
        p2.setLayoutY(480);
        p2.setFont(Font.font(26));

        Button p3 = new Button("Add to Cart");
        p3.setMinSize(100, 50);
        p3.setLayoutX(615);
        p3.setLayoutY(480);
        p3.setFont(Font.font(26));

        Button p4 = new Button("Add to Cart");
        p4.setMinSize(100, 50);
        p4.setLayoutX(875);
        p4.setLayoutY(480);
        p4.setFont(Font.font(26));

        Button p5 = new Button("Add to Cart");
        p5.setMinSize(100, 50);
        p5.setLayoutX(1150);
        p5.setLayoutY(480);
        p5.setFont(Font.font(26));
        root.getChildren().addAll(p1,p2,p3,p4,p5);

       p1.setOnAction((ActionEvent e)->{cart.setText("Cart:"+800+" EG");name.setText("Adidas");price.setText("800");});
       p2.setOnAction((ActionEvent e)->{cart.setText("Cart:"+1400+" EG");name.setText("Buma");price.setText("1400");});
       p3.setOnAction((ActionEvent e)->{cart.setText("Cart:"+1000+" EG");name.setText("Mikasha");price.setText("1000");});
       p4.setOnAction((ActionEvent e)->{cart.setText("Cart:"+450+" EG");name.setText("Molten");price.setText("450");});
       p5.setOnAction((ActionEvent e)->{cart.setText("Cart:"+1200+" EG");name.setText("Wilson");price.setText("1200");});
     //The bill            
            c.setOnAction((ActionEvent ex)->{
            Hyperlink h1=new Hyperlink("Show Bill");
            h1.setLayoutX(1200);
            h1.setLayoutY(38);
            h1.setFont(Font.font(30));
            root.getChildren().add(h1);
            });
            
            c.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //The contents of the bill
                JOptionPane.showMessageDialog(null,"Name: "+ name.getText()+"\n"+"Price: "+price.getText()+"\n"
                 +"_"+"\n"
                 +"Telephone:00201000580504 "+"\n"
                 +"Email: FootballClothes@Gmail.com"+"\n" 
                 +"_"+"\n"
                );     
            }
        });
    
            
             Button  bt = new Button("Back");
            bt.setAlignment(Pos.CENTER);
            bt.setStyle(STYLESHEET_MODENA);
            root.getChildren().add(bt);
           bt.setOnAction(this);
               
         
            bt.setOnAction((ActionEvent e)->{
           FirstPage s=new FirstPage();
            s5.close();
           try{
          s.start(new Stage());
          }catch(Exception ex)
           {}
                    ;});
            
            
            
            
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("SoccerBalls");
          s5= primaryStage;
            }
    
 @Override
    public void handle(ActionEvent event) {
        FirstPage page=new FirstPage();
        //when back button is pressed
        s5.close();
        try{
         page.start(new Stage());
        }catch(Exception e)
        {
        }
        
    }}
    
    
    
    
    
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        launch(args);
//    }
//}