package otodidak;

public class Array {

    public static void main(String[] args) {

        // array manual (length nya sudah ditentukan)
        String[] arrayString;
        arrayString = new String[5];
        arrayString[0] = "Tharissa";
        arrayString[1] = "Najwa";
        arrayString[2] = "Putri";
        arrayString[3] = "Budiman";
        arrayString[4] = "behaviour";

        // array otomatis (length tidak ditentukan)
        int[] arrayInt = new int[] {
                22, 8, 2004
        };

        long[] arrayLong = new long[] {
                04L, 05L, 06L
        };

        // mengubah data array
        arrayString[4] = "Smart";
        // mengambil panjang array
        arrayString[0].length();

        // array dalam array
        String[][] members = {
                {"tharissa", "najwa"},
                {"putri", "budiman"},
                {"ica", "wawa"}
        };

        // output
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        System.out.println(arrayString[4]);
        System.out.println(arrayString[0].length());
        System.out.println(arrayLong.length);
        System.out.println(arrayInt[1]);
        System.out.println(arrayLong[2]);
    }
}
