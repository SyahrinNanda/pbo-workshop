package interfaces;

public class BankBNI implements Bank {

    public BankBNI() {
        System.out.println("SELAMAT DATANG DI BANK BNI");
    }

    @Override
    public void transfer(int jumlah) {

    }

    @Override
    public int tarikTunai() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
