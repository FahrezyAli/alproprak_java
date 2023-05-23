package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.Scanner;

/**
 * Program Soal 3 Minggu 13-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Ukuran array
 * @param i Looping
 * @param x Array
 */
public class Soal3_187221042_Week13_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input ukuran array yang diinginkan: ");
        int n = input.nextInt();

        int[] x = new int[n];

        // Proses input array
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Input data ke " + (i + 1) + ": ");
            x[i] = input.nextInt();
        }

        // Output
        System.out.println("Median dari array tersebut adalah " + median(x, n));
    }

    /**
     * Menghitung median dari suatu array
     *
     * @param x Array
     * @param n Ukuran Array
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><l>f</b> Lokasi median</li>
     * <li><b>m</b> Nilai median</li>
     * </ul>
     *
     * @return
     */
    public static double median(int[] x, int n) {

        // Lokasi median adalah panjang data (n) dibagi 2. Namun, karena index array dimulai dari 0, maka nilai n harus dikurangi dengan 1 terlebih dahulu
        float m;

        int l = (n - 1) / 2;

        // Melihat apakah panjang array ganjil / genap
        if (n % 2 == 0) {

            // Jika n adalah genap, maka nilai median adalah nilai tengah dari dua nilai yang berada ditengah, dalam hal ini adalah x[i] dan nilai setelahnya x[i + 1], kemudian dibagi dua
            m = (x[l] + x[l + 1]) / 2f;
        } else {

            // Jika n adalah ganjil, maka nilai median adalah nilai pada lokasi l
            m = x[l];
        }

        return m;
    }
}
