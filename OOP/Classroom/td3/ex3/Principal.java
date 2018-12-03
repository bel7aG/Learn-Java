public class Principal {
  public static void main(String[] args) {
    Stade radesStade = new Stade("rades", true);
    TeamDivOne teamOne = new TeamDivOne("teamOne", "Belhassen", radesStade, "Gharsallah");

    System.out.println(teamOne.toString());

    Stade[] stadeArray = new Stade[3];
    stadeArray[0] = new Stade("rades", false);
    stadeArray[1] = new Stade("psg", false);
    stadeArray[2] = new Stade("barca", true);

    TeamDivTwo teamTwo = new TeamDivTwo("teamTwo", "lola", stadeArray);

    System.out.println(teamTwo.toString());

  }
}
