
package Latihan;

import java.util.Scanner;

public class looping15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int area = 1;
        int totalKendaraan = 0;

        System.out.print("Masukkan jumlah area parkir: ");
        int jumlahArea = sc.nextInt();

        while (area <= jumlahArea) {

            System.out.println("\n=== AREA PARKIR " + area + " ===");

            int kendaraan = 1;

            System.out.print("Masukkan jumlah kendaraan: ");
            int jumlahKendaraan = sc.nextInt();

            do {

                if (kendaraan == 2) {
                    System.out.println("Kendaraan ke-2 dilewati!");
                    kendaraan++;
                    continue;
                }

                System.out.println("Kendaraan ke-" + kendaraan);

                totalKendaraan++;

                if (kendaraan == jumlahKendaraan) {
                    System.out.println("Area selesai!");
                    break;
                }

                kendaraan++;

            } while (kendaraan <= jumlahKendaraan);

            area++;
        }

        System.out.println("\n========================");
        System.out.println("Total kendaraan: " + totalKendaraan);
        System.out.println("========================");

        sc.close();
    }
}
