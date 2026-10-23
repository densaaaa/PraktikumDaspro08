package Jobsheet6;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = 8;

        int diskonKamus = 8 + (P % 5);  
        int batasKamus  = 2 + (P % 2);   
        int diskonNovel = 5 + (P % 4);   
        int batasNovel  = 3 + (P % 2);   
        int diskonLain  = 3 + (P % 4);   
        int batasLain   = 3 + (P % 2);   

        String hari, jenis;
        int jumlah, harga, diskon;
        double potongan, total;

        System.out.print("Hari : ");
        hari = sc.nextLine().trim();
        System.out.print("Jenis buku : ");
        jenis = sc.nextLine().trim();
        System.out.print("Jumlah buku : ");
        jumlah = sc.nextInt();
        System.out.print("Harga satuan (Rp) : ");
        harga = sc.nextInt();

        diskon = 0;

        if (hari.equalsIgnoreCase("Rabu")) {
            if (jenis.equalsIgnoreCase("kamus")) {
                diskon = diskonKamus;
                if (jumlah > batasKamus) {
                    diskon = diskon + 2;
                }
            } else if (jenis.equalsIgnoreCase("novel")) {
                diskon = diskonNovel;
                if (jumlah > batasNovel) {
                    diskon = diskon + 2;
                } else {
                    diskon = diskon + 1;
                }
            } else {
                if (jumlah > batasLain) {
                    diskon = diskonLain;
                }
            }
        }

        potongan = (double) harga * jumlah * diskon / 100;
        total = (double) harga * jumlah - potongan;

        System.out.println();
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Potongan : Rp " + potongan);
        System.out.println("Total bayar : Rp " + total);
    }
}