package Jobsheet42;

import java.util.Scanner;

public class Tugas2Pemilihan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahSks;

        System.out.println("MASUKKAN JUMLAH SKS");
        jumlahSks = sc.nextInt();

        if (jumlahSks >= 24){
            System.out.println("MELEBIHI BATAS SKS");
        }else {
            System.out.println("KRS VALID");
        }
    }    
}
