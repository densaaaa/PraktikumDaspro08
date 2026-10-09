package Jobsheet42;

import java.util.Scanner;

public class Tugas1Pemilihan08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ----");
        System.out.println("APAKAH UKT SUDAH LUNAS? (TRUE/FALSE) : ");

        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
                ? "PEMBAYARAN UKT TERVERIFIKASI\nSILAKAN CETAK KRS DAN MINTA TTD DPA"
                : "SILAKAN BAYAR UKT TERLEBIH DAHULU";

        System.out.println(pesan);
    }
}
