package otodidak;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input bilangan dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();

        // Panggil metode untuk menghitung faktorial
        long factorialResult = calculateFactorial(number);

        // Cetak hasil faktorial
        System.out.println(number + "! = " + factorialResult);

        scanner.close();
    }

    // Metode untuk menghitung faktorial dari bilangan
    private static long calculateFactorial(int number) {
        // Faktorial dari 0 dan 1 adalah 1
        if (number == 0 || number == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
