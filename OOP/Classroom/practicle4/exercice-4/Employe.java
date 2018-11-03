public class Employe {
  private int matricule;
  private String name;
  private String surname;
  private float impot;

  public Employe(int paramInt, String paramString1, String paramString2) {
    matricule = paramInt;
    name = paramString1;
    surname = paramString2;
  }

  public void setImpot(float paramFloat) {
    impot = paramFloat;
  }

  public float getImpot() {
    return impot;
  }

  public String toString() {
    String str = "";
    return str = str + matricule + "  " + name + "  " + surname;
  }
}
