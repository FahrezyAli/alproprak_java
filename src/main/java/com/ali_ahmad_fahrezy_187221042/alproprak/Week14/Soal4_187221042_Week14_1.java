package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

public class Soal4_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 1 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Nilai input
        int n;

        System.out.print("Input nilai integer yang ingin dicari jumlah dari nilai faktornya: ");
        n = input.nextInt();
        System.out.println("Jumlah dari nilai faktor dari nilai integer tersebut adalah: " + sumFactor(n, 1));
    }

    public static int sumFactor(int n, int i) {
        // i: Looping
        // sum: Jumlah nilai nilai faktor
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

