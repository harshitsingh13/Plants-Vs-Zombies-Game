package application;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class JavaFXApplication extends Application
{
    // Create the TextFields
    TextField sourceFld = new TextField("This is the Source Text");
    TextField targetFld = new TextField("Drag and drop the source text here");
 
    // Create the LoggingArea
    TextArea loggingArea = new TextArea("");
 
    public static void main(String[] args)
    {
        Application.launch(args);
    }
 
    @Override
    public void start(Stage stage)
    {
        // Set the Size of the TextFields
        sourceFld.setPrefSize(200, 20);
        targetFld.setPrefSize(200, 20);
 
        // Create the Labels
        Label sourceLbl = new Label("Source Node:");
        Label targetLbl = new Label("Target Node:");
 
        // Create the GridPane
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(20);
 
        // Add the Labels and Fields to the Pane
        pane.addRow(0, sourceLbl, sourceFld);
        pane.addRow(1, targetLbl, targetFld);
 
        // Add mouse event handlers for the source
        sourceFld.setOnMousePressed(new EventHandler <MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                sourceFld.setMouseTransparent(true);
                writelog("Event on Source: mouse pressed");
                event.setDragDetect(true);
            }
        });
 
        sourceFld.setOnMouseReleased(new EventHandler <MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                sourceFld.setMouseTransparent(false);
                writelog("Event on Source: mouse released");
            }
        });
 
        sourceFld.setOnMouseDragged(new EventHandler <MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                writelog("Event on Source: mouse dragged");
                event.setDragDetect(false);
            }
        });
 
        sourceFld.setOnDragDetected(new EventHandler <MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                sourceFld.startFullDrag();
                writelog("Event on Source: drag detected");
            }
        });
 
        // Add mouse event handlers for the target
        targetFld.setOnMouseDragEntered(new EventHandler <MouseDragEvent>()
        {
            public void handle(MouseDragEvent event)
            {
                writelog("Event on Target: mouse dragged");
            }
        });
 
        targetFld.setOnMouseDragOver(new EventHandler <MouseDragEvent>()
        {
            public void handle(MouseDragEvent event)
            {
                writelog("Event on Target: mouse drag over");
            }
        });
 
        targetFld.setOnMouseDragReleased(new EventHandler <MouseDragEvent>()
        {
            public void handle(MouseDragEvent event)
            {
                targetFld.setText(sourceFld.getSelectedText());
                writelog("Event on Target: mouse drag released");
            }
        });
 
        targetFld.setOnMouseDragExited(new EventHandler <MouseDragEvent>()
        {
            public void handle(MouseDragEvent event)
            {
                writelog("Event on Target: mouse drag exited");
            }
        });
 
        // Create the VBox
        VBox root = new VBox();
        // Add the Pane and The LoggingArea to the VBox
        root.getChildren().addAll(pane,loggingArea);
        // Set the Style of the VBox
        root.setStyle("-fx-padding: 10;" +
            "-fx-border-style: solid inside;" +
            "-fx-border-width: 2;" +
            "-fx-border-insets: 5;" +
            "-fx-border-radius: 5;" +
            "-fx-border-color: blue;");
 
        // Create the Scene
        Scene scene = new Scene(root,300,200);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title
        stage.setTitle("A Press Drag Release Example");
        // Display the Stage
        stage.show();
    }
 
    // Helper Method for Logging
    private void writelog(String text)
    {
        this.loggingArea.appendText(text + "\n");
    }
}
