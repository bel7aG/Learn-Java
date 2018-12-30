public class ResultatLancement implements IResultat {
  private float distance;
  private String dateResultat;
  
  public ResultatLancement(float distance, String dateResultat) {
    this.distance = distance;
    this.dateResultat = dateResultat;
  }
  
  public float getDistance() {
    return this.distance;
  }
  
  @Override
  public String getInformation() {
    return "distance: " + this.distance + "\n\ndateResultat: " + this.dateResultat;
  }
  
  public boolean resultatMeilleur(IResultat r) {
    if (r instanceof ResultatLancement) {
      ResultatLancement result = (ResultatLancement) r;
      if (this.getDistance() > result.getDistance()) {
        return true;
      }
    }
    return false;
  }
}