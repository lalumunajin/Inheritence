# Inheritance Java - Shape and Circle

Repository ini berisi tugas **Pemrograman Berorientasi Objek (PBO)** menggunakan bahasa Java dengan materi utama *Inheritance* atau pewarisan kelas.

Program ini menggunakan kelas `Shape` sebagai kelas induk dan `Circle` sebagai kelas turunan untuk mempelajari hubungan pewarisan, penggunaan constructor, serta pengelolaan atribut dan method dalam Java.

## 📚 Materi yang Dipelajari

- **Inheritance** — konsep pewarisan atribut dan method dari kelas induk ke kelas turunan.
- **Constructor** — proses inisialisasi objek saat dibuat.
- **`super()`** — memanggil constructor dari kelas induk.
- **Encapsulation** — pengaturan akses terhadap atribut dan method.
- **Getter dan Setter** — mengambil dan mengubah nilai atribut.

## 📂 Struktur Program

```text
Inheritance-Java/
├── Shape.java
├── Circle.java
├── [Kelas Turunan Lain].java
├── Main.java
└── README.md
```

*Catatan: Sesuaikan struktur di atas dengan nama file yang benar-benar terdapat di repository.*

## 💻 Penjelasan Kelas

### 1. Shape.java

Kelas `Shape` berperan sebagai kelas induk (*parent class*) yang menjadi dasar bagi kelas turunannya.

Kelas ini digunakan untuk menunjukkan konsep pewarisan dalam pemrograman berorientasi objek.

### 2. Circle.java

Kelas `Circle` merupakan kelas turunan dari `Shape` dengan menggunakan keyword `extends`.

```java
public class Circle extends Shape {
    protected double radius;
    public static final double PI = 3.14159;
}
```

Keterangan:
- `extends Shape` menunjukkan bahwa `Circle` mewarisi kelas `Shape`.
- `radius` digunakan untuk menyimpan nilai jari-jari lingkaran.
- `PI` merupakan konstanta yang menyimpan nilai pi.
- `super(color)` digunakan pada constructor `Circle` untuk memanggil constructor kelas induk.
- Getter dan setter digunakan untuk mengambil serta mengubah nilai `radius`.

### 3. Kelas Turunan Lainnya

Bagian ini digunakan untuk menjelaskan kelas turunan lain yang terdapat dalam program.

Tambahkan nama kelas, atribut, constructor, dan method sesuai implementasi kode yang digunakan.

### 4. Main.java

Kelas utama digunakan sebagai titik awal eksekusi program melalui method `main()`.

Sesuaikan penjelasan ini dengan cara objek dibuat, method dipanggil, dan hasil program ditampilkan dalam kode utama.

## 🔄 Konsep Inheritance

Secara sederhana, inheritance memungkinkan sebuah kelas memperoleh karakteristik dari kelas lain.

```text
Shape
  |
  └── Circle
```

Pada hubungan tersebut, `Shape` merupakan kelas induk, sedangkan `Circle` merupakan kelas turunan.

Dengan konsep ini, kelas turunan dapat menggunakan fitur yang diwariskan dari kelas induk sesuai aturan akses yang berlaku, sekaligus memiliki atribut dan method khusus.

## ▶️ Cara Menjalankan Program

1. Pastikan Java Development Kit (JDK) telah terpasang.
2. Buka folder proyek menggunakan IDE Java atau terminal.
3. Pastikan semua file Java berada pada struktur package yang sesuai.
4. Compile file yang diperlukan jika menjalankan program melalui terminal.

Contoh perintah jika semua file berada pada package default:

```bash
javac *.java
java Main
```

Ganti `Main` dengan nama kelas yang benar-benar memiliki method `main()` pada proyekmu.

## 📸 Screenshot Output Program

Bagian ini digunakan untuk menampilkan dokumentasi hasil eksekusi program.

### Hasil Eksekusi

Tambahkan screenshot hasil program pada bagian berikut.

```text
docs/
└── output-inheritance.png
```

Setelah gambar dimasukkan ke folder `docs`, tampilkan menggunakan Markdown berikut:

```markdown
![Output Program Inheritance](docs/output-inheritance.png)
```

Pastikan screenshot menunjukkan hasil eksekusi program yang sebenarnya.

## 🎯 Kesimpulan

Melalui tugas ini, konsep *Inheritance* dalam Java dipelajari melalui hubungan antara kelas induk dan kelas turunan. Penggunaan `extends`, constructor, `super()`, serta getter dan setter membantu memahami bagaimana kelas dapat mewarisi dan mengelola atribut maupun method dalam pemrograman berorientasi objek.

---

**Bahasa Pemrograman:** Java  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Topik:** Inheritance
