import java.util.Scanner;
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

}
