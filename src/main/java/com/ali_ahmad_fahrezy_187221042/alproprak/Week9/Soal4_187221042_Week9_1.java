package com.ali_ahmad_fahrezy_187221042.alproprak.Week9;

import java.util.Scanner;

/**
 * Soal 4 Minggu 9-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 * @param   jo  Jam keberangkatan
 * @param   mo  Menit keberangkatan
 * @param   td  Total detik waktu keberangkatan
 * @param   v   Kecepatan bus
 * @param   s   Jarak yang ditempuh bus
 * @param   w   Total detik waktu kedatangan
 * @param   ja  Jam kedatangan
 * @param   ma  Menit kedatangan
 */
public class Soal4_187221042_Week9_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 4 Minggu 9 \"Waktu Kedatangan Bus\"");

        System.out.print("Input jam keberangkatan: ");
        int jo = input.nextInt();

        System.out.print("Input menit keberangkatan: ");
        int mo = input.nextInt();

        System.out.print("Input kecepatan bus dalam km/jam: ");
        float v = input.nextFloat();

        System.out.print("Input jarak yang akan ditempuh dalam km: ");
        int s = input.nextInt();

        //Menghitung total detik waktu keberangkatan
        int td = (jo*3600)+(mo*60);

        //Konversi km/jam ke m/s
        v = v*1000/3600;

        //Konversi jam ke s
        s = s*1000;

        //
        int w = (int) (s/v+td+2700);

        int ja = w/3600;

        int ma = (w-(3600*ja))/60;

        //Output
        System.out.println("Anda akan sampai pada pukul: " + ja + ":" + ma);
    }
}
