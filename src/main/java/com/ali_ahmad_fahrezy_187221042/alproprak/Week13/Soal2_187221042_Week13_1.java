package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.Scanner;

/**
 * Program Soal 2 Minggu 13-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Ukuran array
 * @param i Looping
 * @param x Array
 */
public class Soal2_187221042_Week13_1 {

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
        System.out.println("Frekuensi terbesar dari array tersebut adalah " + maxFreq(x, n));
    }

    /**
     * Menghitung frekuensi modus dari suatu array
     *
     * @param x Array
     * @param n Ukuran array
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>f</b> Frekuensi modus</li>
     * <li><b>c</b> Counter nilai (value) yang sama</li>
     * <li><b>i</b> Looping</li>
     * <li><b>j</b> Looping</li>
     * </ul>
     *
     * @return Frekunesi modus dari array
     */
    public static int maxFreq(int[] x, int n) {

        int c = 1;
        int f = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {

                // Dilakukan dua looping untuk melihat apakah value dari x[i] sama dengan x[j]
                if (x[i] == x[j]) {

                    // Jika nilai x[i] sama dengan x[j], maka counter (c) akan bertambah, kemudian nilai x[i] akan dihapus agar tidak terhitung dua kali saat nilai i berubah
                    c = c + 1;
                    x[j] = 0;
                }
            }
            if (c > f) {

                // Jika nilai counter lebih tinggi daripada frekuensi, maka frekuensi akan diisi dengan nilai counter. Dengan ini, nilai frekuensi terbesar akan pasti didapat dan nilai modus (v) pasti benar
                f = c;
            }

            // Counter direset kembali menjadi 1
            c = 1;
        }

        return f;
    }
}
