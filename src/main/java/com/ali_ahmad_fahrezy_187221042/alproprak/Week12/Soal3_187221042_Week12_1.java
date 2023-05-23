package com.ali_ahmad_fahrezy_187221042.alproprak.Week12;

import java.util.Scanner;

/**
 * Program Soal 3 Minggu 12-1
 * @author  Ali Ahmad Fahrezy
 * @NIM     187221042
 *
 * @param n Ukuran array
 * @param i Looping
 * @param e Index akhir dari deret naik berkelanjutan terpanjang
 * @param x Array input
 * @param s Array index awal dari deret naik berkelanjutan
 * @param l Array panjang dari deret naik berkelanjutan
 * @param t Array nilai total dari deret naik berkelanjutan
 * @param c Boolean dari pertanyaan "Apakah awal deret berhasil ditemukan"
 */
public class Soal3_187221042_Week12_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Soal Nomor 3 Minggu 12 \"Array Ascending dengan Jumlah terbesar\"");

        System.out.print("Input ukuran array: ");
        int n = input.nextInt();
        int[] x = new int[n];

        // Proses input nilai array x
        int i = 0;
        while (i < n) {
            System.out.print("Input nilai ke " + (i + 1) + ": ");
            x[i] = input.nextInt();
            i++;
        }

        // Memberikan nilai 0 pada s, l dan t agar tidak error
        int[] s = new int[2];
        int[] l = new int[2];
        int[] t = new int[2];

        i = 0;
        while (i < 2) {
            s[i] = 0;
            l[i] = 0;
            t[i] = 0;
            i++;
        }

        boolean c = false;
        i = 0;
        while (i < n) {
            if (i == 0) {

                // Jika i = 0, maka deret baru saja dimulai sehingga panjang deret (l[0]) adalah 1
                l[0] = 1;
            } else {
                if (x[i] > x[i - 1]) {
                    if (c) {

                        // Jika c sudah true, maka awal index tidak diambil lagi agar nilai nya tidak tertimpa dan nilai total terus ditambahkan
                        t[0] = t[0] + x[i];
                    } else {

                        // Karena c masih false, maka deret baru saja dimulai sehingga awal index (s[0]) bisa diambil dan nilai total dapat mulai dijumlahkan
                        s[0] = i - 1;
                        t[0] = x[i - 1] + x[i];
                        c = true;
                    }

                    // Jika nilai x[i] lebih kecil daripada nilai sebelumya (x[i - 1]), maka panjang dari deret (l[0]) bertambah 1
                    l[0]++;
                } else {

                    // Jika deret naik berkelanjutan sudah selesai (nilai x[i] tidak lebih besar daripada nilai x[i - 1]), maka panjang deret (l[0])pun di kembalikan lagi menjadi 1 agar dapat menghitung panjang deret yang lain jika ada, dan nilai total (t[0]) diubah kembali menjadi 0 agar dapat menghitung nilai total deret lain jika ada
                    l[0] = 1;
                    t[0] = 0;

                    // Kondisi c diubah menjadi false karena deret naik berkelanjutan sudah selesai
                    c = false;
                }

                // Setiap langkah dari loop, jika nilai total deret yang sedang berlangsung (t[0]) lebih besar daripada nilai total deret sebelumnya, maka nilai panjang terbesar akan disimpan di t[1] beserta dengan awal indexnya (s[1]) dan panjang nya (l[1])
                if (t[0] > t[1]) {
                    l[1] = l[0];
                    s[1] = s[0];
                    t[1] = t[0];
                }
            }
            i++;
        }

        // Untuk mendapatkan index akhir dari deret naik berkelanjutan, kita dapat menghitungnya dengan menjumlahkan nilai awal index(s[1]) dengan panjang deret (l[1])
        int e = s[1] + l[1];

        // Proses output
        System.out.print("Array bilangan ascending berurutan dengan jumlah terbesar: ");
        if (l[1] == 0) {
            System.out.println("Tidak ada");
        } else {
            i = s[1];
            while (i < e) {
                System.out.print(x[i] + " ");
                i++;
            }
            System.out.println("(" + t[1] + ")");
        }
    }
}
