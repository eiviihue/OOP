import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();
        mhs.inputData();
      
        Dosen[] daftarDosen = Dosen.getDaftarDosen();
        MataKuliah[] daftarMK = MataKuliah.getDaftarMataKuliah(daftarDosen);

        System.out.println("\n=== Daftar Mata Kuliah ===");
        for (MataKuliah mk : daftarMK) {
            System.out.println(mk);
        }

        System.out.print("\nMasukkan Kode Mata Kuliah yang ingin diambil (pisahkan dengan koma): ");
        String input = sc.nextLine();
        String[] kodeDipilih = input.split(",");


        List<MataKuliah> mkDipilihList = new ArrayList<>();
        for (String kode : kodeDipilih) {
            String kodeTrim = kode.trim();
            for (MataKuliah mk : daftarMK) {
                if (mk.getKode().equalsIgnoreCase(kodeTrim)) {
                    mkDipilihList.add(mk);
                    break;
                }
            }
        }

        if (mkDipilihList.isEmpty()) {
            System.out.println("Tidak ada kode mata kuliah yang sesuai!");
        } else {
            System.out.println("\n=== Hasil Pengambilan MK ===");
            System.out.println("Mahasiswa : " + mhs);
            System.out.println("Mata Kuliah yang Diambil:");
            int totalSKS = 0;
            for (MataKuliah mk : mkDipilihList) {
                System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS), Dosen: " + mk.getDosenPengampu().getNama());
                totalSKS += mk.getSks();
            }
            System.out.println("Total SKS : " + totalSKS);
        }
    }
}
