import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class App extends Application {
  public static Scene scene;
  public static VBox layout;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage window) throws Exception {
    window.setTitle("GridPane");

    layout = new VBox();

    Button submit = new Button("submit");

    ChoiceBox<String> choiceBox = new ChoiceBox();

    choiceBox.getItems().add("bel7aG");
    choiceBox.getItems().add("javascript");
    choiceBox.getItems().add("ReactJS");
    choiceBox.getItems().add("GraphQL");

    layout.setPadding(new Insets(30, 30, 30, 30));
    layout.getChildren().addAll(choiceBox, submit);


    scene = new Scene(layout, 700, 570);
    window.setScene(scene);
    window.show();

  }
}
