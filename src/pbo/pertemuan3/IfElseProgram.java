package pbo.pertemuan3;

import java.util.Scanner;

public class IfElseProgram {
    
    
    public static void main(String[] args) {
        int Tabungan;
        int Penarikan;
        
        System.out.print("Masukan sisa Tabungan Anda = ");
        Scanner Ok = new Scanner(System.in);
        Tabungan = Ok.nextInt();
        
        System.out.print("Uang yang ingin anda ambil = ");
        Penarikan = Ok.nextInt();
        
        if (Tabungan >= Penarikan) {
            Tabungan -= Penarikan;
            System.out.println("\n\nBerhasil Mengambil tabungan \nSisa Tabungan Anda = " + Tabungan);
        } else {
            System.out.println("Sisa Tabungan tidak Mencukupi");
        }
    }
}
