package pbo.pertemuan3;

import java.util.Scanner;

public class TugasP3_01 {
    public static void main(String[] args) {
        int nilai;
        Scanner scanNilai = new Scanner(System.in);
        
        System.out.println("Program demo IF ELSE");
        System.out.print("Inputkan nilai 0 - 100 = ");
        nilai = scanNilai.nextInt();
        
        if (nilai > 100) {
            System.out.println("Nilai yang anda masukan terlalu tinggi, masukan nilai antara 0 - 100");
        } else if (nilai >= 80){
            System.out.println("Selamat, anda Lulus Mata Kuliah Pemrograman Berorientasi Objek");
        } else if (nilai < 80 && nilai >= 0 ) {
            System.out.println("Maaf Anda harus mengulang Mata Kuliah Pemrograman Berorientasi Objek atau mengikuti Semester Pendek");
        } else {
            System.out.println("Nilai yang Anda masukan terlalu kecil, masukan nilai antara 0 - 100");
        }
    }
}


