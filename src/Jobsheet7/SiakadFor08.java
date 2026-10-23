// P = 8
package Jobsheet7;

import java.util.Scanner;

public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            } 
            if (nilai < 0 || nilai >  63){
                System.out.println("Mahasiswa ke-" + i + " lulus");
                jumlahLulus++;
            } 
            else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus");
                jumlahTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);

    }
}
