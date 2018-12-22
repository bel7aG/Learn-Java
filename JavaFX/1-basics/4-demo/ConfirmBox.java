import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

  static Boolean answer;

  public static Boolean display(String title, String content) {


    Stage window = new Stage();

    window.initModality(Modality.APPLICATION_MODAL);

    window.setTitle(title);

    Label label = new Label(content);

    Button truthyButton = new Button("Yes");
    truthyButton.setOnAction(event -> {
      answer = true;
      window.close();
    });

    Button falsyButton = new Button("No");
    falsyButton.setOnAction(event -> {
      answer = false;
      window.close();
    });


    VBox layout = new VBox();
    layout.getChildren().addAll(label, truthyButton, falsyButton);
    layout.setAlignment(Pos.CENTER);

    Scene scene = new Scene(layout, 600, 400);
    window.setScene(scene);
    window.showAndWait();
    return answer;
  }
}
