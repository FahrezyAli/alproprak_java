package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.Scanner;

public class Soal6_187221042_Week13_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 6 ALPRAK I1
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

    public static int[] kurangNilaiMin(int[] x, int n) {
        // i = Looping
        // m = Nilai minimum / terendah

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
