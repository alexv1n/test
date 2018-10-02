public abstract class Computer extends Product{
  private double cpuSpeed;
  private int ram;
  private int storage;
  private boolean ssd;
  
  public Computer(double initPrice, int initQuantity, double initCPU, int initRAM, int initStorage, boolean initSSD){
    super(initPrice, initQuantity);
    cpuSpeed = initCPU;
    ram = initRAM;
    storage = initStorage;
    ssd = initSSD;
  }
  
  public double getCPU(){
    return cpuSpeed;
  }
  
  public int getRAM(){
    return ram;
  }
  
  public int getStorage(){
    return storage;
  }
  
  public boolean getSSD(){
    return ssd;
  }
}