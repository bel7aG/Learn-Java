import java.util.ArrayList;

public class Bibiotheque {
  private String nomBiblio;
  private ArrayList <Etudiant> vectEtud = new ArrayList<Etudiant>();


  public Bibiotheque(String nomBiblio) {
    this.nomBiblio = nomBiblio;
  }

  public void ajouter(Etudiant e) {
    this.vectEtud.add(e);
  }

  public int calculNbreLivreEmpruntesLicencies() {
    int sum = 0;
    for (int i = 0; i < vectEtud.size(); i++) {
      if (vectEtud.get(i) instanceof Etudiant_En_Licence) {
        sum += vectEtud.get(i).getNbreLivreEmpruntes();
      }
    }
    return sum;
  }

    public int calculNbreLivreEmpruntesMaster() {
      int sum = 0;
      for (int i = 0; i < vectEtud.size(); i++) {
        if (vectEtud.get(i) instanceof Etudiant_En_Master) {
          sum += vectEtud.get(i).getNbreLivreEmpruntes();
        }
      }
      return sum;
    }

    public void afficher() {
      for (int i = 0; i < vectEtud.size(); i++) {
        System.out.println(vectEtud.get(i).toString());
      }
    }


}
