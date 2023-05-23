package com.ali_ahmad_fahrezy_187221042.alproprak.Week11;

import java.util.Scanner;

/**
 * Soal 1 Minggu 11-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param b     Array berat 10 bebek
 * @param m     Mean berat 10 bebek
 * @param s     Selisih berat antara 2 bebek yang hilang
 * @param j     Jumlah berat antara 2 bebek yang hilang
 * @param sum   Jumlah berat 8 bebek yang masih ada
 * @param svar  Variabel bantu untuk menghitung variance
 * @param var   Variance
 * @param i     Looping
 */
public class Soal1_187221042_Week11_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 1 Minggu 11 \"Berat Bebek\"");

        float[] b = new float[10];
        float sum = 0;
        float svar = 0;

        // Kode ini berfungsi untuk looping input 8 berat bebek yang kemudian sekaligus dijumlahkan kedalam variabel sum
        for (int i = 0; i < 8; i++) {
            System.out.print("Inputlah berat bebek ke " + (i + 1) + ": ");
            b[i] = input.nextFloat();
            sum = sum + b[i];
        }

        System.out.print("Inputlah mean dari berat 10 bebek: ");
        float m = input.nextFloat();

        System.out.print("Inputlah selisih antara 2 bebek yang hilang: ");
        float s = input.nextFloat();

        // Dengan menggukanan rumus mean sebagai dasar. Dibentuk rumus yang digunakan untuk mencari jumlah 2 berat bebek yang hilang
        float j = -sum + m * 10;

        // Kemudian kita dapat menggunakan substitusi dengan jumlah dan selisih 2 bebek yang hilang untuk menemukan berat masing masing bebek tersebut
        b[8] = (j - s) / 2;
        b[9] = s + b[8];

        // Berat bebek yang sudah lengkap kemudian dioutput, sekaligus menghitung svar
        for (int i = 0; i <= 9; i++) {
            System.out.println("Berat bebek ke " + (i + 1) + " adalah " + b[i]);
            svar = svar + (b[i] - m) * (b[i] - m);
        }

        // Menghitung variance, dan kemudian dioutput
        float var = svar / 10;
        System.out.println("Variance 10 bebek adalah: " + var);
    }
}
