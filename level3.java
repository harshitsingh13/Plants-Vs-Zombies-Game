
package application;
import javafx.util.Duration;
import javafx.scene.input.DragEvent;
import javafx.scene.effect.BlendMode;
import javafx.geometry.Insets;	
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//import application.objects.TimeCounter;
import javafx.scene.text.*;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.input.ClipboardContent;
import javafx.scene.shape.Path;
import javafx.scene.shape.Sphere;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.application.Application; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.util.Duration;
import javafx.scene.input.MouseEvent;
import java.awt.event.MouseListener;
public class level3 extends Application {
	private final TimeCounter counter  = new TimeCounter();
	ImageView imageView18;
	ImageView imageView17;
	//PathTransition  pathTransitions;
	 private void gotoxy(int x, int y) {
		 //imageView18.setVisible(true);
		    imageView18.setX(x); 
		    imageView18.setY(y);
		    
		   
		  }
	 private void gotoxy1(int x, int y) {
		 //imageView18.setVisible(true);
		    imageView17.setX(x);; 
		    imageView17.setY(y);
		    
		   
		  }

		 
	 void insertImage(Image i, HBox hb){
         
	        ImageView iv = new ImageView();
	        
	        iv.setImage(i);
	         
	        setupGestureSource(iv);
	        hb.getChildren().add(iv);
	    }
	     
	 
	    void setupGestureTarget(final HBox targetBox){
	         
	        targetBox.setOnDragOver(new EventHandler <DragEvent>() {
	            @Override
	            public void handle(DragEvent event) {
	 
	                Dragboard db = event.getDragboard();
	                 
	                if(db.hasImage()){
	                    event.acceptTransferModes(TransferMode.COPY);
	                }
	                 
	                event.consume();
	            }
	        });
	 
	        targetBox.setOnDragDropped(new EventHandler <DragEvent>() {
	            @Override
	            public void handle(DragEvent event) {
	  
	                Dragboard db = event.getDragboard();
	 
	                if(db.hasImage()){
	 
	                    insertImage(db.getImage(), targetBox);
	                     
	                    event.setDropCompleted(true);
	                }else{
	                    event.setDropCompleted(false);
	                }
	 
	                event.consume();
	            }
	        });
	         
	    }
	     
	    void setupGestureSource(final ImageView source){
	         
	        source.setOnDragDetected(new EventHandler <MouseEvent>() {
	           @Override
	           public void handle(MouseEvent event) {
	                
	               /* allow any transfer mode */
	               Dragboard db = source.startDragAndDrop(TransferMode.COPY);
	                
	               /* put a image on dragboard */
	               ClipboardContent content = new ClipboardContent();
	                
	               Image sourceImage = source.getImage();
	               content.putImage(sourceImage);
	               db.setContent(content);
	                
	               event.consume();
	           }
	       });
	 
	    }
	   
	   
	    class TimeCounter {
		    private long start = new Date().getTime();
		    void reset()   { start = new Date().getTime(); }
		    long elapsed() { return new Date().getTime() - start; }
		  }
		  
		  private void refreshScene() {
			 
			  
	          gotoxy(300,00);
	          
			  
			  }  
private void refreshScene1() {
			 
			  
	          gotoxy1(1100,0);
	          
			  
			  }  
	   
	lastscreen ls=new lastscreen();
	Group root;
	private int timer=0;
	final double MAX_FONT_SIZE = 30.0; // define max font size you need
	Peashooter peashooter;
	sunflower sunflower;
	walnut walnut;
	beetroot beetroot;
	potatomine potato;
	threepea threepea;
	public int count=0;
	private Text label = new Text("TIMER: ");
	public String ScoreCount = "Score: " + count;
	private Text labels = new Text("SUNTOKENS: "+count);
	private Text label1 = new Text("100 suntokens");
	private Text label2 = new Text("50 suntokes");
	private Text label3 = new Text("150 suntokens");
	private Text label4 = new Text("200 suntokes");
	private Text label5 = new Text("250 suntokes");
	private Text label6 = new Text("300 suntokes");
	
	@Override
	public void start(Stage stage) {
		try {
			walnut=new walnut(root);
			peashooter=new Peashooter(root);
			sunflower=new sunflower(root);
			beetroot=new beetroot(root);
			potato=new potatomine(root);
			threepea=new threepea(root);
			normalzombie normal1=new normalzombie(root,1180,75);
			normalzombie normal2=new normalzombie(root,1180,195);
			normalzombie normal3=new normalzombie(root,1180,295);
			normalzombie normal4=new normalzombie(root,1180,395);
			normalzombie normal5=new normalzombie(root,1180,495);
			special s1=new special(root,1100,75);
			special s2=new special(root,1100,195);
			special s3=new special(root,1100,295);
			special s4=new special(root,1100,395);
			special s5=new special(root,1100,495);
			cap cap1=new cap(root,1050,75);
			cap cap2=new cap(root,1050,195);
			cap cap3=new cap(root,1050,295);
			cap cap4=new cap(root,1050,395);
			cap cap5=new cap(root,1050,495);
			newspaper news1=new newspaper(root,980,75);
			newspaper news2=new newspaper(root,980,195);
			newspaper news3=new newspaper(root,980,295);
			newspaper news4=new newspaper(root,980,395);
			newspaper news5=new newspaper(root,980,495);
			//newspaper news1=new newspaper(root,1000,75);
			sun sun =new sun(root);
			sun.run(300,50, 300, 50);
			  Image image1 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\path1.jpg"));  
			  Image image2 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\road.jpg")); 
		      //Setting the image view 
		      ImageView imageView1 = new ImageView(image1); 
		      ImageView imageView2 = new ImageView(image2);
		      /*imageView2.setBlendMode(BlendMode.DIFFERENCE);
		      Group blend = new Group(imageView1,imageView2);*/
		               
		       
		      //Setting the position of the image 
		      imageView1.setX(0); 
		      imageView1.setY(0); 
		      
		      imageView2.setX(800); 
		      imageView2.setY(0); 
		      //setting the fit height and width of the image view 
		      imageView1.setFitHeight(1000); 
		      imageView1.setFitWidth(800); 
		      
		      imageView2.setFitHeight(600); 
		      imageView2.setFitWidth(500); 
		      //Setting the preserve ratio of the image view 
		      imageView1.setPreserveRatio(true);  
		      imageView2.setPreserveRatio(true); 
		      /////////////////////////////
		      	Image image3 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\option.jpg"));
		        ImageView iw3 = new ImageView(image3);
		        Button button3 = new Button("Accept");
		        button3.setMinSize(1,1);
		        button3.setMaxSize(1,1);
		        button3.setLayoutX(1080);
		        button3.setLayoutY(30);
		        button3.setStyle("-fx-focus-color: transparent;");
		        
		        /////////////////////////////////////////////////////////////
		        
		        MenuButton m = new MenuButton("menuButton"); 
		        
		        // create menuitems 
		        MenuItem m1 = new MenuItem("menu item 1"); 
		        MenuItem m2 = new MenuItem("menu item 2"); 
		        MenuItem m3 = new MenuItem("menu item 3"); 
		  
		        // add menu items to menu 
		        m.getItems().add(m1); 
		        m.getItems().add(m2); 
		        m.getItems().add(m3); 
		  
		        
		        ////////////////////////////////////////////////////////////
		        //Setting the position of the image 
			     
			      //setting the fit height and width of the image view 
			     iw3.setFitHeight(50); 
			     iw3.setFitWidth(220); 
			     button3.setGraphic(new ImageView(image3)); 
		        TilePane r3 = new TilePane();
		        //button1.setGraphic(new ImageView(image2));
		        button3.setText("options ");
		       
		        button3.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		                System.out.println("Accepted option GAME");
		                ls.start(stage);
		            }
		        });////////////////
		     /////////////LAWNMOVERS////////////////////////
		          
				  Image image4 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\lawn_mower.gif")); 
				  Image image5 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\lawn_mower.gif"));  
				  Image image6 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\lawn_mower.gif")); 
				  Image image7 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\lawn_mower.gif")); 
				  Image image8 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\lawn_mower.gif"));
				  ///////////////////////////////////////////////zombie///////////////////////////////////
				  Image image9 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\zombie_normal.gif"));
				  
				  
				  /////////////////////////////////////////////////////////////////////////////////////
				  Image image13 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\bottom.png"));
				  Image image14 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\sunbar.png"));
				  ///////////////////////plants//////////no use/////////////////////////////////////////////////
				  Image image10 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\pea_shooter.gif"));
				  
				  ////////////////////////////////////////////barmenu/////////////////////////////////
				  Image image11 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\pea_shooter.gif"));
				  Image image12 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\sun_flower.gif"));
				 
			          
				    Image image15 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\walnut.gif"));
				    Image image16 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\beetroot.gif"));
				    Image image17 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\sun.gif"));
				    Image image18 = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\sun.gif"));
				  ///////////////////////////////////////////////////////////////////////////////////////
				  //Setting the image view 
			      ImageView imageView4 = new ImageView(image4); 
			      ImageView imageView5 = new ImageView(image5);
			      ImageView imageView6 = new ImageView(image6); 
			      ImageView imageView7 = new ImageView(image7);
			      ImageView imageView8 = new ImageView(image8); 
			      
			      ImageView imageView9 = new ImageView(image9);
			      ImageView imageView10 = new ImageView(image10); 
			      ImageView imageView11 = new ImageView(image11);
			      ImageView imageView12 = new ImageView(image12);
			      ImageView imageView13 = new ImageView(image13);
			      ImageView imageView14 = new ImageView(image14);
			      ImageView imageView15 = new ImageView(image15);
			      ImageView imageView16 = new ImageView(image16);
			      ImageView imageView17 = new ImageView(image17);
			      imageView18 = new ImageView(image18);
			      //////////////////////////////////////////////////
			      HBox hBox1 = new HBox();
			      HBox hBox12 = new HBox();
			      HBox hBox13 = new HBox();
			      HBox hBox14 = new HBox();
			      HBox hBox15 = new HBox();
			    
			         hBox1.setTranslateX(300);
			    	 hBox1.setTranslateY(35);
			    	 hBox1.setMaxSize(500, 50);
			         hBox1.setMinSize(500, 50);
			         
			         hBox13.setTranslateX(300);
			    	 hBox13.setTranslateY(190);
			    	 hBox13.setMaxSize(500, 50);
			         hBox13.setMinSize(500, 50);
			         
			        
			         
			         hBox12.setTranslateX(300);
			    	 hBox12.setTranslateY(185);
			         hBox12.setMaxSize(500, 50);
			         hBox12.setMinSize(500, 50);
			         
			         
			        
			        
			         
			         hBox14.setTranslateX(300);
			    	 hBox14.setTranslateY(330);
			    	 hBox14.setMaxSize(500, 50);
			         hBox14.setMinSize(500, 50);
			         
			        
			         hBox15.setTranslateX(300);
			    	 hBox15.setTranslateY(185);
			    	 hBox15.setMaxSize(500, 50);
			         hBox15.setMinSize(500, 50);
			         
			        
			      
			     /* HBox hBox2 = new HBox();
			      hBox2.setTranslateX(320);
			    	 hBox2.setTranslateY(350);
			         hBox2.setPrefWidth(100);
			         hBox2.setPrefHeight(80);*/
			         
			         insertImage(sunflower.getimage(),sunflower.gethbox());
			         //setupGestureTarget(hBox1);
			         
			        /*HBox hBox3 = new HBox();
			    	 hBox3.setTranslateX(430);
			    	 hBox3.setTranslateY(270);
			         hBox3.setPrefWidth(100);
			         hBox3.setPrefHeight(80);*/
			         
			         insertImage(peashooter.getimage(),peashooter.gethbox());
			         //setupGestureTarget(hBox1);
			         
			        /* HBox hBox4 = new HBox();
			    	 hBox4.setTranslateX(580);
			    	 hBox4.setTranslateY(190);
			         hBox4.setPrefWidth(100);
			         hBox4.setPrefHeight(80);*/
			         insertImage(walnut.getimage(),walnut.gethbox());
			         //setupGestureTarget(hBox1);
			         
			        /* HBox hBox5 = new HBox();
			    	 hBox5.setTranslateX(740);
			    	 hBox5.setTranslateY(110);
			         hBox5.setPrefWidth(100);
			         hBox5.setPrefHeight(80);*/
			         insertImage(beetroot.getimage(),beetroot.gethbox());
			         
			        /* HBox hBox6 = new HBox();
			    	 hBox6.setTranslateX(860);
			    	 hBox6.setTranslateY(10);
			         hBox6.setPrefWidth(50);
			         hBox6.setPrefHeight(30);*/
			         insertImage(potato.getimage(),potato.gethbox());
			         
			        /* HBox hBox7 = new HBox();
			    	 hBox7.setTranslateX(980);
			    	 hBox7.setTranslateY(-80);
			    	 hBox7.setMaxSize(500, 50);
			         hBox7.setMinSize(500, 50);*/
			         insertImage(threepea.getimage(),threepea.gethbox());
			         
			         
			         setupGestureTarget(hBox1);
			         setupGestureTarget(hBox12);
			         setupGestureTarget(hBox13);
			         setupGestureTarget(hBox14);
			         setupGestureTarget(hBox15);
			      ///////////////////////////////////////////////////
			      ///////////////////////////////////////////
			      //HBox hbox4 = new HBox(imageView4);
			      //HBox hbox5 = new HBox(imageView5);
			      //HBox hbox6 = new HBox(imageView6);
			      //HBox hbox7 = new HBox(imageView7);
			      //HBox hbox8 = new HBox(imageView8);
			      // set background 
			     //HBox hbox12 = new HBox(imageView12);
			      /////////////////sun bar////////////////////////////////
			     
			      
			     
			      
			      ///////////////////////////////////////////////////////////
			      //Group blend = new Group(imageView1,imageView2,imageView13);        
			      //Setting the position of the image 
			      imageView4.setX(220); 
			      imageView4.setY(90);
			      imageView5.setX(220); 
			      imageView5.setY(190); 
			      imageView6.setX(220); 
			      imageView6.setY(290); 
			      imageView7.setX(220); 
			      imageView7.setY(395); 
			      imageView8.setX(220); 
			      imageView8.setY(490); 
			      
			      imageView9.setX(1200); 
			      imageView9.setY(320); 
			      imageView10.setX(330); 
			      imageView10.setY(290); 
			      imageView11.setX(420); 
			      imageView11.setY(600);
			      imageView12.setX(300); 
			      imageView12.setY(600);
			      imageView13.setX(0); 
			      imageView13.setY(600);
			      imageView14.setX(220); 
			      imageView14.setY(0);
			      imageView15.setX(590); 
			      imageView15.setY(600);
			      imageView16.setX(740); 
			      imageView16.setY(600);
			      imageView17.setX(1000); 
			      imageView17.setY(0);
			      imageView18.setX(3000); 
			      imageView18.setY(0);
			      //setting the fit height and width of the image view 
			      imageView4.setFitHeight(80); 
			      imageView4.setFitWidth(80); 
			      imageView5.setFitHeight(80); 
			      imageView5.setFitWidth(80); 
			      imageView6.setFitHeight(80); 
			      imageView6.setFitWidth(80); 
			      imageView7.setFitHeight(80); 
			      imageView7.setFitWidth(80); 
			      imageView8.setFitHeight(80); 
			      imageView8.setFitWidth(80); 
			      imageView9.setFitHeight(110); 
			      imageView9.setFitWidth(110); 
			      imageView10.setFitHeight(80); 
			      imageView10.setFitWidth(80); 
			      imageView11.setFitHeight(80); 
			      imageView11.setFitWidth(100);
			      imageView12.setFitHeight(80); 
			      imageView12.setFitWidth(100);
			      imageView13.setFitHeight(150); 
			      imageView13.setFitWidth(1400);
			      imageView14.setFitHeight(100); 
			      imageView14.setFitWidth(400);
			      imageView15.setFitHeight(80); 
			      imageView15.setFitWidth(100);
			      imageView16.setFitHeight(80); 
			      imageView16.setFitWidth(100);
			      imageView17.setFitHeight(50); 
			      imageView17.setFitWidth(50);
			      imageView18.setFitHeight(50); 
			      imageView18.setFitWidth(50);
			      
			      /////////////////////////////////////////////////////////////////
			      imageView4.setPreserveRatio(true);  
			      imageView5.setPreserveRatio(true);
			      imageView6.setPreserveRatio(true);  
			      imageView7.setPreserveRatio(true);
			      imageView8.setPreserveRatio(true);  
			      imageView9.setPreserveRatio(true);
			      imageView10.setPreserveRatio(true);
			      imageView11.setPreserveRatio(true);
			      imageView12.setPreserveRatio(true);
			      imageView13.setPreserveRatio(true);
			      imageView14.setPreserveRatio(true);
			      imageView15.setPreserveRatio(true);
			      imageView16.setPreserveRatio(true);
			      imageView17.setPreserveRatio(true);
			      imageView18.setPreserveRatio(true);
		      //////////////////////////////////////////////
			      
			      ////////////////////////////////////////////////////
			    //Drawing a Sphere  
			      Sphere sphere = new Sphere();  
			      
			      //Setting the properties of the Sphere 
			      sphere.setRadius(13.0);   
			      PhongMaterial phongMaterial = new PhongMaterial();
			      phongMaterial.setDiffuseColor(Color.GREEN);
			      sphere.setMaterial(phongMaterial);
			      sphere.setTranslateX(440); 
			      sphere.setTranslateY(305);      
			       
			  ////////////////////////////////////////////////zombie movement///////////////////////////////
			      
			      Path path=new Path();
			      MoveTo moveTo = new MoveTo(900,320);
			      //Create new path transition
			      PathTransition pathTransition = new PathTransition();
			      pathTransition.setDuration(Duration.millis(7000));
			      
			      //
			      //Set node to be animated
			      pathTransition.setNode(imageView9);
			      LineTo line = new LineTo(650,320);
			      path.getElements().add(moveTo); 
			      path.getElements().addAll(line); 
			      
			      pathTransition.setPath(path);
			
			     pathTransition.setOnFinished(new EventHandler<ActionEvent>() {
			    	    @Override
			    	    public void handle(ActionEvent event) {
			    	        // do something
			    	    	
			    	    }
			    	});
			      
			////////////////////////////////////////////////////////////////////////////////
			     imageView17.setOnMouseClicked(new EventHandler<MouseEvent>(){
			    	 
			            @Override
			            public void handle(MouseEvent event) {
			                imageView17.setImage(null);
			                count+=10;
			            }
			        });
			               
			     imageView18.setOnMouseClicked(new EventHandler<MouseEvent>(){
			    	 
			            @Override
			            public void handle(MouseEvent event) {
			                imageView18.setImage(null);
			                count+=10;
			            }
			        });
			 //////////////////////////////////////////////////////////////////////////////////////////// 
			     Path path1=new Path();
			      MoveTo moveTo1 = new MoveTo(420,305);
			      //Create new path transition
			      PathTransition pathTransition1 = new PathTransition();
			      pathTransition1.setDuration(Duration.millis(7000));
			      
			      //
			      //Set node to be animated
			      pathTransition1.setNode(sphere);
			      LineTo line1 = new LineTo(620,305);
			      path1.getElements().add(moveTo1); 
			      path1.getElements().addAll(line1); 
			      
			      pathTransition1.setPath(path1);
			
			     pathTransition1.setOnFinished(new EventHandler<ActionEvent>() {
			    	    @Override
			    	    public void handle(ActionEvent event) {
			    	        // do something
			    	    	
			    	    }
			    	});
			      
			     pathTransition1.play();
			     pathTransition.play(); 
			     
			   ///////////////////////////////////////////////////////////////////////////////////////
			     
			     Path paths=new Path();
			      MoveTo moveTos = new MoveTo(300,0);
			      //Create new path transition
			      PathTransition pathTransitions = new PathTransition();
			      pathTransitions.setDuration(Duration.seconds(8));
			      //
			      //
			      pathTransitions.setDelay(Duration.seconds(10));
			      //Set node to be animated
			      pathTransitions.setNode(imageView18);
			      LineTo lines= new LineTo(300,750);
			      paths.getElements().add(moveTos); 
			      paths.getElements().addAll(lines); 
			      
			      pathTransitions.setPath(paths);
			
			     pathTransitions.setOnFinished(new EventHandler<ActionEvent>() {
			    	    @Override
			    	    public void handle(ActionEvent event) {
			    	        // do something
			    	    	final Timeline timeline = new Timeline(new KeyFrame(Duration.millis(5000), new EventHandler() {
			    	    		        @Override public void handle(Event event) {
			    	    		        	
			    	    		        	pathTransitions.setDelay(Duration.seconds(5));
			    	    		        refreshScene();
			    	    		        
			    	    		        }
			    	    		      }),
			    	    			new KeyFrame(Duration.millis(100))
			    	    			);
			    	    	timeline.setCycleCount(Timeline.INDEFINITE);

			    	   
			    	        //counter.reset();
			    	        timeline.play();
			    	        pathTransitions.play();
			    	    }
			    	});
			     
			    
			     //////////////////////////////////////////////////////////////////////////////////////////////
			     
			     Path paths1=new Path();
			      MoveTo moveTos1 = new MoveTo(1100,0);
			      //Create new path transition
			     PathTransition pathTransitions1 = new PathTransition();
			      pathTransitions1.setDuration(Duration.seconds(8));
			      //
			      
			      pathTransitions1.setDelay(Duration.seconds(25));
			      //Set node to be animated
			      pathTransitions1.setNode(imageView18);
			      LineTo lines1= new LineTo(1100,750);
			      paths1.getElements().add(moveTos1); 
			      paths1.getElements().addAll(lines1); 
			      
			      pathTransitions1.setPath(paths1);
			
			     pathTransitions1.setOnFinished(new EventHandler<ActionEvent>() {
			    	    @Override
			    	    public void handle(ActionEvent event) {
			    	        // do something
			    	    	final Timeline timeline = new Timeline(new KeyFrame(Duration.millis(5000), new EventHandler() {
			    	    		        @Override public void handle(Event event) {
			    	    		        	
			    	    		        	pathTransitions1.setDelay(Duration.seconds(5));
			    	    		        refreshScene1();
			    	    		        
			    	    		        }
			    	    		      }),
			    	    			new KeyFrame(Duration.millis(100))
			    	    			);
			    	    	timeline.setCycleCount(Timeline.INDEFINITE);

			    	   
			    	        //counter.reset();
			    	        timeline.play();
			    	        pathTransitions1.play();
			    	    }
			    	});
			     
			      
			     pathTransitions.play(); 
			     pathTransitions1.play();
			     pathTransitions1.setDelay(Duration.seconds(5));
			     pathTransitions.setDelay(Duration.seconds(5));
			 ////////////////////////////////////////////////////////////////////////////////////////////////    
			     Pane pane = new Pane();
			     pane.setPrefSize(400,400);
		      //Creating a Group object  
		      //
			/*scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());*/
			     VBox vBox = new VBox();
			        vBox.getChildren().addAll(hBox15,hBox1,hBox12,hBox14,hBox13,peashooter.gethbox(),sunflower.gethbox(),walnut.gethbox(),beetroot.gethbox());
			       //root.getChildren().addAll(vBox);
		      root = new Group(imageView1,imageView2,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView13,imageView14,imageView18,normal1.getigw(),normal2.getigw(),normal3.getigw(),normal4.getigw(),normal5.getigw(),s1.getigw(),s2.getigw(),s3.getigw(),s4.getigw(),s5.getigw(),cap1.getigw(),cap2.getigw(),cap3.getigw(),cap4.getigw(),cap5.getigw(),news1.getigw(),news2.getigw(),news3.getigw(),news4.getigw(),news5.getigw(),vBox,sphere);
		      Scene scene1 = new Scene(root,1250,700);
		      root.getChildren().add(button3);
		      //root.getChildren().add(imageView12);
		      //root.getChildren().add(imageView11);
		      //root.getChildren().add(imageView15);
		      //root.getChildren().add(imageView16);
		      //root.getChildren().add(imageView17);
		     // root.getChildren().add(imageView18);
		        //vbox1.setSpacing(1);
		      	//vbox1.getChildren().add((label1));
		        //root.getChildren().add(vbox1);
		        //vbox1.getChildren().add(button5);
		        
		      
		        //vbox2.setSpacing(1);
		        //vbox2.getChildren().add(button4);
		        //root.getChildren().add(vbox2);
		        label2.relocate(300,680);
		        label1.relocate(420,680);
		        label3.relocate(565,680);
		        label4.relocate(715,680);
		        label5.relocate(860,680);
		        label6.relocate(1000,680);
		        label.relocate(650, 30);
		        labels.relocate(320, 30);// You can put this label, wherever you want!
		        label.setFont(new Font(MAX_FONT_SIZE));
		        labels.setFont(new Font(MAX_FONT_SIZE));// set to Label
		        label1.setFont(new Font(MAX_FONT_SIZE));
		        label2.setFont(new Font(MAX_FONT_SIZE));
		        label3.setFont(new Font(MAX_FONT_SIZE));
		        label4.setFont(new Font(MAX_FONT_SIZE));
		        label5.setFont(new Font(MAX_FONT_SIZE));
		        label6.setFont(new Font(MAX_FONT_SIZE));
		        root.getChildren().add(label);
		        root.getChildren().add(label2);
		        root.getChildren().add(label1);
		        root.getChildren().add(labels);
		        root.getChildren().add(label3);
		        root.getChildren().add(label4);
		        root.getChildren().add(label5);
		        root.getChildren().add(label6);
		        
		        labels.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 35));
		        label1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		        label2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		        label3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		        label4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		        label5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		        label6.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
		        labels.setFill(Color.BROWN); 
		        label1.setFill(Color.YELLOW); 
		        label2.setFill(Color.YELLOW); 
		        label3.setFill(Color.YELLOW); 
		        label4.setFill(Color.YELLOW);
		        label5.setFill(Color.YELLOW);
		        label6.setFill(Color.YELLOW);
		        
		        //Setting the Stroke  
		        labels.setStrokeWidth(2); 
		        
		        // Setting the stroke color
		        labels.setStroke(Color.BLUE);
		        
		        label.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 35));
		        label.setFill(Color.CYAN); 
		        
		        //Setting the Stroke  
		        label.setStrokeWidth(2); 
		        
		        // Setting the stroke color
		        label.setStroke(Color.MAGENTA);
		       // vbox2.getChildren().add((label2));
		      stage.setResizable(false);
			  stage.setScene(scene1);
			  stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private int gt() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void counter(){
	    timer++;
	    //System.out.println(counter);

	}
	
	public static void main(String[] args) {
		launch(args);
		
      
	}
}
