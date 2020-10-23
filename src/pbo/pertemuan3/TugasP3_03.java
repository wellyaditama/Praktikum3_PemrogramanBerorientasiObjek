package pbo.pertemuan3;
import java.util.Scanner;
public class TugasP3_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama Calon Karyawan = ");
        String namaKaryawan = scan.nextLine();
        System.out.print("Apakah Karyawan Lulus seleksi tahap 1 (Tes Tertulis dan Psikotes)? = ");
        boolean seleksiTahap1 = scan.nextBoolean();
        System.out.print("Apakah Karyawan Lulus seleksi tahap 2 (Wawancara)? = ");
        boolean seleksiTahap2 = scan.nextBoolean();
        System.out.print("Apakah Karyawan Lulus seleksi tahap 3 (Kesehatan)? = ");
        boolean seleksiTahap3 = scan.nextBoolean();
        
        if (seleksiTahap1 == true && seleksiTahap2 == true && seleksiTahap3 == true) {
            System.out.println("==============================================================");
            System.out.println("Selamat " + namaKaryawan + " Anda Lulus Menjadi Karyawan Baru");
            System.out.println("==============================================================");
        } else {
            System.out.println("======================================================================");
            System.out.println("Mohon maaf " + namaKaryawan + " Anda Tidak Lulus Menjadi Karyawan Baru");
            System.out.println("======================================================================");
        }
        
    }
}


