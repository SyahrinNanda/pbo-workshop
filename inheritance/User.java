package inheritance;

public class User extends Account {

    private String namaLengkap;
    private String tempatLahir;
    private String tanggalLahir;
    private int umur;

    public User(String username, String password) {
//        super.setUsername(username);
//        super.setPassword(password);
//        super(username, password);
        super.setUsername(username);
        super.setPassword(password);
    }

    public void setUsernameAndPassword(String username, String password) {
        super.setUsername(username);
        super.setPassword(password);
    }

    public String getEmail() {
        return super.email;
    }

    public void setEmail(String email) {
        super.email = email;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
