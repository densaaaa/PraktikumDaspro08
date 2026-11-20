package Latihan;

import java.util.Scanner;

public class looping6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPendapatan = 0;

        for (int pembeli = 1; pembeli <= 3; pembeli++) {

            System.out.println("\n=== PEMBELI " + pembeli + " ===");

            int totalBelanja = 0;
            int pilihan;

            do {
                System.out.println("\n=== MENU KOPERASI ===");
                System.out.println("1. Buku      - Rp5.000");
                System.out.println("2. Pulpen    - Rp3.000");
                System.out.println("3. Penghapus - Rp2.000");
                System.out.println("0. Selesai");
                System.out.print("Pilih barang: ");
                pilihan = sc.nextInt();

                if (pilihan == 0) {
                    break;
                }

                int harga = 0;
                String namaBarang = "";

                switch (pilihan) {
                    case 1:
                        namaBarang = "Buku";
                        harga = 5000;
                        break;

                    case 2:
                        namaBarang = "Pulpen";
                        harga = 3000;
                        break;

                    case 3:
                        namaBarang = "Penghapus";
                        harga = 2000;
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        continue;
                }

                System.out.print("Jumlah barang: ");
                int jumlah = sc.nextInt();

                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }

                int subtotal = harga * jumlah;
                totalBelanja += subtotal;

                System.out.println("Barang       : " + namaBarang);
                System.out.println("Subtotal     : Rp" + subtotal);

            } while (pilihan != 0);

            System.out.println("\nTotal belanja pembeli "
                    + pembeli + " = Rp" + totalBelanja);

            totalPendapatan += totalBelanja;
        }

        System.out.println("\n==========================");
        System.out.println("TOTAL PENDAPATAN KOPERASI");
        System.out.println("Rp" + totalPendapatan);
        System.out.println("==========================");

        sc.close();
    }
}

    
