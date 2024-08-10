Proyek ini adalah contoh sederhana aplikasi pengolahan data Keluarga menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

Aplikasi ini menerima input berupa nama dan umur, dan memberikan output berupa informasi detail dari nama dan umur.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. Berikut adalah kodingan Orang.java

package UAS;

public class Orang {
    private String nama;
    private int umur;

    // Konstruktor
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method
    public void perkenalan() {
        System.out.println("Halo, nama saya " + nama + ", umur saya " + umur + " tahun.");
    }
}  

2. Berikut adalah kodingan Keluarga.java

package UAS;

// Inheritance
class Ayah extends Orang {
    private String pekerjaan;

    // Konstruktor
    public Ayah(String nama, int umur, String pekerjaan) {
        super(nama, umur);
        this.pekerjaan = pekerjaan;
    }

    // Polymorphisme (Overriding)
    @Override
    public void perkenalan() {
        System.out.println("Halo, saya ayah. Nama saya " + getNama() + ", umur saya " + getUmur() + " tahun. Saya bekerja sebagai " + pekerjaan + ".");
    }
}

// Subclass : Ibu
class Ibu extends Orang {
    private String pekerjaan;

    // Konstruktor
    public Ibu(String nama, int umur, String pekerjaan) {
        super(nama, umur);
        this.pekerjaan = pekerjaan;
    }

    // Polymorphisme (Overriding)
    @Override
    public void perkenalan() {
        System.out.println("Halo, saya ibu. Nama saya " + getNama() + ", umur saya " + getUmur() + " tahun. Saya bekerja sebagai " + pekerjaan + ".");
    }
}

// Subclass: Anak
class Anak extends Orang {
    private String sekolah;

    // Konstruktor
    public Anak(String nama, int umur, String sekolah) {
        super(nama, umur);
        this.sekolah = sekolah;
    }

    // Overriding method
    @Override
    public void perkenalan() {
        System.out.println("Halo, saya anak. Nama saya " + getNama() + ", umur saya " + getUmur() + " tahun. Saya sekolah di " + sekolah + ".");
    }
}

3. Berikut adalah kodingan Main.java

package UAS;

import java.util.Scanner;

public class Main {
    
    // Method overloading
    public static void perkenalkanKeluarga(Orang[] anggotaKeluarga) {
        for (Orang anggota : anggotaKeluarga) {
            anggota.perkenalan();
        }
    }

    // Error handling
    public static int inputUmur(Scanner scanner) {
        int umur = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Masukkan umur: ");
                umur = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
            }
        }
        return umur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data ayah
        System.out.print("Masukkan nama ayah: ");
        String namaAyah = scanner.nextLine();
        int umurAyah = inputUmur(scanner);
        System.out.print("Masukkan pekerjaan ayah: ");
        String pekerjaanAyah = scanner.nextLine();

        // Input data ibu
        System.out.print("Masukkan nama ibu: ");
        String namaIbu = scanner.nextLine();
        int umurIbu = inputUmur(scanner);
        System.out.print("Masukkan pekerjaan ibu: ");
        String pekerjaanIbu = scanner.nextLine();

        // Input data anak
        System.out.print("Masukkan nama anak: ");
        String namaAnak = scanner.nextLine();
        int umurAnak = inputUmur(scanner);
        System.out.print("Masukkan sekolah anak: ");
        String sekolahAnak = scanner.nextLine();

        // Membuat objek keluarga
        Ayah ayah = new Ayah(namaAyah, umurAyah, pekerjaanAyah);
        Ibu ibu = new Ibu(namaIbu, umurIbu, pekerjaanIbu);
        Anak anak = new Anak(namaAnak, umurAnak, sekolahAnak);

        // Menyimpan anggota keluarga dalam array
        Orang[] keluarga = {ayah, ibu, anak};

        // Perkenalan anggota keluarga
        perkenalkanKeluarga(keluarga);

        scanner.close();
    }
}

Syarat Penilaian :

a) Class 

Orang.java, Keluarga.java, Main.java

b) Object

Ayah ayah = new Ayah(namaAyah, umurAyah, pekerjaanAyah);
Ibu ibu = new Ibu(namaIbu, umurIbu, pekerjaanIbu);
Anak anak = new Anak(namaAnak, umurAnak, sekolahAnak);

c) Atribut

private String nama;
private int umur;
private String pekerjaan;
private String sekolah;

d) Constructor

public Orang(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
}

public Ayah(String nama, int umur, String pekerjaan) {
    super(nama, umur);
    this.pekerjaan = pekerjaan;
}

e) Mutator

public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(int umur) {
    this.umur = umur;
}

f) Accessor

public String getNama() {
    return nama;
}

public int getUmur() {
    return umur;
}

g) Encapsulation

Contoh enkapsulasi dalam program ini adalah penggunaan atribut private dan method getter dan setter di Orang.java.

h) Inheritance

class Ayah extends Orang {
    //...
}

class Ibu extends Orang {
    //...
}

class Anak extends Orang {
    //...
}

i) Polymorphism

@Override
public void perkenalan() {
    System.out.println("Halo, saya ayah. Nama saya " + getNama() + ", umur saya " + getUmur() + " tahun. Saya bekerja sebagai " + pekerjaan + ".");
}

public static void perkenalkanKeluarga(Orang[] anggotaKeluarga) {
    for (Orang anggota : anggotaKeluarga) {
        anggota.perkenalan();
    }
}

j) Selection

Contoh seleksi dalam program ini ada di inputUmur method dengan penggunaan try-catch untuk error handling.

k) Loop

for (Orang anggota : anggotaKeluarga) {
    anggota.perkenalan();
}

l) IO Sederhana

Scanner scanner = new Scanner(System.in);

System.out.print("Masukkan nama ayah: ");
String namaAyah = scanner.nextLine();
//...

scanner.close();

m) Arrray

Orang[] keluarga = {ayah, ibu, anak};

n) Error Handling

public static int inputUmur(Scanner scanner) {
    int umur = 0;
    boolean valid = false;
    while (!valid) {
        try {
            System.out.print("Masukkan umur: ");
            umur = Integer.parseInt(scanner.nextLine());
            valid = true;
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Silakan masukkan angka.");
        }
    }
    return umur;
}

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rafli Arizqi Kurniawan
NPM: 2110010611
