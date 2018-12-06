public class EnterpriseID implements Identite {
  private String raisonSocial;
  private PersonneID resonable;

  public EnterpriseID(String raisonSocial, PersonneID resonable) {
    this.raisonSocial = raisonSocial;
    this.resonable = resonable;
  }

  public String PersonneID() {
    return resonable.PersonneID() + "\n\n\tRaison Social: " + this.raisonSocial;
  }

  public boolean comparer(Object o) {
    if (o instanceof EnterpriseID) {
      EnterpriseID e = (EnterpriseID) o;
      return this.raisonSocial == e.raisonSocial && this.resonable.comparer(o) == e.resonable.comparer(o);
    } else {
      return false;
    }
  }

}
