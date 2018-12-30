public class Lanceur {
  private String numEtud, nom, prenom, ville;
  private ResultatLancement resultatLanceur;

  public Lanceur(String numEtud, String ville, ResultatLancement resultatLanceur) {
    this.numEtud = numEtud;
    this.ville = ville;
    this.resultatLanceur = resultatLanceur;
  }
  
  public void setNom(String nom) {
    this.nom = nom;
  }
  
  public ResultatLancement getResultat() {
    return this.resultatLanceur;
  }
  
  public boolean equals(Object o) {
    if (o instanceof Lanceur) {
      Lanceur l = (Lanceur) o;
      if (this.numEtud == o.numEtud) {
        return true;
      }
    }

    return false;
  }


  public String toString() {
    return "\n\n\tnumEtude: " + this.numEtud
    + "\n\n\tnom: " + this.nom
    + "\n\n\tprenom: " + this.prenom
    + "\n\n\tville: " + this.ville
    + "\n\n\tresultatLanceur: " + this.resultatLanceur;
  }
  
  
}