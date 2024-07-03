
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

