package Latihan;

import java.util.Scanner;

public class looping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, nilai;
        int total = 0;
        int tertinggi = 0;
        int terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;
        double rataRata;

        System.out.print("Jumlah mahasiswa : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            do {
                System.out.print("Nilai mahasiswa ke-" + i + " : ");
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

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        rataRata = (double) total / n;

        System.out.println("Rata-rata      : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Lulus (>= 60) : " + lulus);
        System.out.println("Tidak lulus     :" + tidakLulus);

        sc.close();
    }
}

// 8 % 1	0	8 % 51	8
// 8 % 2	0	8 % 52	8
// 8 % 3	2	8 % 53	8
// 8 % 4	0	8 % 54	8
// 8 % 5	3	8 % 55	8
// 8 % 6	2	8 % 56	8
// 8 % 7	1	8 % 57	8
// 8 % 8	0	8 % 58	8
// 8 % 9	8	8 % 59	8
// 8 % 10	8	8 % 60	8