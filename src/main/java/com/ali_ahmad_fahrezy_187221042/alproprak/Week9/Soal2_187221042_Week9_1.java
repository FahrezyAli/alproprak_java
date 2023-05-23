package com.ali_ahmad_fahrezy_187221042.alproprak.Week9;

import java.util.Scanner;

/**
 * Soal 2 Minggu 9-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 * @param   n   Input rerata deret
 * @param   k   Nilai k dari deret {6, 9, 11, k}
 */
public class Soal2_187221042_Week9_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 2 Minggu 9 \"Nilai k dari deret {6, 9, 11, k)\"");

        //Input n
        System.out.print("Input rerata deret (Harus lebih dari 6): ");
        int n = input.nextInt();

        //Menghitung k
        int k = ((6+9+11) - (n*4))*(-1);

        //Output
        System.out.println("Nilai k adalah: " + k);
    }
}
