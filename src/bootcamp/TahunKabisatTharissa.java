package bootcamp;

import java.util.Scanner;

public class TahunKabisatTharissa {
    public static void main(String[] args) {

        // membuat scanner
        Scanner scanner = new Scanner(System.in);

        // input tahun dari pengguna
        System.out.println("Masukkan tahun : ");
        int tahunTharissa = scanner.nextInt();

        // Panggil metode untuk melakukan perhitungan tahun kabisat
        hitungKabisatTharissa(tahunTharissa);

        // scanner ditutup
        scanner.close();
    }

    // membuat metode hitung kabisat dengan operasi relasional dan aritmatika
    private static void hitungKabisatTharissa(int tahunTharissa) {
        if ((tahunTharissa % 4 == 0) && (tahunTharissa % 400 == 0) || (tahunTharissa % 100 != 0) ) {
             System.out.println("Tahun " + tahunTharissa + " merupakan tahun kabisat");
        } else {
            System.out.println("Tahun " + tahunTharissa + " bukan tahun kabisat");
        }
    }
}
