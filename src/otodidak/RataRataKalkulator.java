package otodidak;

import java.util.Scanner;

public class RataRataKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang akan dihitung rata-ratanya: ");
        int jumlahAngka = input.nextInt();

        int[] angka = new int[jumlahAngka];
        int total = 0;

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i];
        }

        double rataRata = (double) total / jumlahAngka;
        System.out.println("Nilai rata-ratanya adalah: " + rataRata);

        input.close();
    }
}
