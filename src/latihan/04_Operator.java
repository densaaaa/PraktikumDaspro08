package latihan;

import java.util.Scanner;

class Operator {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PILIH STUDI KASUS OPERATOR");
        System.out.println("1. Operator aritmetika");
        System.out.println("2. Modulus: genap atau ganjil");
        System.out.println("3. Operator perbandingan");
        System.out.println("4. Operator logika AND");
        System.out.println("5. Operator logika OR");
        System.out.println("6. Operator logika NOT");
        System.out.println("7. Increment dan decrement");
        System.out.println("8. Prioritas operator");
        System.out.println("9. Rata-rata dan casting");
        System.out.println("10. Validasi kombinasi operator");

        int pilihan = bacaIntRentang("Pilih studi kasus (1-10): ", 1, 10);
        System.out.println();

        switch (pilihan) {
            case 1:
                kasus1Aritmetika();
                break;
            case 2:
                kasus2Modulus();
                break;
            case 3:
                kasus3Perbandingan();
                break;
            case 4:
                kasus4LogikaAnd();
                break;
            case 5:
                kasus5LogikaOr();
                break;
            case 6:
                kasus6LogikaNot();
                break;
            case 7:
                kasus7Increment();
                break;
            case 8:
                kasus8PrioritasOperator();
                break;
            case 9:
                kasus9RataRataCasting();
                break;
            case 10:
                kasus10ValidasiKombinasi();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    static void kasus1Aritmetika() {
        System.out.println("STUDI KASUS 1: OPERATOR ARITMETIKA");
        double angka1 = bacaDouble("Masukkan angka pertama: ");
        double angka2 = bacaDouble("Masukkan angka kedua: ");

        System.out.println("Penjumlahan: " + (angka1 + angka2));
        System.out.println("Pengurangan: " + (angka1 - angka2));
        System.out.println("Perkalian: " + (angka1 * angka2));
        if (angka2 != 0) {
            System.out.println("Pembagian: " + (angka1 / angka2));
            if (angka1 == Math.rint(angka1) && angka2 == Math.rint(angka2)) {
                System.out.println("Sisa bagi: " + ((long) angka1 % (long) angka2));
            }
        } else {
            System.out.println("Pembagian dan sisa bagi tidak dapat dilakukan dengan pembagi nol");
        }
    }

    static void kasus2Modulus() {
        System.out.println("STUDI KASUS 2: BILANGAN GENAP ATAU GANJIL");
        int angka = bacaInt("Masukkan bilangan bulat: ");
        if (angka % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }

    static void kasus3Perbandingan() {
        System.out.println("STUDI KASUS 3: OPERATOR PERBANDINGAN");
        double nilai = bacaDouble("Masukkan nilai: ");
        double batasLulus = bacaDouble("Masukkan batas kelulusan: ");

        System.out.println("Nilai >= batas kelulusan: " + (nilai >= batasLulus));
        System.out.println("Nilai == batas kelulusan: " + (nilai == batasLulus));
        System.out.println("Nilai != 0: " + (nilai != 0));
        System.out.println("Nilai < batas kelulusan: " + (nilai < batasLulus));
    }

    static void kasus4LogikaAnd() {
        System.out.println("STUDI KASUS 4: OPERATOR LOGIKA AND");
        int nilai = bacaIntRentang("Masukkan nilai (0-100): ", 0, 100);
        int kehadiran = bacaIntRentang("Masukkan kehadiran (0-100): ", 0, 100);
        boolean lulus = nilai >= 70 && kehadiran >= 80;
        System.out.println("Lulus (nilai minimal 70 dan kehadiran minimal 80%): " + lulus);
    }

    static void kasus5LogikaOr() {
        System.out.println("STUDI KASUS 5: OPERATOR LOGIKA OR");
        boolean mahasiswa = bacaYaTidak("Apakah pengguna mahasiswa? (y/n): ");
        boolean dosen = bacaYaTidak("Apakah pengguna dosen? (y/n): ");
        boolean bolehMasuk = mahasiswa || dosen;
        System.out.println("Boleh masuk: " + bolehMasuk);
    }

    static void kasus6LogikaNot() {
        System.out.println("STUDI KASUS 6: OPERATOR LOGIKA NOT");
        boolean akunDiblokir = bacaYaTidak("Apakah akun diblokir? (y/n): ");
        System.out.println("Akun aktif: " + !akunDiblokir);
    }

    static void kasus7Increment() {
        System.out.println("STUDI KASUS 7: INCREMENT DAN DECREMENT");
        int angka = bacaInt("Masukkan angka awal: ");
        System.out.println("Nilai awal: " + angka);
        angka++;
        System.out.println("Setelah increment (++): " + angka);
        angka--;
        System.out.println("Setelah decrement (--): " + angka);
    }

    static void kasus8PrioritasOperator() {
        System.out.println("STUDI KASUS 8: PRIORITAS OPERATOR");
        int angka1 = bacaInt("Masukkan angka pertama: ");
        int angka2 = bacaInt("Masukkan angka kedua: ");
        int angka3 = bacaInt("Masukkan angka ketiga: ");
        long hasilPrioritas = (long) angka1 + (long) angka2 * angka3;
        long hasilKurung = ((long) angka1 + angka2) * angka3;

        System.out.println(angka1 + " + " + angka2 + " * " + angka3 + " = " + hasilPrioritas);
        System.out.println("(" + angka1 + " + " + angka2 + ") * " + angka3 + " = " + hasilKurung);
    }

    static void kasus9RataRataCasting() {
        System.out.println("STUDI KASUS 9: RATA-RATA DAN CASTING");
        int nilai1 = bacaIntRentang("Masukkan nilai pertama (0-100): ", 0, 100);
        int nilai2 = bacaIntRentang("Masukkan nilai kedua (0-100): ", 0, 100);
        int nilai3 = bacaIntRentang("Masukkan nilai ketiga (0-100): ", 0, 100);
        double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;
        int rataBulat = (int) rataRata;

        System.out.println("Rata-rata desimal: " + rataRata);
        System.out.println("Rata-rata setelah casting ke int: " + rataBulat);
    }

    static void kasus10ValidasiKombinasi() {
        System.out.println("STUDI KASUS 10: VALIDASI KOMBINASI OPERATOR");
        boolean mahasiswaAktif = bacaYaTidak("Apakah mahasiswa aktif? (y/n): ");
        boolean punyaIzin = bacaYaTidak("Apakah memiliki izin? (y/n): ");
        boolean akunDiblokir = bacaYaTidak("Apakah akun diblokir? (y/n): ");
        boolean bolehAkses = mahasiswaAktif && (punyaIzin || !akunDiblokir);
        System.out.println("Boleh mengakses: " + bolehAkses);
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
                double nilai = input.nextDouble();
                if (!Double.isNaN(nilai) && !Double.isInfinite(nilai)) {
                    return nilai;
                }
            } else {
                input.next();
            }
            System.out.println("Masukkan angka yang valid");
        }
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
}
