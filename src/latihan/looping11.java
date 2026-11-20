package Latihan;

import java.util.Scanner;

public class looping11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pelanggan = 3;
        String barang;

        for (int i = 0; i < pelanggan; i++) {
            int totalBelanja = 0;
            int totalPendapatan = 0;

            do {
                System.out.println("Masukkan nama barang (selesai) : ");
                barang = sc.nextLine();

                if (barang.equalsIgnoreCase("selesai")) {
                    break;
                }

                System.out.println("Harga barang : ");
                int harga = sc.nextInt();

                System.out.println("Jumlah barang : ");
                int jumlahBarang = sc.nextInt();

                sc.nextLine();

                if (harga <= 0 || jumlahBarang <= 0) {
                    System.out.println("Input tidak valid");

                    continue;
                }

                int subtotal = harga * jumlahBarang;

                totalBelanja += subtotal;

                
            } while (true);

            totalPendapatan += totalBelanja;

            System.out.println("Total belanja : " + totalBelanja);
        }
    }
}
