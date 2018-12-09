public class Personne {
  private String name;
  private int age;
  private double taille;

	public Personne(String name, int age, double taille) {
		this.name = name;
		this.age = age;
		this.taille = taille;
	}

	public int getAge() {
		return this.age;
	}

  public String getName() {
		return this.name;
	}

	public double getTaille() {
		return this.taille;
	}

}
