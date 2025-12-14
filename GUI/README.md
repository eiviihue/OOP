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

## Contoh Penggunaan

https://github.com/user-attachments/assets/4eb0bc55-ba30-46c6-bbfd-ee9715e40bd3

## Struktur Kode

<img width="1173" height="680" alt="image" src="https://github.com/user-attachments/assets/a0f2ee8d-374d-484b-861d-8ee69de06581" />


- **ImageViewer.java**: Kelas utama yang membuat GUI, menangani menu, dan mengelola gambar.
- **ImagePanel.java**: Panel khusus untuk menampilkan gambar.
- **ImageFileManager.java**: Utility untuk memuat gambar dari file.
- **OFImage.java**: Kelas gambar kustom dengan metode filter (darker, lighter, threshold).

