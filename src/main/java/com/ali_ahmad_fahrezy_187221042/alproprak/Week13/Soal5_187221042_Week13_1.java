package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program Soal 5 Minggu 13-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Ukuran array
 * @param i Looping
 * @param x Array
 * @param r Variable bantu output
 */
public class Soal5_187221042_Week13_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 5 Minggu 13 \"List index angka terbesar\"");

        System.out.print("Input ukuran array yang diinginkan: ");
        int n = input.nextInt();

        int[] x = new int[n];

        // Proses input array
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Input data ke " + (i + 1) + ": ");
            x[i] = input.nextInt();
        }

        List<Integer> r = maxIndex(x, n);

        //Output
        System.out.print("Index angka terbesar adalah: ");
        if (r.size() == 1) {
            System.out.println(r.get(0));
        } else {
            for (int i = 0; i <= r.size() - 1; i++) {
                if (i < r.size() - 1) {
                    System.out.print(r.get(i) + ", ");
                } else {
                    System.out.println("dan " + r.get(i));
                }
            }
        }
    }

    /**
     * Fungsi untuk mendapatkan list index angka terbesar
     *
     * @param x Array
     * @param n Ukuran array
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>i</b> Looping</li>
     * <li><b>m</b> Nilai maksimum / tertinggi</li>
     * <li><b>r</b> List resultan yang akan di return</li>
     * </ul>
     *
     * @return List index angka terbesar
     */
    public static List<Integer> maxIndex(int[] x, int n) {

        // Kita ambil data pertama sebagai nilai maksimum sementara
        int m = x[0];

        List<Integer> r = new ArrayList<>();

        // Looping dimulai dari satu karena index 0 sudah diambil sebagai nilai m sementara
        for (int i = 1; i <= n - 1; i++) {
            if (x[i] > m) {

                // Jika nilai x[i] lebih tinggi daripada nilai m saat ini, maka nilai m = x[i]
                m = x[i];
            }
        }

        for (int i = 0; i <= n - 1; i++) {
            if (x[i] == m) {

                // Jika nilai x[i] ==  m, maka index (i) akan dimasukkan ke list
                r.add(i);
            }
        }

        return r;
    }
}
