package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

public class Soal5_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 1 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Nilai input
        int n;

        System.out.print("Input nilai integer yang ingin dicari jumlah faktornya: ");
        n = input.nextInt();
        System.out.print("Jumlah faktor dari nilai integer tersebut adalah: " + numFactor(n, 1));
    }

    public static int numFactor(int n, int i) {
        // i: Looping
        // j: Jumlah faktor
        int j;

        // n / 2 karena nilai faktor tertinggi selain nilai itu sendiri adalah nilai n / 2
        if (i <= (double) n / 2) {

            // Rekursif dengan menambahkan nilai i + 1 untuk mencoba nilai i lainnya
            j = numFactor(n, i + 1);
            if (n % i == 0) {

                // Jika nilai i dapat membagi habis n, maka nilai i akan ditambahkan ke sum
                j = j + 1;
            }
        } else {
            j = 1;
        }

        return j;
    }
}
