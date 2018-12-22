import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class App  extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage window) throws Exception {


    window.setTitle("Exam");

    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));

    grid.setVgap(8);
    grid.setHgap(10);



    //submit button
    Button sumbitButton = new Button("submit");
    sumbitButton.setOnAction((event) -> {
      QuestionRepUnique qOne = new QuestionRepUnique("Javascript is the best ?", "OOP");
      QuestionRepUnique qTwo = new QuestionRepUnique("Javascript compiler ?", "OOP");
      String[] possibleAnswerQOne = {"compile", "intrepreted", "compile and interpreted"};
      String[] possibleAnswerQTwo = {"API", "Nodejs", "C++"};
      qOne.setTabRepProposees(possibleAnswerQOne);
      qTwo.setTabRepProposees(possibleAnswerQTwo);
      qOne.setRepCorrect("compile and interpreted");
      qTwo.setRepCorrect("C++");
      Qcm exam = new Qcm("OOP");
      exam.addQuestion(qOne);
      exam.addQuestion(qTwo);
      exam.answerQuestion();
    });
    GridPane.setConstraints(sumbitButton, 1, 2); // chnéya bch nhot , column, Line

    grid.getChildren().addAll(sumbitButton);

    Scene scene = new Scene(grid, 700, 570);
    window.setScene(scene);
    window.show();

  }

}
