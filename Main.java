public class Main {

    public static void main(String[] args) {

        System.out.println("Test");

        cetakNama("Indar");

        int jumlah = hitung(5, 5);
        System.out.println(jumlah);
        System.out.println(hitung(5, 5));

        int number = 0;
        Integer numberObjek = null;

        double decimal = 0.0;
        Double decimalObjek = null;
        float decimal2;

        String kalimat;
        char character;
        boolean isNumber;

        if (numberObjek != null) {
            System.out.println("NUMBER OBJEK " + numberObjek);
        } else {
            System.out.println("NUMBER OBJEK IS NULL");
        }

        char[] arrayChar = {'i', 'n', 'd', 'a', 'r'};
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println(arrayChar[i]);
        }

        while(arrayChar.length > 0) {

        }

        do {

        } while (arrayChar.length > 5);

    }

    public static void cetakNama(String nama) {
        System.out.println("NAMA : " + nama);
    }

    public static int hitung(int angka1, int angka2) {
        return angka1 + angka2;
    }

}

