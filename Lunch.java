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

int choice; // create the variable to store the users choice for the menu! without it, the program doesnt know where to start!
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
            scanner.nextLine();  // once again because of the int

            System.out.print("Enter price per item: ");
            double price = scanner.nextDouble(); // read the price per item using double since it can be a decimal
            scanner.nextLine(); // once again because of the double 

            orders[orderCount] = new Lunchbox(customerName, mainItem, quantity, price); 

            // desserts.length gives the number of desserts in the array, random next int chooses randomly from those numbers!
            int randomIndex = random.nextInt(desserts.length); // use the random index to pick a random dessert from the dessert array built
            System.out.println("Your Order Today Includes a Free dessert! : " + desserts[randomIndex]);

           orderCount ++; // increase the order count by 1 after placing an order
            break; // exit the first case

        case 2: // second case, option to view all orders
        if (orderCount == 0) { // if there are no (0) orders, print this message
            System.out.println("No orders have been placed yet :( ).");
        } else { 
            for (int i = 0; i < orderCount; i++) { // zero based array starts at 0, i ++ to increase index by 1 each time
                System.out.println("Order #" + (i + 1) + ":"); // add 1 to every order added because humans dont start counting at 0, they start at one
                orders[i].displayOrder(); // prints the order using displayorder method
                System.out.println(); // prints a new blank line for nice formatting!
            }
        }
        break; // exit the second case

        case 3: // the third case, add quantity to an order
         if (orderCount == 0) { // if there are no orders, print this message below
             System.out.println("No orders have been placed yet :( ).");
         } else {
        System.out.print("Enter order number to add quantity: ");
        int orderNumber = scanner.nextInt(); // read the user input using the scanner 
        scanner.nextLine(); // once again because of the int we need to make a new line
        if (orderNumber > 0 && orderNumber <= orderCount) { // if the order number is greater than 0 AND = (&&) less than or equal to the order count add the quantity to the order
            System.out.print("How many? ");
            int extra = scanner.nextInt(); // extra is used to add / store the quantity of the order
            scanner.nextLine(); // once again because of the int we need to make a new line
        } else {
            System.out.println("Invalid order number. Please try again!");
        }
         }
         break; // exit the third case

        case 4: // the fourth case, mark order as delivered
         if (orderCount == 0) { // if there are 0 orders, print this message below
             System.out.println("No orders have been placed yet :( )."); // same code as above in other cases
         } else {
        System.out.print("Enter order number to mark as delivered: ");
        int deliveredOrderNumber = scanner.nextInt(); // read the user input using the scanner and store it in delivered order number
        scanner.nextLine(); // once again because of the int we need to make a new line
        if (deliveredOrderNumber > 0 && deliveredOrderNumber <= orderCount) { // if the order number is greater than 0 AND = (&&) less than or equal to the order count mark the order as delivered
            orders[deliveredOrderNumber - 1].markAsDelivered(); // orders is the array, delivered order number is the user input and -1 because of zero based array since the first order starts at 0
            System.out.println("Order #" + deliveredOrderNumber + " has been marked as delivered!"); 
        } else {
            System.out.println("Invalid order number. Please try again!");
        }
         }
         break; // exit the fourth case

        case 5: // the fifth case, calculate the total cost of an order!
         if (orderCount == 0) { // if there are 0 orders, print this message below
             System.out.println("No orders have been placed yet :( )."); // same code as above in other cases
         } else {
        System.out.print("Enter order number to calculate total cost: ");
        int costOrderNumber = scanner.nextInt(); // read the user input using the scanner, costOrderNumber is used to store the user input
        scanner.nextLine(); // once again because of the int we need to make a new line
        if (costOrderNumber > 0 && costOrderNumber <= orderCount) { // if the order number is greater than 0 AND = (&&) less than or equal to the order count calculate the total cost of that order
            double totalCost = orders[costOrderNumber - 1].calculateCost(); // double is used to store the total cost with a decimal, orders is the array, cost order number is the user input and -1 because of zero based array since the first order starts at 0
            System.out.printf("Total cost for Order #%d: $%.2f%n", costOrderNumber, totalCost); // printf is used to format the placeholders for the total cost to have 2 decimal places
        // #%d format integer for order number and $%.2f format double for the cost since it uses decimal places and %n is for new line for the next menu option and not /n since it is printf!
        } else {
            System.out.println("Invalid order number. Please try again!"); 
        }
         }
         break; // exit the fifth case

        case 6: // sixth case, exit option!
            System.out.println("Thank you for using the Lunch Ordering System! Goodbye!");
            break; // exit the sixth case

            default: // if the user enters a number that is not 1-6 to have a backup default message
            System.out.println("Invalid option. Please try again!");
            break;
            } // end the switch statement
        } // end the while loop
    } // end main in public static void
} // end the public class lunch 
        