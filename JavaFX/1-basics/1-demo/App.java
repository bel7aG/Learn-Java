import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
  Button myButton;
  public static void main(String[] args) {
    launch(args); // Method inside Application class ==> setup your program as javafx Application
    // in javaFX the entire window called STAGE and the content inside your window that's the SCENE
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("bel7aG write javaFX for the first time xD");
    myButton = new Button();
    myButton.setText("Click me");

    myButton.setOnAction(event -> System.out.println("is this a callback inside java ?"));

    StackPane layout = new StackPane();
    layout.getChildren().add(myButton);
    Scene scene = new Scene(layout, 400, 300);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
