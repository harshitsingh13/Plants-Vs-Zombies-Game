package application;
import java.util.*;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.Label; 
import javafx.scene.control.Alert;
public class Main extends Application {
	/*Button buttonTypeOne = new Button("LEVEL-1");
	Button buttonTypeTwo = new Button("LEVEL-2");
	Button buttonTypeThree = new Button("LEVEL-3");
	Button buttonTypeFour = new Button("LEVEL-4");
	Button buttonTypeFive = new Button("LEVEL-5");
	Button buttonTypeCancel = new Button("CANCEL");*/
   
	
	/*

    public Main(int n) {
        this.result = n;
    }*/
	private int result;
    private int difficulty = 1;

    objects obj=new objects();
    level1 l1=new level1();
    level2 l2=new level2();
    level3 l3=new level3();
    level4 l4=new level4();
    level5 l5=new level5();
	@Override
	public void start(Stage stage) {
		
		try {
			Image image = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\pz.jpeg"));  
		      
		      //Setting the image view 
		      ImageView imageView = new ImageView(image); 
		      
		      //Setting the position of the image 
		      imageView.setX(0); 
		      imageView.setY(0); 
		      
		      //setting the fit height and width of the image view 
		      imageView.setFitHeight(900); 
		      imageView.setFitWidth(900); 
		      
		      //Setting the preserve ratio of the image view 
		      imageView.setPreserveRatio(true);  
		      
		      //Creating a Group object  
		      Group root = new Group(imageView);  
		      //////////////////////////////////////////////////////
		        Image image1 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\startplay.gif"));
		        ImageView iw1 = new ImageView(image1);
		       
		        Button button1 = new Button("Accept",iw1);
		        button1.setStyle("-fx-focus-color: transparent;");
		        button1.setMinSize(1, 1);
		        button1.setMaxSize(1, 1);
		        button1.setLayoutX(270);
		        button1.setLayoutY(100);
		        //Setting the position of the image 
		     
			      //setting the fit height and width of the image view 
			      iw1.setFitHeight(70); 
			      iw1.setFitWidth(350); 
			        
		        TilePane r1 = new TilePane();
		        Label l = new Label("button not selected");
		       // button1.setGraphic(new ImageView(image1));
		        button1.setText("START GAME");
		        //button1.setGraphic(new ImageView(image));
		        button1.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		            	obj.start(stage);
		                System.out.println("Accepted START GAME");
		            }
		        });
		        
		      
		        /////////////////////////////////////////////////////////
		        Image image2 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\load.png"));
		        ImageView iw2 = new ImageView(image2);
		        Button button2 = new Button("Accept",iw2);
		        button2.setMinSize(1, 1);
		        button2.setMaxSize(1, 1);
		        button2.setLayoutX(340);
		        button2.setLayoutY(200);
		        button2.setStyle("-fx-focus-color: transparent;");
		        //Setting the position of the image 
			     
			      //setting the fit height and width of the image view 
			      iw2.setFitHeight(50); 
			      iw2.setFitWidth(200); 
			      
		        TilePane r2 = new TilePane();
		        //button1.setGraphic(new ImageView(image2));
		        button2.setText("LOAD GAME");
		       
		        button2.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		                System.out.println("Accepted LOAD GAME");
		            }
		        });
		        
		        //////////////////////////////////////////////////////////////
		        Image image3 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\level1.jpg"));
		        ImageView iw3 = new ImageView(image3);
		        Button button3 = new Button("Accept",iw3);
		        button3.setMinSize(1,1);
		        button3.setMaxSize(1,1);
		        button3.setLayoutX(340);
		        button3.setLayoutY(300);
		        button3.setStyle("-fx-focus-color: transparent;");
		        //Setting the position of the image 
			     
			      //setting the fit height and width of the image view 
			      iw3.setFitHeight(50); 
			      iw3.setFitWidth(200); 
			      
		        TilePane r3 = new TilePane();
		        //button1.setGraphic(new ImageView(image2));
		        button3.setText("level ");
		       
		        button3.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		                System.out.println("Accepted level GAME");
		                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		               DialogPane dialogPane = alert.getDialogPane();
		                alert.setTitle("SET DIFFICULTY");
		                ButtonType buttonTypeOne = new ButtonType("LEVEL-1");
		                ButtonType buttonTypeTwo = new ButtonType("LEVEL-2");
		                ButtonType buttonTypeThree = new ButtonType("LEVEL-3");
		                ButtonType buttonTypeFour = new ButtonType("LEVEL-4");
		                ButtonType buttonTypeFive = new ButtonType("LEVEL-5");
		                ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

		                alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeFour,buttonTypeFive,buttonTypeCancel);
		                
				            
		                Optional<ButtonType> result = alert.showAndWait();
		            
		                
		                if (result.get()==buttonTypeOne) {
		                    l1.start(stage);
		                } else if (result.get() == buttonTypeTwo) {
		                	l2.start(stage);
		                } else if (result.get() == buttonTypeThree) {
		                	l3.start(stage);
		                } else if (result.get() == buttonTypeFour) {
		                	l4.start(stage);
		                } else if(result.get() == buttonTypeFive){
		                	l5.start(stage);
		                }
		            

		            }
		        });
		        
		        
		        ////////////////////////////////////////////////////////////////
		        Image image4 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\inst.jpg"));
		        ImageView iw4 = new ImageView(image4);
		        Button button4 = new Button("Accept",iw4);
		        button4.setMinSize(1,1);
		        button4.setMaxSize(1,1);
		        button4.setLayoutX(340);
		        button4.setLayoutY(400);
		        //Setting the position of the image 
			    
			      //setting the fit height and width of the image view 
			      iw4.setFitHeight(50); 
			      iw4.setFitWidth(200); 
			      
		        TilePane r4 = new TilePane();
		       // button1.setGraphic(new ImageView(image3));
		        button4.setText("instruction GAME");
		       
		        button4.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		            	Alert alert=new Alert(AlertType.CONFIRMATION);
		                System.out.println("Accepted instruction GAME");
		               
		                alert.setTitle("INSTRUCTION");
		                alert.setHeaderText("SOME INFORMATION!");
		                alert.setContentText("\"In this game you will fight against zombies by plant different plants on your plant.\\n\" +\r\n" + 
		                		"                    \"Each plant has their own special skill:\\n\" +\r\n" + 
		                		"                    \"-Peashooter: attacks zombies by continuously shoot out peas once you put it down\\n\" +\r\n" + 
		                		"                    \"-Sunflower: produce one star at intervals. You can click on the plant to collect the stars. Each star worth 50 value, which you would use to buy more plants.\\n\" +\r\n" + 
		                		"                    \"-Wallnut: put it on the ground to slow down zombie's movement.\\n\" +\r\n" + 
		                		"                    \"Good luck and have fun!");
		               
		                
		                alert.showAndWait();
		            }
		        });

		       
		      /////////////////////////////////////////////////
		        Image image5 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\quit.png"));
		        ImageView iw5 = new ImageView(image5);
		        Button button5 = new Button("Accept",iw5);
		        button5.setMinSize(1,1);
		        button5.setMaxSize(1,1);
		        button5.setLayoutX(340);
		        button5.setLayoutY(500);
		        //Setting the position of the image 
			    
			      //setting the fit height and width of the image view 
			      iw5.setFitHeight(50); 
			      iw5.setFitWidth(200); 
			      
		        TilePane r5 = new TilePane();
		       // button1.setGraphic(new ImageView(image3));
		        button5.setText("EXIT GAME");
		       
		        button5.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		            	System.exit(0);//button5.setOnAction(EventHandler ->stage.close());
		                System.out.println("Accepted EXIT GAME");
		                
		            }
		        });
		      //////////////////////////////////////////////////////////////////////////////
		      //Creating a scene object 
		      Scene scene = new Scene(root, 890, 590);  
		      
		      //Setting title to the Stage 
		      stage.setTitle("PLANT VS ZOMBIES");
		        
		     root.getChildren().add(button1);
		     root.getChildren().add(button2);
		     root.getChildren().add(button3);
		     root.getChildren().add(button4);
		     root.getChildren().add(button5);
		    /* root.getChildren().add(buttonTypeOne); 
		     root.getChildren().add(buttonTypeTwo);
		     root.getChildren().add(buttonTypeThree);
		     root.getChildren().add(buttonTypeFour);
		     root.getChildren().add(buttonTypeFive);
		     root.getChildren().add(buttonTypeCancel);*/
		      //Adding scene to the stage 
		    //  Scene scene = new Scene(root, 600, 600);
		      stage.setResizable(false);
		      stage.setScene(scene);
		     
		      //Displaying the contents of the stage 
		      stage.show(); 
		   /////////////////////////////////////////////////////////////////////
		      
		     
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
