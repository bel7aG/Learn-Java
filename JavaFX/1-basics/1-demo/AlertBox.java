import javafx.stage.*;
  import javafx.scene.*;
  import javafx.scene.layout.*;
  import javafx.scene.control.*;
  import javafx.geometry.*;

public class AlertBox {
  public static void display(String title, String content) {
    Stage window = new Stage();

    // ma3néha loukén t7alét él winow hedhi lézém tetsaker bch najem nkamel like alert in javascript
    window.initModality(Modality.APPLICATION_MODAL);

    window.setTitle(title);
    window.setMinWidth(300);

    Label label = new Label(content);

    Button closeButton = new Button("close this idiot Java");

    closeButton.setOnAction(event -> window.close());

    VBox layout= new VBox(1);
    layout.getChildren().addAll(label, closeButton);

    layout.setAlignment(Pos.TOP_CENTER);

    Scene scene = new Scene(layout, 400, 400);
    window.setScene(scene);
    window.show();

  }
}
