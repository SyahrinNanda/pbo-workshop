package interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank;

        System.out.print("Masukkan nama bank : ");
        String namaBank = input.nextLine();

        if (namaBank.toLowerCase().contains("bri")) {
            bank = new BankBRI();
        } else if (namaBank.contains("BNI")) {
            bank = new BankBNI();
        } else {
            System.out.println("NAMA BANK TIDAK VALID");
        }

        Bank bankBRI = new BankBRI();
        Bank bankBNI = new BankBNI();
        System.out.println(bankBRI.equals(bankBRI));

        Test test = new Test();
        System.out.println(test);
    }
}
