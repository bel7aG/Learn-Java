public class Etudiant_En_Master extends Etudiant {

  private int droit_Au_Livre_Empruntes;
  private String  sujetMemoire;

  public Etudiant_En_Master(String matricule, String nom, String prenom, int nbreLivreEmpruntes, int droit_Au_Livre_Empruntes, String sujetMemoire) {
    super(matricule, nom, prenom, nbreLivreEmpruntes);
    this.droit_Au_Livre_Empruntes = droit_Au_Livre_Empruntes;
    this.sujetMemoire = sujetMemoire;
  }

  @Override
  public boolean Empruntert() {
    if (this.droit_Au_Livre_Empruntes <= 6) {
      droit_Au_Livre_Empruntes++;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return super.toString() ;
  }



  public int getdroitAuLivresEmpruntes() {
    return this.droit_Au_Livre_Empruntes;
  }


}
