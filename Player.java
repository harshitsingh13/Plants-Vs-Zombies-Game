package application;


import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.text.Font;


public class Player {
    private int sun = 200;
    private ArrayList<plant> listPlants = new ArrayList<plant>();
    //private ArrayList<Pea> listPeas = new ArrayList<Pea>();
    Group root = new Group();
    

    
    public int getSun(){
        return this.sun;
    }


  
    public ArrayList<plant> getPlants(){
        return listPlants;
    }

    

  
   
    /**
     * add the plant that the player bought
     */
    public void addPlants(plant plant){
        listPlants.add(plant);
    }

    /**
     * add the peas which are weapons
     * @param pea
     */
   
}

