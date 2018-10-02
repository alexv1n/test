public class Fridge extends Appliance {
  private double cubicFeet;
  private boolean hasFreezer;

  public String toString() {
    return String.format("%.1f cu. ft. %s Fridge%s%s", cubicFeet, getBrand(), hasFreezer ? " with Freezer" : "", super.toString());
  }

  //constructor
  public Fridge(double initPrice, int initQuantity, int initWattage, String initColor, String initBrand, double initCubicFeet, boolean initFreezer) {
    super(initPrice, initQuantity, initWattage, initColor, initBrand);
    cubicFeet = initCubicFeet;
    hasFreezer = initFreezer;
  }
}