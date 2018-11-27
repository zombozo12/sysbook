# sysbook
Sebuah Aplikasi Dinamis Penyewaan Buku menggunakan Java Swing  dan MySQL dengan halaman yang dinamis

## Getting Started
Instruksi ini untuk mendapatkan sebuah copy dari project ini dan dijalankan di komputer Anda. Feel free to edit, but don't delete the copyright :)

### Prerequisites
Apa saja yang aplikasi yang dibutuhkan untuk menjalankan projek ini.
* XAMPP (phpmyadmin)
atau
* Aplikasi lain untuk menjalankan database
* JDK 7 atau 8

### Installing
* Import projek ini ke Java IDE kalian (Netbeans atau Eclipse)
* Import database [db_sysbook.sql](https://github.com/zombozo12/sysbook/blob/master/db_sysbook.sql) ke XAMPP (phpmyadmin) kalian atau aplikasi database lainnya
* Atur username dan password database kalian di [MySQLConnection.java](https://github.com/zombozo12/sysbook/blob/master/src/Main/MySQLConnection.java)
```
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_sysbook","username","password");
```
* Enjoy! :)

### Screenshots

* Login
Menggunakan enkripsi SHA-256 untuk password
![Login Form](https://raw.githubusercontent.com/zombozo12/sysbook/master/src/Main/screenshot/login.png)

* Dashboard
Menampilkan informasi singkat tentang data yang ada di database
![Dashboard Form](https://raw.githubusercontent.com/zombozo12/sysbook/master/src/Main/screenshot/dashboard.png)

* Daftar Buku (CRUD)
Menampilkan daftar buku yang tersedia
![Buku Form](https://raw.githubusercontent.com/zombozo12/sysbook/master/src/Main/screenshot/buku.png)

* Penyewaan Buku
Form penyewaan buku. Kalkulasi biaya sewa, pengurangan stok, dan memasukan hari saat ini dalam bentuk Unix Timestamp/Epoch
![Penyewaan Buku Form](https://raw.githubusercontent.com/zombozo12/sysbook/master/src/Main/screenshot/penyewaan.png)

* Pengembalian Buku
Form pengembalian buku, penambahan stok dan kalkulasi denda per harinya
![Pengembalian Buku Form](https://raw.githubusercontent.com/zombozo12/sysbook/master/src/Main/screenshot/pengembalian.png)

* Pengaturan Pengguna
Form untuk mengatur pengguna, pengguna dibagi menjadi 2 yaitu Admin dan Kasir
![Pengaturan Pengguna Form](https://raw.githubusercontent.com/zombozo12/sysbook/master/src/Main/screenshot/pengguna.png)

### Build with
* [Netbeans IDE](https://netbeans.org/downloads/index.html)
* [XAMPP](https://www.apachefriends.org/index.html)

## Author
* **Wiguna R** - [zombozo12](https://github.com/zombozo12)


