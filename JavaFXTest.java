package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.control.Label; 
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class JavaFXTest extends Application implements EventHandler<ActionEvent>{

    Button button;
    Button button2;
    Counter counter = new Counter(0);
    Counter timecounter = new Counter(0);
    Text text_counter = new Text(counter.S_count.get());
    Text text_timecounter = new Text(timecounter.S_count.get());

    Date currdate = new Date();
    int currsec = currdate.getSeconds();


    public static void main(String[] args) {
        launch(args);


    }

    class timerclass {
        Timer timer1;
        private int timecounter = 0;

        TimerTask Task1 = new TimerTask() {
            @Override
            public void run() {
                setTimecounter(getTimecounter()+1);
            }
        };

        public timerclass(){
            timer1 = new Timer();

        }

        public int getTimecounter() {
            return timecounter;
        }

        public void setTimecounter(int timecounter) {
            this.timecounter = timecounter;
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Counter Window");

        button = new Button();
        button2 = new Button();
        button.setText("Reset");
        button.setOnAction(this);
        button2.setText("Tick");
        button2.setOnAction(this);
        button.setTranslateY(-120);
        button2.setTranslateY(-80);
        text_counter.textProperty().bind(counter.S_count);
        text_timecounter.textProperty().bind(timecounter.S_count);
        text_timecounter.setTranslateX(-100);



        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2);
        layout.getChildren().add(text_counter);
        layout.getChildren().add(text_timecounter);

        Scene scene = new Scene(layout, 360,280);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            counter.Reset();
        }
        if(event.getSource()==button2){
            counter.Tick();
        }
    }
}