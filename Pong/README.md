# Pong Game

Game Pong klasik berbasis Java yang mensimulasikan permainan tenis meja. Pemain mengontrol paddle untuk memantulkan bola dan mencegahnya keluar dari layar.

## Deskripsi

Pong adalah game arkade sederhana di mana dua pemain (atau satu pemain melawan AI) mengontrol paddle untuk memantulkan bola bolak-balik. Versi ini adalah implementasi Java dengan GUI menggunakan Swing atau AWT, di mana pemain menggunakan keyboard untuk menggerakkan paddle.

## Fitur

- **Kontrol Paddle**: Gunakan tombol keyboard (misalnya, W/S atau panah atas/bawah) untuk menggerakkan paddle.
- **Gerakan Bola**: Bola bergerak secara otomatis, memantul dari dinding dan paddle.
- **Scoring**: Skor diperbarui ketika bola melewati paddle lawan.
- **Game Loop**: Loop permainan yang menangani pembaruan posisi dan rendering.
- **GUI Sederhana**: Jendela game dengan panel untuk menampilkan elemen game.

## Persyaratan

- Java Development Kit (JDK) versi 8 atau lebih tinggi.
- Sistem operasi yang mendukung Java GUI (Windows, macOS, Linux).

## Cara Menjalankan

1. **Pastikan File Java Ada**:
   - File utama: `Game.java`, `Ball.java`, `Paddle.java`, `GamePanel.java`, `GameFrame.java`.

2. **Compile Kode**:
   - Buka terminal dan navigasi ke direktori proyek (misalnya: `e:\pbo\Pong\`).
   - Jalankan perintah untuk mengkompilasi semua file Java:
     ```
     javac *.java
     ```

3. **Jalankan Game**:
   - Setelah kompilasi berhasil, jalankan game dengan:
     ```
     java Game
     ```

4. **Bermain**:
   - Gunakan kontrol keyboard untuk menggerakkan paddle.
   - Cobalah untuk memantulkan bola dan dapatkan skor tertinggi.

## Contoh Gameplay

- Jendela game muncul.
- Bola mulai bergerak dari tengah.
- Gerakkan paddle dengan tombol untuk memantulkan bola.
- Jika bola keluar, skor lawan bertambah.

## Struktur Kode

- **Game.java**: Kelas utama yang memulai game dan mengelola loop utama.
- **GameFrame.java**: Membuat jendela utama game.
- **GamePanel.java**: Panel yang menangani rendering dan input.
- **Ball.java**: Mewakili bola dengan posisi, kecepatan, dan logika gerakan.
- **Paddle.java**: Mewakili paddle pemain dengan kontrol gerakan.

## Pengembangan Lanjutan

Game ini dapat diperluas dengan:
- Menambahkan AI untuk pemain lawan.
- Fitur multiplayer jaringan.
- Efek suara dan musik.
- Level atau mode berbeda.

## Lisensi

Proyek ini adalah contoh sederhana dan dapat digunakan untuk tujuan pendidikan atau pribadi.

## Kontribusi

Silakan fork dan berkontribusi dengan fitur baru atau perbaikan bug.