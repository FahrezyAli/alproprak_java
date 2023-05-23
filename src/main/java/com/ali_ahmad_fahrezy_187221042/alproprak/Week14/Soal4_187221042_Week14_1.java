package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

/**
 * Program Soal 4 Minggu 14-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Nilai input
 */
public class Soal4_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 4 Minggu 14 \"Jumlah dari Faktor Suatu Integer\"");

        System.out.print("Input nilai integer yang ingin dicari jumlah dari nilai faktornya: ");
        int n = input.nextInt();
        System.out.println("Jumlah dari nilai faktor dari nilai integer tersebut adalah: " + sumFactor(n, 1));
    }

    /**
     * Fungsi untuk menghitung jumlah dari semua faktor faktor dari suatu integer
     *
     * @param n Input
     * @param i Looping
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>sum</b> Jumlah faktor faktor</li>
     * </ul>
     *
     * @return
     */
    public static int sumFactor(int n, int i) {

        int sum;

        // n / 2 karena nilai faktor tertinggi selain nilai itu sendiri adalah nilai n / 2
        if (i <= (double) n / 2) {

            // Rekursif dengan menambahkan nilai i + 1 untuk mencoba nilai i lainnya
            sum = sumFactor(n, i + 1);
            if (n % i == 0) {

                // Jika nilai i dapat membagi habis n, maka nilai i akan ditambahkan ke sum
                sum = sum + i;
            }
        } else {
            sum = n;
        }

        return sum;
    }
}

