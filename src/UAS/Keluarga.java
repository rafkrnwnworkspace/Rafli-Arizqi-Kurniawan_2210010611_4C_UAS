
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
