public class Game {
  private String name;
  private float prix, recetteJeu;
  private ConditionAcces conditionJeu;
  private int nbrPers = 0;

	public Game(String name, float prix, ConditionAcces conditionJeu) {
		this.name = name;
		this.prix = prix;
		this.conditionJeu = conditionJeu;
  }

  public void utilise(Personne p) {
    if (conditionJeu.autoriserAcces(p)) {
      this.nbrPers += 1;
      this.recetteJeu += this.prix * nbrPers;
      System.out.println("\n\n\t" + p.getName() + " Join the game.");
    } else {
      System.out.println("\n\n\t" + "can't join the game.");
    }
  }

  public double getRecette() {
    return this.recetteJeu;
  }

  public void stream() {
    System.out.println("\n\n\tGame name: " + this.name + "\n\tdescription: " + this.conditionJeu.getDescription() + "\n\n\t\t\t recette: " + this.recetteJeu);
  }

}
