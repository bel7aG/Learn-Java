public abstract class Team {
  private String teamName, coach;
  public Team(String teamName, String coach) {
    this.teamName = teamName;
    this.coach = coach;
  }
  public abstract Stade affectedStade();
  public String toString() {
    return "\n\n\t\tTeam name: " + this.teamName + "\n\n\t\tcoach: " + this.coach;
  }
}
