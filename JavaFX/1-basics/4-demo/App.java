import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
  Button myButton;
  Stage window;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    window = primaryStage;

    window.setTitle("my App"); //title mte3 el window

    window.setOnCloseRequest(event -> {
      event.consume();
      this.closeProgram();
    });

    myButton = new Button("ah nounou");

    myButton.setOnAction(event -> this.closeProgram());

    StackPane layout = new StackPane();
    layout.getChildren().add(myButton);

    Scene scene = new Scene(layout, 400, 300);

    window.setScene(scene);
    window.setMaximized(true); //thot stage (window) full screen maoujouda f new java 8
    window.show();
  }

   public void closeProgram() {
     boolean answer = new ConfirmBox().display("Are you want to exit ?", "Leave the program");
     if (answer) {
       window.close();
     }
   }

}
