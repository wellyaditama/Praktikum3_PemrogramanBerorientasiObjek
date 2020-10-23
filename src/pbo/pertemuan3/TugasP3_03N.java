/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pertemuan3;

import java.util.Scanner;
import java.util.Locale;
import jdk.nashorn.internal.ir.BreakNode;
/**
 *
 * @author Admin
 */
public class TugasP3_03N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        String namaKaryawan;
        boolean ujianTahap1;
        boolean ujianTahap2;
        boolean ujianTahap3;
        
        System.out.print("Masukan Nama Karyawan = ");
        namaKaryawan = scan.nextLine();
        System.out.println("Apakah " + namaKaryawan + " Lulus ujian Tes tertulis dan Psikotes??");
        System.out.print("--->");
        ujianTahap1 = scan.nextBoolean();
        if (ujianTahap1 == false) {
            System.out.println(namaKaryawan + " Tidak lulus menjadi karyawan baru");
        }
        System.out.println("Apakah " + namaKaryawan + " Lulus ujian Wawancara??");
        System.out.print("--->");
        ujianTahap2 = scan.nextBoolean();
        if (ujianTahap2 == false) {
            System.out.println(namaKaryawan + " Tidak lulus menjadi karyawan baru");
        }
        System.out.println("Apakah " + namaKaryawan + " Lulus ujian Kesehatan??");
        System.out.print("--->");
        ujianTahap3 = scan.nextBoolean();
        if (ujianTahap2 == false) {
            System.out.println(namaKaryawan + " Tidak lulus menjadi karyawan baru");
        }
        
        System.out.println("Selamat, " + namaKaryawan + " Lulus menjadi karyawan Baru");
    }
}
