# World of Zuul

Game petualangan berbasis teks sederhana di mana pemain dapat berjalan-jalan di sekitar kampus universitas. Ini adalah versi dasar yang dapat diperluas untuk membuatnya lebih menarik.

## Deskripsi

"World of Zuul" adalah game petualangan teks klasik yang dikembangkan sebagai contoh proyek Java. Pemain dapat menjelajahi ruangan-ruangan seperti luar gedung universitas, teater kuliah, pub kampus, lab komputer, dan kantor admin. Game ini menggunakan input teks untuk navigasi dan interaksi.

## Fitur

- **Navigasi Ruangan**: Pemain dapat bergerak ke arah utara, timur, selatan, atau barat menggunakan perintah "go".
- **Perintah Dasar**:
  - `help`: Menampilkan informasi bantuan dan daftar perintah.
  - `go <direction>`: Bergerak ke arah tertentu (north, east, south, west).
  - `quit`: Keluar dari game.
- **Deskripsi Ruangan**: Setiap ruangan memiliki deskripsi yang ditampilkan saat pemain memasukinya.
- **Peta Kampus**: Ruangan-ruangan terhubung dengan pintu keluar yang sesuai.

### Struktur Ruangan

- **Outside**: Luar pintu masuk utama universitas.
- **Theatre**: Di dalam teater kuliah.
- **Pub**: Di pub kampus.
- **Lab**: Di lab komputer.
- **Office**: Di kantor admin komputer.

## Contoh Permainan

<img width="1906" height="1198" alt="image" src="https://github.com/user-attachments/assets/64b80e1c-f6d5-4b60-9fbc-bb98e8511acc" />

## Struktur Kode

<img width="1156" height="691" alt="image" src="https://github.com/user-attachments/assets/41d15711-f471-4e83-a445-899af4ac0d91" />


- **Game.java**: Kelas utama yang mengelola game, membuat ruangan, parser, dan loop permainan.
- **Room.java**: Mewakili ruangan dengan deskripsi dan pintu keluar (north, east, south, west).
- **Command.java**: Mewakili perintah yang dimasukkan pemain, dengan kata perintah dan kata kedua opsional.
- **Parser.java**: Mengurai input pemain menjadi objek Command.
- **CommandWord.java**: (Jika ada) Mendefinisikan kata-kata perintah yang valid.
