package pbo.pertemuan3;

import java.util.Locale;
import java.util.Scanner;

public class TugasP3_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        double jariJari;
        double panjang;
        double lebar;
        double luasLingkaran;
        double luasPersegiPanjang;
        
        String menuLuasBangun;
        System.out.println("MENU LUAS BANGUN 2 DIMENSI");
        System.out.println("= = = = = = = = = = = = =");
        System.out.println("1. LUAS LINGKARAN");
        System.out.println("2. LUAS PERSEGI PANJANG");
        System.out.println("= = = = = = = = = = = = =");
        System.out.print("PILIH MENU = ");
        menuLuasBangun = scan.next();
        
        switch(menuLuasBangun) 
        {
            case "1":
                System.out.print("Jari-jari = ");
                jariJari = scan.nextDouble();
                if(jariJari < 0) {
                    System.out.println("Nilai Jari-jari yang anda masukan terlalu kecil, masukan angka >= 0");
                    break;
                } else if (jariJari % 7 == 0) {
                    luasLingkaran = (jariJari * jariJari * 22) / 7;
                } else {
                    luasLingkaran = jariJari * jariJari * 3.14;
                }
                
                System.out.println("Luas Lingkaran = " + luasLingkaran);
                break;
            case "2":
                System.out.print("Panjang = ");
                panjang = scan.nextDouble();
                if (panjang < 0) {
                    System.out.println("Maaf, Nilai Panjang yang anda Masukan harus > 0");
                    break;
                }
                System.out.print("Lebar = ");
                lebar = scan.nextDouble();
                if (lebar < 0) {
                    System.out.println("Maaf, Niali Lebar yang anda Masukan harus > 0");
                    break;
                }
                luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
                break;
            default:
                System.out.println("Maaf, pilih menu dengan benar. Masukan angka 1 / 2");
                break;
        }
    }
}
