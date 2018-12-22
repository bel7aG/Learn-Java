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
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class App extends Application{

  QuestionRepUnique qOne = new QuestionRepUnique("My Main Language is ?", "OOP");
  QuestionRepUnique qTwo = new QuestionRepUnique("Best OOP language is ?", "OOP");

  public static Scene scene;
  public static VBox layout;


  public static void main(String[] args) {
    launch(args);
  }


  @Override
  public void start(Stage window) throws Exception {
    window.setTitle("QCM");

    layout = new VBox();

    String[] possibleAnswerQOne = {"Javascript", "Java", "Python"};
    String[] possibleAnswerQTwo = {"C++", "Nodejs", "Java"};

    qOne.setTabRepProposees(possibleAnswerQOne);
    qTwo.setTabRepProposees(possibleAnswerQTwo);

    Qcm exam = new Qcm("OOP");
    exam.addQuestion(qOne);
    exam.addQuestion(qTwo);

    qOne.setRepCorrect("Javascript");
    qTwo.setRepCorrect("Java");


    Label questionOne = new Label(qOne.getEnnonceQuestion());
    ChoiceBox<String> choiceBoxOne = new ChoiceBox();

    choiceBoxOne.getItems().add(possibleAnswerQOne[0]);
    choiceBoxOne.getItems().add(possibleAnswerQOne[1]);
    choiceBoxOne.getItems().add(possibleAnswerQOne[2]);
    choiceBoxOne.setValue(possibleAnswerQOne[0]);


    Label questionTwo = new Label(qTwo.getEnnonceQuestion());
    ChoiceBox<String> choiceBoxTwo = new ChoiceBox();

    choiceBoxTwo.getItems().add(possibleAnswerQTwo[0]);
    choiceBoxTwo.getItems().add(possibleAnswerQTwo[1]);
    choiceBoxTwo.getItems().add(possibleAnswerQTwo[2]);
    choiceBoxTwo.setValue(possibleAnswerQTwo[0]);



    layout.setPadding(new Insets(30, 30, 30, 30));

    Button submit = new Button("submit");

    layout.getChildren().addAll(questionOne, choiceBoxOne, questionTwo, choiceBoxTwo, submit);


    scene = new Scene(layout, 700, 570);
    scene.getStylesheets().add("App.css");
    window.setScene(scene);
    window.show();



    submit.setOnAction((event) -> this.getChoice(choiceBoxOne, choiceBoxTwo));


  }

  public void getChoice(ChoiceBox<String> choiceBoxOne, ChoiceBox<String> choiceBoxTwo) {
    int corrects = 0;
    if (choiceBoxOne.getValue() == qOne.getRepCorrect()) {
      corrects += 1;
    }
    if (choiceBoxTwo.getValue() == qTwo.getRepCorrect()) {
      corrects += 1;
    }
    Stage window = new Stage();

      // ma3néha loukén t7alét él window hedhi lézém tetsaker bch najem nkamel like alert in javascript
      window.initModality(Modality.APPLICATION_MODAL);

      window.setTitle("Number of Correct answers.");
      window.setMinWidth(300);

      Label label = new Label("Number of Correct answers:" + "\n" + corrects);

      Button closeButton = new Button("Done");

      closeButton.setOnAction(event -> window.close());

      VBox layout= new VBox(1);
      layout.getChildren().addAll(label, closeButton);

      layout.setAlignment(Pos.TOP_CENTER);

      Scene scene = new Scene(layout, 400, 400);
      scene.getStylesheets().add("App.css");
      window.setScene(scene);
      window.show();
  }
}
