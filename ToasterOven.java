public class ToasterOven extends Appliance {
  private int width;
  private boolean convection;

  public ToasterOven(double initPrice, int initQuantity, int initWattage, String initColor, String initBrand, int initWidth, boolean initConvection) {
    super(initPrice, initQuantity, initWattage, initColor, initBrand);
    width = initWidth;
    convection = initConvection;
  }

  public String toString() {
    return String.format("%d inch %s Toaster%s%s", width, getBrand(), convection ? " with convection" : "", super.toString());
  }
}