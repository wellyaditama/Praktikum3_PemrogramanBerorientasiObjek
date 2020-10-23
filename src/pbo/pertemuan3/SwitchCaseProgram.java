package pbo.pertemuan3;

import java.util.Scanner;

public class SwitchCaseProgram {
    public static void main(String[] args) {
        int NilaiAngka;

        Scanner Ok = new Scanner(System.in);
        System.out.print("Inputkan Nilai Anda = ");
        NilaiAngka = Ok.nextInt();
        
        switch(NilaiAngka) {
            case 80:
                System.out.println("Nilai Anda Adalah A");
                break;
            case 75:
                System.out.println("Nilai Anda Adalah B+");
                break;
            case 70:
                System.out.println("Nilai Anda Adalah B");
                break;
            case 65:
                System.out.println("Nilai Anda Adalah C+");
                break;
            case 60:
                System.out.println("Nilai Anda Adalah C");
                break;
            default:
                System.out.println("Nilai Anda Adalah D");
                break;
        }
        
    }
}
