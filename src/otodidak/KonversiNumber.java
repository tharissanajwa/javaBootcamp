package otodidak;

public class KonversiNumber {
    public static void main(String[] args) {

        // widening casting(otomatis) : harus berurutan dari yg terkecil, kalau dari yg terbesar harus manual
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // narrowing casting(manual) : bisa konversi dari yg terbesar
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

        System.out.println(iniShort2);

    }
}
