public class TeamDevisionOne extends Team {

  private Stade principalStade;
  private String doctor;

  public TeamDevisionOne(String teamName, String coach, Stade principalStade, String doctor) {
    super(teamName, coach);
    this.principalStade = principalStade;
    this.doctor = doctor;
  }

  @Override
  public Stade affectedStade() {
    return this.principalStade;
  }

}
