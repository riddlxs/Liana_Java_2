public class Lunchbox  { // create class for the lunchbox and doesnt need a scanner or secure random because its not a driver class!
private String customerName; //create the variables for the lunchbox class that the professor asked for
private String mainItem;
private int quantity;
private double price;
private boolean isDelivered;

public Lunchbox() { // create the default constructor first
    this.customerName = ""; // set everything to zero or empty since setters will change the values later, we need to start fresh
    this.mainItem = "";
    this.quantity = 0;
    this.price = 0.0;
    this.isDelivered = false;
}
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
    return customerName;

}