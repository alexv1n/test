public abstract class Product {
  private double price;
  private int quantity;

  public Product(double initPrice, int initQuantity) {
    price = initPrice;
    quantity = initQuantity;
  }

  public String toString() {
    return String.format(" (%d in stock, %.1f dollars each)", quantity, price);
  }

  //selling method
  public double sellUnits(int amount) {
    if(amount > 0 && amount <= quantity) {
      quantity -= amount;
      return amount * price;
    } else {
      return 0.0;
    }
  }
}
