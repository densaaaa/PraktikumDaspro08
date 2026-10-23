package Latihan;

import java.util.Scanner;

public class Anjay {

    

    public static void main(String[] args) {
        p3();
    }
static Scanner sc = new Scanner(System.in);
    static void p1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);

        int a = 8;
        int b = 5;
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Sisa bagi 8 % 5: " + (a % b));
    }

    static void p2() {
        int nilai = 85;

        if (nilai >= 80) {
            System.out.println("Nilai bagus");
        }

        if (nilai >= 80) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }

        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 75) {
            System.out.println("B");
        } else if (nilai >= 65) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

    static void p3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.print("Masukkan kehadiran (0-100): ");
        int kehadiran = input.nextInt();

        if (nilai >= 70) {
            if (kehadiran >= 80) {
                System.out.println("Lulus");
            } else {
                System.out.println("Nilai cukup, tetapi kehadiran kurang");
            }
        } else {
            System.out.println("Tidak lulus karena nilai kurang");
        }
    }

    static void p4() {
        boolean mahasiswaAktif = true;
        boolean sedangDisanksi = false;
        boolean punyaIzinDosen = true;
        boolean asistenLab = false;

        if (mahasiswaAktif) {
            if (!sedangDisanksi) {
                if (punyaIzinDosen || asistenLab) {
                    System.out.println("Akses lab diizinkan");
                } else {
                    System.out.println("Perlu izin dosen atau status asisten lab");
                }
            } else {
                System.out.println("Akses ditolak karena sedang disanksi");
            }
        } else {
            System.out.println("Akses ditolak: mahasiswa tidak aktif");
        }
    }

    static void p5() {
        boolean mahasiswa = true;
        boolean dosen = false;
        boolean akunDiblokir = false;

        if (mahasiswa || dosen) {
            if (!akunDiblokir) {
                System.out.println("Akses Wi-Fi diizinkan");
            } else {
                System.out.println("Akses Wi-Fi ditolak: akun diblokir");
            }
        } else {
            System.out.println("Akses Wi-Fi ditolak: bukan mahasiswa/dosen");
        }
    }

    static void p6() {
        int dana = 2_000_000;
        String kategori = "BELMAWA";

        if (dana > 0) {
            if (kategori.equals("BELMAWA")) {
                System.out.println("Proses prestasi BELMAWA");
            } else if (kategori.equals("BAKORMA")) {
                System.out.println("Proses prestasi BAKORMA");
            } else if (kategori.equals("MANDIRI")) {
                System.out.println("Proses prestasi MANDIRI");
            } else if (kategori.equals("PKM")) {
                System.out.println("Proses PKM");
            } else {
                System.out.println("Kategori lainnya");
            }
        } else {
            System.out.println("Dana tidak valid");
        }
    }

    static void p7() {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah bimbingan P1: ");
        int p1 = input.nextInt();

        System.out.print("Jumlah bimbingan P2: ");
        int p2 = input.nextInt();

        if (p1 >= 8) {
            if (p2 >= 4) {
                System.out.println("Syarat bimbingan terpenuhi");
            } else {
                System.out.println("Bimbingan P2 belum memenuhi minimum 4");
            }
        } else {
            System.out.println("Bimbingan P1 belum memenuhi minimum 8");
        }
    }

    static void p8() {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih kategori (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("BELMAWA");
                break;
            case 2:
                System.out.println("BAKORMA");
                break;
            case 3:
                System.out.println("MANDIRI");
                break;
            case 4:
                System.out.println("PKM");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    static void p9() {
        int nilai = 78;
        String hasil = (nilai >= 70) ? "Lulus" : "Tidak lulus";
        System.out.println(hasil);
    }

    static void p10() {
        Scanner input = new Scanner(System.in);

        System.out.print("Total belanja: Rp");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (totalBelanja >= 100_000) {
            diskon = totalBelanja * 0.10;
        } else if (totalBelanja >= 50_000) {
            diskon = totalBelanja * 0.05;
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total bayar: Rp" + totalBayar);

        int totalBulat = (int) totalBayar;
        System.out.println("Total setelah casting int: Rp" + totalBulat);
    }

    static void p11() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor: ");
        int nomor = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println(nomor + " - " + nama);

        String kategori = "PKM";
        if (kategori.equals("PKM")) {
            System.out.println("Kategori PKM");
        }

    }

    static void p12() {
        for (int baris = 1; baris <= 4; baris++) {
            for (int kolom = 1; kolom <= 4; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int baris = 1; baris <= 5; baris++) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int baris = 1; baris <= 5; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.print((baris * kolom) + "\t");
            }
            System.out.println();
        }
    }

}
