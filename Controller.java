package application;
import java.util.Date;
import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/** Simple JavaFX Animation Sample. */
public class Controller extends Application {
  private       int         x        = 20;
  private       String      status   = "";
  private final Circle      dot      = new Circle(20, 20, 5);
  private final TimeCounter counter  = new TimeCounter();

  public static void main(String[] args) throws Exception { launch(args); }
  @Override public void start(final Stage stage) throws Exception {
    final Timeline timeline = new Timeline(
      new KeyFrame(Duration.ZERO, new EventHandler() {
        @Override public void handle(Event event) {
          refreshScene();
        }
      }),  
      new KeyFrame(Duration.millis(400))
    );
    timeline.setCycleCount(Timeline.INDEFINITE);

    stage.setScene(new Scene(new Group(dot), 50, 50));
    stage.show();

    counter.reset();
    timeline.play();
  }

  private void refreshScene() {
    gotoxy(x, 20);

    status = "*****".equals(status) ? "*" : status + "*";
    System.out.println(String.format("%7d", counter.elapsed()) + " ms " + x + " " + status);

    if (x == 24) {
      x = 20;
    } else {
      x++;
    }
  }      

  private void gotoxy(int x, int y) {
    dot.setCenterX(x); 
    dot.setCenterY(y);
  }

  class TimeCounter {
    private long start = new Date().getTime();
    void reset()   { start = new Date().getTime(); }
    long elapsed() { return new Date().getTime() - start; }
  }
}