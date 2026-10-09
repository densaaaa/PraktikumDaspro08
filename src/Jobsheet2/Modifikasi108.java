package Jobsheet2;

import java.util.Scanner;

public class Modifikasi108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan per anak: Rp ");
        double tunjanganPerAnak = sc.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = sc.nextInt();

        double persenPensiun = 0.10; // tetap 10% sesuai ketentuan perusahaan

        double tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        System.out.println("\n=== Slip Gaji Karyawan ===");
        System.out.printf("Gaji Pokok        : Rp %,.0f%n", gajiPokok);
        System.out.printf("Tunjangan Anak    : Rp %,.0f%n", tunjanganAnak);
        System.out.printf("Potongan Pensiun  : Rp %,.0f%n", potonganPensiun);
        System.out.printf("Gaji Bersih       : Rp %,.0f%n", gajiBersih);

        sc.close();
    }
}