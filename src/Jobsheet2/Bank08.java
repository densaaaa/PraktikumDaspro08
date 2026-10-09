package Jobsheet2;

import java.util.Scanner;

public class Bank08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, jml_tabungan_akhir;

        System.out.print("Masukkan jumlah tabungan awal anda: ");
        jml_tabungan_awal = input.nextInt();
        System.out.print("Masukkan lama menabung anda: ");
        lama_menabung = input.nextInt();

        double bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

    }
}
