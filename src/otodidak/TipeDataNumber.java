package otodidak;

public class TipeDataNumber {
    public static void main(String[] args) {
        // integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000000;
        long iniLong = 1000000000;
        Long iniLong2 = 1000000000L;

        // floating
        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        // literals
        int decimalInt = 22;
        int hexInt = 0xA132B;
        int binInt = 0b0101010101;

        // underscore
        long balence = 1_000_000_000_000L;
        int sum = 60_000_000;

        // output integer
        System.out.println("ini adalah byte " + iniByte);
        System.out.println("ini adalah short " + iniShort);
        System.out.println("ini adalah integer " + iniInt);
        System.out.println("ini adalah long " + iniLong);
        System.out.println("ini juga adalah long, namun diakhir memakai huruf L " + iniLong2);

        // output floating
        System.out.println("ini adalah float " + iniFloat);
        System.out.println("ini adalah double " + iniDouble);

        // output literals
        System.out.println("ini adalah desimal integer " + decimalInt);
        System.out.println("ini adalah hexa integer " + hexInt);
        System.out.println("ini adalah binary integer " + binInt);

        // output underscore
        System.out.println("ini adalah contoh underscore 1 = " + balence);
        System.out.println("ini adalah contoh underscore 2 = " + sum);
    }
}
