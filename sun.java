package application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class sun{
	private final TimeCounter counter  = new TimeCounter();
	private final int timesec=5;
	private int posx;
	private int posy;
	private int destx;
	private int desty;
	private StackPane s = new StackPane();
    private  Group root;
    private Image image;
    private  ImageView imageView;
    private Timer timer;
    public PathTransition pathTransitions;
    sun(Group root)throws FileNotFoundException{
    	this.posx=300;
        this.posy=50;
        this.destx=300;
        this.desty=700;
        timer =new Timer();
        this.image = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\sun.gif"));
        this.imageView = new  ImageView(image);
        s.getChildren().add(imageView);
        this.root = root;
        root = new Group(s);
        //timer.schedule(new RemindTask(), timesec*1000);
    }
    public Timer gettimer() {
    	return timer;
    }	   public void hello(final Stage stage) throws Exception {
        final Timeline timeline = new Timeline(
  	          new KeyFrame(Duration.seconds(this.timesec), new EventHandler() {
  	            @Override public void handle(Event event) {
  	              refreshScene();
  	            }
  	          }),  
  	          new KeyFrame(Duration.millis(4000))
  	        );
  	        timeline.setCycleCount(Timeline.INDEFINITE);

  	       
  	        counter.reset();
  	        timeline.play();
  	      }
  	   
  	   private void gotoxy(int x, int y) {
  		   
  		    imageView.setX(300);; 
  		    imageView.setY(50);
  		  }

  		  class TimeCounter {
  		    private long start = new Date().getTime();
  		    void reset()   { start = new Date().getTime(); }
  		    long elapsed() { return new Date().getTime() - start; }
  		  }
  		  
  		  private void refreshScene() {
  			    gotoxy(300,50);

  			  } 
    
    
        public void run(int x,int y,int l,int m) {
    	Path paths=new Path();
	      MoveTo moveTos = new MoveTo(x,y);
	      //Create new path transition
	      pathTransitions = new PathTransition();
	      pathTransitions.setDuration(Duration.seconds(12));
	      //pathTransitions.setDelay(Duration.seconds(5));
	      //
	      //Set node to be animated
	      pathTransitions.setNode(this.imageView);
	      LineTo lines= new LineTo(l,m);
	      paths.getElements().add(moveTos); 
	      paths.getElements().addAll(lines); 
	      
	      pathTransitions.setPath(paths);
	
	     pathTransitions.setOnFinished(new EventHandler<ActionEvent>() {
	    	    @Override
	    	    public void handle(ActionEvent event) {
	    	        // do something
	    	    	final Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, new EventHandler() {
	    		        @Override public void handle(Event event) {
	    		          refreshScene();
	    		        }
	    		      }),
	    			new KeyFrame(Duration.millis(12000))
	    			);
	    	timeline.setCycleCount(Timeline.INDEFINITE);

	   
	        counter.reset();
	        timeline.play();
	        pathTransitions.play();
	    }
	});
 
  
 pathTransitions.play(); 
    }
        
}