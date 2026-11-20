package Jobsheet9;

import java.util.Scanner;

public class Tugas2 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };

        System.out.println("===== MENU KAFE KAMPUS =====");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]
                    + " - Rp" + harga[i]);
        }

        System.out.print("\nMasukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();

        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Menu ditemukan!");
            System.out.println("Nama  : " + menu[posisi]);
            System.out.println("Harga : Rp" + harga[posisi]);
        } else {
            System.out.println("Menu tidak tersedia!");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];
        int totalBiaya = 0;

        for (int i = 0; i < jumlah; i++) {

            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu pesanan ke-"
                        + (i + 1) + ": ");

                String namaPesanan = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        pesanan[i] = menu[j];
                        totalBiaya += harga[j];
                        ditemukan = true;
                        System.out.println("Pesanan berhasil ditambahkan!");
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia! Silakan pilih lagi.");
                }
            }
        }

        System.out.println("\n===== STRUK PEMESANAN =====");

        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < menu.length; j++) {
                if (pesanan[i].equals(menu[j])) {
                    System.out.println((i + 1) + ". "
                            + pesanan[i] + " - Rp" + harga[j]);
                    break;
                }
            }
        }

        System.out.println("----------------------------");
        System.out.println("Total biaya: Rp" + totalBiaya);
        System.out.println("============================");

        input.close();
    }
}

// P = 8
