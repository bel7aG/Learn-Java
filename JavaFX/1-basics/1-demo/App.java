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
    primaryStage.setTitle("bel7aG write javaFX for the first time xD"); //title mte3 el window
    myButton = new Button("ah nounou");

    myButton.setOnAction(event -> AlertBox.display("Welcome to hiven", "okey"));


    StackPane layout = new StackPane();
    layout.getChildren().add(myButton);
    Scene scene = new Scene(layout, 400, 300);
    primaryStage.setScene(scene);
    primaryStage.setMaximized(true); //thot stage (window) full screen maoujouda f new java 8
    primaryStage.show();
  }
}
