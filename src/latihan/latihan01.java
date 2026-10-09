package latihan;

import java.util.Scanner;

public class latihan01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String item;
        int jumlahItem;
        int harga;
        double diskon = 0.20;
        int bayar;
        

        System.out.println("Masukkan nama item: ");
        item = sc.nextLine();
        System.out.println("Masukkan jumlah item: ");
        jumlahItem = sc.nextInt();
        System.out.println("Masukkan harga: ");
        harga = sc.nextInt();
        System.out.println("Masukkan uang bayar: ");
        bayar = sc.nextInt();

        int subTotal;
        double total;
        double kembalian;

        subTotal = harga * jumlahItem;
        total = subTotal - (subTotal * diskon);
        kembalian = bayar - total;

        System.out.println(" ");
        System.out.println("===== HASIL PEMBAYARAN =====");
        System.out.println("Jumlah yang harus dibayar : " + total);
        System.out.println("Uang yang diterima untuk pembayaran : " + bayar);
        System.out.println("Uang kembalian : " + kembalian);
        System.out.println(" ");
        System.out.println("Karena ada diskon " + diskon + " maka jumlah yang harus dibayar adalah " + total );
        
    }
}
