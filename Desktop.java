public class Desktop extends Computer {
  private String profile;

  public String toString() {
    return String.format("%s Desktop PC%s", profile, super.toString());
  }

  //constructor
  public Desktop(double initPrice, int initQuantity, double initCPU, int initRAM, boolean initSSD, int initStorage, String initProfile) {
    super(initPrice, initQuantity, initCPU, initRAM, initStorage, initSSD);
    profile = initProfile;
  }
}
