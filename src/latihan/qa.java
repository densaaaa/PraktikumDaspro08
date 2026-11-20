package Latihan;

import java.util.Scanner;

public class qa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSemua = 0;
        int jumlahPembeli;

        // Validasi jumlah pembeli
        do {
            System.out.print("Masukkan jumlah pembeli: ");

            while (!sc.hasNextInt()) {
                System.out.println("Input salah! Masukkan angka.");
                sc.next();
                System.out.print("Masukkan jumlah pembeli: ");
            }

            jumlahPembeli = sc.nextInt();

            if (jumlahPembeli <= 0) {
                System.out.println("Jumlah pembeli harus lebih dari 0!");
            }

        } while (jumlahPembeli <= 0);

        // Perulangan pembeli
        for (int pembeli = 1; pembeli <= jumlahPembeli; pembeli++) {

            int totalBelanja = 0;
            int barang = 1;

            System.out.println("\nPembeli ke-" + pembeli);

            // Perulangan barang
            do {
                System.out.println("\nBarang ke-" + barang);

                int harga;

                // Validasi harga
                do {
                    System.out.print("Masukkan harga barang: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Input salah! Masukkan angka.");
                        sc.next();
                        System.out.print("Masukkan harga barang: ");
                    }

                    harga = sc.nextInt();

                    if (harga < 0) {
                        System.out.println("Harga tidak boleh negatif!");
                    }

                } while (harga < 0);

                int jumlah;

                // Validasi jumlah barang
                do {
                    System.out.print("Masukkan jumlah barang: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Input salah! Masukkan angka.");
                        sc.next();
                        System.out.print("Masukkan jumlah barang: ");
                    }

                    jumlah = sc.nextInt();

                    if (jumlah <= 0) {
                        System.out.println("Jumlah barang harus lebih dari 0!");
                    }

                } while (jumlah <= 0);

                int subtotal = harga * jumlah;

                totalBelanja = totalBelanja + subtotal;

                System.out.println("Subtotal: Rp" + subtotal);

                barang++;

            } while (barang <= 2);

            System.out.println("Total belanja pembeli ke-" + pembeli
                    + ": Rp" + totalBelanja);

            totalSemua = totalSemua + totalBelanja;
        }

        System.out.println("\n======================");
        System.out.println("Total seluruh transaksi: Rp" + totalSemua);

        sc.close();
    }
}
