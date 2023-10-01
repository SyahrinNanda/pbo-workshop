package abstract_polymorphism;

public class Kucing extends Hewan {

    String warna;

    @Override
    public String getJenis() {
        return "Jenis Kucing";
    }

    @Override
    public void setJenis(String jenis) {
        super.jenis = jenis;
    }
}
