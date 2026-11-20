package Latihan;

import java.util.Scanner;

public class looping4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahRuang, jumlahHari;
        int pengunjung;
        int totalSeluruh = 0;
        int ruangTeramai = 1;
        int totalTertinggi = 0;
        int hariRamai = 0;

        System.out.print("Jumlah ruang baca : ");
        jumlahRuang = sc.nextInt();

        System.out.print("Jumlah hari : ");
        jumlahHari = sc.nextInt();

        if (jumlahRuang <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah ruang dan hari harus > 0.");
        } else {

            for (int ruang = 1; ruang <= jumlahRuang; ruang++) {

                int totalRuang = 0;
                int hari = 1;

                System.out.println("Ruang " + ruang);

                while (hari <= jumlahHari) {

                    do {
                        System.out.print(" Pengunjung hari ke-" + hari + " : ");
                        pengunjung = sc.nextInt();

                        if (pengunjung < 0) {
                            System.out.println(" Tidak boleh negatif. Ulangi input!");
                        }

                    } while (pengunjung < 0);

                    totalRuang = totalRuang + pengunjung;

                    if (pengunjung > 50) {
                        hariRamai++;
                    }

                    hari++;
                }

                double rataRata = (double) totalRuang / jumlahHari;

                System.out.println("Ruang " + ruang
                        + " - total: " + totalRuang
                        + ", rata-rata per hari: " + rataRata);

                totalSeluruh = totalSeluruh + totalRuang;

                if (ruang == 1 || totalRuang > totalTertinggi) {
                    totalTertinggi = totalRuang;
                    ruangTeramai = ruang;
                }
            }

            System.out.println("==============================");
            System.out.println("Total seluruh pengunjung : " + totalSeluruh);
            System.out.println("Ruang paling ramai       :" + ruangTeramai);
            System.out.println("Hari ramai (> 50)      :" + hariRamai);
        }

        sc.close();
    }
}
