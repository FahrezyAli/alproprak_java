package com.ali_ahmad_fahrezy_187221042.alproprak.Week11;

import java.util.Scanner;

/**
 * Soal 4 Minggu 11-1
 * @author Ali Ahmad Fahrezy
 * @NIM    187221042
 * @param nb    Array nama bulan
 * @param i     Looping counter
 * @param ib    Nilai bulan dalam integer
 * @param stg   Nilai tanggal dalam string
 * @param sb    Input nama bulan dalam string
 * @param sth   Nilai tahun dalam string
 * @param sib   Nilai bulan dalam string
 * @param sp    Nilai bilangan total dalam string
 * @param sr    Nilai kebalikan dalam string
 */
public class Soal4_187221042_Week11_1  {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 4 Minggu 11 \"Tanggal Palindrome\"");

        String[] nb = new String[] {"januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember"};

        int ib;

        String sib = "";

        System.out.print("Input tanggal: ");
        String stg = input.next();

        System.out.print("Input bulan: ");
        String sb = input.next().toLowerCase();

        System.out.print("Input tahun: ");
        String sth = input.next();

        // Looping ini berfungsi untuk mengkonversi nama bulan menjadi nilai angka bulan tersebut
        for (int i = 0; i <= 11; i++) {
            if (sb.equals(nb[i])) {
                ib = i + 1;
                if (ib < 10) {
                    sib = "0" + ib;
                } else {
                    sib = Integer.toString(ib);
                }
            }
        }

        String sp = stg + sib + sth;
        StringBuilder build = new StringBuilder();
        for (int i = sp.length() - 1; i >= 0; i--) {
            build.append(sp.charAt(i));
        }
        String sr = build.toString();

        System.out.println("Asli: " + sp);
        System.out.println("Reverse: " + sr);
        if (sp.equals(sr)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("BUKAN PALINDROME");
        }
    }
}
