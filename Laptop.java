public class Laptop extends Computer {
  double screenSize;

  public String toString() {
    return String.format("%.1f inch Laptop PC%s", screenSize, super.toString());
  }

  //constructor
  public Laptop(double initPrice, int initQuantity, double initCPU, int initRAM, boolean initSSD, int initStorage, int initScreenSize) {
    super(initPrice, initQuantity, initCPU, initRAM, initStorage, initSSD);
    screenSize = initScreenSize;
  }
}