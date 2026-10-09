package Jobsheet4;

import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, kelas;
        long nim;
        int nomorAbsen;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan nim: ");
        nim = sc.nextLong();
        sc.nextLine();
        System.out.println("Masukkan kelas");
        kelas = sc.nextLine();
        System.out.println("Masukkan Nomor Absen: ");
        nomorAbsen = sc.nextInt();
        System.out.println("Masukkan Nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3.0;

        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM" + nim + ") " + " kelas " + kelas + " nomer absen " + nomorAbsen );
        System.out.println("Nilai akhir angka: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

    }
}
