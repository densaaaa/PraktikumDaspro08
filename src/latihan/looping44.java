
package Latihan;

import java.util.Scanner;

public class looping44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama cafe: ");
        String namaCafe = sc.nextLine();

        int totalPendapatan = 0;
        int totalPengunjung = 0;
        int pengunjungTerbanyak = 0;

        int senin = 0;
        int selasa = 0;
        int rabu = 0;
        int kamis = 0;
        int jumat = 0;
        int sabtu = 0;
        int minggu = 0;

        int hariNaik = 1;

        for (; hariNaik <= 7; hariNaik++) {

            int pengunjung = 1;
            int jumlahPengunjung = 0;
            String namaHari = "";

            if (hariNaik == 1) {
                namaHari = "Senin";
            } else if (hariNaik == 2) {
                namaHari = "Selasa";
            } else if (hariNaik == 3) {
                namaHari = "Rabu";
            } else if (hariNaik == 4) {
                namaHari = "Kamis";
            } else if (hariNaik == 5) {
                namaHari = "Jumat";
            } else if (hariNaik == 6) {
                namaHari = "Sabtu";
            } else if (hariNaik == 7) {
                namaHari = "Minggu";
            }

            System.out.println("\n===== " + namaCafe.toUpperCase()
                    + " - HARI " + namaHari.toUpperCase() + " =====");

            do {

                System.out.println("\nPENGUNJUNG KE-" + pengunjung);

                int totalPesanan = 0;
                int jumlahPesanan = 0;

                boolean selesai = false;

                do {

                    System.out.print("\nMasukkan makanan/minuman (stop untuk selesai): ");
                    String makanan = sc.nextLine();

                    if (makanan.equalsIgnoreCase("stop")) {
                        selesai = true;
                        break;
                    }

                    if (makanan.equalsIgnoreCase("skip")) {
                        System.out.println("Pengunjung dilewati!");
                        selesai = true;
                        pengunjung--;
                        break;
                    }

                    if (makanan.equalsIgnoreCase("tutup")) {
                        System.out.println("Cafe ditutup hari ini!");
                        selesai = true;
                        pengunjung = 6;
                        break;
                    }

                    System.out.print("Masukkan harga: Rp");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    totalPesanan += harga;
                    jumlahPesanan++;

                    System.out.println("Pesanan berhasil ditambahkan!");

                } while (!selesai);

                if (pengunjung == 6) {
                    break;
                }

                if (jumlahPesanan > 0) {

                    totalPendapatan += totalPesanan;
                    jumlahPengunjung++;

                    System.out.println("\n===== TOTAL PESANAN =====");
                    System.out.println("Jumlah menu: " + jumlahPesanan);
                    System.out.println("Total harga: Rp" + totalPesanan);

                }

                pengunjung++;

            } while (pengunjung <= 1);

            totalPengunjung += jumlahPengunjung;

            if (hariNaik == 1) {
                senin = jumlahPengunjung;
            } else if (hariNaik == 2) {
                selasa = jumlahPengunjung;
            } else if (hariNaik == 3) {
                rabu = jumlahPengunjung;
            } else if (hariNaik == 4) {
                kamis = jumlahPengunjung;
            } else if (hariNaik == 5) {
                jumat = jumlahPengunjung;
            } else if (hariNaik == 6) {
                sabtu = jumlahPengunjung;
            } else if (hariNaik == 7) {
                minggu = jumlahPengunjung;
            }

            if (jumlahPengunjung > pengunjungTerbanyak) {
                pengunjungTerbanyak = jumlahPengunjung;
            }

            System.out.println("\nTotal pengunjung " + namaHari
                    + ": " + jumlahPengunjung);
        }

        System.out.println("\n===== LAPORAN "
                + namaCafe.toUpperCase() + " =====");

        System.out.println("Senin  : " + senin);
        System.out.println("Selasa : " + selasa);
        System.out.println("Rabu   : " + rabu);
        System.out.println("Kamis  : " + kamis);
        System.out.println("Jumat  : " + jumat);
        System.out.println("Sabtu  : " + sabtu);
        System.out.println("Minggu : " + minggu);

        System.out.println("\n===== HARI PALING RAMAI =====");

        if (senin == pengunjungTerbanyak) {
            System.out.println("Senin");
        }
        if (selasa == pengunjungTerbanyak) {
            System.out.println("Selasa");
        }
        if (rabu == pengunjungTerbanyak) {
            System.out.println("Rabu");
        }
        if (kamis == pengunjungTerbanyak) {
            System.out.println("Kamis");
        }
        if (jumat == pengunjungTerbanyak) {
            System.out.println("Jumat");
        }
        if (sabtu == pengunjungTerbanyak) {
            System.out.println("Sabtu");
        }
        if (minggu == pengunjungTerbanyak) {
            System.out.println("Minggu");
        }

        System.out.println("Pengunjung terbanyak: "
                + pengunjungTerbanyak);
        System.out.println("Total pengunjung: " + totalPengunjung);
        System.out.println("Total pendapatan: Rp" + totalPendapatan);

        System.out.print("\nApakah ingin membuka cabang cafe lagi? (ya/tidak): ");
        String keputusan = sc.nextLine();

        if (keputusan.equalsIgnoreCase("ya")) {
            System.out.println("Cafe akan membuka cabang baru!");
        } else if (keputusan.equalsIgnoreCase("tidak")) {
            System.out.println("Cafe tidak membuka cabang baru!");
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}
