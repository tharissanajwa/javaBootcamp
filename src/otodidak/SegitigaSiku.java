package otodidak;

import java.util.Scanner;

public class SegitigaSiku {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // menerima input angka
        System.out.println("Masukkan angka yg ingin di generate : ");
        int angka = scanner.nextInt();

        // memanggil metode
        buatSegitiga(angka);
    }

    private static void buatSegitiga(int angka) {

        int i;
        int j;
        for (i = 1; i <= angka; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf(" " + i);
            }
            System.out.println();
        }
    }
}
