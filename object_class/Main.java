package object_class;


public class Main {

    public static void main(String[] args) {

        Mahasiswa[] fakultasUmi = new Mahasiswa[10];

        Mahasiswa mahasiswaFikom = new Mahasiswa();

        mahasiswaFikom.namaLengkap = "Ismunandar";
        mahasiswaFikom.nim = "13020190418";
        mahasiswaFikom.namaFakultas = "Ilmu Komputer";
        mahasiswaFikom.namaProdi = "Teknik Informatika";
        mahasiswaFikom.perkenalanDiri();
        Mahasiswa.MataKuliah mataKuliah = new Mahasiswa.MataKuliah();

        Mahasiswa mahasiswaTeknik = new Mahasiswa();
        mahasiswaTeknik.namaLengkap = "Jack";
        mahasiswaTeknik.nim = "41820200471";
        mahasiswaTeknik.namaFakultas = "Teknik";
        mahasiswaTeknik.namaProdi = "Teknik Mesin";
        mahasiswaTeknik.perkenalanDiri();

        Mahasiswa mahasiswaSastra = new Mahasiswa();
        mahasiswaSastra.nim = "41820200471";

//        fakultasUmi[0] = mahasiswaTeknik;
//        fakultasUmi[1] = mahasiswaFikom;
//        fakultasUmi[2] = mahasiswaSastra;
//
//        System.out.println(fakultasUmi.length);
//
//        for (int i = 0; i < fakultasUmi.length; i++) {
//            System.out.println("NIM : " + fakultasUmi[i].nim);
//        }
    }
}
