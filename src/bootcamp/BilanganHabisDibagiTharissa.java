package bootcamp;

import java.util.Scanner;

public class BilanganHabisDibagiTharissa {
    public static void main(String[] args) {

        // membuat scanner
        Scanner scannerTharissa = new Scanner(System.in);

        // input bilangan dari pengguna
        System.out.println("Masukkan bilangan : ");
        int bilanganTharissa = scannerTharissa.nextInt();

        // memanggil metode untuk melakukan perhitungan
        hitungBilanganTharissa(bilanganTharissa);

        // menutup scanner
        scannerTharissa.close();

    }

    private static void hitungBilanganTharissa(int bilanganTharissa) {
        if ((bilanganTharissa % 3 == 0) && (bilanganTharissa % 5 == 0)) {
            System.out.println("Bilangan " + bilanganTharissa + " memenuhi kondisi.");
        } else {
            System.out.println("Bilangan " + bilanganTharissa + " tidak memenuhi kondisi.");
        }
    }
}
