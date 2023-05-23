package com.ali_ahmad_fahrezy_187221042.alproprak.Week10;

import java.util.Scanner;

/**
 * Soal 1 Minggu 10-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 *
 * @param x1 Titik lokasi x lingkaran pertama
 * @param y1 Titik lokasi y lingkaran pertama
 * @param r1 Jari-jari lingkaran pertama
 * @param x2 Titik lokasi x lingkaran kedua
 * @param y2 Titik lokasi y lingkaran kedua
 * @param r2 Jari-jari lingkaran kedua
 * @param rb Jari-jari lingkaran terbesar
 * @param rk Jari-jari lingkaran terkecil
 * @param a  Alas atau jarak titik pusat dua lingkaran di sumbu x
 * @param t  Tinggi atau jarak titik pusat lingkaran di sumbu y
 * @param d  Jarak titik pusat dua lingkaran
 */
public class Soal1_187221042_Week10_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 1 Minggu 10 \"Melihat Hubungan Antara 2 Lingkaran\"");

        System.out.print("Inputlah nilai sumbu x titik pusat lingkaran pertama: ");
        float x1 = input.nextFloat();

        System.out.print("Inputlah nilai sumbu y titik pusat lingkaran pertama: ");
        float y1 = input.nextFloat();

        System.out.print("Inputlah jari-jari lingkaran pertama: ");
        float r1 = input.nextFloat();

        System.out.print("Inputlah nilai sumbu x titik pusat lingkaran kedua: ");
        float x2 = input.nextFloat();

        System.out.print("Inputlah nilai sumbu y titik pusat lingkaran kedua: ");
        float y2 = input.nextFloat();

        System.out.print("Inputlah jari-jari lingkaran pertama: ");
        float r2 = input.nextFloat();


        //Menghitung nilai jarak alas atau jarak antara x1 dan x2
        float a = Math.abs(x1 - x2);

        //Menghitung nilai tinggi atau jarak antara y1 dan y2
        float t = Math.abs(y1 - y2);

        //Menghitung jarak antara kedua lingkaran dengan menggunakan teorama pythagoras
        double d = Math.sqrt((a * a) + (t * t));

        //Mengambil nilai jari-jari terbesar antara kedua lingkaran
        float rb = Math.max(r1, r2);

        //Mengambil nilai jari-jari terkecil antara kedua lingkaran
        float rk = Math.min(r1, r2);

        //Posisi dasar adalah P1, yaitu sama sekali tidak menyentuh
        String h = "P1";

        //Jika nilai jarak adalah sama dengan penjumlahan kedua jari jari lingkaran, maka terbukti bahwa lingkaran tersebut saling bersinggungan di luar (P2)
        if (d == rb + rk) {
            h = "P2";
        }

        //Jika nilai jarak adalah sama dengan pengurangan jari jari terbesar dengan yang terkecil, maka terbukti bahwa lingkaran tersebut saling bersinggungan di dalam (P3)
        if (rb - rk < d && d < rb + rk) {
            h = "P3";
        }

        //Jika nilai pengurangan jari jari terbesar dengan jari jari terkecil adalah lebih kecil dari pada jarak, dan nilai jarak adalah lebih kecil dari pada nilai penjumlahan kedua jari jari, maka terbukti terbentuk arsiran ditengah kedua lingkaran, dimana terdapat dua titik potong antara dua lingkaran (P3)
        if (d == rb - rk) {
            h = "P4";
        }

        //Jika nilai penjumlahan jarak dan jari jari terkecil adalah lebih kecil dari pada nilai jari jari terbesar, maka terbukti bahwa lingkaran terkecil tersebut berada didalam lingkaran terbesar tanpa bersinggungan (P5)
        if (d + rk < rb) {
            h = "P5";
        }

        //Output
        System.out.println("Posisi kedua lingkaran tersebut adalah: " + h);
    }
}
