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
        System.out.println("NIM : " + NIM + " | Nama : " + nama + " | Prodi: " + prodi);
    }
}
