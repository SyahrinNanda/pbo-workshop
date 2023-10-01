package encapsulation;

public class Main {

    public Main() {
        System.out.println("CONSTRUCTOR MAIN");
    }

    public static void main(String[] args) {

//        Account account1 = new Account();
//        System.out.println(account1.getUsername());
//        account1.setUsername("New Username");
//        System.out.println(account1.getUsername());
//
//        Account account2 = new Account("idnar@gmail.com", "indar");
//        System.out.println(account2.getUsername());
//
//        Account account3 = new Account("jack@gmail.com", "jack", "123456");

        Account account3 = new Account();
        System.out.println(account3.getPassword());

        Account account4 = new Account("indar@gmail.com", "indar");
        System.out.println(account4.getPassword());


    }
}
