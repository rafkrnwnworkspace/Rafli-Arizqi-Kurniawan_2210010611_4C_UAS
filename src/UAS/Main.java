
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