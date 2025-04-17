public class matakuliah {
    String kodeMK, namaMK;
    int sks;

    public matakuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilmataKuliah() {
        System.out.println("Kode MK: " + kodeMK + ", Nama MK: " + namaMK + ", SKS: " + sks);
    }
}
