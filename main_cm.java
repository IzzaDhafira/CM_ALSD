import java.util.Scanner;

public class main_cm {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mahasiswa mhs = mahasiswa[] mhs = {
            new mahasiswa("22001", "Ali Rahman", "Informatika"),
            new mahasiswa("22002", "Budi Santoso", "Informatika"),
            new mahasiswa("22003", "Citra Dewi", "Informatika")};
        

        matakuliah[] mk = {
            new matakuliah("MK001", "Struktur Data", 3),
            new matakuliah("MK002", "Basis Data", 3),
            new matakuliah("MK003", "Desain Web", 3)
        };

        penilaianenilaian[] nilai = {
            new penilaian(mhs[0], mk[0], 80, 85, 90),
            new penilaian(mhs[0], mk[1], 60, 75, 70),
            new penilaian(mhs[1], mk[0], 75, 70, 85),
            new penilaian(mhs[2], mk[1], 90, 90, 95),
            new penilaian(mhs[2], mk[2], 80, 90, 65)
        };

        int menu;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    for (mahasiswa m : mhs) m.tampilmahasiswa();
                    break;
                case 2:
                    for (matakuliah m : mk) m.tampilmataKuliah();
                    break;
                case 3:
                    for (penilaian p : nilai) p.tampilpenilaian();
                    break;
                case 4:
                    Arrays.sort(nilai, (a, b) -> Double.compare(b.nilaiAkhir, a.nilaiAkhir));
                    for (penilaian p : nilai) p.tampilpenilaian();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    sc.nextLine(); // buang newline
                    String nim = sc.nextLine();
                    boolean ditemukan = false;
                    for (mahasiswa m : mhs) {
                        if (m.NIM.equals(nim)) {
                            System.out.println("Mahasiswa Ditemukan:");
                            m.tampilmahasiswa();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) System.out.println("Mahasiswa tidak ditemukan!");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 0);
    }
}
