package Jobsheet8;

import java.util.Scanner;

public class Star08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++ )
        {
            System.out.print("*");
        }

        System.out.println();
        sc.close();
    }
}

// uji 1 = 6 *
// uji 2 = 12 *
