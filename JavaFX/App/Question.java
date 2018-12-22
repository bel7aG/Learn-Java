import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Question {
  private String ennonceQuestion;
  private String themeQuestion;
  protected String[] tabRepPropsees = new String[3];
  protected int nbRepCorrect;

  public Question(String eq, String tq, int nrc) {
    this.ennonceQuestion = eq;
    this.themeQuestion = tq;
    this.nbRepCorrect = nrc;
  }

  public void setTabRepProposees(String[] t) {
    this.tabRepPropsees = t;
  }

  public static boolean identique(Question qOne, Question qTwo) {
      return ((qOne.ennonceQuestion == qTwo.ennonceQuestion) && (qOne.themeQuestion == qTwo.themeQuestion));
  }

  public boolean identique(Question Q) {
    return this.ennonceQuestion == Q.ennonceQuestion && this.themeQuestion == Q.themeQuestion;
  }

  public String toString() {
    String stream = "";
    stream += this.ennonceQuestion + "(" + this.nbRepCorrect + ")";
    for (int i = 0; i < this.tabRepPropsees.length; i++) {
      stream += "\n" + (i + 1) + "- " + this.tabRepPropsees[i];
    }
    return stream;
  }

  public String getTheme() {
    return this.themeQuestion;
  }
}
