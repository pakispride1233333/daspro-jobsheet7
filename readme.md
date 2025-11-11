# Laporan Jawaban Jobsheet 7
**Nama:** Adiatma Wahyudi  
**NIM:** 254107020212  
**Absen:** 01  



### 1. Komponen For dalam source kode:
- `int i = 1` untuk memberikan nilai awal pada variabel *i* sebelum dilakukan perulangan.
- `i <= 10` menjadi syarat untuk sebuah perulangan. Pada source kode tersebut, jika kondisi perulangan masih di bawah 10 maka perulangan akan terus dilanjutkan sampai mencapai 10.

---

### 2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah 100?
Karena rentang nilai mahasiswa biasanya berada antara 0 sampai 100, sehingga setiap nilai yang dimasukkan dapat dibandingkan secara benar untuk menentukan nilai tertinggi dan terendah. Jika variabel tertinggi diinisialisasi dengan 100 dan terendah dengan 0, maka tidak akan ada nilai yang lebih besar dari 100 atau lebih kecil dari 0, sehingga nilai tertinggi akan tetap 100 dan nilai terendah tetap 0, menyebabkan hasil perhitungan menjadi salah.

---

### 3. Penjelasan Blok IF
- Blok IF pertama akan membandingkan apakah value variabel `nilai` lebih besar dari variabel `tertinggi`. Jika iya maka `nilai` tersebut akan disimpan ke variabel `tertinggi`.
- Blok IF kedua akan membandingkan apakah value variabel `nilai` lebih kecil dari variabel `terendah`. Jika iya maka `nilai` tersebut akan disimpan ke variabel `terendah`.

---

## Pertanyaan 2.2.3

### 1. Penjelasan Sintaks
a. `nilai < 0 || nilai > 100`  
Digunakan untuk memeriksa apakah nilai berada di luar rentang valid (0-100). Jika nilai tidak valid maka harus diinput ulang.

b. `continue`  
Digunakan untuk melewati sisa perintah dalam satu iterasi perulangan dan langsung kembali ke awal perulangan `while`. Jika nilai tidak valid, maka pengecekan grade dilewati dan input diminta kembali.

### 2. Letak `i++`
`i++` berada di akhir karena berfungsi menambah hitungan mahasiswa yang sudah diproses. Jika diletakkan di awal, maka perulangan akan bergeser satu langkah lebih cepat sehingga jumlah iterasi akan menjadi tidak sesuai dan input pertama bisa terlewati.

### 3. Jumlah Perulangan
Jika mengisikan 19, maka akan dilakukan **19 kali** perulangan.

---

## 2.3.3 Pertanyaan

1. Jika mengisikan `batal`, maka perulangan tidak dijalankan.
2. Kondisi berhenti yaitu ketika user mengisikan `batal`. Saat itu program menjalankan perintah `break`.
3. `true` pada kondisi `do-while` artinya perulangan selalu bernilai benar sehingga loop akan terus berulang. Perulangan hanya berhenti ketika kondisi tertentu terpenuhi, misalnya ketika pengguna mengetik `batal`.








