package com.ali_ahmad_fahrezy_187221042.alproprak.Week12;

import java.util.Scanner;

/**
 * Program Soal 2 Minggu 12-1
 * @author Ali Ahmad Fahrezy
 * @NIM    187221042
 *
 * Variabel array
 * @param x Array x
 *
 * 2 variabel integer pembantu
 * @param a    Membantu looping
 * @param temp Menyimpan data sementara (temporary)
 */
public class Soal2_187221042_Week12_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 1 Minggu 11 \"\"");

        int[] x = new int[5];

        int a = 0;

        // Proses input array X
        while (a != 5) {
            System.out.print("Input nilai ke " + (a + 1) + " untuk array X: ");
            x[a] = input.nextInt();
            a++;
        }
        a = 0;

        // Proses sortir
        while (a != 5) {

            // Karena hanya x[4] yang tidak terurut, maka kita akan mencek setiap nilai dalam array dengan x[4].
            if (x[a] > x[4]) {

                // Jika nilai x[i] lebih kecil daripada x[4], maka akan terjadi penukaran nilai hingga array telah tersortir
                int temp = x[a];
                x[a] = x[4];
                x[4] = temp;
            }
            a++;
        }
        a = 0;
        System.out.print("Array yang sudah berhasil diurut adalah: ");
        while (a != 4) {
            System.out.print(x[a] + ", ");
            a++;
        }
        System.out.println(x[4]);
    }
}
