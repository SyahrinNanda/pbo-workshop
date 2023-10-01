package inheritance;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("user123", "12345");
//        user1.setUsername("user123");
//        user1.setPassword("12345");
        user1.setEmail("user@gmail.com");
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());
        System.out.println(user1.getEmail());

        // User user2 = new User("")
        AnggotaSatu anggotaSatu = new AnggotaSatu();
        anggotaSatu.setUsername("naggotaSatu");

        AnggotaDua anggotaDua = new AnggotaDua();
        anggotaDua.setUsername("anggotaDua");

    }

}
