package Jobsheet3;

import java.util.Scanner;

public class GajiKaryawan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        System.out.println("Masukkan gaji pokok :");
        gajiPokok=sc.nextInt();

        bonus= 0.05*gajiPokok;

        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " +totGaji);
    }
}
