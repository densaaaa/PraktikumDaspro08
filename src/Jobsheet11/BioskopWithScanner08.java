package Jobsheet11;

import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            pilihan = sc.nextLine();
            
            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
