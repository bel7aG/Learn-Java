public abstract class Team {

  private String teamName;
  private String coach;

  public Team(String teamName, String coach) {
    this.teamName = teamName;
    this.coach = coach;
  }

  public abstract Stade affectedStade();
}
