package otodidak;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input bilangan dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();

        // Panggil metode untuk memeriksa apakah bilangan adalah bilangan prima
        boolean isPrime = isPrimeNumber(number);

        // Cetak hasil
        if (isPrime) {
            System.out.println("Bilangan tersebut adalah bilangan prima.");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan prima.");
        }

        scanner.close();
    }

    // Metode untuk memeriksa apakah bilangan adalah bilangan prima
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        // Cek apakah bilangan bisa dibagi oleh angka selain 1 dan dirinya sendiri
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
