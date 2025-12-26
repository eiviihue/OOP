<img width="1160" height="688" alt="image" src="https://github.com/user-attachments/assets/d328da34-7297-4d0b-8028-e2f1361f48ed" />

## Command.java

### Deskripsi Kelas
Kelas `Command` mewakili sebuah perintah dalam permainan. Setiap perintah terdiri dari kata perintah utama (`commandWord`) dan kata kedua opsional (`secondWord`).

### Atribut
- `private String commandWord`: Kata perintah utama (misalnya "go", "take").
- `private String secondWord`: Kata kedua opsional (misalnya "north", "key").

### Konstruktor
- `public Command(String firstWord, String secondWord)`: Membuat objek Command dengan kata pertama dan kedua. Kata pertama disimpan sebagai `commandWord`, kata kedua sebagai `secondWord`.

### Metode
- `public String getCommandWord()`: Mengembalikan kata perintah utama.
- `public String getSecondWord()`: Mengembalikan kata kedua.
- `public boolean isUnknown()`: Mengembalikan `true` jika `commandWord` adalah `null`, menandakan perintah tidak dikenal.
- `public boolean hasSecondWord()`: Mengembalikan `true` jika `secondWord` tidak `null`, menandakan ada kata kedua.

### Contoh Penggunaan
```java
Command cmd = new Command("go", "north");
System.out.println(cmd.getCommandWord()); // Output: go
System.out.println(cmd.hasSecondWord()); // Output: true
```

## CommandTest.java

### Deskripsi Kelas
Kelas `CommandTest` adalah kelas test untuk memverifikasi kelas `Command`. Menggunakan metode `main` untuk menjalankan test case secara manual dan mencetak hasil "passed" atau "failed".

### Metode Test
- `testConstructor()`: Test pembuatan objek Command dan verifikasi nilai atribut.
- `testGetCommandWord()`: Test metode `getCommandWord()`.
- `testGetSecondWord()`: Test metode `getSecondWord()`.
- `testIsUnknown()`: Test metode `isUnknown()` dengan commandWord null dan tidak null.
- `testHasSecondWord()`: Test metode `hasSecondWord()` dengan secondWord ada dan tidak ada.

### Program dijalankan
<img width="643" height="370" alt="image" src="https://github.com/user-attachments/assets/78fef4e2-b1bc-4a0b-840a-0ac3fd7a148c" />
