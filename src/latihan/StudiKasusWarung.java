package latihan;

import java.util.Scanner;

public class StudiKasusWarung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data barang (3 array paralel: indeks yang sama = barang yang sama)
        String[] namaBarang = {
            "Beras 1 kg", "Minyak Goreng 1 L", "Gula 1 kg", "Telur 1 kg", "Kopi Sachet"
        };
        int[] harga = {14000, 18000, 16000, 28000, 2000};
        int[] stok  = {50, 30, 40, 20, 200};
        int[] jumlahBeli = new int[namaBarang.length]; // mencatat belanjaan

        final String PIN_BENAR = "1234";
        final int MAKS_PERCOBAAN = 3;

                System.out.println("=== WARUNG BERKAH - LOGIN KASIR ===");
        int percobaan = 0;
        boolean loginBerhasil = false;

        while (!loginBerhasil && percobaan < MAKS_PERCOBAAN) {
            System.out.print("Masukkan PIN: ");
            String pin = input.next();
            percobaan++;

            if (pin.equals(PIN_BENAR)) {
                loginBerhasil = true;
            } else {
                System.out.println("PIN salah. Sisa percobaan: " + (MAKS_PERCOBAAN - percobaan));
            }
        }

        if (!loginBerhasil) {
            System.out.println("Akun terkunci. Hubungi pemilik warung.");
            input.close();
            return;
        }
        System.out.println("Login berhasil. Selamat bekerja!\n");

                System.out.println("=== DAFTAR BARANG ===");
        System.out.printf("%-4s %-20s %10s %6s%n", "No", "Nama Barang", "Harga", "Stok");
        System.out.println("-------------------------------------------");

        long totalNilaiStok = 0;
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.printf("%-4d %-20s %10d %6d%n", (i + 1), namaBarang[i], harga[i], stok[i]);
            totalNilaiStok += (long) harga[i] * stok[i];
        }
        System.out.println("-------------------------------------------");
        System.out.println("Total nilai stok warung: Rp" + totalNilaiStok + "\n");

                System.out.println("=== TRANSAKSI ===");
        long totalBelanja = 0;

        System.out.print("Nomor barang (1-" + namaBarang.length + ", 0 = selesai): ");
        int pilihan = input.nextInt();

        while (pilihan != 0) {
            if (pilihan < 1 || pilihan > namaBarang.length) {
                System.out.println("Nomor barang tidak valid.");
            } else {
                int idx = pilihan - 1;
                int sisaStok = stok[idx] - jumlahBeli[idx];

                System.out.print("Jumlah " + namaBarang[idx] + ": ");
                int jumlah = input.nextInt();

                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0.");
                } else if (jumlah > sisaStok) {
                    System.out.println("Stok tidak cukup! Sisa stok: " + sisaStok);
                } else {
                    jumlahBeli[idx] += jumlah;
                    totalBelanja += (long) harga[idx] * jumlah;
                    System.out.println("Ditambahkan. Subtotal sementara: Rp" + totalBelanja);
                }
            }

            // Baca input lagi. Ini yang membuat loop bisa berhenti.
            System.out.print("Nomor barang (1-" + namaBarang.length + ", 0 = selesai): ");
            pilihan = input.nextInt();
        }

                System.out.println("\n=========== STRUK BELANJA ===========");
        boolean adaBelanjaan = false;

        for (int i = 0; i < namaBarang.length; i++) {
            if (jumlahBeli[i] > 0) {
                adaBelanjaan = true;
                long subtotal = (long) harga[i] * jumlahBeli[i];
                System.out.printf("%-18s %3d x %6d = %9d%n",
                        namaBarang[i], jumlahBeli[i], harga[i], subtotal);
                stok[i] -= jumlahBeli[i]; // kurangi stok
            }
        }

        if (!adaBelanjaan) {
            System.out.println("Tidak ada barang yang dibeli.");
        } else {
            double diskon = (totalBelanja >= 100000) ? totalBelanja * 0.05 : 0;
            double totalBayar = totalBelanja - diskon;

            System.out.println("-------------------------------------");
            System.out.printf("Total belanja : Rp%,.0f%n", (double) totalBelanja);
            System.out.printf("Diskon 5%%     : Rp%,.0f%n", diskon);
            System.out.printf("Total bayar   : Rp%,.0f%n", totalBayar);

            System.out.println("\n--- Sisa Stok ---");
            for (int i = 0; i < namaBarang.length; i++) {
                System.out.println(namaBarang[i] + " : " + stok[i]);
            }
        }

        System.out.println("\nTerima kasih. Sampai jumpa!");
        input.close();
    }
}