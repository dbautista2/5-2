import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();

        // Create a circle and set its properties
        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // Add the circle to the pane
        pane.getChildren().add(circle);

        // Handle mouse pressed event
        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));

        // Handle mouse released event
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Change Color on Mouse Press/Release");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}