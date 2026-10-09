package Matdas;

import java.util.Scanner;

public class matdas1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan persen kehadiran: ");
        double kehadiran = input.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;

        boolean lulus = p || q;

        System.out.println();

        if (lulus) {
            System.out.println("Hasil: LULUS");
        } else {
            System.out.println("Hasil: TIDAK LULUS");
        }

        }
    }
}