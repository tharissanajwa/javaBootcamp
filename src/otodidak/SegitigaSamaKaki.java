package otodidak;

import java.util.Scanner;

public class SegitigaSamaKaki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputkan angka yang diinginkan : ");
        int angka = scanner.nextInt();

        membuatSegitiga(angka);

        scanner.close();
    }

    private static void membuatSegitiga(int angka) {
        int i;
        int j;
        for (i = 1; i <= angka; i++) {
            // mencetak spasi
            for (j = 1; j <= angka - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            // mencetak baris baru
            System.out.println();
        }
    }
}
