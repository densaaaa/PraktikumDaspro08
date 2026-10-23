package latihan;

import java.util.Scanner;

class IfElse {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PILIH STUDI KASUS IF-ELSE");
        System.out.println("1. Kelulusan nilai");
        System.out.println("2. Bilangan genap atau ganjil");
        System.out.println("3. Positif, negatif, atau nol");
        System.out.println("4. Batas usia");
        System.out.println("5. Harga setelah diskon");
        System.out.println("6. Kecukupan saldo");
        System.out.println("7. Kategori suhu");
        System.out.println("8. Kehadiran");
        System.out.println("9. Biaya parkir");
        System.out.println("10. Angka terbesar");

        int pilihan = bacaIntRentang("Pilih studi kasus (1-10): ", 1, 10);
        System.out.println();

        switch (pilihan) {
            case 1:
                kasus1Kelulusan();
                break;
            case 2:
                kasus2GenapGanjil();
                break;
            case 3:
                kasus3PositifNegatif();
                break;
            case 4:
                kasus4Usia();
                break;
            case 5:
                kasus5Diskon();
                break;
            case 6:
                kasus6Saldo();
                break;
            case 7:
                kasus7Suhu();
                break;
            case 8:
                kasus8Kehadiran();
                break;
            case 9:
                kasus9Parkir();
                break;
            case 10:
                kasus10Terbesar();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    static void kasus1Kelulusan() {
        System.out.println("STUDI KASUS 1: KELULUSAN NILAI");
        int nilai = bacaIntRentang("Masukkan nilai (0-100): ", 0, 100);
        if (nilai >= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }
    }

    static void kasus2GenapGanjil() {
        System.out.println("STUDI KASUS 2: BILANGAN GENAP ATAU GANJIL");
        int angka = bacaInt("Masukkan bilangan bulat: ");
        if (angka % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }

    static void kasus3PositifNegatif() {
        System.out.println("STUDI KASUS 3: BILANGAN POSITIF, NEGATIF, ATAU NOL");
        int angka = bacaInt("Masukkan bilangan bulat: ");
        if (angka > 0) {
            System.out.println("Bilangan positif");
        } else if (angka < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Bilangan nol");
        }
    }

    static void kasus4Usia() {
        System.out.println("STUDI KASUS 4: BATAS USIA");
        int usia = bacaIntRentang("Masukkan usia: ", 0, 120);
        if (usia >= 17) {
            System.out.println("Memenuhi batas usia");
        } else {
            System.out.println("Belum memenuhi batas usia");
        }
    }

    static void kasus5Diskon() {
        System.out.println("STUDI KASUS 5: HARGA SETELAH DISKON");
        double belanja = bacaDoubleRentang("Total belanja (Rp): ", 0, 1_000_000_000);
        double diskon;
        if (belanja >= 500_000) {
            diskon = 0.15;
        } else if (belanja >= 100_000) {
            diskon = 0.10;
        } else {
            diskon = 0;
        }
        double nilaiDiskon = belanja * diskon;
        double total = belanja - nilaiDiskon;
        System.out.printf("Diskon: %.0f%%%n", diskon * 100);
        System.out.printf("Nilai diskon: Rp%.2f%n", nilaiDiskon);
        System.out.printf("Total bayar: Rp%.2f%n", total);
    }

    static void kasus6Saldo() {
        System.out.println("STUDI KASUS 6: CEK SALDO DAN PENARIKAN");
        double saldo = bacaDoubleRentang("Masukkan saldo (Rp): ", 0, 1_000_000_000);
        double penarikan = bacaDoubleRentang("Jumlah penarikan (Rp): ", 0.01, 1_000_000_000);
        if (saldo >= penarikan) {
            double sisaSaldo = saldo - penarikan;
            if (sisaSaldo >= 50_000) {
                System.out.printf("Penarikan berhasil. Sisa saldo: Rp%.2f%n", sisaSaldo);
            } else if (sisaSaldo > 0) {
                System.out.printf("Penarikan berhasil, saldo di bawah batas aman: Rp%.2f%n", sisaSaldo);
            } else {
                System.out.println("Penarikan berhasil. Saldo habis");
            }
        } else {
            System.out.println("Penarikan gagal: saldo tidak cukup");
        }
    }

    static void kasus7Suhu() {
        System.out.println("STUDI KASUS 7: KATEGORI SUHU");
        double suhu = bacaDoubleRentang("Masukkan suhu dalam Celsius: ", -100, 100);
        if (suhu >= 35) {
            System.out.println("Cuaca sangat panas");
        } else if (suhu >= 30) {
            System.out.println("Cuaca panas");
        } else if (suhu >= 20) {
            System.out.println("Cuaca sejuk");
        } else {
            System.out.println("Cuaca dingin");
        }
    }

    static void kasus8Kehadiran() {
        System.out.println("STUDI KASUS 8: SYARAT KEHADIRAN");
        int hadir = bacaIntRentang("Persentase kehadiran (0-100): ", 0, 100);
        int nilai = bacaIntRentang("Nilai akhir (0-100): ", 0, 100);
        if (hadir >= 80) {
            if (nilai >= 70) {
                System.out.println("Memenuhi syarat kehadiran dan nilai");
            } else {
                System.out.println("Kehadiran memenuhi, tetapi nilai belum lulus");
            }
        } else {
            System.out.println("Kehadiran kurang dari batas minimum 80%");
        }
    }

    static void kasus9Parkir() {
        System.out.println("STUDI KASUS 9: BIAYA PARKIR");
        System.out.print("Jenis kendaraan (MOTOR/MOBIL): ");
        String jenis = input.next().toUpperCase();
        int jam = bacaIntRentang("Lama parkir dalam jam (1-24): ", 1, 24);
        int biaya;
        if (jenis.equals("MOTOR")) {
            if (jam <= 2) {
                biaya = 2_000;
            } else {
                biaya = 2_000 + (jam - 2) * 1_000;
            }
            if (biaya > 15_000) {
                biaya = 15_000;
            }
        } else if (jenis.equals("MOBIL")) {
            if (jam <= 2) {
                biaya = 5_000;
            } else {
                biaya = 5_000 + (jam - 2) * 2_000;
            }
            if (biaya > 50_000) {
                biaya = 50_000;
            }
        } else {
            System.out.println("Jenis kendaraan tidak tersedia");
            return;
        }
        System.out.println("Biaya parkir: Rp" + biaya);
    }

    static void kasus10Terbesar() {
        System.out.println("STUDI KASUS 10: ANGKA TERBESAR");
        int angkaPertama = bacaInt("Masukkan angka pertama: ");
        int angkaKedua = bacaInt("Masukkan angka kedua: ");
        if (angkaPertama > angkaKedua) {
            System.out.println("Angka terbesar: " + angkaPertama);
        } else if (angkaKedua > angkaPertama) {
            System.out.println("Angka terbesar: " + angkaKedua);
        } else {
            System.out.println("Kedua angka bernilai sama: " + angkaPertama);
        }
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
}
