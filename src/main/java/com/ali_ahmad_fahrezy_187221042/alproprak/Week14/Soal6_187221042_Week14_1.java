package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program Soal 6 Minggu 14-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Nilai input
 */
public class Soal6_187221042_Week14_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 6 Minggu 14 \"List Faktor Prima Suatu Integer\"");

        System.out.print("Input nilai integer yang ingin dicari faktor prima nya: ");
        int n = input.nextInt();

        List<Integer> r = dispPrimeFactor(n, 1, new ArrayList<>());

        System.out.print("Faktor prima dari nilai integer tersebut adalah: ");
        for (int i = 0; i <= r.size() - 2; i++) {
            System.out.print(r.get(i) + ", ");
        }
        System.out.println(r.get(r.size() - 1 ));
    }

    /**
     * Fungsi untuk mendapatkan faktor prima dari suatu integer
     *
     * @param n Input
     * @param i Looping
     * @param r List rekursif
     *
     * @return List faktor prima
     */
    public static List<Integer> dispPrimeFactor(int n, int i, List<Integer> r) {

        if (i <= n / 2) {
            if (n % i == 0 && Soal5_187221042_Week14_1.numFactor(i, 1) == 2) {

                // Jika i merupakan faktor dari n dan i merupakan bilangan prima (numFactor == 2). Maka nilai i akan di output
                r.add(i);
            }

            // Rekursif dengan menambahkan nilai i + 1 untuk mencoba nilai i lainnya
            dispPrimeFactor(n, i + 1, r);
        } else {
            if (Soal5_187221042_Week14_1.numFactor(n, 1) == 2) {
                r.add(n);
            }
        }
        return r;
    }
}
