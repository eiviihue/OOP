### Penjelasan Kode dan Menjalankannya
[MonsterMart Snack Vending Machine-Rafi Aqila Maulana](https://youtu.be/SBCxXoMLpro?si=bsflJ76e9DmDWdq4)

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

### monstermart
Class untuk memulai vendingmachine

### Simulasi Penggunaan Vending Machine
<img width="1919" height="1197" alt="image" src="https://github.com/user-attachments/assets/29d50f95-d353-4355-9c91-90fe1d9de301" />
<img width="1919" height="1191" alt="image" src="https://github.com/user-attachments/assets/ad28cc5e-7445-4e55-990f-2d5cf6f0bf4a" />


### Kelemahan
Log transaksi tidak disimpan ke suatu file sehingga setiap kali vendingmachine dijalankan informasi terkait product juga mengulang(stok kembali karena di initiate lagi di awal)   
