package com.ali_ahmad_fahrezy_187221042.alproprak.Week9;

import java.util.Scanner;

/**
 * Soal 3 Minggu 9-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187220142
 * @param   b   Harga beli
 * @param   pb  Persentase beli
 * @param   u   Keuntungan
 * @param   o   Ongkos kirim
 * @param   h   Pertambahan harga
 * @param   pj  Persentase pertambahan harga
 */
public class Soal3_187221042_Week9_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 3 Minggu 9 \"Penjual Minyak\"");

        //Input harga  beli
        System.out.print("Input harga beli: ");
        int b = input.nextInt();

        //Input persentase pembelian
        System.out.print("Input persentase pembelian (Harus antara 1-100): ");
        int pb = input.nextInt();

        //Input nilai keuntungan
        System.out.print("Input keuntungan yang diinginkan: ");
        int u = input.nextInt();

        //Menghitung ongkos kirim
        float o = (float) b*pb/100;

        //Menghitung pertambahan harga
        float h = o + u;

        //Menghitung persentase pertambahan harga
        float pj = h/b*100;

        //Output
        System.out.println("Persentase pertambahan harga: " + pj + "%");
    }
}
