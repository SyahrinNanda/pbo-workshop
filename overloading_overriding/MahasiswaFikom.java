package overloading_overriding;

public class MahasiswaFikom extends Mahasiswa {

    private String namaFakultas = "ILMU KOMPUTER";

    @Override
    public void showNamaKampus() {
        System.out.printf("NAMA KAMPUS %s | NAMA FAKULTAS %s %n", super.namaKampus, this.namaFakultas);
    }
}
