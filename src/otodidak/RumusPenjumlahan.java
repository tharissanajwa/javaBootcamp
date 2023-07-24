package otodidak;

public class RumusPenjumlahan {
    // Variabel anggota (instance variables)
    int angka1;
    int angka2;

    // Konstruktor
    public RumusPenjumlahan(int a, int b) {
        angka1 = a;
        angka2 = b;
    }

    // Metode untuk menambahkan dua angka
    public int tambah() {
        return angka1 + angka2;
    }

    // Metode utama (main method)
    public static void main(String[] args) {
        // Membuat objek dari kelas RumusPenjumlahan
        RumusPenjumlahan objek = new RumusPenjumlahan(5, 10);

        // Memanggil metode tambah() dari objek dan menampilkan hasilnya
        int hasilPenjumlahan = objek.tambah();
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
    }
}
