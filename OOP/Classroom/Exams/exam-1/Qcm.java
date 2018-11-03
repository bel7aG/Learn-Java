import java.util.Scanner;

public class Qcm {
  Scanner userInput = new Scanner(System.in);
  private String themeQcm;
  private QuestionRepUnique[] tabQuestions = new QuestionRepUnique[30];
  private int nbQuestions = 0;

  public Qcm(String themeQcm) {
    this.themeQcm = themeQcm;
  }

  public void addQuestion(QuestionRepUnique q) {
    if (nbQuestions < 30 && q.getTheme() == this.themeQcm) {
      this.tabQuestions[nbQuestions] = q;
      nbQuestions++;
    } else {
      System.out.println("you cant add a question for some reasons ..");
    }
  }

  public int answerQuestion() {
    int choiceNumber;
    int k = 0;
    for (int i = 0; i < nbQuestions; i++) {
      System.out.println(tabQuestions[i].toString());
      System.out.println("\n\n");
      if (userInput.hasNextInt()) {
        do {
          System.out.println("\n\nanswer to this quetion [1 or 2 or 3]");
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
    System.out.println("\n" + k + "correct\n");
    return k;
  }
}
