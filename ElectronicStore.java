import java.util.Scanner;

public class ElectronicStore {
  private final int MAX_PRODUCTS = 10;
  private int curProducts = 0;
  private String name;
  private double revenue = 0;
  private Scanner input = new Scanner(System.in);
  private Product[] stock = new Product[MAX_PRODUCTS];
  
  public ElectronicStore(String initName){
    name = initName;
  }
  
  public String getName(){
    return name;
  }
  
  public double getRevenue(){
    return revenue;
  }
  
  public boolean addProduct(Product p){
    if(curProducts < MAX_PRODUCTS){
      stock[curProducts++] = p;
      return true;
    }
    else{
    return false;
    }
  }
  
  public void printStock(){
    for(int i = 0;i < curProducts; i++){
      System.out.println(String.format("%d. %s", i, stock[i]));
    }
  }
  
  public void sellProducts(int item, int amount){
    if(item <= curProducts - 1 && amount <= stock[item].getQuantity()){
      revenue += stock[item].sellUnits(amount);
    }
    else {
      revenue += 0;
    }
  }
    public void sellProducts(){
    System.out.println("The current stock is: ");
    printStock();
    System.out.println("Enter the index of the product you wish to purchase.");
    int index = input.nextInt();
    if(index <= curProducts - 1){
      System.out.println("You have selected \n" + stock[index] + "\n How many units would you like to purchase?");
      int amount = input.nextInt();
      if(amount <= stock[index].getQuantity()){
        revenue += stock[index].sellUnits(amount);
        System.out.println("Transaction completed.");
        printStock();
      }
      else{
        revenue += 0;
        System.out.println("Sorry, the transaction could not be completed.");
      }
    }
    else{
      System.out.println("Sorry, that index does not match anything in the stock.");
    }
    }
  }
