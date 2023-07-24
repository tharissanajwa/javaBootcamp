package otodidak;

import java.util.Scanner;

public class ReverseKata {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Menerima input kata dari pengguna
        System.out.print("Masukkan kata untuk direverse: ");
        String kata = scanner.nextLine();

        // membalikkan kata menggunakan function
        StringBuilder kataBalik = new StringBuilder(kata);
        kataBalik.reverse();

        // Cetak hasil reverse
        System.out.println("kata " + kata + " menjadi " + kataBalik);

        scanner.close();
    }
}
