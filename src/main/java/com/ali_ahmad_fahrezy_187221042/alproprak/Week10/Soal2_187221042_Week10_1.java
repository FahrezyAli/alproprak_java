package com.ali_ahmad_fahrezy_187221042.alproprak.Week10;

import java.util.Scanner;

/**
 * Soal 2 Minggu 10-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 *
 * @param i Input jarak total perjalanan
 * @param w Input waktu perjalanan
 * @param c Input status hujan dalam boolean
 * @param h Total harga perjalanan
 */
public class Soal2_187221042_Week10_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 2 Minggu 10 \"Menghitung harga transportasi online MyJex\"");

        System.out.print("Inputlah jarak total perjalanan dalam km: ");
        int j = input.nextInt();

        System.out.print("Inputlah waktu total perjalanan dalam menit: ");
        int w = input.nextInt();

        System.out.print("Input status hujan dengan 'hujan' jika hujan, dan 'cerah' jika cerah: ");
        String c = input.next();

        //Harga dasar perjalanan adalah 10.000
        int h = 10000;

        //Jika jarak adalah atau lebih dari 3, maka harga akan bertambah 2000 per km tambahan
        if (j > 3) {
            h = h + ((j - 3) * 2000);
        }

        //Jika waktu per jarak melebihi 2 menit, maka harga akan bertambah 1000 per menit tambahan
        if ((double) w / j > 2) {
            h = h + ((w % j) * 1000);
        }

        //Jika hujan, maka harga akan bertambah 15%
        if (c.equals("hujan")) {
            h = (int) (h + (h * 0.15));
        }

        //Output
        System.out.println("Harga total perjalanan: " + h);
    }
}
