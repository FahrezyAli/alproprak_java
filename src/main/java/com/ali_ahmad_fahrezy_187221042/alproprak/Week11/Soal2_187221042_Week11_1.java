package com.ali_ahmad_fahrezy_187221042.alproprak.Week11;

import java.util.Scanner;

/**
 * Soal 2 Minggu 11-1
 * @author Ali Ahmad Fahrezy
 * @NIM    187221042
 *
 * @param b Array berat 10 bebek
 * @param i Looping
 * @param k Total status kurus
 * @param l Total status langsing
 * @param s Total status Standard
 * @param g Total status gemuk
 * @param o Total status obesitas
 */
public class Soal2_187221042_Week11_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 2 Minggu 11 \"Kondisi kesehatan bebek\"");

        double[] b = new double[10];

        int k = 0;
        int l = 0;
        int s = 0;
        int g = 0;
        int o = 0;

        // Kode ini berfungsi untuk looping input berat 10 bebek dalam satuan kilogram
        for (int i = 0; i <= 9; i++) {
            System.out.print("Inputlah berat bebek ke " + (i + 1) + " dengan satuan kilogram: ");
            b[i] = input.nextDouble();
        }

        // Kemudian masing masing berat akan dicek apakah status-nya kurus, langsing, standard, gemuk atau obesitas, yang kemudian akan menambah total count dari status tersebut
        for (int i = 0; i <= 9; i++) {
            if (b[i] < 0.7) {
                k++;
            } else if (b[i] < 1) {
                l++;
            } else if (b[i] < 1.5) {
                s++;
            } else if (b[i] < 2) {
                g++;
            } else {
                o++;
            }
        }

        // Status tersebut kemudian di output
        System.out.println("Bebek yang memiliki status KURUS: " + k);
        System.out.println("Bebek yang memiliki status LANGSING: " + l);
        System.out.println("Bebek yang memiliki status STANDARD: " + s);
        System.out.println("Bebek yang memiliki status GEMUK: " + g);
        System.out.println("Bebek yang memiliki status OBESITAS: " + o);
    }
}
