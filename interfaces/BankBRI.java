package interfaces;

public class BankBRI implements Bank {

    public BankBRI() {
        System.out.println("SELAMAT DATANG DI BANK BRI");
    }

    @Override
    public void transfer(int jumlah) {

    }

    @Override
    public int tarikTunai() {
        return 0;
    }

    @Override
    public void showBankName() {
        System.out.println("BANK BRI");
    }
}
