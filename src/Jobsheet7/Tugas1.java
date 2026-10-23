// P = 8


import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 44000;
        int jumlahTiket, totalTiket = 0, totalPenjualan = 0;
        String input;

        while (true) {
            System.out.print("Masukkan jumlah tiket ('batal' untuk selesai): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("batal")) {
                System.out.println("Selesai memasukkan data pelanggan.");
                break;
            }

            try {
                jumlahTiket = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka atau 'batal'!");
                continue;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            int harga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 8) {
                harga = harga - (harga * 23 / 100);
            } else if (jumlahTiket > 6) {
                harga = harga - (harga * 3 / 100);
            }

            totalTiket += jumlahTiket;
            totalPenjualan += harga;
            System.out.println("Jumlah tiket pelanggan berhasil dicatat.");
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}
