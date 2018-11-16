public class QuestionRepUnique extends Question {
  private String repCorrect;

  public QuestionRepUnique(String eq, String tq) {
    super(eq, tq, 1);
  }

  public void setRepCorrect(String repCorrect) {
    this.repCorrect = repCorrect;
  }

  public int numRepCorrect() {
    for (int i = 0; i < super.tabRepPropsees.length; i++) {
      if (tabRepPropsees[i] == this.repCorrect) {
        return i + 1;
      }
    }
    return 0;
  }
}
