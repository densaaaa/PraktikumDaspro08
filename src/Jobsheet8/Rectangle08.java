package Jobsheet8;

import java.util.Scanner;

public class Rectangle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {           
            for (int j = 1; j <= kolom; j++) {               
                System.out.print("*");           
            }
            System.out.println();
        }
    }
}

// uji coba 1 = 4, 6
// uji coba 2 = 7, 4