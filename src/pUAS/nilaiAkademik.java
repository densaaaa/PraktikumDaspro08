package pUAS;

import java.util.Scanner;

public class nilaiAkademik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalSemua = 0;

        // LOOP LUAR: for - ulangi 9 matkul
        for (int i = 1; i <= 9; i++) {
            System.out.println("=== Matkul ke-" + i + " ===");

            double totalNilai = 0;
            int j = 1;

            // LOOP TENGAH: while - ulangi 4 komponen nilai
            while (j <= 4) {

                // tentukan nama komponen nilai
                String namaKomponen = "";
                if (j == 1) namaKomponen = "harian";
                else if (j == 2) namaKomponen = "kuis";
                else if (j == 3) namaKomponen = "UTS";
                else if (j == 4) namaKomponen = "UAS";

                double nilai;

                // LOOP DALAM: do-while - ulangi input kalau nilai minus
                do {
                    System.out.print("Masukkan nilai " + namaKomponen + " : ");
                    nilai = sc.nextDouble();
                    if (nilai < 0) {
                        System.out.println("Nilai tidak boleh minus, ulangi!");
                    }
                } while (nilai < 0);

                totalNilai = totalNilai + nilai;
                j++;
            }

            double nilaiAkhir = totalNilai / 4;
            totalSemua = totalSemua + nilaiAkhir;

            System.out.println("Nilai akhir matkul ke-" + i + " : " + nilaiAkhir);
            System.out.println();
        }

        double rataRata = totalSemua / 9;
        System.out.println("Rata-rata semua matkul : " + rataRata);
    }
}
