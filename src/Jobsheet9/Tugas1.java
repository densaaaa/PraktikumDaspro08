package Jobsheet9;

import java.util.Scanner;

public class Tugas1 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahNilai;
        int total = 0;
        int tertinggi = 0;
        int terendah = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahNilai = input.nextInt();

        int[] nilai = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];

            if (i == 0) {
                tertinggi = nilai[i];
                terendah = nilai[i];
            }

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlahNilai;

        System.out.println("\n===== HASIL PENGELOLAAN NILAI =====");

        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");

        for (int i = 0; i < jumlahNilai; i++) {

            System.out.print("Mahasiswa ke-" + (i + 1));
            System.out.print(" | Nilai: " + nilai[i]);

            if (nilai[i] >= 70) {
                System.out.println(" | LULUS");
            } else {
                System.out.println(" | TIDAK LULUS");
            }
        }

        input.close();
    }
}

// P = 8
