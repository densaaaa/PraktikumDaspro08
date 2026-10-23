package Jobsheet6;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P = 8;
        int minPemrograman = 75 + (P % 11);
        int minWawancara = 70 + (P % 11);

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Mahasiswa aktif (true/false): ");
        boolean aktif = input.nextBoolean();
        System.out.print("Ada sanksi (true/false): ");
        boolean sanksi = input.nextBoolean();
        System.out.print("Nilai Dasar Pemrograman: ");
        int nilai = input.nextInt();
        System.out.print("Punya sertifikat (true/false): ");
        boolean sertifikat = input.nextBoolean();

        System.out.println();
        System.out.println("Hasil seleksi: " + nama);

        if (aktif && !sanksi) {
            if (nilai >= minPemrograman || sertifikat) {
                System.out.println("Lolos tahap 1 dan 2, lanjut wawancara");
                System.out.print("Nilai wawancara: ");
                int wawancara = input.nextInt();
                if (wawancara >= minWawancara) {
                    System.out.println("DITERIMA");
                } else {
                    System.out.println("TIDAK DITERIMA");
                    System.out.println("Alasan: nilai wawancara kurang dari " + minWawancara);
                }
            } else {
                System.out.println("GAGAL tahap 2");
                System.out.println("Alasan: nilai kurang dari " + minPemrograman + " dan tidak ada sertifikat");
            }
        } else {
            System.out.println("GAGAL tahap 1");
            if (!aktif && sanksi) {
                System.out.println("Alasan: tidak aktif dan kena sanksi");
            } else if (!aktif) {
                System.out.println("Alasan: tidak aktif");
            } else {
                System.out.println("Alasan: kena sanksi");
            }
        }
    }
}