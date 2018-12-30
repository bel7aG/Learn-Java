import java.util.ArrayList;

public class Epreuve {
  private String nomEpreuve;
  private final float RECORD_A_BATTRE = 17.12; // meter
  private ArrayList<Lanceur> tabLanceurs;
  
  public Epreuve(String nomEpreuve, ArrayList<Lanceur> tabLanceurs) {
    this.nomEpreuve = nomEpreuve;
    this.tabLanceurs = tabLanceurs;
  }
  
  public ArrayList<Lanceur> lesLanceurBattantsRecord() {
    ArrayList<Lanceur> newArray = new ArrayList<Lanceur>();
    
    for (int i = 0; i < tabLanceurs.size(); i++) {
      if (tabLanceurs.getResultat().getDistance() > RECORD_A_BATTRE) {
        newArray.add(tabLanceurs.get(i));
      }
    }
    return newArray;
  }


}