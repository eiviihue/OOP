# Tech Support System

Sistem dukungan teknis sederhana berbasis Java yang berfungsi sebagai chatbot untuk memberikan respons berdasarkan kata kunci yang dimasukkan pengguna.

## Deskripsi

Proyek ini adalah aplikasi Java konsol yang mensimulasikan sistem dukungan teknis. Pengguna dapat memasukkan deskripsi masalah mereka, dan sistem akan memberikan respons yang relevan berdasarkan kata kunci tertentu. Jika tidak ada kata kunci yang cocok, sistem akan memberikan respons generik.

## Fitur

- **Respons Berdasarkan Kata Kunci**: Sistem memiliki daftar kata kunci seperti "internet", "wifi", "slow", dll., dengan respons yang sesuai.
- **Respons Generik**: Jika tidak ada kata kunci yang cocok, sistem memberikan respons umum untuk meminta lebih banyak detail.
- **Interaksi Konsol**: Pengguna dapat berinteraksi melalui terminal dengan mengetik masalah dan mendapatkan respons.

### Kata Kunci dan Respons

- `internet`: "Try restarting your router and check if the cables are properly connected."
- `wifi`: "Make sure Wi-Fi is enabled and you are connected to the correct network."
- `slow`: "Your system may be slow due to many background apps. Try closing unused programs."
- `error`: "Please note the error message and try restarting the application."
- `crash`: "The app crash may be caused by a bug. Try updating or reinstalling it."
- `update`: "Check if a software update is available and install the latest version."
- `password`: "Try resetting your password using the 'Forgot Password' option."
- `login`: "Ensure your username and password are correct, and check your internet connection."
- `printer`: "Make sure the printer is powered on and connected to your computer."
- `virus`: "Run a full antivirus scan and avoid downloading files from unknown sources."
- `thank`: "You're welcome! Let me know if you need more technical help."

## Persyaratan

- Java Development Kit (JDK) versi 8 atau lebih tinggi harus terinstal di sistem Anda.
- Terminal atau command prompt untuk menjalankan aplikasi.

## Cara Menjalankan

1. **Clone atau Download Repository**:
   - Pastikan file `TechSupport.java` berada di direktori kerja Anda.

2. **Compile Kode**:
   - Buka terminal dan navigasi ke direktori proyek (misalnya: `e:\pbo\Tech Support System\`).
   - Jalankan perintah berikut untuk mengkompilasi:
     ```
     javac TechSupport.java
     ```

3. **Jalankan Aplikasi**:
   - Setelah kompilasi berhasil, jalankan aplikasi dengan:
     ```
     java TechSupport
     ```

4. **Interaksi**:
   - Aplikasi akan menampilkan pesan sambutan.
   - Ketik deskripsi masalah Anda (misalnya: "my internet is slow").
   - Sistem akan memberikan respons berdasarkan kata kunci.
   - Ketik "exit" untuk keluar dari aplikasi.

## Contoh Penggunaan

<img width="1917" height="1193" alt="image" src="https://github.com/user-attachments/assets/70b45e43-d6dd-4964-bba0-0dce12a8943b" />


## Struktur Kode

- **TechSupport.java**: File utama yang berisi kelas `TechSupport`.
  - **Variabel Instance**:
    - `supportMessages`: Map yang menyimpan kata kunci dan respons terkait.
    - `random`: Objek Random untuk memilih respons generik secara acak.
  - **Konstruktor**: Menginisialisasi map dengan kata kunci dan respons.
  - **getResponse(String userInput)**: Metode utama yang memproses input pengguna, mencari kata kunci, dan mengembalikan respons.
  - **main(String[] args)**: Metode utama yang menjalankan loop interaksi dengan pengguna menggunakan Scanner.

## Lisensi

Proyek ini adalah contoh sederhana dan dapat digunakan secara bebas untuk tujuan pendidikan atau pribadi.

## Kontribusi

Jika Anda ingin berkontribusi, silakan fork repository ini dan buat pull request dengan perubahan Anda.
