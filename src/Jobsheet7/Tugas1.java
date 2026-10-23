// P = 8
package Jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int harga;
        String input;

        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik batal untuk selesai): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("batal")) {
                break;
            }

            jumlahTiket = Integer.parseInt(input);

            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket harus lebih dari 0!");
                continue;
            }

            harga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                harga = harga - (harga * 15 / 100);
            } else if (jumlahTiket > 4) {
                harga = harga - (harga * 10 / 100);
            }

            totalTiket = totalTiket + jumlahTiket;
            totalPenjualan = totalPenjualan + harga;

            System.out.println("Harga tiket: Rp" + harga);
            System.out.println("Data berhasil dicatat.");
            System.out.println();
        }

        System.out.println("\n===== HASIL PENJUALAN =====");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

    }
}
