package application;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/** @see http://stackoverflow.com/a/31443755/230513 */
public class AnimationTest extends Application {

    private static final int SIZE = 256;
    private static final int RECT = SIZE / 4;
    private static final int R2 = RECT / 2;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Animation Test");
        Rectangle rect = new Rectangle(0, 0, RECT, RECT);
        rect.setArcHeight(16);
        rect.setArcWidth(16);
        rect.setFill(Color.GOLD);
        Pane root = new Pane();
        root.getChildren().add(rect);
        Scene scene = new Scene(root, SIZE, SIZE);
        stage.setScene(scene);
        stage.show();

        Path path = new Path();
        path.getElements().add(new MoveTo(R2, R2));
        path.getElements().add(new LineTo(SIZE - R2, SIZE - R2));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(1000));
        pathTransition.setPath(path);
        pathTransition.setNode(rect);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();
    }

    public static void main(String[] args) {
        launch(args);
    }

}