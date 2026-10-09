package Jobsheet42;

import java.util.Scanner;

public class PemilihanIf08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ----");
        System.out.println("APAKAH UKT SUDAH LUNAS? (TRUE/FALSE) : ");

        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("PEMBAYARAN UKT TERVERIFIKASI");
            System.out.println("SILAKAN CETAK KRS DAN MINTA TTD DPA");
        }    
    }
}
