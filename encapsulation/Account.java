package encapsulation;

public class Account {

    private String email;
    private String username;
    private String password;

    public Account(String email, String username) {
        this.email = email;
        this.username = username;
        this.password = "DEFAULT";
    }

    public Account() {
        this.password = "DEFAULT";
    }

    public Account(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String inputUsername) {
        username = inputUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String inputPassword) {
        if (inputPassword == "" || inputPassword.length() < 5) {
            password = "default";
        } else {
            password = inputPassword;
        }
    }

}
