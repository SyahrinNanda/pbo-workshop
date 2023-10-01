package overloading_overriding;

public class Main {
    public static void main(String[] args) {
        MahasiswaFikom mhsFikom = new MahasiswaFikom();
        MahasiswaTeknik mhsTeknik = new MahasiswaTeknik();

        mhsTeknik.showNamaKampus();
        mhsFikom.showNamaKampus();
    }
}
