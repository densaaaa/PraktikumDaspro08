package Latihan;

import java.util.Scanner;

public class looping8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studio = 3;
        int baris = 4;
        int hargaTiket = 35000;

        int totalBioskop = 0;
        int pendapatanBioskop = 0;

        for (int i = 1; i < studio; i++) {
            
            int j = 1;
            int totalStudio = 0;
            
            System.out.println("Studio " + i);

            while (j <= baris) {
                System.out.println("jumlah tiket baris " + j + " 0-5 : ");
                int tiket = sc.nextInt();

                while (tiket < 0 || tiket > 5) {
                    System.out.println("input tidak valid");

                    System.out.println("masukkan lagi ");
                    tiket = sc.nextInt();
                }

                totalStudio += tiket;

                j++;
            }

            int pendapatanStudio = totalStudio * hargaTiket;

            System.out.println("Total tiket studio " + totalStudio);
            System.out.println("Pendapatan studio : " + pendapatanStudio);

            totalBioskop += totalStudio;
            pendapatanBioskop += pendapatanStudio;
        }

        System.out.println("===== LAPORAN BIOSKOP =====");
        System.out.println("Total tiket terjual : " + totalBioskop);
        System.out.println("Pendapatan bioskop : " + pendapatanBioskop);
        
    }
}
