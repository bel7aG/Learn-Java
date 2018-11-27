public class TeamDevisionTwo extends Team {

  private Stade[] stadeArray = new Stade[3];

  public TeamDevisionTwo(String teamName, String coach, Stade[] stadeArray) {
    super(teamName, coach);
    this.principalStade = principalStade;
  }

  @Override
  public Stade affectedStade() {
    for (int i = 0; i < stadeArray.length; i++) {
      if (stadeArray[i].getIsReady()) {
        return stadeArray[i];
      }
    }
    return null;
  }
}
