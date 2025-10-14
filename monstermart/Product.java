 import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private int stock;

    private static ArrayList<String> transactionLog = new ArrayList<>();

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock() {
        if (stock > 0) stock--;
    }

    public static void addTransaction(int transactionNo, Product p) {
        transactionLog.add("Transaksi #" + transactionNo + ": " + p.getName() + " - Rp" + p.getPrice());
    }

    public static void showLog() {
        System.out.println("\n=== LOG TRANSAKSI ===");
        for (String log : transactionLog) {
            System.out.println(log);
        }
    }
}
