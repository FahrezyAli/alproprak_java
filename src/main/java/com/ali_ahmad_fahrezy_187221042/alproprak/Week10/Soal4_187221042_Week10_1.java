package com.ali_ahmad_fahrezy_187221042.alproprak.Week10;

import java.util.Scanner;

/**
 * Soal 4 Minggu 10-1
 * @author   Ali Ahmad Fahrezy
 * @NIM      187220142
 *
 * @param j  Input jam
 * @param m  Input menit
 * @param sj Sudut yang terbentuk terhadap garis tegak lurus dan jarum jam
 * @param sm Sudut yang terbentuk terhadap garis tegak lurus dan jarum menit
 * @param sa Sudut yang terbentuk terhadap jarum jam dan jarum menit
 */
public class Soal4_187221042_Week10_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Soal Nomor 4 Minggu 10 \"Menghitung sudut antara jarum jam dan jarum menit\"");

        System.out.print("Inputlah nilai jam: ");
        int j = input.nextInt();

        System.out.print("Inputlah nilai menit: ");
        int m = input.nextInt();

        //Karena dalam menit ada 60 posisi terhadap satu lingkaran 360. Maka perbandingan sudut dengan menit adalah 360/60=6. Maka setiap menit, 6 derajat berpindah.
        int sm = m * 6;

        //Karena dalam jam ada 12 posisi terhadap satu lingkaran 360. Maka perbandingan sudut dengan jam adalah 360/12=30. Maka setiap menit, 30 derajat berpindah.
        float sj = (j + (m / 60f)) * 30;

        //Besaran sudut jam terhadap menit adalah nilai mutlak pengurangan sudut jam terhadap garis tegak lurus dan menit terhadap garis tegak lurus
        float sa = Math.abs(sj - sm);

        //Jika sudut lebih besar daripada 180, maka harus dihitung dari belakang, jadi 360 dikurang dengan sudut akhir
        if (sa > 180) {
            sa = 360 - sa;
        }

        //Output
        System.out.println("Sudut antara jarum jam dan jarum menit adalah " + sa + " derajat");
    }
}
