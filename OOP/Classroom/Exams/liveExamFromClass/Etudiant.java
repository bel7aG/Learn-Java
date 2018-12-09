public abstract class Etudiant {
  private String matricule, nom, prenom;
  private int nbreLivreEmpruntes;

  public Etudiant(String matricule, String nom, String prenom, int nbreLivreEmpruntes) {
    this.matricule = matricule;
    this.nom = nom;
    this.prenom = prenom;
    this.nbreLivreEmpruntes = nbreLivreEmpruntes;
  }

  public int getNbreLivreEmpruntes() {
    return this.nbreLivreEmpruntes;
  }

  public abstract boolean Empruntert();

  public String toString() {
    return this.matricule + " " + this.nom + "   " + this.prenom;
  }

}
