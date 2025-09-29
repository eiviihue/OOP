public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String kode, String nama, int sks, Dosen dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS), Dosen: " + dosenPengampu.getNama();
    }

    public static MataKuliah[] getDaftarMataKuliah(Dosen[] dosen) {
        return new MataKuliah[] {
            new MataKuliah("IF2110", "Algoritma & Pemrograman", 3, dosen[0]),
            new MataKuliah("IF2120", "Sistem Operasi", 3, dosen[1]),
            new MataKuliah("IF2130", "Jaringan Komputer", 3, dosen[2]),
            new MataKuliah("IF2140", "Basis Data", 3, dosen[3]),
            new MataKuliah("IF2150", "Rekayasa Perangkat Lunak", 3, dosen[4]),
            new MataKuliah("IF2160", "Kecerdasan Buatan", 3, dosen[5]),
            new MataKuliah("IF2170", "Visi Komputer", 3, dosen[6]),
            new MataKuliah("IF2180", "Interaksi Manusia-Komputer", 3, dosen[7]),
            new MataKuliah("IF2190", "Keamanan Siber", 3, dosen[8]),
            new MataKuliah("IF2200", "Manajemen Proyek TI", 3, dosen[9])
        };
    }
}
