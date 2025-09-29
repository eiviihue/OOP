public class Dosen {
    private String nip;
    private String nama;

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return nama;
    }

    public static Dosen[] getDaftarDosen() {
        return new Dosen[] {
            new Dosen("19700101", "Tohari Ahmad"),
            new Dosen("19700202", "Bagus Jati Santoso"),
            new Dosen("19700303", "Hudan Studiawan"),
            new Dosen("19700404", "Ary Mazharuddin Shiddiqi"),
            new Dosen("19700505", "Moch. Nafkhan Alzamzami"),
            new Dosen("19700606", "Nanik Suciati"),
            new Dosen("19700707", "Chastine Fatichah"),
            new Dosen("19700808", "Handayani Tjandrasa"),
            new Dosen("19700909", "Agus Zainal Arifin"),
            new Dosen("19701010", "Dini Adni Navastara")
        };
    }
}
