public abstract class Product {
  private double price;
  private int quantity;
  
  public Product(double initPrice, int initQuantity){
    price = initPrice;
    quantity = initQuantity;
  }
  
  public double getPrice(){
    return price;
  }
  
  public int getQuantity(){
    return quantity;
  }
  
  //selling method
  public double sellUnits(int amount){
    if(amount <= quantity){
      quantity -= amount;
      return amount * price;
    }
    else{
      return 0.0;
    }
  }
  
  
  
}
