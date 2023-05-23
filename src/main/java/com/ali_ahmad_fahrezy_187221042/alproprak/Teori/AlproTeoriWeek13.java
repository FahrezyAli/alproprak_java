package com.ali_ahmad_fahrezy_187221042.alproprak.Teori;

public class AlproTeoriWeek13 {

    public static void main(String[] args) {
        System.out.println();
        pascalWithRecursive(5);

        System.out.println();

        pascalWithLoop(5);

        int[] x = new int[] {5, 3, 11, 6, 10};

        System.out.println("\n" + ketemu(x, x.length, 11));
    }

    public static int comb(int n, int k) {
        if (n >= k) {
            return (fact(n) / (fact(k) * fact(n - k)));
        }
        else return -1000; //Error code
    }

    public static int fact(int n) {
        if (n > 0) {
            return (n * fact(n - 1));
        }
        else return 1;
    }

    public static void pascalWithRecursive(int n) {
        if (n > 0) {
            pascalWithRecursive(n - 1);
            for (int i = 0; i < n + 1; i++) {
                System.out.print(comb(n, i) + " ");
            }
            System.out.println();
        }
    }

    public static void pascalWithLoop(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(comb(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static boolean ketemu(int[] x, int n, int k) {
        if (n < 0) {
            return false;
        }

        else if (x[n - 1] == k) {
            return true;
        }

        else return ketemu(x, n - 1, k);
    }
}
