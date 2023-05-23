package com.ali_ahmad_fahrezy_187221042.alproprak;

import java.util.Scanner;

import com.ali_ahmad_fahrezy_187221042.alproprak.Week10.Soal1_187221042_Week10_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week10.Soal2_187221042_Week10_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week10.Soal3_187221042_Week10_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week10.Soal4_187221042_Week10_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week11.Soal1_187221042_Week11_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week11.Soal2_187221042_Week11_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week11.Soal3_187221042_Week11_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week11.Soal4_187221042_Week11_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week12.Soal1_187221042_Week12_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week12.Soal2_187221042_Week12_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week12.Soal3_187221042_Week12_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week12.Soal4_187221042_Week12_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week12.Soal5_187221042_Week12_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week13.Soal1_187221042_Week13_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week13.Soal2_187221042_Week13_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week13.Soal3_187221042_Week13_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week13.Soal4_187221042_Week13_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week13.Soal5_187221042_Week13_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week13.Soal6_187221042_Week13_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week14.Soal1_187221042_Week14_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week14.Soal2_187221042_Week14_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week14.Soal3_187221042_Week14_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week14.Soal4_187221042_Week14_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week14.Soal5_187221042_Week14_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week14.Soal6_187221042_Week14_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week8.Soal1_187221042_Week8_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week8.Soal2_187221042_Week8_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week8.Soal3_187221042_Week8_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week8.Soal4_187221042_Week8_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week9.Soal1_187221042_Week9_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week9.Soal2_187221042_Week9_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week9.Soal3_187221042_Week9_1;
import com.ali_ahmad_fahrezy_187221042.alproprak.Week9.Soal4_187221042_Week9_1;

/**
 * Hello world!
 * @author Ali Ahmad Fahrezy
 */
public final class App {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        getSoal(getIndex(), args);
    }

    public static int getIndex() {
        Scanner input = new Scanner(System.in);

        System.out.print("Soal berapa yang ingin di run? Input 0 untuk exit: ");

        return input.nextInt();
    }

    public static void getSoal(int index, String[] args) {
        System.out.println("");
        switch (index) {
            case 0: break;

            case 81: Soal1_187221042_Week8_1.main(args); break;
            case 82: Soal2_187221042_Week8_1.main(args); break;
            case 83: Soal3_187221042_Week8_1.main(args); break;
            case 84: Soal4_187221042_Week8_1.main(args); break;

            case 91: Soal1_187221042_Week9_1.main(args); break;
            case 92: Soal2_187221042_Week9_1.main(args); break;
            case 93: Soal3_187221042_Week9_1.main(args); break;
            case 94: Soal4_187221042_Week9_1.main(args); break;

            case 101: Soal1_187221042_Week10_1.main(args); break;
            case 102: Soal2_187221042_Week10_1.main(args); break;
            case 103: Soal3_187221042_Week10_1.main(args); break;
            case 104: Soal4_187221042_Week10_1.main(args); break;

            case 111: Soal1_187221042_Week11_1.main(args); break;
            case 112: Soal2_187221042_Week11_1.main(args); break;
            case 113: Soal3_187221042_Week11_1.main(args); break;
            case 114: Soal4_187221042_Week11_1.main(args); break;

            case 121: Soal1_187221042_Week12_1.main(args); break;
            case 122: Soal2_187221042_Week12_1.main(args); break;
            case 123: Soal3_187221042_Week12_1.main(args); break;
            case 124: Soal4_187221042_Week12_1.main(args); break;
            case 125: Soal5_187221042_Week12_1.main(args); break;

            case 131: Soal1_187221042_Week13_1.main(args); break;
            case 132: Soal2_187221042_Week13_1.main(args); break;
            case 133: Soal3_187221042_Week13_1.main(args); break;
            case 134: Soal4_187221042_Week13_1.main(args); break;
            case 135: Soal5_187221042_Week13_1.main(args); break;
            case 136: Soal6_187221042_Week13_1.main(args); break;

            case 141: Soal1_187221042_Week14_1.main(args); break;
            case 142: Soal2_187221042_Week14_1.main(args); break;
            case 143: Soal3_187221042_Week14_1.main(args); break;
            case 144: Soal4_187221042_Week14_1.main(args); break;
            case 145: Soal5_187221042_Week14_1.main(args); break;
            case 146: Soal6_187221042_Week14_1.main(args); break;

            default: wrongIndex(index, args); break;
        }
    }

    public static void wrongIndex(int index, String[] args) {
        System.out.println("Soal dengan index " + index + " tidak ditemukan!\nPastikan format index berupa 'minggu' dan 'nomor soal' tanpa spasi.\nContoh: Soal4_187221042_Minggu8_1 = 84");
        getSoal(getIndex(), args);
    }
}
