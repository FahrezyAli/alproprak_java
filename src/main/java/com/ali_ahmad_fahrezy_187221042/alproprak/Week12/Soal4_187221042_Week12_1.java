package com.ali_ahmad_fahrezy_187221042.alproprak.Week12;

import java.util.Scanner;

/**
 * Program Soal 4 Minggu 12-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Panjang deret fibonacci
 * @param i Looping
 * @param f Array deret fibonacci

 */
public class Soal4_187221042_Week12_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 4 Minggu 12 \"Deret Fibonacci\"");

        // Proses input
        System.out.print("Input ukuran deret Fibonacci: ");
        int n = input.nextInt();
        int[] f = new int[n];

        System.out.print("Input nilai pertama: ");
        f[0] = input.nextInt();

        System.out.print("Input nilai kedua: ");
        f[1] = input.nextInt();

        // Karena nilai f[0] dan f[1] telah diisi pengguna, maka nilai yang akan dicari deret fibonacci nya dimulai dari f[2], menjelaskan mengapa i = 2
        int i = 2;
        while (i < n) {

            // Nilai fibonacci f[i] adalah penjumlahan nilai f[i - 1] dan f[i - 2]
            f[i] = f[i - 2] + f[i - 1];
            i++;
        }

        // Proses Output
        System.out.print("Deret Fibonacci: ");
        i = 0;
        while (i < n - 1) {
            System.out.print(Integer.toString(f[i]) + ", ");
            i++;
        }
        System.out.println(f[n - 1]);
    }
}
