package Latihan;

import java.util.Scanner;

public class looping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKantin, jumlahHari;
        int pendapatan;
        int totalSeluruh = 0;
        int kantinTerbaik = 1;
        int totalTertinggi = 0;
        int hariSepi = 0;

        System.out.print("Jumlah kantin : ");
        jumlahKantin = sc.nextInt();

        System.out.print("Jumlah hari : ");
        jumlahHari = sc.nextInt();

        if (jumlahKantin <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah kantin dan hari harus > 0.");
        } else {

            int kantin = 1;

            while (kantin <= jumlahKantin) {

                int totalKantin = 0;

                System.out.println("Kantin " + kantin);

                for (int hari = 1; hari <= jumlahHari; hari++) {

                    do {
                        System.out.print(" Pendapatan hari ke-" + hari + " : ");
                        pendapatan = sc.nextInt();

                        if (pendapatan < 0) {
                            System.out.println(" Tidak boleh negatif. Ulangi input!");
                        }

                    } while (pendapatan < 0);

                    totalKantin = totalKantin + pendapatan;

                    if (pendapatan < 100) {
                        hariSepi++;
                    }
                }

                double rataRata = (double) totalKantin / jumlahHari;

                System.out.println("Kantin " + kantin
                        + " - total: " + totalKantin
                        + ", rata-rata per hari: " + rataRata);

                totalSeluruh = totalSeluruh + totalKantin;

                if (kantin == 1 || totalKantin > totalTertinggi) {
                    totalTertinggi = totalKantin;
                    kantinTerbaik = kantin;
                }

                kantin++;
            }

            System.out.println("==============================");
            System.out.println("Total seluruh kantin : " + totalSeluruh);
            System.out.println("Kantin terbaik      :" + kantinTerbaik);
            System.out.println("Hari sepi (< 100) :" + hariSepi);
        }

        sc.close();
    }
}
