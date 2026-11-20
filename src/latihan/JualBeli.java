package Latihan;
import java.util.Scanner;

public class JualBeli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSemua = 0;

        for (int pembeli = 1; pembeli <= 3; pembeli++) {

            int totalBelanja = 0;
            int barang = 1;

            System.out.println("\nPembeli ke-" + pembeli);

            do {
                System.out.println("\nBarang ke-" + barang);

                int harga;
                do {
                    System.out.print("Masukkan harga barang: ");
                    harga = sc.nextInt();

                    if (harga < 0) {
                        System.out.println("Harga tidak boleh negatif!");
                    }
                } while (harga < 0);

                int jumlah;
                do {
                    System.out.print("Masukkan jumlah barang: ");
                    jumlah = sc.nextInt();

                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak boleh negatif!");
                    }
                } while (jumlah < 0);

                int subtotal = harga * jumlah;

                totalBelanja = totalBelanja + subtotal;

                System.out.println("Subtotal: Rp" + subtotal);

                barang++;

            } while (barang <= 2);

            System.out.println("Total belanja pembeli ke-" + pembeli
                    + ": Rp" + totalBelanja);

            totalSemua = totalSemua + totalBelanja;
        }

        System.out.println("\n======================");
        System.out.println("Total seluruh transaksi: Rp" + totalSemua);

        sc.close();
    }
}
