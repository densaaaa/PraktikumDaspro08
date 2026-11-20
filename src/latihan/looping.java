
package Latihan;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

            System.out.println("\n===== HARI " + namaHari.toUpperCase() + " =====");

            do {

                System.out.println("\nPengunjung ke-" + pengunjung);
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();

                if (nama.equals("")) {
                    System.out.println("Nama tidak boleh kosong!");
                    continue;
                }

                if (nama.equalsIgnoreCase("skip")) {
                    System.out.println("Pengunjung dilewati!");
                    pengunjung++;
                    continue;
                }

                if (nama.equalsIgnoreCase("tutup")) {
                    System.out.println("Cafe ditutup hari ini!");
                    break;
                }

                System.out.println("\n===== MENU CAFE =====");
                System.out.println("1. Kopi Susu       - Rp15000");
                System.out.println("2. Matcha          - Rp20000");
                System.out.println("3. Roti Bakar      - Rp12000");
                System.out.println("4. Kentang Goreng  - Rp10000");

                System.out.print("Pilih menu: ");
                int pilihan = sc.nextInt();
                sc.nextLine();

                int harga = 0;

                if (pilihan == 1) {
                    harga = 15000;
                } else if (pilihan == 2) {
                    harga = 20000;
                } else if (pilihan == 3) {
                    harga = 12000;
                } else if (pilihan == 4) {
                    harga = 10000;
                } else {
                    System.out.println("Menu tidak tersedia!");
                    pengunjung++;
                    continue;
                }

                totalPendapatan += harga;
                jumlahPengunjung++;

                System.out.println("Pesanan berhasil!");
                System.out.println("Harga: Rp" + harga);

                pengunjung++;

            } while (pengunjung <= 5);

            totalPengunjung += jumlahPengunjung;

            // MENYIMPAN JUMLAH PENGUNJUNG
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

        // LAPORAN
        System.out.println("\n===== LAPORAN PENGUNJUNG CAFE =====");

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

        System.out.println("Pengunjung terbanyak: " + pengunjungTerbanyak);
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
