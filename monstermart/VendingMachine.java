package monstermart;

import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        this.products = Product.getProductList();
    }

    public void displayMenu() {
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println(
                    (i + 1) + ". " + p.getName() + " - Price: " + p.getPrice() + " (Stock: " + p.getStock() + ")");
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Select a product (enter number, or 0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= products.size()) {
                Product selectedProduct = products.get(choice - 1);
                if (selectedProduct.getStock() > 0) {
                    handleTransaction(scanner, selectedProduct);
                } else {
                    System.out.println("Sorry, this product is out of stock.");
                    notifyAdmin(selectedProduct);
                }
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        scanner.close();
    }

    private void handleTransaction(Scanner scanner, Product product) {
        System.out.println("You have selected: " + product.getName());
        System.out.println("Total price: " + product.getPrice());
        System.out.print("Enter payment amount: ");
        int payment = scanner.nextInt();

        if (payment >= product.getPrice()) {
            product.decreaseStock();
            int change = payment - product.getPrice();
            System.out.println("Thank you for your purchase! Your change is: " + change);
            Product.logTransaction(product.getName(), product.getPrice());
            if (product.getStock() == 0) {
                notifyAdmin(product);
            }
        } else {
            System.out.println("Insufficient payment. Transaction cancelled.");
        }
    }

    private void notifyAdmin(Product product) {
        System.out.println("ADMIN ALERT: Product '" + product.getName() + "' is out of stock. Please refill.");
    }
}
