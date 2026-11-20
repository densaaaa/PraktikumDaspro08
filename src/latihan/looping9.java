
package Latihan;

import java.util.Scanner;

public class looping9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPendapatan = 0;

        for (int i = 1; i <= 3; i++) {
            int totalBelanja = 0;
            String pilihan;

            System.out.println("\nPelanggan ke-" + i);

            do {
                System.out.print("Masukkan nama barang: ");
                String barang = sc.nextLine();

                System.out.print("Masukkan harga barang: ");
                int harga = sc.nextInt();

                System.out.print("Masukkan jumlah barang: ");
                int jumlahBarang = sc.nextInt();

                int subtotal = harga * jumlahBarang;

                System.out.println("Barang: " + barang);
                System.out.println("Subtotal: Rp" + subtotal);

                totalBelanja += subtotal;
                sc.nextLine();

                System.out.print("Apakah ingin membeli lagi (Y/N)? ");
                pilihan = sc.nextLine();

            } while (pilihan.equalsIgnoreCase("y"));
            totalPendapatan += totalBelanja;

            System.out.println("Total belanja pelanggan: Rp" + totalBelanja);
        }

        System.out.println("\n===== LAPORAN PENJUALAN =====");
        System.out.println("Total pendapatan: Rp" + totalPendapatan);

        sc.close();
    }
}
