package otodidak;

import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input bilangan suhu dari pengguna
        System.out.print("Masukkan suhu dalam celcius: ");
        int suhuCelcius = scanner.nextInt();

        // Panggil metode untuk mengambil hasil yg sudah dikonversi
        int fahrenheit = isConverted(suhuCelcius);

        // Cetak hasil
        System.out.println(suhuCelcius + " derajat Celcius sama dengan " + fahrenheit + " derajat Fahrenheit");


        scanner.close();
    }

    // Metode untuk mengkonversi celcius ke fahrenheit
    private static int isConverted(int suhuCelcius) {
        int fahrenheit = (suhuCelcius * 9/5) + 32;

        return fahrenheit;
    }
}
