package interfaces;

public interface Bank {

    void transfer(int jumlah);
    int tarikTunai();

    // method default yang akan digunakan ketika tidak di override di method turunan
    default void showBankName() {
        System.out.println("NAMA BANK");
    }

}
