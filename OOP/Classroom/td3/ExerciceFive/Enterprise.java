public class Enterprise implements Identity{
  private String socialRaison;
  private PersonneId responsable;

  public Enterprise(String socialRaison, PersonneId responsable) {
    this.socialRaison = socialRaison;
    this.responsable = responsable;
  }

  @Override
  public String presente() {
    return "\n\n\t\tsocialRaison: " + this.socialRaison;
  }

  public boolean compare(Object o) {
    if (!(o instanceof Enterprise)) {
      return false;
    } else {
      if (o.equals(Enterprise)) {
        return false;
      }
    }
    return false;
  }
}
