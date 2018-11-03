public class Qustion {
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

  public static boolean identique(Question q) {
      return Question.ennonceQuestion == q.ennonceQuestion && Question.themeQuestion == q.themeQuestion;
  }

  public boolean identique(Question qOne, Qeustion qTwo) {
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
