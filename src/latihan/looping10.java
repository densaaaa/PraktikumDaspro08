
package Latihan;

import java.util.Scanner;

public class looping10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mahasiswa = 3;

        for (int i = 1; i <= mahasiswa; i++) {
            int pertemuan = 1;
            int hadir = 0;
            int alpha = 0;
            int izin = 0;
            int sakit = 0;

            System.out.println("\n===== MAHASISWA KE-" + i + " =====");

            do {
                String status;

                do {
                    System.out.print("Pertemuan " + pertemuan + " (H/A/I/S): ");
                    status = sc.nextLine();

                    if (!status.equalsIgnoreCase("H") &&
                        !status.equalsIgnoreCase("A") &&
                        !status.equalsIgnoreCase("I") &&
                        !status.equalsIgnoreCase("S")) {

                        System.out.println("Input tidak valid! Silakan ulangi.");
                    }

                } while (!status.equalsIgnoreCase("H") &&
                        !status.equalsIgnoreCase("A") &&
                        !status.equalsIgnoreCase("I") &&
                        !status.equalsIgnoreCase("S"));

                if (status.equalsIgnoreCase("H")) {
                    hadir++;
                } else if (status.equalsIgnoreCase("A")) {
                    alpha++;
                } else if (status.equalsIgnoreCase("I")) {
                    izin++;
                } else if (status.equalsIgnoreCase("S")) {
                    sakit++;
                }

                pertemuan++;

            } while (pertemuan <= 5);

            double persentase = (double) hadir / 5 * 100;

            System.out.println("\n===== HASIL ABSENSI =====");
            System.out.println("Jumlah Hadir : " + hadir);
            System.out.println("Jumlah Alpha : " + alpha);
            System.out.println("Jumlah Izin  : " + izin);
            System.out.println("Jumlah Sakit : " + sakit);
            System.out.println("Persentase   : " + persentase + "%");

            if (persentase >= 80) {
                System.out.println("Status       : Memenuhi Kehadiran");
            } else {
                System.out.println("Status       : Tidak Memenuhi Kehadiran");
            }
        }

        sc.close();
    }
}
