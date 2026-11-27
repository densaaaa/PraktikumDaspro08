
package Jobsheet11;

import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {

                        System.out.println("Nomor baris atau kolom tidak tersedia!");

                    } else if (penonton[baris - 1][kolom - 1] != null) {

                        System.out.println("Maaf, kursi sudah terisi!");
                        System.out.println("Silakan pilih kursi lain.");

                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                        break;
                    }
                }

            } else if (menu == 2) {
                System.out.println("\n===== DAFTAR PENONTON =====");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : Kosong");
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : " + penonton[i][j]);
                        }
                    }
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;

            } else {
                System.out.println("Menu tidak tersedia!");
            }
        }
    }
}
