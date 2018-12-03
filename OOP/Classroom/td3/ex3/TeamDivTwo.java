public class TeamDivTwo extends Team {
  private Stade[] stadeArray = new Stade[3];

  public TeamDivTwo(String teamName, String coach, Stade[] stadeArray) {
    super(teamName, coach);
    this.stadeArray = stadeArray;
  }

  public Stade affectedStade() {
    for (Stade stade : stadeArray) {
      if (stade.getEtat()) {
        return stade;
      }
    }
    return null;
  }

  public String toString() {
    String isAffected = affectedStade().getEtat() ? this.affectedStade().getStadeName() : "no stade Affected all not alloawed at this moment." ;
    return super.toString() + "\n\n\t\tPrincipal stade: " + isAffected;
  }
}
