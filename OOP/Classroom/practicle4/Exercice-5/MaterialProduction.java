class MaterialProduction extends Material {
  private String typePromo;
  private int percent;

  public MaterialProduction(String typePromo, int percent, String reference, float sellPrice) {
    super(reference, sellPrice);
    this.typePromo = typePromo;
    this.percent = percent;
  }

  public String toString() {
    super.toString();
    return "\npromo type: " + this.typePromo + ".\npercent: " + this.percent + "\nreference" + super.toString();
  }

}
