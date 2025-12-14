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

## Persyaratan

- Java Development Kit (JDK) versi 8 atau lebih tinggi.
- Terminal atau command prompt untuk kompilasi dan eksekusi.

## Cara Menjalankan

1. **Pastikan File Java Ada**:
   - File utama: `game.java`, `command.java`, `parser.java`, `room.java`.
   - File `commandsword.java` mungkin tidak digunakan atau merupakan bagian tambahan.

2. **Compile Kode**:
   - Buka terminal dan navigasi ke direktori proyek (misalnya: `e:\pbo\World of Zuull\`).
   - Jalankan perintah untuk mengkompilasi semua file Java:
     ```
     javac *.java
     ```

3. **Jalankan Game**:
   - Setelah kompilasi berhasil, jalankan game dengan:
     ```
     java Game
     ```
     (Perhatikan: Kelas utama adalah `Game`, bukan `game`).

4. **Bermain**:
   - Ikuti instruksi di layar.
   - Ketik perintah seperti "go north" untuk bergerak.
   - Ketik "help" untuk bantuan.
   - Ketik "quit" untuk keluar.

## Contoh Permainan

```
Welcome to Adventure!
Adventure is a new, incredibly boring adventure game.
Type 'help' if you need help.

You are outside the main entrance of the university
Exits: east south west

> go east
You are in a lecture theatre
Exits: west

> help
You are lost. You are alone. You wander
around at the university.

Your command words are:
go quit help

> quit
Thank you for playing. Goodbye.
```

## Struktur Kode

- **Game.java**: Kelas utama yang mengelola game, membuat ruangan, parser, dan loop permainan.
- **Room.java**: Mewakili ruangan dengan deskripsi dan pintu keluar (north, east, south, west).
- **Command.java**: Mewakili perintah yang dimasukkan pemain, dengan kata perintah dan kata kedua opsional.
- **Parser.java**: Mengurai input pemain menjadi objek Command.
- **CommandWord.java**: (Jika ada) Mendefinisikan kata-kata perintah yang valid.

## Pengembangan Lanjutan

Game ini dirancang untuk diperluas. Ide-ide untuk pengembangan:
- Tambahkan item dan inventori.
- Implementasikan NPC (non-player characters).
- Tambahkan lebih banyak ruangan dan cerita.
- Integrasikan fitur seperti pertarungan atau puzzle.

## Lisensi

Proyek ini berdasarkan contoh dari buku "Objects First with Java" oleh Michael Kolling dan David J. Barnes. Dapat digunakan untuk tujuan pendidikan.

## Kontribusi

Silakan fork dan berkontribusi dengan fitur baru atau perbaikan bug.