<img width="1919" height="1199" alt="image" src="https://github.com/user-attachments/assets/abbc2acd-e14e-44a1-8582-f801ade6cbff" />

Code
```
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override

    public String toString() {
        return "Judul: " + title + " | Penulis: " + author + " | Tahun: " + year;
    }
}

public class LibraryCatalog {
    public static void main(String[] args) {
        ArrayList<Book> catalog = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Library Catalog ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan nama penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit: ");
                    int year = scanner.nextInt();
                    catalog.add(new Book(title, author, year));
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    if (catalog.isEmpty()) {
                        System.out.println("Tidak ada buku dalam katalog.");
                    } else {
                        for (int i = 0; i < catalog.size(); i++) {
                            System.out.println((i + 1) + ". " + catalog.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String searchTitle = scanner.nextLine().toLowerCase();

                    boolean found = false;
                    for (Book book : catalog) {
                        if (book.getTitle().toLowerCase().contains(searchTitle)) {
                            System.out.println(book);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor buku yang akan dihapus: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= catalog.size()) {
                        catalog.remove(index - 1);
                        System.out.println("Buku berhasil dihapus!");
                    } else {
                        System.out.println("Nomor buku tidak valid.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari katalog. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
```

Result
```
=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 1
Masukkan judul buku: Harry Potter
Masukkan nama penulis: J.K. Rowling
Masukkan tahun terbit: 1992
Buku berhasil ditambahkan!

=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 1
Masukkan judul buku: Jokowi Si Tukang Kayu
Masukkan nama penulis: Fufufafa
Masukkan tahun terbit: 2016
Buku berhasil ditambahkan!

=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 2

Daftar Buku:
1. Judul: Harry Potter | Penulis: J.K. Rowling | Tahun: 1992
2. Judul: Jokowi Si Tukang Kayu | Penulis: Fufufafa | Tahun: 2016

=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 3
Masukkan judul buku yang dicari: Harry Potter
Judul: Harry Potter | Penulis: J.K. Rowling | Tahun: 1992

=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 4
Masukkan nomor buku yang akan dihapus: 2
Buku berhasil dihapus!

=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 2

Daftar Buku:
1. Judul: Harry Potter | Penulis: J.K. Rowling | Tahun: 1992

=== Library Catalog ===
1. Tambah Buku
2. Lihat Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 5
Keluar dari katalog. Terima kasih!
```
