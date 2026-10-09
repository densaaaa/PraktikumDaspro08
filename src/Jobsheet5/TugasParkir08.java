package Jobsheet42;

import java.util.Scanner;

public class TugasParkir08 {
    public static void main(String[] args) {
    
        int lamaParkir;
        int jamTambahan;
        int tarif;

        Scanner scanner = new Scanner(System.in);

        System.out.print("MASUKKAN LAMA PARKIR (JAM): ");
        lamaParkir = scanner.nextInt();

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            jamTambahan = lamaParkir - 2;
            tarif = 2000 + (jamTambahan * 1000);
        }

        System.out.println("TARIF PARKIR: Rp " + tarif);
    }
}