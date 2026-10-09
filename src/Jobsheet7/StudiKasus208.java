package Jobsheet7;

import java.util.Scanner;

public class StudiKasus208 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        int dokumen = sc.nextInt();

        if (dokumen == 4) {
            if (jenis.equalsIgnoreCase("BELMAWA") ||
                jenis.equalsIgnoreCase("BAKORMA") ||
                jenis.equalsIgnoreCase("MANDIRI")) {

                System.out.print("Peringkat juara: ");
                int juara = sc.nextInt();

                if (juara >= 1 && juara <= 3) {
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            } else if (jenis.equalsIgnoreCase("PKM")) {
                System.out.print("Status pendanaan PKM (jika lolos 1 dan jika tidak lolos 0): ");
                int pkm = sc.nextInt();
                if (pkm == 1) {
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Kegiatan lainnya tidak memperoleh dana penghargaan.");
            }
        } else {
            System.out.println("Dokumen tidak lengkap.");
            System.out.println("Dana penghargaan tidak diberikan.");
        }
    }
}