package otodidak;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // menerima input angka pertama
        System.out.println("Masukkan angka pertama : ");
        int angkaPertama = scanner.nextInt();

        // menerima operator
        System.out.println("Masukkan operator yang diinginkan : ");
        char operator = scanner.next().charAt(0);

        // menerima input angka kedua
        System.out.println("Masukkan angka kedua : ");
        int angkaKedua = scanner.nextInt();

        // cetak hasil
        System.out.println("Output : ");

        // Panggil metode untuk mengambil hasil yg sudah dikalkulasi
        int hasilnya = kalkulasi(angkaPertama, operator, angkaKedua);
        if (hasilnya != Integer.MIN_VALUE) {
            System.out.println(angkaPertama + " " + operator + " " + angkaKedua + " = " + hasilnya);
        }

        scanner.close();
    }

    private static int kalkulasi(int angkaPertama, char operator, int angkaKedua){
        int hasil = 0;
        switch (operator) {
            case '+':
                hasil = angkaPertama + angkaKedua;
                break;
            case '-':
                hasil = angkaPertama - angkaKedua;
                break;
            case '*':
                hasil = angkaPertama * angkaKedua;
                break;
            case '/':
                hasil = angkaPertama / angkaKedua;
                break;
            default:
                System.out.println("Pilihan operator anda tidak valid!");
                hasil = Integer.MIN_VALUE; // Menggunakan nilai spesial untuk menandakan operator tidak valid
                break;
        }
        return hasil;
    }
}
