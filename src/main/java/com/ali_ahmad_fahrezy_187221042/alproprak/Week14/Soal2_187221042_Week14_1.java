package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

/**
 * Program Soal 2 Week 14-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Nilai input
 */

public class Soal2_187221042_Week14_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 2 Minggu 14 \"Konversi Integer ke Binari\"");

        System.out.print("Input nilai integer yang ingin diubah ke dalam binari: ");
        int n = input.nextInt();

        System.out.println("Binari dari nilai integer tersebut adalah: " + convertBin(n));
    }

    /**
     * Fungsi untuk konversi nilai integer ke string binari
     *
     * @param n Nilai input
     *
     * <p><b>Other Parameters:</b></p>
     * <ul>
     * <li><b>b</b> String binari</li>
     * </ul>
     *
     * @return String binari dari input
     */
    public static String convertBin(int n) {

        String b = "";

        if (n < 0) {
            return "Nilai input harus positif";
        } else if (n == 0) {
            return "0";
        } else {
            // Fungsi rekursif dengan cara memanggil kembali convertBin(n / 2), dan digabung dengan n % 2. Ini menggunakan rumus konversi desimal ke binari yaitu membagi 2 angka yang ingin dikonversi, dan jika ia habis maka nilai nya 0, dan jika tidak habis maka nilai nya 1, kemudian dilanjutkan dengan nilai n / 2 dan seterusnya sampai n bernilai 0
            b = convertBin(n / 2);
            b += n % 2;
        }

        return b;
    }
}
