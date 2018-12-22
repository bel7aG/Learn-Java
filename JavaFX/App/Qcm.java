import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.stage.*;
  import javafx.scene.*;
  import javafx.scene.layout.*;
  import javafx.scene.control.*;
  import javafx.geometry.*;


public class Qcm {
  Scanner userInput = new Scanner(System.in);
  private String themeQcm;
  private QuestionRepUnique[] tabQuestions = new QuestionRepUnique[30];
  private int nbQuestions;

  public Qcm(String themeQcm) {
    this.themeQcm = themeQcm;
  }

  public void addQuestion(QuestionRepUnique q) {
    if (nbQuestions < 30 && q.getTheme() == this.themeQcm) {
      this.tabQuestions[nbQuestions++] = q;
    } else {
      System.out.println("you cant add a question for some reasons ..");
    }
  }

  public int answerQuestion() {
    int choiceNumber;
    int k = 0;
    for (int i = 0; i < nbQuestions; i++) {
      Stage window = new Stage();
      window.setTitle("Exam");
      window.initModality(Modality.APPLICATION_MODAL);
      window.setMinWidth(300);

      GridPane grid = new GridPane();
      grid.setPadding(new Insets(10, 10, 10, 10));

      grid.setVgap(8);
      grid.setHgap(10);

      Label question = new Label(tabQuestions[i].toString());
      if (i == 0) {
        GridPane.setConstraints(question, 0, 0); // chnéya bch nhot , column, Line
        grid.getChildren().addAll(question);
      }
      if (i == 1) {
        GridPane.setConstraints(question, 0, (i + 4)); // chnéya bch nhot , column, Line
        grid.getChildren().addAll(question);
      }

      if (i == 2) {
        GridPane.setConstraints(question, 0, (i + 8)); // chnéya bch nhot , column, Line
        Label answer = new Label("answer to this question [1 or 2 or 3] : ");
        GridPane.setConstraints(answer, 0, (i + 10)); // chnéya bch nhot , column, Line
        TextField input = new TextField();
        input.setPromptText("Choose an answer");
        GridPane.setConstraints(input, 1, (i + 12)); // chnéya bch nhot , column, Line
        grid.getChildren().addAll(question, answer, input);

        Scene scene = new Scene(grid, 700, 570);
        window.setScene(scene);
        window.show();

      }



      // System.out.println("\n\n");
      // System.out.println(tabQuestions[i].toString());
      // System.out.println("\n\n");
      // System.out.print("answer to this question [1 or 2 or 3] : ");
      if (userInput.hasNextInt()) {
        do {
          choiceNumber = userInput.nextInt();
        } while (choiceNumber < 1 || choiceNumber > 3);

        if (tabQuestions[i].numRepCorrect() == choiceNumber) {
          k++;
        }
        System.out.println("\n\n");
      } else {

        // System.out.println("sorry ur keyboard give the wrong type.");
      }
    }
    if (k >= (float) (nbQuestions / 2))
      System.out.println("\n" + k + " Answers correct. PASSED\n");
    else
      System.out.println("\n" + k + " Answers correct. FAILED\n");
    return k;
  }
}
