package otodidak;

import java.util.Random;
import java.util.Scanner;

public class TebakanAngkaRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaRandom = random.nextInt(100) + 1;
        int tebakan;
        int jumlahTebakan = 0;

        System.out.println("Hai! Mari bermain Tebak Angka Random.");

        do {
            System.out.print("Tebak angka (1-100): ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaRandom) {
                System.out.println("Tebakan terlalu rendah!");
            } else if (tebakan > angkaRandom) {
                System.out.println("Tebakan terlalu tinggi!");
            } else {
                System.out.println("Selamat! Tebakan benar.");
                System.out.println("Jumlah tebakan yang diperlukan: " + jumlahTebakan);
                break;
            }
        } while (true);

        scanner.close();
    }
}