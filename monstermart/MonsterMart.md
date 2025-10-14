## Rancangan Class
<img width="1915" height="934" alt="image" src="https://github.com/user-attachments/assets/5231a4bb-874a-4cbb-b798-583346dbf1c5" />

## Explanation
### Product
Class untuk menyimpan informasi terkait product yang ada(nama, harga, dan stok yang tersedia)
Class ini juga menyimpan log informasi terkait transaksi yang sudah dilakukan

### VendingMachine
Class utama untuk menjalankan fungsi fungsi dari monstermart seperti:
  1. Initiate product apa saja yang ada di dalam vending machine kemudian disimpan di arraylist
  2. Menampilkan seluruh product yang ada
  3. Fungsi pemilihan product dan transaksi

### Kelemahan
Log transaksi tidak disimpan ke suatu file sehingga setiap kali vendingmachine dijalankan informasi terkait product juga mengulang(stok kembali karena di initiate lagi di awal)   
