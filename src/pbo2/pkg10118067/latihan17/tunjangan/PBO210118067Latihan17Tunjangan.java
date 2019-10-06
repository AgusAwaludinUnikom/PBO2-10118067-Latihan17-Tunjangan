/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana menampilkan nilai tunjangan dari
 *  gaji pokok
 */
public class PBO210118067Latihan17Tunjangan {

    /**
     *  Agus Awaludin
     *  IF2
     *  10118067
     *  Latihan ini berisi tentang bagaimana cara menghitung tunjangan
     */
    public static void main(String[] args) {
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner scanner = new Scanner(System.in);
        
        Double gajipokok = scanner.nextDouble();
        Double tunjangan = 0.0;
        System.out.print("Status Anda? (Menikah/Belum)   : ");
        if(scanner.next().equals("Menikah")) {
            tunjangan = gajipokok * 0.35;
        }
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok              : Rp. "+gajipokok );
        System.out.println("Tunjangan               : Rp. "+tunjangan);
        System.out.println("Total Gaji              : Rp. "+(gajipokok+tunjangan));
        
            
    }
    
}
