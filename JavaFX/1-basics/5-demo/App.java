import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage window) throws Exception {
    window.setTitle("GridPane");

    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));

    grid.setVgap(8);
    grid.setHgap(10);

    //username label
    Label username = new Label("Username:");
    GridPane.setConstraints(username, 0, 0); // chnéya bch nhot , column, Line

    //username input
    TextField inputName = new TextField();
    inputName.setPromptText("username");
    GridPane.setConstraints(inputName, 1, 0); // chnéya bch nhot , column, Line


    //password label
    Label password = new Label("Password:");
    GridPane.setConstraints(password, 0, 1); // chnéya bch nhot , column, Line

    //password input
    TextField inputPassword = new TextField("");
    inputPassword.setPromptText("password");
    GridPane.setConstraints(inputPassword, 1, 1); // chnéya bch nhot , column, Line

    //login Button
    Button loginButton = new Button("Login");
    GridPane.setConstraints(loginButton, 1, 2); // chnéya bch nhot , column, Line

    grid.getChildren().addAll(username, inputName, password, inputPassword, loginButton);

    Scene scene = new Scene(grid, 700, 570);
    window.setScene(scene);
    window.show();

  }
}
