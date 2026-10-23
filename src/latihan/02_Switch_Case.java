package latihan;

import java.util.Scanner;

class SwitchCase {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PILIH STUDI KASUS SWITCH-CASE");
        System.out.println("1. Hari");
        System.out.println("2. Kalkulator");
        System.out.println("3. Kategori prestasi");
        System.out.println("4. Menu kantin");
        System.out.println("5. Konversi nilai");
        System.out.println("6. Biaya parkir kendaraan");
        System.out.println("7. Paket internet");
        System.out.println("8. Bulan");
        System.out.println("9. Diskon member");
        System.out.println("10. Transportasi");

        int pilihan = bacaIntRentang("Pilih studi kasus (1-10): ", 1, 10);

        switch (pilihan) {
            case 1:
                kasus1Hari();
                break;
            case 2:
                kasus2Kalkulator();
                break;
            case 3:
                kasus3Prestasi();
                break;
            case 4:
                kasus4Kantin();
                break;
            case 5:
                kasus5Nilai();
                break;
            case 6:
                kasus6Kendaraan();
                break;
            case 7:
                kasus7Internet();
                break;
            case 8:
                kasus8Bulan();
                break;
            case 9:
                kasus9Member();
                break;
            case 10:
                kasus10Transportasi();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    static void kasus1Hari() {
        tampilkanJudul("STUDI KASUS 1: NAMA HARI");
        int hari = bacaIntRentang("Masukkan nomor hari (1-7): ", 1, 7);

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Nomor hari tidak valid");
        }
    }

    static void kasus2Kalkulator() {
        tampilkanJudul("STUDI KASUS 2: KALKULATOR");
        double angka1 = bacaDouble("Masukkan angka pertama: ");
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();
        double angka2 = bacaDouble("Masukkan angka kedua: ");

        switch (operator) {
            case "+":
                System.out.println("Hasil: " + (angka1 + angka2));
                break;
            case "-":
                System.out.println("Hasil: " + (angka1 - angka2));
                break;
            case "*":
                System.out.println("Hasil: " + (angka1 * angka2));
                break;
            case "/":
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Tidak bisa membagi dengan nol");
                }
                break;
            default:
                System.out.println("Operator tidak dikenal");
        }
    }

    static void kasus3Prestasi() {
        tampilkanJudul("STUDI KASUS 3: KATEGORI PRESTASI");
        System.out.print("Masukkan kategori (BELMAWA/BAKORMA/MANDIRI/PKM): ");
        String kategori = input.next().toUpperCase();

        switch (kategori) {
            case "BELMAWA":
                System.out.println("Prestasi BELMAWA");
                break;
            case "BAKORMA":
                System.out.println("Prestasi BAKORMA");
                break;
            case "MANDIRI":
                System.out.println("Prestasi MANDIRI");
                break;
            case "PKM":
                System.out.println("Proses PKM");
                break;
            default:
                System.out.println("Kategori prestasi tidak dikenal");
        }
    }

    static void kasus4Kantin() {
        tampilkanJudul("STUDI KASUS 4: PEMESANAN KANTIN");
        System.out.println("1. Nasi goreng - Rp15.000");
        System.out.println("2. Mi ayam - Rp12.000");
        System.out.println("3. Soto - Rp14.000");
        int menu = bacaIntRentang("Pilih menu (1-3): ", 1, 3);
        int jumlah = bacaIntRentang("Jumlah pesanan: ", 1, 100);
        String namaMenu;
        int harga;

        switch (menu) {
            case 1:
                namaMenu = "Nasi goreng";
                harga = 15_000;
                break;
            case 2:
                namaMenu = "Mi ayam";
                harga = 12_000;
                break;
            case 3:
                namaMenu = "Soto";
                harga = 14_000;
                break;
            default:
                System.out.println("Menu tidak tersedia");
                return;
        }

        System.out.println("Pesanan: " + namaMenu + " x " + jumlah);
        System.out.println("Total: Rp" + (harga * jumlah));
    }

    static void kasus5Nilai() {
        tampilkanJudul("STUDI KASUS 5: KONVERSI NILAI HURUF");
        System.out.print("Masukkan nilai huruf (A-E): ");
        String masukan = input.next().toUpperCase();

        if (masukan.length() != 1) {
            System.out.println("Nilai tidak valid");
            return;
        }

        char nilai = masukan.charAt(0);
        switch (nilai) {
            case 'A':
                System.out.println("Sangat baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Perlu perbaikan");
                break;
            case 'E':
                System.out.println("Tidak lulus");
                break;
            default:
                System.out.println("Nilai tidak valid");
        }
    }

    static void kasus6Kendaraan() {
        tampilkanJudul("STUDI KASUS 6: BIAYA PARKIR KENDARAAN");
        System.out.print("Jenis kendaraan (MOTOR/MOBIL/BUS): ");
        String jenis = input.next().toUpperCase();
        int jam = bacaIntRentang("Lama parkir dalam jam: ", 1, 24);
        int tarifAwal;
        int tarifTambahan;
        int batasMaksimum;

        switch (jenis) {
            case "MOTOR":
                tarifAwal = 2_000;
                tarifTambahan = 1_000;
                batasMaksimum = 15_000;
                break;
            case "MOBIL":
                tarifAwal = 5_000;
                tarifTambahan = 2_000;
                batasMaksimum = 50_000;
                break;
            case "BUS":
                tarifAwal = 10_000;
                tarifTambahan = 4_000;
                batasMaksimum = 100_000;
                break;
            default:
                System.out.println("Jenis kendaraan tidak dikenal");
                return;
        }

        int biaya = tarifAwal + Math.max(0, jam - 2) * tarifTambahan;
        if (biaya > batasMaksimum) {
            biaya = batasMaksimum;
        }
        System.out.println("Biaya parkir " + jenis + " selama " + jam + " jam: Rp" + biaya);
    }

    static void kasus7Internet() {
        tampilkanJudul("STUDI KASUS 7: PEMBELIAN PAKET INTERNET");
        System.out.println("1. 5 GB - Rp25.000");
        System.out.println("2. 15 GB - Rp50.000");
        System.out.println("3. 30 GB - Rp80.000");
        System.out.println("4. 50 GB - Rp120.000");
        int paket = bacaIntRentang("Pilih paket (1-4): ", 1, 4);
        boolean pelangganBaru = bacaYaTidak("Apakah pembeli pelanggan baru? (y/n): ");
        int kuota;
        int harga;

        switch (paket) {
            case 1:
                kuota = 5;
                harga = 25_000;
                break;
            case 2:
                kuota = 15;
                harga = 50_000;
                break;
            case 3:
                kuota = 30;
                harga = 80_000;
                break;
            case 4:
                kuota = 50;
                harga = 120_000;
                break;
            default:
                System.out.println("Paket tidak tersedia");
                return;
        }

        if (pelangganBaru) {
            harga -= harga * 10 / 100;
        }
        System.out.println("Paket " + kuota + " GB berhasil dipilih");
        System.out.println("Total pembayaran: Rp" + harga);
    }

    static void kasus8Bulan() {
        tampilkanJudul("STUDI KASUS 8: NAMA BULAN");
        int bulan = bacaIntRentang("Masukkan nomor bulan (1-12): ", 1, 12);

        switch (bulan) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;
            default:
                System.out.println("Nomor bulan tidak valid");
        }
    }

    static void kasus9Member() {
        tampilkanJudul("STUDI KASUS 9: DISKON KEANGGOTAAN");
        System.out.print("Jenis member (BRONZE/SILVER/GOLD): ");
        String member = input.next().toUpperCase();
        double belanja = bacaDoubleRentang("Total belanja (Rp): ", 0, 1_000_000_000);
        double diskonPersen;

        switch (member) {
            case "BRONZE":
                diskonPersen = 3;
                break;
            case "SILVER":
                diskonPersen = 5;
                break;
            case "GOLD":
                diskonPersen = 10;
                break;
            default:
                diskonPersen = 0;
        }

        if (belanja >= 500_000) {
            diskonPersen += 5;
        }

        double nilaiDiskon = belanja * diskonPersen / 100;
        System.out.printf("Diskon: %.0f%%%n", diskonPersen);
        System.out.printf("Nilai diskon: Rp%.2f%n", nilaiDiskon);
        System.out.printf("Total bayar: Rp%.2f%n", belanja - nilaiDiskon);
    }

    static void kasus10Transportasi() {
        tampilkanJudul("STUDI KASUS 10: PEMILIHAN TRANSPORTASI");
        System.out.println("1. Bus - Rp5.000");
        System.out.println("2. Kereta - Rp10.000");
        System.out.println("3. Pesawat - Rp500.000");
        System.out.println("4. Ojek online - Rp15.000");
        int pilihan = bacaIntRentang("Pilih transportasi (1-4): ", 1, 4);
        int jumlahTiket = bacaIntRentang("Jumlah tiket: ", 1, 20);
        String transportasi;
        int harga;

        switch (pilihan) {
            case 1:
                transportasi = "Bus";
                harga = 5_000;
                break;
            case 2:
                transportasi = "Kereta";
                harga = 10_000;
                break;
            case 3:
                transportasi = "Pesawat";
                harga = 500_000;
                break;
            case 4:
                transportasi = "Ojek online";
                harga = 15_000;
                break;
            default:
                System.out.println("Pilihan transportasi tidak valid");
                return;
        }

        double total = (double) harga * jumlahTiket;
        if (pilihan == 3) {
            if (jumlahTiket >= 3) {
                total *= 0.90;
                System.out.println("Diskon rombongan 10% diterapkan");
            } else {
                System.out.println("Diskon rombongan berlaku mulai 3 tiket");
            }
        }
        System.out.println("Transportasi: " + transportasi);
        System.out.printf("Total pembayaran: Rp%.2f%n", total);
    }

    static int bacaInt(String pesan) {
        while (true) {
            System.out.print(pesan);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            System.out.println("Masukkan bilangan bulat yang valid");
            input.next();
        }
    }

    static int bacaIntRentang(String pesan, int minimum, int maksimum) {
        int nilai;
        do {
            nilai = bacaInt(pesan);
            if (nilai < minimum || nilai > maksimum) {
                System.out.println("Nilai harus antara " + minimum + " dan " + maksimum);
            }
        } while (nilai < minimum || nilai > maksimum);
        return nilai;
    }

    static double bacaDouble(String pesan) {
        while (true) {
            System.out.print(pesan);
            if (input.hasNextDouble()) {
                return input.nextDouble();
            }
            System.out.println("Masukkan angka yang valid");
            input.next();
        }
    }

    static double bacaDoubleRentang(String pesan, double minimum, double maksimum) {
        double nilai;
        do {
            nilai = bacaDouble(pesan);
            if (Double.isNaN(nilai) || Double.isInfinite(nilai)
                    || nilai < minimum || nilai > maksimum) {
                System.out.println("Nilai harus antara " + minimum + " dan " + maksimum);
            }
        } while (Double.isNaN(nilai) || Double.isInfinite(nilai)
                || nilai < minimum || nilai > maksimum);
        return nilai;
    }

    static boolean bacaYaTidak(String pesan) {
        while (true) {
            System.out.print(pesan);
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("y")) {
                return true;
            }
            if (jawaban.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Jawab dengan y atau n");
        }
    }

    static void tampilkanJudul(String judul) {
        System.out.println();
        System.out.println("========================================");
        System.out.println(judul);
        System.out.println("========================================");
        System.out.println();
    }
}
