package com.ali_ahmad_fahrezy_187221042.alproprak.Week8;

import java.util.Scanner;

/**
 * Soal 2 Minggu 8-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 * @param   a   Input alas segitiga
 * @param   t   Input tinggi segitiga
 */
public class Soal2_187221042_Week8_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 2 Minggu 8 \"Luas Segitiga\"");

        //Input alas
        System.out.print("Masukkan alas segitiga: ");
        float a = input.nextFloat();

        //Input tinggi
        System.out.print("Masukkan tinggi segitiga: ");
        float t = input.nextFloat();

        //Output
        System.out.println("Output: " + (a * t) / 2f);
    }
}
