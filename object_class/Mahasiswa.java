package object_class;

public class Mahasiswa {

    String namaLengkap;
    String nim;
    String namaFakultas;
    String namaProdi;

    public void perkenalanDiri() {
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Nim : " + nim);
        System.out.println("Nama Fakultas : " + namaFakultas);
        System.out.println("Nama Prodi : " + namaProdi);

        // System.out.print("Nama "); System.out.print(namaLengkap);
    }

    static class MataKuliah {
        String namaMk;
        int jumlahSks;

    }

}
