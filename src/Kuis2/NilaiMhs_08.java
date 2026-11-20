
package Kuis2;

import java.util.Scanner;

public class NilaiMhs_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mahasiswa = 1;
        String keputusan = "ya";

        for (int i = 1; keputusan.equalsIgnoreCase("ya"); i++) {

            System.out.println("\nMahasiswa ke-" + i);

            System.out.print("Masukkan nama mahasiswa : ");
            String nama = sc.nextLine();

            int nilaiKuis = 0;
            int nilaiUts = 0;
            int nilaiUas = 0;
            int nilaiTugas1 = 0;
            int nilaiTugas2 = 0;

            boolean valid;

            do {
                valid = true;

                System.out.print("Masukkan nilai kuis : ");
                nilaiKuis = sc.nextInt();

                System.out.print("Masukkan nilai UTS : ");
                nilaiUts = sc.nextInt();

                System.out.print("Masukkan nilai UAS : ");
                nilaiUas = sc.nextInt();

                System.out.print("Masukkan nilai Tugas 1 : ");
                nilaiTugas1 = sc.nextInt();

                System.out.print("Masukkan nilai Tugas 2 : ");
                nilaiTugas2 = sc.nextInt();

                if (nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100
                        || nilaiTugas1 < 0 || nilaiTugas1 > 100 || nilaiTugas2 < 0 || nilaiTugas2 > 100) {

                    System.out.println("\nNilai harus antara 0-100!");
                    System.out.println("Silakan masukkan ulang nilai.");
                    valid = false;
                }

            } while (!valid);

            int nilaiAkhir = nilaiKuis + nilaiUts + nilaiUas + nilaiTugas1 + nilaiTugas2;

            double nilaiRata = nilaiAkhir / 5.0;

            System.out.println("\n===== HASIL NILAI MAHASISWA =====");
            System.out.println("Nama mahasiswa : " + nama);
            System.out.println("Nilai akhir    : " + nilaiAkhir);
            System.out.println("Nilai rata-rata: " + nilaiRata);

            sc.nextLine();

            System.out.print("\nTambah mahasiswa? (ya/tidak): ");
            keputusan = sc.nextLine();

            if (keputusan.equalsIgnoreCase("ya")) {
                System.out.println("Lanjut mahasiswa berikutnya!");

            } else if (keputusan.equalsIgnoreCase("tidak")) {
                System.out.println("Tidak lanjut mahasiswa berikutnya.");

            } else {
                System.out.println("Pilihan tidak valid!");
                keputusan = "tidak";
            }
        }

        sc.close();
    }
}