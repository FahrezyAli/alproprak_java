package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program Soal 3 Minggu 14-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Nilai input
 */
public class Soal3_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 3 Minggu 14 \"List Faktor suatu Integer\"");

        System.out.print("Input nilai integer yang ingin dicari faktornya: ");
        int n = input.nextInt();

        List<Integer> r = dispFactor(n, 1, new ArrayList<>());

        System.out.print("Faktor faktor dari nilai integer tersebut adalah: ");
        for (int i = 0; i <= r.size() - 2; i++) {
            System.out.print(r.get(i) + ", ");
        }
        System.out.println(r.get(r.size() - 1));
    }

    /**
     * Fungsi untuk mendapatkan faktor faktor dari suatu integer
     *
     * @param n Input
     * @param i Looping
     * @param r r List rekursif
     *
     * @return List faktor faktor dari suatu integer
     */
    public static List<Integer> dispFactor(int n, int i, List<Integer> r) {

        // n / 2 karena nilai faktor tertinggi selain nilai itu sendiri adalah nilai n / 2
        if (i <= n / 2) {
            if (n % i == 0) {

                // Jika nilai i dapat membagi habis n, maka nilai i akan dioutput
                r.add(i);
            }

            // Rekursif dengan menambahkan nilai i + 1 untuk mencoba nilai i lainnya
            dispFactor(n, i + 1, r);
        } else {
            r.add(n);
        }
        return r;
    }
}
