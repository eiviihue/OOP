# Image Viewer GUI

Aplikasi GUI berbasis Java Swing untuk melihat gambar dan menerapkan filter sederhana seperti membuat gambar lebih gelap, lebih terang, atau menerapkan threshold.

## Deskripsi

ImageViewer adalah aplikasi desktop sederhana yang memungkinkan pengguna membuka file gambar, menampilkannya di jendela, dan menerapkan filter dasar. Aplikasi ini menggunakan Java Swing untuk antarmuka grafis dan mendukung format gambar standar.

## Fitur

- **Buka Gambar**: Pilih dan buka file gambar dari direktori menggunakan file chooser.
- **Tutup Gambar**: Hapus gambar yang sedang ditampilkan.
- **Keluar Aplikasi**: Tutup aplikasi.
- **Filter Gambar**:
  - **Darker**: Membuat gambar lebih gelap.
  - **Lighter**: Membuat gambar lebih terang.
  - **Threshold**: Menerapkan filter threshold untuk efek hitam-putih.
- **Informasi**: Tampilkan versi aplikasi dan informasi tentang.
- **Status Bar**: Menampilkan status operasi dan nama file.

## Persyaratan

- Java Development Kit (JDK) versi 8 atau lebih tinggi (karena menggunakan Swing).
- Sistem operasi yang mendukung Java Swing (Windows, macOS, Linux).

## Cara Menjalankan

1. **Pastikan File Java Ada**:
   - File utama: `ImageViewer.java`, `ImagePanel.java`, `ImageFileManager.java`, `OFImage.java`.

2. **Compile Kode**:
   - Buka terminal dan navigasi ke direktori proyek (misalnya: `e:\pbo\GUI\`).
   - Jalankan perintah untuk mengkompilasi semua file Java:
     ```
     javac *.java
     ```

3. **Jalankan Aplikasi**:
   - Setelah kompilasi berhasil, jalankan aplikasi dengan:
     ```
     java ImageViewer
     ```

4. **Menggunakan Aplikasi**:
   - Gunakan menu **File > Open** untuk membuka gambar.
   - Terapkan filter dari menu **Filter**.
   - Lihat status di bagian bawah jendela.

## Contoh Penggunaan

- Buka aplikasi: Jendela utama muncul dengan menu bar.
- Pilih **File > Open**: Pilih file gambar (misalnya, .jpg atau .png).
- Gambar ditampilkan di panel tengah.
- Klik **Filter > Darker**: Gambar menjadi lebih gelap, status diperbarui.
- Klik **File > Close**: Gambar dihapus.
- Klik **File > Quit**: Aplikasi ditutup.

## Struktur Kode

- **ImageViewer.java**: Kelas utama yang membuat GUI, menangani menu, dan mengelola gambar.
- **ImagePanel.java**: Panel khusus untuk menampilkan gambar.
- **ImageFileManager.java**: Utility untuk memuat gambar dari file.
- **OFImage.java**: Kelas gambar kustom dengan metode filter (darker, lighter, threshold).

## Pengembangan Lanjutan

Aplikasi ini dapat diperluas dengan:
- Menambah filter baru (misalnya, blur, sharpen).
- Mendukung lebih banyak format gambar.
- Menambahkan fitur save gambar yang telah difilter.
- Integrasi dengan drag-and-drop untuk membuka file.

## Lisensi

Proyek ini berdasarkan contoh dari buku "Objects First with Java" oleh Michael Kolling dan David J. Barnes. Dapat digunakan untuk tujuan pendidikan.

## Kontribusi

Silakan fork dan berkontribusi dengan fitur baru atau perbaikan bug.