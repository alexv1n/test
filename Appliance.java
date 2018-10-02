public abstract class Appliance extends Product {
  private int wattage;
  private String color;
  private String brand;

  public Appliance(double initPrice, int initQuantity, int initWattage, String initColor, String initBrand) {
    super(initPrice, initQuantity);
    wattage = initWattage;
    color = initColor;
    brand = initBrand;
  }

  public String getBrand() {
    return brand;
  }

  public String toString() {
    return String.format(" (%s, %d watts)%s", color, wattage, super.toString());
  }
}