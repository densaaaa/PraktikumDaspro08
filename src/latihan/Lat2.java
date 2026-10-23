package Latihan;
import java.util.Scanner;

public class Lat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int umur;
        int hargaTiket;

        System.out.println("Masukkan nama");
        String nama = sc.nextLine();

        System.out.println("Masukkan umur");
        umur = sc.nextInt();

        if (umur < 0) {
            System.out.println("Umur tidak valid");
        } else if (umur >= 18) {
            hargaTiket = 40000;
            System.out.println("Cek Status Member");
            System.out.println("Masukkan true jika member, false jika bukan");
            boolean member = sc.nextBoolean();

            if (umur > 18) {
                if (member) {
                    hargaTiket -= (int) (hargaTiket * 0.20);
                }
            }
            System.out.println("Nama: " + nama);
            System.out.println("Harga tiket Rp" + hargaTiket);
        } else if (umur > 5) {
            hargaTiket = 25000;
            System.out.println("Nama: " + nama);
            System.out.println("Harga tiket Rp" + hargaTiket);
        } else {
            System.out.println("Nama: " + nama);
            System.out.println("Tiket Gratis");
        }

        sc.close();
    }
}
