import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class App extends Application {
  Stage window;
  Scene sceneOne, sceneTwo;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    window = primaryStage;

    Label labelOne = new Label("This is the first Scene");
    Label labelTwo = new Label("This is the second Scene");

    Button buttonOne = new Button("Go to scene two");
    Button buttonTwo = new Button("Go to scene One");

    buttonOne.setOnAction((event) -> window.setScene(sceneTwo));
    buttonTwo.setOnAction((event) -> window.setScene(sceneOne));

    VBox layoutOne = new VBox();
    VBox layoutTwo = new VBox();

    layoutOne.getChildren().addAll(labelOne, buttonOne);
    layoutTwo.getChildren().addAll(labelTwo, buttonTwo);


    sceneOne = new Scene(layoutOne, 700, 400);
    sceneTwo = new Scene(layoutTwo, 700, 400);
    window.setScene(sceneOne);
    window.setTitle("Switch Scenes");
    window.show();
  }
}
