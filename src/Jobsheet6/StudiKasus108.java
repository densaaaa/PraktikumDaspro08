package Jobsheet7;

import java.util.Scanner;

public class StudiKasus108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 17000;
        int jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang, diskon;

        System.out.println("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.println("Uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 110000) {
            diskon = totalHarga * 7 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}