package Jobsheet42;

import java.util.Scanner;

public class PemilihanSwitch08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("MASUKKAN SEMESTER SAAT INI : ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1 :
                System.out.println("KRS SEMESTER 1 DITAMPILKAN");
                break;
            case 2 :
                System.out.println("KRS SEMESTER 2 DITAMPILKAN");
                break;
            case 3 :
                System.out.println("KRS SEMESTER 3 DITAMPILKAN");
                break;
            case 4 :
                System.out.println("KRS SEMESTER 4 DITAMPILKAN");
                break;
            case 5 :
                System.out.println("KRS SEMESTER 5 DITAMPILKAN");
                break;
            case 6 :
                System.out.println("KRS SEMESTER 6 DITAMPILKAN");
                break;
            case 7 :
                System.out.println("KRS SEMESTER 7 DITAMPILKAN");
                break;
            case 8 :
                System.out.println("KRS SEMESTER 8 DITAMPILKAN");
                break; 
            default :
                System.out.println("SEMESTER TIDAK AKTIF");
        }
    }
}
