package Jobsheet3;

import java.util.Scanner;

public class Study01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga laptop : ");
        double x = input.nextDouble();
        System.out.print("Masukkan uang muka : ");
        double y = input.nextDouble();
        System.out.print("Masukkan lama cicilan dalam bulan : ");
        int z = input.nextInt();

        double sisa = x - y;
        double bunga = 0.02 * sisa;
        double totalBunga = bunga * z;
        double totalBayar = sisa + totalBunga;
        double cicilan = totalBayar / z;

        System.out.println("Sisa harga setelah uang muka: Rp" + sisa);
        System.out.println("Cicilan per bulan: Rp" + cicilan);

        input.close();
    }
}