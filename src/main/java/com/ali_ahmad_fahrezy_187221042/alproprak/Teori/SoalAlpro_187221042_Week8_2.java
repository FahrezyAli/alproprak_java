package com.ali_ahmad_fahrezy_187221042.alproprak.Teori;

import java.util.Scanner;

public class SoalAlpro_187221042_Week8_2 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input: ");
        int x = input.nextInt();

        System.out.println("Output: " + intToVoice(x));
    }

    public static String intToVoice(int x) {
        String[] angka = new String[] {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

        if (x < 0 || x > 99) {
            return "ERROR: Only 1 - 99";
        } else {
            if (x < 12) {
                return angka[x - 1];
            } else if (x < 20) {
                int d = x % 10;
                return angka[d - 1] + " belas";
            } else {
                int d1 = x / 10;
                int d2 = x % 10;

                if (d2 == 0) {
                    return angka[d1 - 1] + " puluh";
                }
                else {
                    return angka[d1 - 1] + " puluh " + angka[d2 - 1];
                }
            }
        }
    }
}
