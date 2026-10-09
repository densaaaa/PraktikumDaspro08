package Jobsheet2;

import java.util.Scanner;

public class Modifikasi208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah (m): ");
        double lebar = sc.nextDouble();

        System.out.print("Masukkan panjang tanah (m): ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan diameter kolam (m): ");
        double diameter = sc.nextDouble();

        System.out.print("Masukkan sisi taman persegi (m): ");
        double sisi = sc.nextDouble();

        double luasTanah = lebar * panjang;
        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("\n=== Perhitungan Luas Tanah ===");
        System.out.printf("Luas Tanah          : %.2f m2%n", luasTanah);
        System.out.printf("Luas Kolam          : %.2f m2%n", luasKolam);
        System.out.printf("Luas Taman          : %.2f m2%n", luasTaman);
        System.out.printf("Luas Tidak Terpakai : %.2f m2%n", luasTidakDigunakan);


        sc.close();
    }
}