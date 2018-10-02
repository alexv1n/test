public abstract class Computer extends Product {
  private double cpuSpeed;
  private int ram;
  private int storage;
  private boolean ssd;

  public Computer(double initPrice, int initQuantity, double initCPU, int initRAM, int initStorage, boolean initSSD) {
    super(initPrice, initQuantity);
    cpuSpeed = initCPU;
    ram = initRAM;
    storage = initStorage;
    ssd = initSSD;
  }

  public String toString() {
    return String.format(" with %.1fghz CPU, %dGB RAM, %dGB %s drive.%s", cpuSpeed, ram, storage, ssd ? "SSD" : "HDD", super.toString());
  }
}