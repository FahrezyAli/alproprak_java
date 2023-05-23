package com.ali_ahmad_fahrezy_187221042.alproprak.Week11;

import java.util.Scanner;

/**
 * Soal 3 Minggu 11-1
 * @author Ali Ahmad Fahrezy
 * @NIM    187221042
 *
 * @param n Ukuran array
 * @param i Looping
 * @param e Index akhir dari deret naik berkelanjutan terpanjang
 * @param x Array input
 * @param s Array index awal dari deret naik berkelanjutan
 * @param l Panjang dari deret naik berkelanjutan
 * @param c Boolean dari pertanyaan "Apakah awal deret berhasil ditemukan"
 */
public class Soal3_187221042_Week11_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 3 Minggu 11 \"LCIS\"");

        System.out.print("Input ukuran array: ");
        int n = input.nextInt();
        int[] x = new int[n];

        // Proses input nilai array x
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Input nilai ke " + (i + 1) + ": ");
            x[i] = input.nextInt();
        }

        // Memberikan nilai 0 pada s dan l agar tidak error
        int[] s = new int[2];
        int[] l = new int[2];

        for (int i = 0; i <= 1; i++) {
            s[i] = 0;
            l[i] = 0;
        }

        boolean c = false;
        for (int i = 0; i <= n - 1; i++) {
            if (i == 0) {

                // Jika i = 0, maka deret baru saja dimulai sehingga panjang deret (l[0]) adalah 1
                l[0] = 1;
            } else if (x[i] > x[i - 1]) {
                if (!c) {
                    // Karena c masih false, maka deret baru saja dimulai sehingga awal index (s[0]) bisa diambil dan c diubah menjadi true untuk menandakan bahwa awal index telah ditemukan
                    s[0] = i - 1;
                    c = true;
                }
                // Jika nilai x[i] lebih kecil daripada nilai sebelumya (x[i - 1]), maka panjang dari deret (l[0]) bertambah 1
                l[0]++;
            } else {
                // Jika deret naik berkelanjutan sudah selesai (nilai x[i] tidak lebih besar daripada nilai x[i - 1]), maka panjang deret (l[0])pun di kembalikan lagi menjadi 1 agar dapat menghitung panjang deret yang lain jika ada
                l[0] = 1;

                // Kondisi c diubah menjadi false karena deret naik berkelanjutan sudah selesai
                c = false;
            }
            // Setiap langkah dari loop, jika panjang deret yang sedang berlangsung (l[0]) lebih besar daripada panjang deret sebelumnya, maka nilai panjang terbesar akan disimpan di l[1] beserta dengan awal indexnya (s[1])
            if (l[0] > l[1]) {
                l[1] = l[0];
                s[1] = s[0];
            }
        }

        // Untuk mendapatkan index akhir dari deret naik berkelanjutan, kita dapat menghitungnya dengan menjumlahkan nilai awal index(s[1]) dengan panjang deret (l[1]), kemudian dikurangi satu karena index array dimulai dari 0
        int e = s[1] + l[1] - 1;

        // Proses output
        System.out.print("Array bilangan ascending berurutan terpanjang: ");
        if (l[1] == 1) {
            System.out.println("Tidak ada");
        } else {
            for (int i = s[1]; i <= e; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println("(" + l[1] + ")");
        }
    }
}
