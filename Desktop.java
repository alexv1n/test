public class Desktop extends Computer{
  private String profile;
  
  public String toString(){
    return (String.format("%s Desktop PC with %.1fghz CPU, %dGB RAM, %dGB %s drive (%d in stock, %.1f dollars each)", profile, getCPU(), getRAM(), getStorage(), getSSD() ? "SSD":"HDD", getQuantity(), getPrice()));
  }
  
  //constructor
  public Desktop(double initPrice, int initQuantity, double initCPU, int initRAM, boolean initSSD, int initStorage, String initProfile){
    super(initPrice, initQuantity, initCPU, initRAM, initStorage, initSSD);
    profile = initProfile;
  }
  

}
