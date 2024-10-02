package labinternal;
import java.util.Scanner;
class Product{
    String name;
    int quantity;
    double cost;
    double totalValue;
    
    public Product(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.totalValue = quantity * cost;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Cost per unit: $" + cost);
        System.out.println("Total Value: $" + totalValue);
    }
}

public class customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[numProducts];

        // Read product details from the user
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Cost per unit: ");
            double cost = sc.nextDouble();
            sc.nextLine(); // consume the newline character after the double input

            // Create and store the product in the array
            products[i] = new Product(name, quantity, cost);
        }

        // Find the product with the highest value
        Product highestValueProduct = products[0];
        for (int i = 1; i < numProducts; i++) {
            if (products[i].totalValue > highestValueProduct.totalValue) {
                highestValueProduct = products[i];
            }
        }

        System.out.println("\nProduct with the highest value:");
        highestValueProduct.displayProduct();

        sc.close();
    }
}
