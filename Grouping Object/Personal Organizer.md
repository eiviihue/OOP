<img width="1152" height="685" alt="image" src="https://github.com/user-attachments/assets/45f528e1-b76f-4b20-92c4-fc077f9857e2" />

COde
```
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {

        return "Judul: " + title + " | Deskripsi: " + description;
    }
}

public class PersonalOrganizer {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Personal Organizer ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul tugas: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan deskripsi tugas: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(title, description));
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\nDaftar Tugas:");
                    if (tasks.isEmpty()) {
                        System.out.println("Tidak ada tugas.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor tugas yang akan dihapus: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Tugas berhasil dihapus!");
                    } else {

                        System.out.println("Nomor tugas tidak valid.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih! Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
```

Result
```

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 2

Daftar Tugas:
Tidak ada tugas.

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 1
Masukkan judul tugas: PBO
Masukkan deskripsi tugas: grouping object implementation
Tugas berhasil ditambahkan!

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 1
Masukkan judul tugas: WEBPRO
Masukkan deskripsi tugas: Make a personal website
Tugas berhasil ditambahkan!

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 2

Daftar Tugas:
1. Judul: PBO | Deskripsi: grouping object implementation
2. Judul: WEBPRO | Deskripsi: Make a personal website

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 3
Masukkan nomor tugas yang akan dihapus: 1
Tugas berhasil dihapus!

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 2

Daftar Tugas:
1. Judul: WEBPRO | Deskripsi: Make a personal website

=== Personal Organizer ===
1. Tambah Tugas
2. Lihat Semua Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 4
Terima kasih! Keluar dari aplikasi.
```
