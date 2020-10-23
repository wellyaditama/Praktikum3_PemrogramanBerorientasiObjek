package pbo.pertemuan3;

import java.util.Locale;
import java.util.Scanner;

public class TugasP3_02 {
    public static void main(String[] args) {
        double IP;
        double masaStudi;
        
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        System.out.print("Inputkan IP Anda = ");
        IP = scan.nextDouble();
        System.out.print("Inputkan Masa Studi Anda = ");
        masaStudi = scan.nextDouble();
        
        if (IP > 4.0 || IP < 0.0 || masaStudi > 7.0 || masaStudi < 3.5) {
            System.out.println("Nilai yang anda masukan salah. IP harus 0.0 - 4.0 dan Masa Studi 3.5 - 7.0");
        } else if (IP >= 3.5 && masaStudi <= 3.5 ) {
            System.out.println("Anda Cumlaude");
        } else {
            System.out.println("Anda Tidak Cumlaude");
        }
    }
}
