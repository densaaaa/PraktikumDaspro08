
package pUAS;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 44000;
        int totalHarga, jumlahTiket;
        double diskon, totalBayar;

        for (int i = 1; i <= 1; i++) {  
            System.out.println("\nTransaksi ke-" + i);

            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            totalHarga = jumlahTiket * harga;

            double presentaseDiskon;

            if (jumlahTiket >= 10) {
                presentaseDiskon = 0.15;
            } else if (jumlahTiket > 4) {
                presentaseDiskon = 0.10;
            } else {
                presentaseDiskon = 0;
            }

            diskon = totalHarga * presentaseDiskon;
            totalBayar = totalHarga - diskon;

            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
        }

        sc.close();
    }
}
