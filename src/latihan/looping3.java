package Latihan;

import java.util.Scanner;

public class looping3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, nilai;
        int total = 0;
        int tertinggi = 0;
        int terendah = 100;
        int tuntas = 0;
        int remidi = 0;
        double rataRata;

        System.out.print("Jumlah mahasiswa : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            do {
                System.out.print("Nilai tugas ke-" + i + " : ");
                nilai = sc.nextInt();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }

            } while (nilai < 0 || nilai > 100);

            total = total + nilai;

            if (i == 1) {
                tertinggi = nilai;
                terendah = nilai;
            } else {
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }

                if (nilai < terendah) {
                    terendah = nilai;
                }
            }

            if (nilai >= 70) {
                tuntas++;
            } else {
                remidi++;
            }
        }

        rataRata = (double) total / n;

        System.out.println("Rata-rata      : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Tuntas (>= 70) : " + tuntas);
        System.out.println("Remidi         :" + remidi);

        sc.close();
    }
}
