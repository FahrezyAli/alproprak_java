package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

/**
 * Program Soal 5 Minggu 14-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Nilai input
 */
public class Soal5_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 5 Minggu 14 \"Total Faktor dari Suatu Integer\"");

        System.out.print("Input nilai integer yang ingin dicari jumlah faktornya: ");
        int n = input.nextInt();
        System.out.println("Total faktor dari nilai integer tersebut adalah: " + numFactor(n, 1));
    }

    /**
     * Fungsi untuk menghitung total faktor dari suatu integer
     *
     * @param n Input
     * @param i Looping
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>t</b> Total faktor</li>
     * </ul>
     *
     * @return Total faktor
     */
    public static int numFactor(int n, int i) {

        int t;

        // n / 2 karena nilai faktor tertinggi selain nilai itu sendiri adalah nilai n / 2
        if (i <= (double) n / 2) {

            // Rekursif dengan menambahkan nilai i + 1 untuk mencoba nilai i lainnya
            t = numFactor(n, i + 1);
            if (n % i == 0) {

                // Jika nilai i dapat membagi habis n, maka nilai i akan ditambahkan ke sum
                t++;
            }
        } else {
            t = 1;
        }

        return t;
    }
}
