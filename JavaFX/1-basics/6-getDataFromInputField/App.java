import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
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


    CheckBox boxOne = new CheckBox("choice 1");
    CheckBox boxTwo = new CheckBox("choice 2");
    Button submit = new Button("submit");
    submit.setOnAction((event) -> handleOptions(boxOne, boxTwo));

    layout.getChildren().addAll(submit, boxOne, boxTwo);


    scene = new Scene(layout, 700, 570);
    window.setScene(scene);
    window.show();

  }

  public void handleOptions(CheckBox one, CheckBox two) {
    if (one.isSelected() || two.isSelected()) {
      if (one.isSelected()) {
        Label resultOne = new Label("box One");
        layout.getChildren().add(resultOne);
      }

      if (two.isSelected()) {
        Label resultTwo = new Label("box Two");
        layout.getChildren().add(resultTwo);

      }
    } else {
      Label result = new Label("No result");
      layout.getChildren().add(result);
    }

  }
}
