package Jobsheet6;

import java.util.Scanner;

public class operatorLogikaWifi08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiblokir;


        System.out.print ("Apakah pengguna mahasiswa? (true/false): "); 
        mahasiswa = sc.nextBoolean();

        System.out.print ("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print ("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan"); 
        } else { 
            System.out.println("Akses WiFi ditolak"); 
        } 
    }
}
