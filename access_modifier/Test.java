package access_modifier;

public class Test extends ProtectedClass {

    // public (Global)
    // private (hanya bisa dipanggil di dalam kelas)
    // protected (bisa dipanggil di package yang sama dan bisa dipanggil di luar luar
    // default

    public String getProperty() {
//        super.property = "";
//        return super.getProperty();
        return super.property;
    }

}
