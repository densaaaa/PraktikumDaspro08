package Jobsheet3;

import java.util.Scanner;

public class Study02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah lembar dokumen : ");
        int x = input.nextInt();

        double biayaCetak = 500 * x;
        double biayaJilid = 5000;
        double totalBiaya = biayaCetak + biayaJilid;

        System.out.println("Biaya cetak: Rp" + biayaCetak);
        System.out.println("Biaya penjilidan: Rp" + biayaJilid);
        System.out.println("Total biaya: Rp" + totalBiaya);

        input.close();
    }
}
