package com.ali_ahmad_fahrezy_187221042.alproprak.Week14;

import java.util.Scanner;

public class Soal2_187221042_Week14_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program Soal 1 ALPRAK I1
        // Ali Ahmad Fahrezy
        // 187221042
        //
        // n: Nilai input
        int n;

        System.out.print("Input nilai integer yang ingin diubah ke dalam binari: ");
        n = input.nextInt();

        System.out.print("Binari dari nilai integer tersebut adalah: " + convertBin(n));
    }

    public static int convertBin(int n) {
        // b: Nilai binari
        int b;

        if (n != 0) {

            // Fungsi rekursif dengan cara memanggil kembali convertBin(n / 2), dan digabung dengan n % 2. Ini menggunakan rumus konversi desimal ke binari yaitu membagi 2 angka yang ingin dikonversi, dan jika ia habis maka nilai nya 0, dan jika tidak habis maka nilai nya 1, kemudian dilanjutkan dengan nilai n / 2 dan seterusnya sampai n bernilai 0
            b = Integer.parseInt(Integer.toString(convertBin((int) ((double) n / 2))) + n % 2);
        } else {
            b = n % 2;
        }

        return b;
    }
}
