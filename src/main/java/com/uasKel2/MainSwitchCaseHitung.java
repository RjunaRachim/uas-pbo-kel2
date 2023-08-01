package com.uasKel2;

import java.util.Scanner;

/**
 *
 * @author Kelompok2
 * Teknik Informatika - Univ.Islam Balitar
 * 2023
 */

public class MainSwitchCaseHitung {

public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("+=============================+");
        System.out.println("|   SWITCH CASE PERHITUNGAN   |");
        System.out.println("+=============================+");
        System.out.println("| Pilih Menu:                 |");
        System.out.println("+=============================+");
        System.out.println("| 1.Penjumlahan               |");
        System.out.println("| 2.Pengurangan               |");
        System.out.println("+=============================+");
        System.out.print("  Masukkan pilihan (1/2): ");

        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            hasil = a + b;
            System.out.println("  Hasil penjumlahan     : " + hasil);
            System.out.println("+=============================+");
        } else if (pilihan == 2) {
            hasil = a - b;
            System.out.println("  Hasil pengurangan     : " + hasil);
            System.out.println("+=============================+");
        } else {
            System.out.println("+=============================+"); 
            System.out.println("|      Pilihan Anda Salah     |");
            System.out.println("+=============================+");        
        }
    }
}
