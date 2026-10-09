package Jobsheet3;

import java.util.Scanner;

public class MenghitungTotalBayar08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan;
        int jml_bayar;
        double diskon=0.15;

        System.out.println("Masukkan harga :");
        harga=sc.nextInt();

        System.out.println("Masukkan potongan harga :");
        potongan=sc.nextInt();
        
        potongan=diskon*harga;
        jml_bayar=(int) (harga-potongan);
        
        

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);
    }
}
