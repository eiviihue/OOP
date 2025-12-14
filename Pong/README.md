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
 Cobalah untuk memantulkan bola dan dapatkan skor tertinggi.

## Contoh Gameplay

https://github.com/user-attachments/assets/508a6b01-dabd-4c83-9a69-6797b06993b3

- Jendela game muncul.
- Bola mulai bergerak dari tengah.
- Gerakkan paddle dengan tombol untuk memantulkan bola.
- Jika bola keluar, skor lawan bertambah.

## Struktur Kode

<img width="1578" height="935" alt="image" src="https://github.com/user-attachments/assets/d19fbde2-05c1-45a2-97da-a9609074cda5" />

- **Game.java**: Kelas utama yang memulai game dan mengelola loop utama.
- **GameFrame.java**: Membuat jendela utama game.
- **GamePanel.java**: Panel yang menangani rendering dan input.
- **Ball.java**: Mewakili bola dengan posisi, kecepatan, dan logika gerakan.
- **Paddle.java**: Mewakili paddle pemain dengan kontrol gerakan.
