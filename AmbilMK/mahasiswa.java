import java.util.Scanner;

public class Mahasiswa {
    private String npm;
    private String nama;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        this.nama = sc.nextLine();
        System.out.print("Masukkan NRP Mahasiswa: ");
        this.npm = sc.nextLine();
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama + " (" + npm + ")";
    }
}
