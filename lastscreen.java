package application;

import javafx.scene.effect.BlendMode;
import javafx.geometry.Insets;	
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;
import javafx.application.Application; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.Label;
import javafx.util.Duration;
public class lastscreen extends Application {
	@Override
	public void start(Stage stage) {
		try {
			  Image image1 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\last1.jpg"));  
			  //Setting the image view 
		      ImageView imageView1 = new ImageView(image1); 
		      /*imageView2.setBlendMode(BlendMode.DIFFERENCE);
		      Group blend = new Group(imageView1,imageView2);*/
		               
		       
		      //Setting the position of the image 
		      imageView1.setX(0); 
		      imageView1.setY(0); 
		      
		      //setting the fit height and width of the image view 
		      imageView1.setFitHeight(900); 
		      imageView1.setFitWidth(900); 
		      
		      //Setting the preserve ratio of the image view 
		      imageView1.setPreserveRatio(true);  
		      /////////////////////////////
		      	Image image3 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\save.jpg"));
		        ImageView iw3 = new ImageView(image3);
		        Button button3 = new Button("Accept");
		        button3.setMinSize(1,1);
		        button3.setMaxSize(1,1);
		        button3.setLayoutX(400);
		        button3.setLayoutY(200);
		        button3.setStyle("-fx-focus-color: transparent;");
		        //Setting the position of the image 
			     
			      //setting the fit height and width of the image view 
			     iw3.setFitHeight(100); 
			     iw3.setFitWidth(300); 
			      
		        TilePane r3 = new TilePane();
		        button3.setGraphic(new ImageView(image3));
		        button3.setText("SAVE");
		       
		        button3.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		                System.out.println("Accepted save GAME");
		            }
		        });///////////////////////////////////////
		        Image image4 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\exit.jpg"));
		        ImageView iw4 = new ImageView(image4);
		        
		        Button button4 = new Button("Accept");
		        button4.setMinSize(1,1);
		        button4.setMaxSize(1,1);
		        button4.setLayoutX(400);
		        button4.setLayoutY(300);
		        button4.setStyle("-fx-focus-color: transparent;");
		        //Setting the position of the image 
			     
			      //setting the fit height and width of the image view 
			     iw4.setFitHeight(50); 
			     iw4.setFitWidth(250); 
			     button4.setGraphic(new ImageView(image4));
		        TilePane r4 = new TilePane();
		        //button1.setGraphic(new ImageView(image2));
		        button4.setText("EXIT");
		       
		        button4.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		                System.out.println("Accepted quit GAME");
		                System.exit(0);
		                //button4.setOnAction(EventHandler ->stage.close());
		            }
		        });////////////////
		      
		      
		      //////////////////////////////////////////////
		      
		      //Creating a Group object  
		      //
			/*scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());*/
		     
		      Group root = new Group(imageView1);
		      Scene scene = new Scene(root,890,500);
		      root.getChildren().add(button3);
		      root.getChildren().add(button4);
			  //stage.setResizable(false);
			  stage.setScene(scene);
			  stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
      
	}
}
