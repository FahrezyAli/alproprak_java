package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

/**
 * Program Soal 1 Minggu 14-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Nilai input
 */
public class Soal1_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n;

        System.out.print("Input nilai integer yang ingin dicari digit terbesar-nya: ");
        n = input.nextInt();

        System.out.println("Digit terbesar dari array tersebut adalah : " + max(n));
    }

    /**
     * Fungsi untuk mendapatkan nilai digit terbesar dari integer multi digit
     *
     * @param n Nilai input
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>m</b> Nilai terbesar (maksimum)</li>
     * <li><b>d</b> Digit yang telah dipisah dari integer</li>
     * </ul>
     *
     * @return Digit terbesar input tersebut
     */
    public static int max(int n) {

        int m;

        // Rumus ini memisah nilai digit paling belakang dari n ke dalam d
        int d = n % 10;
        if (n > 0) {

            // nilai awal m adalah fungsi rekursif max dimana n / 10 untuk menghapus nilai paling belakang yang sudah dimasukkan d
            m = max(n / 10);
            if (d > m) {

                // JIka d lebih besar dari m, maka m akan diisi dengan d
                m = d;
            }
        } else {
            m = d;
        }

        return m;
    }
}
