import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<Product> products = new ArrayList<>();
    private int transactionCount = 0;

    public VendingMachine() {
        products.add(new Product("Biskuat", 5000, 5));
        products.add(new Product("SilverQueen", 18000, 8));
        products.add(new Product("Lays", 13000, 4));
        products.add(new Product("MrPotato", 12000, 5));
        products.add(new Product("Yupi", 8500, 7));
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== MONSTERMART SNACK VENDING MACHINE ===");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.println((i + 1) + ". " + p.getName());
            }
            System.out.println("0. Keluar");
            System.out.print("Pilih produk: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Terima kasih telah menggunakan mesin ini!");
                Product.showLog();
                break;
            }

            if (choice < 1 || choice > products.size()) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            Product selected = products.get(choice - 1);
            if (selected.getStock() == 0) {
                System.out.println("Maaf, stok " + selected.getName() + " habis!");
                System.out.println("Administrator telah diberitahu untuk segera merefill produk ini");
                continue;
            }

            System.out.println("Tekan 0 untuk membatalkan pembelian atau 1 untuk melanjutkan");
            int input = sc.nextInt();
            if (input == 0) {
                System.out.println("Pembelian dibatalkan.");
                continue;
            }
            
            System.out.println("Total harga: Rp" + selected.getPrice());
            System.out.print("Masukkan uang Anda: Rp");
            int money = sc.nextInt();

            for (int i = 0; money < selected.getPrice(); i++) {
                System.out.println("Uang tidak cukup. Silakan tambahkan uang");
                money += sc.nextInt();
            }

            int change = money - selected.getPrice();
            selected.reduceStock();
            transactionCount++;
            Product.addTransaction(transactionCount, selected);

            System.out.println("Membeli " + selected.getName() + "...");
            System.out.println("Kembalian Anda: Rp" + change);
            System.out.println("Terima kasih atas pembelian Anda!");
        }

        sc.close();
    }
}
