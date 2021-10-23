package application;
import javafx.scene.input.DragEvent;
import javafx.scene.effect.BlendMode;
import javafx.geometry.Insets;	
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import javafx.scene.text.*; 
import javafx.animation.PathTransition;
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

public class sunflower implements actor{
    private int price = 50;
    private int posx;
    private int posy;
    private int health = 500;
    private int power = 0;
    private StackPane s = new StackPane();
    private  Group root;
    private Image plant;
    private HBox hBox;
    private  ImageView plantView;
    private double sizeX;
    private double sizeY;
    private boolean status;
    //private Player player;
    private VBox vBox; 

    public sunflower(Group root /*,Player player*/) throws FileNotFoundException{
        //this.player = player;
    	this.hBox=new HBox();
    	
        this.posx=320;
        this.posy=250;
        this.plant = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\sun_flower.gif"));
        this.plantView = new  ImageView(plant);
        s.getChildren().add(plantView);
        this.root = root;
       
       // plantView.setY(600);
	   // plantView.setX(300); 
        this.sizeX = 100;
        this.sizeY = 80;
        hBox.setTranslateX(320);
    	hBox.setTranslateY(250);
        hBox.setPrefWidth(100);
        hBox.setPrefHeight(80);

       this.vBox = new VBox();
        vBox.getChildren().addAll(hBox);
        
        root = new Group(s,plantView,vBox);
        //insertImage(plant,hBox);
    }
    public void insertImage(Image i, HBox hb){
        
        ImageView iv = new ImageView();
        
        iv.setImage(i);
         
        //setupGestureSource(iv);
        hb.getChildren().add(iv);
    }
    public void removeImage(){
        this.s.getChildren().remove(this.plantView);
        this.root.getChildren().remove(this.s);
    }
    public void setPos(int row, int column){
    	this.posx=430;
        this.posy=270;
    }

    public void setSize(double width, double height) {
        this.plantView.setFitWidth(width);
        this.plantView.setFitHeight(height);
    }

    
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return "sunflower";
    }
    public VBox getvbox() {
    	return vBox;
    }
    public HBox gethbox() {
    	return hBox;
    }
    public Image getimage() {
    	return plant;
    }
    public void setstatus(Boolean status) {
    	this.status=true;
    }
    public Boolean getstatus() {
    	if(this.health==0)
    		this.status=false;
    	return status;
    }
	
}

