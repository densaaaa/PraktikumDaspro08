package Jobsheet42;

import java.util.Scanner;


public class TugasAntrean08 {
    public static void main(String[] args) {
        int kode;

        Scanner scanner = new Scanner(System.in);

        System.out.print("MASUKKAN KODE : ");
        kode = scanner.nextInt();

        switch (kode) {
            case 1:
                System.out.println("LEGALISIR IJAZAH");
                System.out.println("LOKET A");
                break;

            case 2:
                System.out.println("SURAT KETERANGAN AKTIF KULIAH");
                System.out.println("LOKET B");
                break;

            case 3:
                System.out.println("PEMINJAMAN BUKU KTM");
                System.out.println("LOKET C");
                break;

            case 4:
                System.out.println("PERPANJANGAN KEAKTIFAN KULIAH");
                System.out.println("LOKET D");
                break;

            default:
                System.out.println("KODE LAYANAN TIDAK TERSEDIA");
                break;
        }
    }
}