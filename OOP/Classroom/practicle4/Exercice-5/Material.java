public class Material {
  private String reference;
  private int quantity;
  private float buyPrice;
  protected float sellPrice;
  private Provider provider;

  public Material(String reference, float buyPrice) {
    this.reference = reference;
    this.buyPrice = buyPrice;
    sellPrice = 1.3 * buyPrice;
  }

  public int livrer(int q) {
    return this.quantity - q;
  }

  public int stocker(int q) {
    return this.quantity + q;
  }

  public String toString() {
    String str = "reference: " + this.reference;
    str += "\nQuantity: " + this.Quantity;
    str += "\nbuy price: " + this.buyPrice;
    str += "\nsell price: " + this.sellPrice;
    return str;
  }

  public provide(Provider p) {
    this.provider = p;
  }
}
