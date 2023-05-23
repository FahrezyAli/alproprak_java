package com.ali_ahmad_fahrezy_187221042.alproprak.Week12;

import java.util.Scanner;

/**
 * Program Soal 4 Minggu 12-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param s String input
 * @param r Kebalikan (reverse) dari string input
 * @param i Looping
 */
public class Soal5_187221042_Week12_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 5 Minggu 12 \"String Palindrome\"");

        // Proses input
        System.out.print("Input kalimat yang ingin di cek apakah palindrome atau tidak: ");
        String s = input.nextLine().toUpperCase();

        // String r diberi string kosong ("") agar tidak error
        StringBuilder build = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            build.append(s.charAt(i));
        }
        String r = build.toString();

        // Proses output
        System.out.println("ASLI: " + s);
        System.out.println("REVERSE:" + r);
        System.out.print("Status: ");
        if (s.equals(r)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("BUKAN PALINDROME");
        }
    }
}
