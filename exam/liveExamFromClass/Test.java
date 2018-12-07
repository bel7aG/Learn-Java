public class Test {
  public static void main(String[] args) {
    Bibiotheque biblio2011 = new Bibiotheque("biblio2011");
    Etudiant_En_Licence b = new Etudiant_En_Licence("E1", "ben jeddou", "mohammed", 2, 2, 3);
    Etudiant_En_Master a = new Etudiant_En_Master("E2", "ben hmid", "ùmouna", 5, 6, "les bases de donneeées avancés");
    Etudiant_En_Licence c = new Etudiant_En_Licence("E3", "Hechmi", "yassmine", 3, 1, 3);

    biblio2011.ajouter(b);
    biblio2011.ajouter(a);
    biblio2011.ajouter(c);


    biblio2011.calculNbreLivreEmpruntesMaster();
    biblio2011.calculNbreLivreEmpruntesMaster();

    biblio2011.afficher();

  }
}
