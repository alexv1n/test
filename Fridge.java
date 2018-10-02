public class Fridge extends Appliance{
  double cubicFeet;
  boolean hasFreezer;
  
  public String toString(){
    return (String.format("%.1f cu. ft. %s Fridge%s(%s, %d watts) (%d in stock, %.1f dollars each)", cubicFeet, getBrand(), hasFreezer ? " with Freezer ":" ", getColor(), getWattage(), getQuantity(), getPrice()));
  }
  
  //constructor
  public Fridge(double initPrice, int initQuantity, int initWattage, String initColor, String initBrand, double initCubicFeet, boolean initFreezer){
    super(initPrice, initQuantity, initWattage, initColor, initBrand);
    cubicFeet = initCubicFeet;
    hasFreezer = initFreezer;
  }
}