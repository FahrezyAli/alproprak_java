package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal5_187221042_Week13_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 5 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Ukuran array
        // i: Looping
        // x: Array
        System.out.print("Input ukuran array yang diinginkan: ");
        int n = input.nextInt();

        int[] x = new int[n];

        // Proses input array
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Input data ke " + (i + 1) + ": ");
            x[i] = input.nextInt();
        }

        //Output
        System.out.print("Index angka terbesar adalah: ");
        for (int i = 0; i <= maxIndex(x, n).size() - 1; i++) {
            if (i < maxIndex(x, n).size() - 1) {
                System.out.print(maxIndex(x, n).get(i) + ", ");
            } else {
                System.out.println("dan " + maxIndex(x, n).get(i));
            }
        }
    }

    /**
     *
     * @param x
     * @param n
     */
    public static List<Integer> maxIndex(int[] x, int n) {
        // i = Looping
        // m = Nilai maksimum / tertinggi

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

                // Jika nilai x[i] ==  m, maka index (i) akan diprint out
                r.add(i);
            }
        }

        return r;
    }
}
