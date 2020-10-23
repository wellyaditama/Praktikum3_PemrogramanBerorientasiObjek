/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pertemuan3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TugasP3_02N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        
        double ipk;
        double masaStudi;
        
        do {            
            System.out.print("Masukan IPK anda (0.0 - 4.0)= ");
            ipk = scan.nextDouble();
        } while (ipk < 0 || ipk > 4);
        
        do {            
            System.out.print("Masukan Masa Studi anda (3.5 - 7.0) = ");
            masaStudi = scan.nextDouble();
        } while (masaStudi < 3.5 || masaStudi > 7.0);
        
        if (ipk >= 3.5) {
            if(masaStudi <= 4) {
                System.out.println("Selamat Anda Lulus Dengan Predikat Cumlaude");
            } else {
                System.out.println("Mohon maaf, anda tidak lulus dengan predikat Cumlaude");
            }
        } else {
            System.out.println("Mohon maaf, anda tidak lulus dengan predikat Cumlaude");
        }
    }
}
