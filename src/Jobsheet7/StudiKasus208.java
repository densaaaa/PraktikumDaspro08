package Jobsheet7;

import java.util.Scanner;

public class StudiKasus208 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen: ");
        int dokumen = sc.nextInt();

        if (dokumen < 4) {
            System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen).");
            System.out.println("Dana penghargaan tidak diberikan.");
        } else if (dokumen == 4) {
            if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
                System.out.print("Peringkat juara: ");
                int juara = sc.nextInt();
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            }  else if (jenis.equals("LAINNYA")) {
                System.out.println("Kegiatan lainnya tidak memperoleh dana penghargaan.");
            } else {
                System.out.println("Jenis kegiatan tidak valid.");
            }
        }
    }
}