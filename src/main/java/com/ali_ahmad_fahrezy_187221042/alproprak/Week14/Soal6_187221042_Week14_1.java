package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal6_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 1 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Nilai input
        int n;

        System.out.print("Input nilai integer yang ingin dicari faktornya: ");
        n = input.nextInt();

        List<Integer> r = dispPrimeFactor(n, 1, new ArrayList<>());

        System.out.print("Faktor prima dari nilai integer tersebut adalah: ");
        for (int i = 0; i <= r.size() - 2; i++) {
            System.out.print(r.get(i) + ", ");
        }
        System.out.println(r.get(r.size() - 1 ));
    }

    public static List<Integer> dispPrimeFactor(int n, int i, List<Integer> r) {
        // i: Looping
        if (i <= (double) n / 2) {
            if (n % i == 0 && numFactor(i, 1) == 2) {

                // Jika i merupakan faktor dari n dan i merupakan bilangan prima (numFactor == 2). Maka nilai i akan di output
                r.add(i);
            }

            // Rekursif dengan menambahkan nilai i + 1 untuk mencoba nilai i lainnya
            dispPrimeFactor(n, i + 1, r);
        } else {
            if (numFactor(n, 1) == 2) {
                r.add(n);
            }
        }
        return r;
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
