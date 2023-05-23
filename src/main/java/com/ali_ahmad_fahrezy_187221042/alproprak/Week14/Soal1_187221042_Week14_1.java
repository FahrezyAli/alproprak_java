package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

public class Soal1_187221042_Week14_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 1 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Nilai input
        int n;

        System.out.print("Input nilai integer yang ingin dicari digit terbesar-nya: ");
        n = input.nextInt();

        System.out.println("Digit terbesar dari array tersebut adalah : " + max(n));
    }

    public static int max(int n) {
        // m: Nilai terbesar (maximum)
        // d: Digit yang telah dipisah dari integer
        int m, d;

        // Rumus ini memisah nilai digit paling belakang dari n ke dalam d
        d = n % 10;
        if (n != 0) {

            // nilai awal m adalah funsi rekursif max dimana n / 10 untuk menghapus nilai paling belakang yang sudah dimasukkan d
            m = max((int) ((double) n / 10));
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
