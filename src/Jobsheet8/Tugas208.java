package Jobsheet8;

import java.util.Scanner;

public class Tugas208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        int jumlah = 0;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlah = jumlah + hasil;
                j++;
            }

            System.out.println();
            i++;
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);
    }
}

