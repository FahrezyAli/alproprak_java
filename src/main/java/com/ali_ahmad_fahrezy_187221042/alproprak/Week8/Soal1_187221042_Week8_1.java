package com.ali_ahmad_fahrezy_187221042.alproprak.Week8;

import java.util.Scanner;

/**
 * Soal 1 Minggu 8-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 * @param   a   Input a
 * @param   b   Input b
 */
public class Soal1_187221042_Week8_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 1 Minggu 8 \"(a/b)\"");

        //Input a
        System.out.print("Masukkan Variabel a: ");
        float a = input.nextFloat();

        //Input b
        System.out.print("Masukkan Variable b: ");
        float b = input.nextFloat();

        //Output
        System.out.println("Output: " + a/b);
    }
}
