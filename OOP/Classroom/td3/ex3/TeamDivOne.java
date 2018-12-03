public class TeamDivOne extends Team {
  private Stade principalStade;
  private String doctor;

  public TeamDivOne(String teamName, String coach, Stade principalStade, String doctor) {
    super(teamName, coach);
    this.principalStade = principalStade;
    this.doctor = doctor;
  }

  public Stade affectedStade() {
    return this.principalStade;
  }

  public String toString() {
    return super.toString() + "\n\n\t\tPrincipal stade: " + this.principalStade.getStadeName() + "\n\n\t\tdoctor: " + this.doctor;
  }

}
