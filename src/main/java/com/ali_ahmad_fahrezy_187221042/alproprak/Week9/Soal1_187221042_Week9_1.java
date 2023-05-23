package com.ali_ahmad_fahrezy_187221042.alproprak.Week9;

import java.util.Scanner;

/**
 * Soal 1 Minggu 9-1
 * @author          Ali Ahmad Fahrezy
 * @NIM             187220142
 * @param   x       Input warisan ibu dan satu anak
 * @param   ibu     Jatah warisan ibu
 * @param   sisa    Sisa warisan setelah memisahkan jatah ibu
 * @param   anak    Jatah warisan satu anak
 * @param   warisan Total warisan
 */
public class Soal1_187221042_Week9_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 1 Minggu 9 \"Warisan\"");

        //Input x
        System.out.print("Input nilai warisan yang diterima ibu dan satu anak: ");
        double x = input.nextDouble();

        //Ibu mendapat 1/4 bagian
        double ibu = 1d/4;

        //Sisanya adalah 3/4
        double sisa = 1 - ibu;

        //Satu anak mendapatkan 1/3 dari sisa tersebut
        double anak = 1d/3*sisa;

        //Kalkulasi warisan
        double warisan = x/(ibu + anak);

        //Output
        System.out.println("Total warisan: " + warisan);
    }
}
