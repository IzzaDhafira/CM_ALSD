public class mahasiswa {
    String NIM;
    String nama;
    String prodi;

    public mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilmahasiswa() {
        System.out.println("NIM     : " + NIM);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
        System.out.println("--------------------------");
    }
}
