package com.ali_ahmad_fahrezy_187221042.alproprak.Week13;

import java.util.Scanner;

public class Soal4_187221042_Week13_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 4 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Ukuran deret
        // r: Input berapa langkah rotasi
        // d: Input arah rotasi
        // i: Looping
        // x: Array
        System.out.print("Input ukuran array yang diinginkan: ");
        int n = input.nextInt();

        int[] x = new int[n];

        String s;

        // Proses input array
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Input data ke " + (i + 1) + ": ");
            x[i] = input.nextInt();
        }

        // Input jumlah langkah rotasi
        System.out.print("Input berapa langkah rotasi: ");
        int r = input.nextInt();
        while (r > n) {
            System.out.println("Langkah tidak boleh lebih besar daripada ukuran array");
            r = input.nextInt();
        }

        // Input arah rotasi
        System.out.print("Input arah rotasi. 1 untuk kanan dan -1 untuk kiri: ");
        int d = input.nextInt();
        while (d != 1 && d != -1) {
            System.out.println("Arah harus bernilai 1 atau -1");
            d = input.nextInt();
        }

        if (d == 1) {
            s = "kanan";
        } else {
            s = "kiri";
        }

        //Output
        System.out.print("Hasil rotasi " + r + " langkah ke " + s + " adalah: [");
        for (int i = 0; i <= n - 2; i++) {
            System.out.print(rotate(x, n, r, d)[i] + " ");
        }
        System.out.println(rotate(x, n, r, d)[n - 1] + "]");
    }

    /**
     *
     * @param x
     * @param n
     * @param r
     * @param d
     */
    public static int[] rotate(int[] x, int n, int r, int d) {
        // i = Looping
        // f = Nilai awal index (from)
        // t = Nilai akhir index (to)
        // s = String untuk menyimpan arah untuk keperluan output
        int f;
        int t;

        int[] result = new int[n];

        // Metode ini menggunakan index dua lapis (two layer index)
        if (d == 1) {

            // Jika kita memiliki array sebagai berikut:
            // 1 2 3 4 5
            // Saya dapat memberikan index dua layer sehingga bentuk index nya menjadi seperti ini:
            // 1 2 3 4 5 (Array)
            // 0 1 2 3 4 (Index 1)
            // 5 6 7 8 9 (Index 2)
            // Sehingga, jika nilai rotasi adalah 2 ke kanan, kita akan memulai index dari:
            // n - r = 5 - 2 = 3
            // dan mengakhiri index di:
            // n * 2 - 1 - r = 5 * 2 - 1 - 2 = 7
            // untuk mendapatkan:
            // 4 5 1 2 3
            f = n - r;
            t = n * 2 - r;

        } else {

            // Jika kita memiliki array sebagai berikut:
            // 1 2 3 4 5
            // Saya dapat memberikan index dua layer sehingga bentuk index nya menjadi seperti ini:
            // 1 2 3 4 5 (Array)
            // 0 1 2 3 4 (Index 1)
            // 5 6 7 8 9 (Index 2)
            // Sehingga, jika nilai rotasi adalah 2 ke kiri, kita akan memulai index dari:
            // r = n = 2
            // dan mengakhiri index di:
            // n - 1 + r = 5 - 1 + 2 = 8
            // untuk mendapatkan:
            // 3 4 5 1 2
            f = r;
            t = n + r;
        }

        for (int i = f; i <= t - 1 ; i++) {
            if (i >= n) {

                // Nilai index layer 2 tersebut di kurangi dengan nilia n untuk mengkonversi kembali ke nilai index layer 1
                result[i - n] = x[i - n];

            } else {

                result[i] = x[i];
            }
        }

        return result;
    }
}
