package com.ali_ahmad_fahrezy_187221042.alproprak.Week10;

import java.util.Scanner;

/**
 * Soal 3 Minggu 10-1
 * @author   Ali Ahmad Fahrezy
 * @NIM      187220142
 *
 * @param a  Nilai a
 * @param b  Nilai b
 * @param c  Nilai c
 * @param d  Nilai d
 * @param e  Nilai e
 * @param b2 Nilai b parabola terhadap garis
 * @param c2 Nilai c parabola terhadap garis
 * @param ds Diskriminan
 * @param x1 Titik potong X1
 * @param y1 Titik potong Y1
 * @param x2 Titik potong X2
 * @param y2 Titik potong Y2
 * @param k  Keterangan
 */
public class Soal3_187221042_Week10_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 3 Minggu 10 \"Melihat hubungan antara parabola dan garis\"");

        System.out.print("Inputlah nilai a: ");
        int a = input.nextInt();

        System.out.print("Inputlah nilai b: ");
        int b = input.nextInt();

        System.out.print("Inputlah nilai c: ");
        int c = input.nextInt();

        System.out.print("Inputlah nilai d: ");
        int d = input.nextInt();

        System.out.print("Inputlah nilai e: ");
        int e = input.nextInt();

        //Menghitung nilai b parabola terhadap garis
        int b2 = b - d;

        //Menghitung nilai c parabola terhadap garis
        int c2 = c - e;

        //Menghitung diskriminan parabola terhadap garis
        int ds = (b2 * b2) - (4 * a * c2);

        String k;

        //Jika D < 0, maka parabola dan garis saling lepas
        if (ds < 0) {
            k = "Saling Lepas";
        } else {
            //jika D = 0. maka parabola dan garis bersinggungan
            if (ds == 0) {
                k = "Bersinggungan";
            } else {
                //jika D < 0, maka parabola dan garis berpotongan
                k = "Berpotongan";
            }

            //Menghitung posisi x1 dengan rumus abc
            double x1 = (-b2) - Math.sqrt(ds);
            x1 = x1 / 2 * a;

            //Menghitung posisi x2 dengan rumus abc
            double x2 = (-b2) + Math.sqrt(ds);
            x2 = x2 / 2 * a;

            //Menghitung posisi y1 dengan memasukkan nilai x1 ke fungsi linear
            double y1 = d * x1 + e;

            //Menghitung posisi y2 dengan memasukkan nilai x2 ke fungsi linear
            double y2 = d * x2 + e;

            System.out.println("Posisi X1 =  " + x1 + "\nPosisi Y1 = " + y1 + "\nPosisi X2 =  " + x2 + "\nPosisi Y2 = " + y2);
        }

        //Output
        System.out.println("Keterangan: " + k);
    }
}
