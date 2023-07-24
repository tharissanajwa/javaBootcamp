package otodidak;

public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 1000L;
        Byte iniByte = null;

        // konversi tipe data primitif ke non primitif
        int iniInteger2 = 10;
        Integer iniInteger3 = iniInteger2;

        // konversi tipe data primitif khusus
        int age = 19;
        Integer ageObject = age;
        // dibalikin lagi ke primitif
        int ageAgain = ageObject;
        // dibalikin lagi ke primitif namun berbeda tipe data
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        String stringAge = ageObject.toString();
        double doubleAge = ageObject.doubleValue();
        // dengan note bisa apa aja tipe data, tidak hanya int saja

        // output
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);
        System.out.println(iniInteger3);
        System.out.println(ageObject);
        System.out.println(ageAgain);
        System.out.println(shortAge);
        System.out.println(byteAge);
        System.out.println(stringAge);
        System.out.println(doubleAge);

    }
}
