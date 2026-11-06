package Jobsheet8;


import java.util.Scanner;

public class Tugas308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int toko = 1;
        int totalBarangSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbaik = 1;

        while (toko <= jumlahToko) {
            int jumlahPelanggan;

            do {
                System.out.print("Jumlah pelanggan toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int pelanggan = 1;
            int totalBarangToko = 0;

            while (pelanggan <= jumlahPelanggan) {
                int barang;

                do {
                    System.out.print("Jumlah barang pelanggan "
                            + pelanggan + " toko " + toko + ": ");
                    barang = sc.nextInt();

                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (barang < 0);

                totalBarangToko = totalBarangToko + barang;
                pelanggan++;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSemua = totalBarangSemua + totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbaik = toko;
            }

            toko++;
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);

    }
}

