package com.ali_ahmad_fahrezy_187221042.alproprak.Week12;

import java.util.Scanner;

/**
 * Program Soal 1 Minggu 12-1
 * @author Ali Ahmad Fahrezy
 * @NIM    187221042
 *
 * Variabel Array
 * @param x Array x
 * @param y Array y
 * @param z Array kombinasi x dan y
 *
 * 3 variabel integer pembantu
 * @param a    Membantu looping
 * @param b    Membantu looping
 * @param temp Menyimpan data sementara (temp)
 */
public class Soal1_187221042_Week12_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] x = new int[5];
        int[] y = new int[5];
        int[] z = new int[10];

        int a = 0;

        //Proses input array X
        while (a != 5) {
            System.out.print("Input nilai ke " + (a + 1) + " untuk data X: ");
            x[a] = input.nextInt();
            z[a] = x[a];
            a = a + 1;
        }
        a = 0;

        //Proses input array Y
        while (a != 5) {
            System.out.print("Input nilai ke " + (a + 1) + " untuk data Y: ");
            y[a] = input.nextInt();
            z[a + 5] = y[a];
            a = a + 1;
        }
        a = 0;

        //Proses sortir data Z
        while (a != 9) {
            int b = a + 1;
            while (b != 10) {
                if (z[a] > z[b]) {

                    //JIka sebuah data z[i] lebih besar daripada seluruh angka sisa dari array (awal sampai akhir), maka, dengan looping ini data tersebut akan dipindahkan hingga sesuai dengan urutan yang benar
                    int temp = z[a];
                    z[a] = z[b];
                    z[b] = temp;
                }
                b = b + 1;
            }
            a = a + 1;
        }
        a = 0;
        System.out.print("Array yang sudah berhasil diurut adalah: ");
        while (a != 9) {
            System.out.print(z[a] + ", ");
            a = a + 1;
        }
        System.out.println(z[9]);
    }
}
