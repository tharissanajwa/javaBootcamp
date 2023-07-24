package otodidak;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input angka n dari pengguna
        System.out.print("Masukkan angka n: ");
        int n = scanner.nextInt();

        // Panggil metode untuk mencetak deret Fibonacci
        printFibonacciSeries(n);

        scanner.close();
    }

    // Metode untuk mencetak deret Fibonacci hingga n angka pertama
    private static void printFibonacciSeries(int n) {
        int num1 = 0, num2 = 1;

        System.out.print("Deret Fibonacci hingga " + n + " angka pertama: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}