package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
interface actor{
	//private final String name;
	


public void setPos(int x, int y);
public void setHealth(int health);
public void setPower(int power);
public int getHealth();
public int getPower();
public int getPrice();
public void removeImage();
public void insertImage(Image i, HBox hb);
public String getName();
public VBox getvbox();
public HBox gethbox();
//public void getImage();
public Boolean getstatus();
public Image getimage();
}
