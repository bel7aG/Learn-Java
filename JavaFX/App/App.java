
public class App {
  public static void main(String[] args) {
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
  }
}
