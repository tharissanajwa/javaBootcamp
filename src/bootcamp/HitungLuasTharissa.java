package bootcamp;

public class HitungLuasTharissa {
    public static void main(String[] args) {
        // ini untuk mengisianilisasi jari - jari lingkaran
        float jariJariTharissa = 6.5F;

        // ini rumus untuk menghitung luas lingkaran
        double luasTharissa = Math.PI * jariJariTharissa * jariJariTharissa;

        // ini rumus untuk menghitung keliling lingkaran
        double kelilingTharissa = 2 * Math.PI * jariJariTharissa;

        // ini untuk memunculkan output
        System.out.printf("Luas lingkaran adalah %.2f\n", luasTharissa);
        System.out.printf("Keliling lingkaran adalah %.2f\n", kelilingTharissa);

        // test untuk cek eval
    }

}
