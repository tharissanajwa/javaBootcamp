package otodidak;

public class Variable {

    public static void main(String[] args) {

        // variabel biasa
        String name;
        name = "Tharissa Najwa Putri Budiman";
        int age = 19;
        String address = "Citeureup, Cimahi";
        // var variabel
        var gender = "female";
        var dob = 22_08_2004;
        // final variabel
        final String aplikasi = "Belajar java";
        // aplikasi = "Belajar php"; // ini akan error, karena data tidak bisa dirubah dikarenakan sudah di final


        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        System.out.println("Alamat : " + address);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Tanggal Lahir : " + dob);
        System.out.println("Aplikasi : " + aplikasi);
    }
}
