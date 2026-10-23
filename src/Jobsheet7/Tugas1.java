// P = 8
package Jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0, totalPenjualan = 0;
        String input;

        while (true) {
            System.out.print("Masukkan jumlah tiket ('batal' untuk selesai): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("batal")) {
                System.out.println("Selesai memasukkan data pelanggan.");
                break;
            }

            try {
                jumlahTiket = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka atau 'batal'!");
                continue;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            int harga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                harga = harga - (harga * 15 / 100);
            } else if (jumlahTiket > 4) {
                harga = harga - (harga * 10 / 100);
            }

            totalTiket += jumlahTiket;
            totalPenjualan += harga;
            System.out.println("Jumlah tiket pelanggan berhasil dicatat.");
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}
