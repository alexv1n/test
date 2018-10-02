public class Laptop extends Computer{
  double screenSize;
  
  public String toString(){
    return (String.format("%.1f inch Laptop PC with %.1fghz CPU, %dGB RAM, %dGB %s drive. (%d in stock, %.1f dollars each)", screenSize, getCPU(), getRAM(), getStorage(), getSSD() ? "SSD":"HDD", getQuantity(), getPrice()));
  }
  
  //constructor
  public Laptop(double initPrice, int initQuantity, double initCPU, int initRAM, boolean initSSD, int initStorage, int initScreenSize){
    super(initPrice, initQuantity, initCPU, initRAM, initStorage, initSSD);
    screenSize = initScreenSize;

  }
}