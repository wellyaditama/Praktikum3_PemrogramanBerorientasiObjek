package pbo.pertemuan3;

import java.util.Scanner;

public class IFProgram {
    
    public static void main(String[] args) {
        int saldo;
        int tarik;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jumlah Saldo anda = ");
        saldo = scan.nextInt();
        System.out.print("Masukan Jumlah uang yang ingin anda ambil = ");
        tarik = scan.nextInt();
        if(saldo >= tarik) {
            saldo -= tarik;
            System.out.println("=====================================================");
            System.out.println("Penarikan Uang berhasil, sisa saldo anda = " + saldo);
            System.out.println("=====================================================");
        }
    }
    
}
