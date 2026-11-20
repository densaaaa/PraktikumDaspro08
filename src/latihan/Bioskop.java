package Latihan;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahStudio;

        do {
            System.out.print("Masukkan jumlah studio: ");

            while (!sc.hasNextInt()) {
                System.out.println("Input salah! Masukkan angka.");
                sc.next();
                System.out.print("Masukkan jumlah studio: ");
            }

            jumlahStudio = sc.nextInt();

            if (jumlahStudio <= 0) {
                System.out.println("Jumlah studio harus lebih dari 0!");
            }

        } while (jumlahStudio <= 0);

        int totalSemua = 0;
        int pendapatanTertinggi = 0;
        int studioTertinggi = 0;

        for (int studio = 1; studio <= jumlahStudio; studio++) {

            int jumlahFilm;

            do {
                System.out.print("\nMasukkan jumlah film studio ke-" + studio + ": ");

                while (!sc.hasNextInt()) {
                    System.out.println("Input salah! Masukkan angka.");
                    sc.next();
                    System.out.print("Masukkan jumlah film: ");
                }

                jumlahFilm = sc.nextInt();

                if (jumlahFilm <= 0) {
                    System.out.println("Jumlah film harus lebih dari 0!");
                }

            } while (jumlahFilm <= 0);

            int totalStudio = 0;

            for (int film = 1; film <= jumlahFilm; film++) {

                System.out.println("\nStudio ke-" + studio);
                System.out.println("Film ke-" + film);

                int harga;

                do {
                    System.out.print("Masukkan harga tiket: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Input salah! Masukkan angka.");
                        sc.next();
                        System.out.print("Masukkan harga tiket: ");
                    }

                    harga = sc.nextInt();

                    if (harga <= 0) {
                        System.out.println("Harga harus lebih dari 0!");
                    }

                } while (harga <= 0);

                int jumlahTiket;

                do {
                    System.out.print("Masukkan jumlah tiket terjual: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Input salah! Masukkan angka.");
                        sc.next();
                        System.out.print("Masukkan jumlah tiket: ");
                    }

                    jumlahTiket = sc.nextInt();

                    if (jumlahTiket < 0) {
                        System.out.println("Jumlah tiket tidak boleh negatif!");
                    }

                } while (jumlahTiket < 0);

                double diskon = 0;

                if (jumlahTiket > 10) {
                    diskon = 0.05;
                }

                double hargaSetelahDiskon = harga - (harga * diskon);

                double pendapatan = hargaSetelahDiskon * jumlahTiket;

                totalStudio += pendapatan;

                System.out.println("Diskon: " + (diskon * 100) + "%");
                System.out.println("Pendapatan film: Rp" + pendapatan);
            }

            System.out.println("\nTotal pendapatan studio ke-" + studio
                    + ": Rp" + totalStudio);

            totalSemua += totalStudio;

            if (studio == 1 || totalStudio > pendapatanTertinggi) {
                pendapatanTertinggi = totalStudio;
                studioTertinggi = studio;
            }
        } 

        System.out.println("\n========== HASIL AKHIR ==========");
        System.out.println("Total seluruh pendapatan: Rp" + totalSemua);
        System.out.println("Studio dengan pendapatan tertinggi: Studio ke-" + studioTertinggi);
        System.out.println("Pendapatan tertinggi: Rp" + pendapatanTertinggi);

        sc.close();
    }
}
