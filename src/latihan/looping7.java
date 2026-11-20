package Latihan;

import java.util.Scanner;

public class looping7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa = 3;
        int jumlahMatkul = 4;

        for (int i = 1; i < jumlahMahasiswa; i++) {
            int total = 0;

            System.out.println("Mahasiswa ke- " + i);

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println("Masukkan nilai : ");
                int nilai = sc.nextInt();

                 total = nilai += total;
            }

            int rataRata = total / jumlahMatkul;

            System.out.println("Hasil" + total + " dan rata rata " + rataRata);
        }
    }
}
