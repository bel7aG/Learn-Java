public class Square extends Form {
  private float cote;

  public Square(float cote) {
    this.cote = cote;
  }

  @Override
  public float perimetre() {
    return this.cote * 4;
  }

  @Override
  public float area() {
    return (float) Math.pow(this.cote, 2);
  }

	public float getCote() {
		return cote;
	}

	public void setCote(float cote) {
		this.cote = cote;
	}

  public String toString() {
    return "\n\nCote: " + this.cote + "\n\nPerimetre: " + this.perimetre() + "\n\nArea: " + this.area();
  }
}
