package Jobsheet6;

import java.util.Scanner;

public class nestedUjianSkripsi08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")){
            if (bimbinganP1 >= 9 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 9 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 9 kali dan P2 kurang dari 5 kali";
            } else if (bimbinganP1 < 9 ) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 9 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 5 kali";
            }
        } else {
            pesan = "Gagal! Mahasisa masih memiliki tanggungan kompen";
        }
        
        System.out.println(pesan);
    }
}
