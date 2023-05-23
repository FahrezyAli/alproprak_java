package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.Scanner;

/**
 * Program Soal 6 Minggu 13-1
 * @author Ali Ahmad Fahrezy
 * @NIM 187221042
 *
 * @param n Ukuran array
 * @param i Looping
 * @param x Array
 */
public class Soal6_187221042_Week13_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input ukuran array yang diinginkan: ");
        int n = input.nextInt();

        int[] x = new int[n];

        // Proses input array
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Input data ke " + (i + 1) + ":  ");
            x[i] = input.nextInt();
        }

        // Output
        System.out.print("Array yang telah dikurangi dengan nilai terkecil adalah: [");
        for (int i = 0; i <= n - 2; i++) {
            System.out.print(kurangNilaiMin(x, n)[i] + " ");
        }
        System.out.println(kurangNilaiMin(x, n)[n - 1] + "]");
    }

    /**
     * Fungsi untuk mengurangi nilai array dengan nilai terkecil
     *
     * @param x Array
     * @param n Ukuran array
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>i</b> Looping</li>
     * <li><b>m</b> Nilai minimum / terendah</li>
     * <li><b>r</b> List resultan yang akan di return</li>
     * </ul>
     *
     * @return Array dengan setiap member nya telah dikurangi dengan nilai terkecil
     */
    public static int[] kurangNilaiMin(int[] x, int n) {

        // Kita ambil data pertama sebagai nilai maksimum sementara
        int m = x[0];

        int[] r = new int[n];

        // Looping dimulai dari satu karena index 0 sudah diambil sebagai nilai m sementara
        for (int i = 1; i <= n - 1; i++) {
            if (x[i] < m) {

                // Jika nilai x[i] lebih rendah daripada nilai m saat ini, maka nilai m = x[i]
                m = x[i];
            }
        }

        for (int i = 0; i <= n - 1; i++) {

            // Outputkan nilai array dikurangi dengan nilai terendah
            r[i] = x[i] - m;
        }

        return r;
    }
}
