package exception_handling;

public class Main {
    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 0;

        Integer[] angka = new Integer[10];
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;

        try {
            int result = number1 / number2;
            System.out.println(result);

            // koneksi database
//            for (int i = 0; i < angka.length; i++) {
//                System.out.println(angka[i]);
//            }
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
        } catch (ExceptionInInitializerError error) {
            System.out.println("Error tidak ditemukan");
        } finally {
            System.out.println("Proses pembagian selesai");
        }

        System.out.println("PERINTAH SELANJUTNYA");

    }
}
