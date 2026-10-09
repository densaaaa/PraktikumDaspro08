package betaTest;

import java.util.Scanner;

public class stukasArray {
    public static void main(String[] args) {
        
        Scanner uhuy = new Scanner(System.in);
        
        //var
        
        String[] bukuSc = {"laskar Pelangi", "bumi Manusia", "filosofi Teras", "one Piece"};
        boolean[] bisaPinjam = {true, false, true, true};
        

        System.out.println("=== DAFTAR BUKU DI RAK ===");
        String status;

        for (int i = 0; i < bisaPinjam.length; i++) {
            if (bisaPinjam[i] == true) {
                status = "Tersedia";
            } else {
                status = "Tidak tersedia";
            }

            System.out.println((i+1) + ". " + bukuSc[i] + "-" + status);
        }
        
        System.out.println("Masukkan nomernyo: ");
        int pilihan = uhuy.nextInt();
        uhuy.nextLine();
        int index = pilihan - 1;


        if (index < 0 || index >= bukuSc.length) {
            System.out.println("Nomer buku tidak ditemukan.");
        } else {
            System.out.println("Buku yang dipilih: " + bukuSc[index]);

            if (bisaPinjam[index] == true) {
                System.out.println("Buku ini bisa dipinjam");
            } else {
                System.out.println("Buku ini tidak bisa dipinjam");
            }
        }
        uhuy.close();
    }
}
