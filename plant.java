package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class plant  {
	
	private int price;
	private double posx;
    private double posy;
    private double cx;
    private double cy;
    private int health;
    private int power;
    private  Group root;
    //private HBox hBox;
    //private  ImageView imageView;
    private double sizeX;
    private double sizeY;
    private boolean status;
    //private Player player;
    //private VBox vBox; 

    public plant(Group root ,double posx,double posy,int health, int power,double sizeX,double sizeY,double cx,double cy,boolean status/*,Player player*/){
        //this.player = player;
    	//this.hBox=new HBox();
    	this.posx=posx;
        this.posy=posy;
        this.cx=cx;
        this.cy=cy;
        this.health=health;
        this.power=power;
        //this.plant = new Image(new FileInputStream("C:\\Users\\HARSHIT\\Desktop\\beetroot.gif"));
        //this.plantView = new  ImageView(plant);
        //s.getChildren().add(plantView);
        this.root = root;
       this.status=status;
       // plantView.setY(600);
	   // plantView.setX(300); 
        this.sizeX = sizeX;
        this.sizeY =sizeY;
        /*hBox.setTranslateX(740);
    	hBox.setTranslateY(90);
        hBox.setPrefWidth(100);
        hBox.setPrefHeight(80);

       this.vBox = new VBox();
        vBox.getChildren().addAll(hBox);
        
       // root = new Group(s);
        //insertImage(plant,hBox);*/
    }

public void setPos(int row, int column){
	this.posx=row;
    this.posy=column;
}
public void setcPosx(int row){
	this.cx=row;
    
}
public void setcPosy(int column){

	this.cy=column;
}
public double getcposx() {
	return this.cx;
}

public double getcposy() {
	return this.cy;
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


public void setstatus(Boolean status) {
	this.status=true;
}
public Boolean getstatus() {
	if(this.health==0)
		this.status=false;
	return status;
}

}

