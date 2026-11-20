package Latihan;

public class looping14 {
    public static void main(String[] args) {

        int kasir = 1;
        int totalTransaksi = 0;

        do {
            System.out.println("\n=== KASIR " + kasir + " ===");

            for (int transaksi = 1; transaksi <= 4; transaksi++) {

                if (transaksi == 2) {
                    System.out.println("Transaksi ke-2 dilewati!");
                    continue;
                }

                System.out.println("Transaksi ke-" + transaksi);

                totalTransaksi++;

                if (transaksi == 4) {
                    System.out.println("Batas transaksi tercapai!");
                    break;
                }
            }

            kasir++;

        } while (kasir <= 3);

        System.out.println("\n========================");
        System.out.println("Total transaksi: " + totalTransaksi);
        System.out.println("========================");
    }
}

