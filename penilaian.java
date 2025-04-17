public class penilaian {
    mahasiswa mahasiswa;
    matakuliah matakuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public penilaian(mahasiswa mhs, matakuliah mk, double tugas, double uts, double uas) {
        this.mahasiswa = mhs;
        this.matakuliah = mk;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilpenilaian() {
        System.out.println(mahasiswa.nama + " | " + matakuliah.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }
}
