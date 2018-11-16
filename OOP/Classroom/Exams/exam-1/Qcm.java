import java.util.Scanner;

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
      System.out.println("\n\n");
      System.out.println(tabQuestions[i].toString());
      System.out.println("\n\n");
      System.out.print("answer to this question [1 or 2 or 3] : ");
      if (userInput.hasNextInt()) {
        do {
          choiceNumber = userInput.nextInt();
        } while (choiceNumber < 1 || choiceNumber > 3);

        if (tabQuestions[i].numRepCorrect() == choiceNumber) {
          k++;
        }
        System.out.println("\n\n");
      } else {
        System.out.println("sorry ur keyboard give the wrong type.");
      }
    }
    if (k >= (float) (nbQuestions / 2))
      System.out.println("\n" + k + " Answers correct. PASSED\n");
    else
      System.out.println("\n" + k + " Answers correct. FAILED\n");

    return k;
  }
}
