package application;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class king implements Zombie {
    private int posx;
    private int posy;
    private int health = 500;
    private int power = 100;
    private HBox hBox;
    private VBox vBox;
    private double sizeX;
    private double sizeY;
    private boolean status;
    private StackPane s = new StackPane();
    private Group root;
    private Image zombie;
    private ImageView zombieView;
    private double imageY;
    private double imageX;
    private double speed;
    private double ispeed;


    public king(Group root,int posx,int posy) throws FileNotFoundException {
    	this.hBox=new HBox();
        this.posx = posx;
        this.posy = posy;
        this.zombie = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\kingz.gif"));
        this.zombieView = new ImageView(zombie);
        s.getChildren().add(zombieView);
        zombieView.setX(posx);
        zombieView.setY(posy);
        zombieView.setFitHeight(120); 
	     zombieView.setFitWidth(130);
	    root = new Group(s,zombieView);
	     
        
        //insertImage(plant,hBox);
    }
public ImageView getigw() {
	return this.zombieView;
}
  
    public void removeImage() {
        this.s.getChildren().remove(this.zombieView);
        this.root.getChildren().remove(this.s);
    }

  
    public void setImagePosition(double x, double y) {
        this.imageX = x;
        this.imageY = y;
    }

    public double getImagePositionX() {
        return this.imageX;
    }


    public int getposx() {
        return this.posx;
    }

    public int getposy() {
        return this.posy;
    }
   
    public void setposy(int column) {
        this.posy = column;
    }
    public void setposx(int row) {
        this.posx = row;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;

    }

    public int getPower() {
        return power;
    }

   
    public double getISpeed() {
        return ispeed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;

    }

  
}