import java.util.Scanner; // import the scanner so it can read the user input!

import java.security.SecureRandom; // import secure random to pick the random dessert

//now create the lunch class that will be the driver class
public class Lunch { 
public static void main(String[] args) { // start the program
    Scanner scanner = new Scanner(System.in); // create the scanner 
    SecureRandom random = new SecureRandom(); // create the secure random for the dessert!
Lunchbox[] orders = new Lunchbox[10]; // create the array and set it to 10 orders
int orderCount = 0; // create the variable to count the orders
String[] desserts = {"Cannoli", "Rocky Road Ice Cream", "Churros", "Soft Baked Peanut Butter Cookies", "Fresh Fudge Brownies"}; // create the array for the desserts
int choice; // create the variable to store the users choice for the menu
// now create the menu and use a while loop like professor did in the example 
while (choice !=6) { // gives user 6 choices in the menu
    System.out.println("Welcome to the Lunch Ordering System! Please select an option:");
    System.out.println("1. Place a new order"); 
    System.out.println("2. View all orders");
    System.out.println("3. Add quantity to order");
    System.out.println("4. Mark order as delivered");
    System.out.println("5. Calculate total cost of an order");  
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
    choice = scanner.nextInt(); // read the users choice using the scanner
    scanner.nextLine(); // learned from last assignment, since its using int 

    // now I need to create switch statements for the menu options
    switch (choice) {

        case 1: // option to place a new order
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine(); 

            System.out.print("Enter main item: ");
            String mainItem = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt(); 
            input.nextLine();  // once again because of the int

            System.out.print("Enter price per item: ");
            double price = scanner.nextDouble(); // read the price per item using double since it can be a decimal
            scanner.nextLine(); // once again because of the double 

            orders[orderCount] = new Lunchbox(customerName, mainItem, quantity, price); 

            int randomIndex = random.nextInt(desserts.length); // use the random index to pick a random dessert from the dessert array built
            System.out.println("Your Order Today Includes a Free dessert! : " + desserts[randomIndex]);

           orderCount ++; // increase the order count by 1 after placing an order
            break; // exit the first case

        case 2: // second case, option to view all orders
        