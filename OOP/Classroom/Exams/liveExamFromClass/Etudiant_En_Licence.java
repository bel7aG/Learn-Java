public class Etudiant_En_Licence extends Etudiant {

  private int annee, droit_AuLivres_Empruntes;

  public Etudiant_En_Licence(String matricule, String nom, String prenom, int nbreLivreEmpruntes, int annee, int droitAuLivresEmruntes) {
    super(matricule, nom, prenom, nbreLivreEmpruntes);
    this.annee = annee;
    this.droit_AuLivres_Empruntes = droit_AuLivres_Empruntes;
  }

  @Override
  public boolean Empruntert() {
    if (this.droit_AuLivres_Empruntes <= 3) {
      droit_AuLivres_Empruntes++;
      return true;
    }
    System.out.println("Desoler Maximum 3");
    return false;
  }

  public int getdroitAuLivresEmpruntes() {
    return this.droit_AuLivres_Empruntes;
  }

  @Override
  public String toString() {
    return super.toString() + "\nannee: " + this.annee + "  max emprunt = " + this.droit_AuLivres_Empruntes;
  }


}
