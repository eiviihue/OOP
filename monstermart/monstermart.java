package monstermart;

public class monstermart {
    public static void main(String[] args) {
        // Add some products
        Product.addProduct(new Product("Coffee", 15000, 5));
        Product.addProduct(new Product("Tea", 12000, 5));
        Product.addProduct(new Product("Juice", 10000, 5));

        VendingMachine machine = new VendingMachine();
        machine.start();
    }
}
