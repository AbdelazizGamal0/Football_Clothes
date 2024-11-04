package javafxapplication13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstPage extends Application implements EventHandler<ActionEvent> {
Stage s2;
    @Override
    public void start(Stage stage) throws Exception {

            //create scene
            Group root = new Group();
            Scene scene = new Scene(root, 1240, 740, Color.DARKTURQUOISE);
            stage.setTitle("FootballClothes");
            
             Font f = new Font("century gothic", 14.5);
            //import and add background image
            Pane pane=new Pane();
            ImageView image=new ImageView(new Image(getClass().getResourceAsStream ("/Images/mess1.jpg")));
            pane.getChildren().add(image);
            root.getChildren().add(pane);     
            
            HBox h=new HBox(50);
            root.getChildren().add(h);
            
            ToggleGroup tg=new ToggleGroup();
            //create and add buttons
              ToggleButton SoccerBalls =new ToggleButton("SoccerBalls");
            h.getChildren().add(SoccerBalls);
            SoccerBalls.setMinSize(200,150);
            SoccerBalls.setFont(f);
            SoccerBalls.setFont(Font.font(60));
            
             SoccerBalls.setOnAction((ActionEvent e)->{
            SoccerBalls SC =new SoccerBalls();
            s2.close();
            try{
           SC.start(new Stage());
              }catch(Exception ex)
           {}
                    ;});
            
            
            
            ToggleButton Shoes =new ToggleButton("Shoes");
            h.getChildren().add(Shoes);
            Shoes.setMinSize(300,150);
            Shoes.setFont(f);
            Shoes.setFont(Font.font(60));
            
            
             Shoes.setOnAction((ActionEvent e)->{
            Shoess S =new Shoess();
            s2.close();
            try{
           S.start(new Stage());
              }catch(Exception ex)
           {}
                    ;});
           
            ToggleButton TShirt =new ToggleButton("T-Shirts");
            h.getChildren().add(TShirt);
            h.setLayoutX(120);
            h.setLayoutY(170);
            TShirt.setMinSize(300,150 );
            TShirt.setFont(f);
            TShirt.setFont(Font.font(60));
            h.autosize();
            tg.getToggles().addAll(TShirt,Shoes,SoccerBalls);
            
             //when T-Shirts  button is selected 
            TShirt.setOnAction((ActionEvent e)->{
            TShirts T =new TShirts();
            s2.close();
            try{
           T.start(new Stage());
              }catch(Exception ex)
           {}
                    ;});
            
            
            
            Button btn = new Button();
            btn.setAlignment(Pos.CENTER);
            btn.setText("Back");
            btn.setOnAction(this);
            root.getChildren().add(btn);
            
            
            Label l1 = new Label();
            l1.setLayoutX(1100);
            l1.setLayoutY(470);
            root.getChildren().add(l1);
            
            stage.setResizable(true);
            stage.setScene(scene);
            stage.show(); 
            s2=stage; 
    }

      @Override
      public void handle(ActionEvent event) {
        Login l=new Login();
        //when back button is pressed
        s2.close();
        try{
           l.start(new Stage());
        }catch(Exception e){}
       
       }} 


    


