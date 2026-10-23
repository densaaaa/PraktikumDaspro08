package Jobsheet6;

import java.util.Scanner;

public class nestedAksesLab08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        System.out.println("Apakah mahasiswa masih hidup? (Ya/Tidak): ");
         mahasiswaAktif = sc.nextBoolean();
        System.out.println("Apakah mahasiswa masih disanksi? (Ya/Tidak): ");
         sedangDisanksi = sc.nextBoolean();
        System.out.println("Apakah mahasiswa mempunyai izin dosen? (Ya/Tidak): ");
         punyaIzinDosen = sc.nextBoolean();
        System.out.println("Apakah mahasiswa itu asisten lab? (Ya/Tidak): ");
         asistenLab = sc.nextBoolean();

         if (mahasiswaAktif && !sedangDisanksi) {
             if (punyaIzinDosen || asistenLab) {
                 System.out.println("Akses laboratorium diberikan"); 
                } else { 
                    System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
             }
             
             } else { System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat"); 
        } 
    }
}
