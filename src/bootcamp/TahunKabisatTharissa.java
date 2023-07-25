package bootcamp;

import java.util.Scanner;

public class TahunKabisatTharissa {
    public static void main(String[] args) {

        // membuat scanner
        Scanner scannerTharissa = new Scanner(System.in);

        // input tahun dari pengguna
        System.out.println("Masukkan tahun : ");
        int tahunTharissa = scannerTharissa.nextInt();

        // Panggil metode untuk melakukan perhitungan tahun kabisat
        hitungKabisatTharissa(tahunTharissa);

        // scanner ditutup
        scannerTharissa.close();
    }

    // membuat metode hitung kabisat dengan operasi relasional dan aritmatika
    private static void hitungKabisatTharissa(int tahunTharissa) {
        if (tahunTharissa % 4 == 0) {
            if (tahunTharissa % 100 == 0) {
                System.out.println("Tahun " + tahunTharissa + " bukan tahun kabisat.");
            } else {
                System.out.println("Tahun " + tahunTharissa + " adalah tahun kabisat.");
            }
        } else if (tahunTharissa % 400 == 0) {
            if (tahunTharissa % 100 == 0) {
                System.out.println("Tahun " + tahunTharissa + " bukan tahun kabisat.");
            } else {
                System.out.println("Tahun " + tahunTharissa + " adalah tahun kabisat.");
            }
        } else {
            System.out.println("Tahun " + tahunTharissa + " bukan tahun kabisat.");
        }
    }
}
