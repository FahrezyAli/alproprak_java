package com.ali_ahmad_fahrezy_187221042.alproprak.Week8;

import java.util.Scanner;

/**
 * Soal 4 Minggu 8-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 * @param   x   Input x
 */
public class Soal4_187221042_Week8_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 4 Minggu 8 \"Fungsi y=5x^2 + 3x - 1\"");

        //Input x
        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();

        //Kalkulasi y
        int y = 5 * x * x + 3 * x - 1;

        //Output
        System.out.println("Output: y = " + y);
    }
}
