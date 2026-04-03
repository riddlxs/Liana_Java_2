public class Lunchbox  { // create class for the lunchbox and doesnt need a scanner or secure random because its not a driver class!
private String customerName; //create the variables for the lunchbox class that the professor asked for
private String mainItem;
private int quantity;
private double price;
private boolean isDelivered;

public Lunchbox() {} // create the default constructor first

 // constructor with parameters
public Lunchbox(String customerName, String mainItem, int quantity, double price) { 
    this.customerName = customerName;
    this.mainItem = mainItem;
    this.quantity = quantity;
    this.price = price;
    this.isDelivered = false; // lunchbox has not been delivered yet, so set to false and not include in parameter
}
// next I need to create the getters 
public String getCustomerName() { 
    return this.customerName;
}
public String getMainItem() {
    return this.mainItem;
}
public int getQuantity() {
    return this.quantity;
}
public double getPrice() {
    return this.price;
}
public boolean getIsDelivered() {
    return this.isDelivered;
}
// now I need to create the setters
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}
public void setMainItem(String mainItem) {
    this.mainItem = mainItem;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
public void setPrice(double price) {
    this.price = price;
}
public void setIsDelivered(boolean isDelivered) {
    this.isDelivered = isDelivered;
}

// next method is to calculate the cost of the lunchbox
public double calculateCost() { // use double since its an int being used and it can be a decimal number
    return this.quantity * this.price; // the amount of items times the price of each item
}
// method to mark the lunchbox as delivered
public void markAsDelivered() { 
    this.isDelivered = true; // set the isDelivered variable to true instead of false
}
//now I need to create the method to display the order 
public void displayOrder() {
    System.out.println("Customer Name: " + this.customerName);
    System.out.println("Main Item: " + this.mainItem);
    System.out.println("Quantity: " + this.quantity);
    System.out.println("Price per Item: $" + this.price);
    System.out.println("Total Cost: $" + this.calculateCost()); 
    System.out.println("Delivered: " + this.isDelivered);
}

}