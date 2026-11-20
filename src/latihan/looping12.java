
package Latihan;

import java.util.Scanner;

public class looping12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPendapatan = 0;

        for (int i = 1; i <= 3; i++) {

            int pelanggan = 1;
            int pendapatanLoket = 0;

            System.out.println("\n===== LOKET " + i + " =====");

            do {
                System.out.print("\nLanjut? (ya/tidak): ");
                String lanjut = sc.nextLine();

                if (lanjut.equalsIgnoreCase("tidak")) {
                    System.out.println("Transaksi dihentikan!");
                    break;
                }

                if (lanjut.equalsIgnoreCase("ya")) {

                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = sc.nextLine();

                    if (nama.equals("")) {
                        System.out.println("Nama tidak boleh kosong!");
                        continue;
                    }

                    if (nama.equalsIgnoreCase("skip")) {
                        System.out.println("Pelanggan dilewati!");
                        pelanggan++;
                        continue;
                    }

                    if (nama.equalsIgnoreCase("tutup")) {
                        System.out.println("Loket ditutup!");
                        break;
                    }

                    int hargaTiket = 35000;

                    pendapatanLoket += hargaTiket;
                    pelanggan++;

                    System.out.println("Pelanggan " + nama + " berhasil membeli tiket!");
                    System.out.println("Harga tiket: Rp" + hargaTiket);

                } else {
                    System.out.println("Input tidak valid!");
                    continue;
                }

            } while (pelanggan <= 3);

            totalPendapatan += pendapatanLoket;

            System.out.println("Pendapatan Loket " + i + ": Rp" + pendapatanLoket);
        }

        System.out.println("\n===== TOTAL PENDAPATAN BIOSKOP =====");
        System.out.println("Total pendapatan: Rp" + totalPendapatan);

        sc.close();
    }
}
