package Latihan;

import java.util.Scanner;

public class looping13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalBiaya = 0;
        int totalPeserta = 0;
        int jumlahKelas = 3;
        int biayaPendaftaran = 10000;

        for (int i = 1; i <= jumlahKelas; i++) {

            int jumlahPeserta = 0;
            int peserta = 1;
            int biayaKelas = 0;

            System.out.println("\n===== KELAS " + i + " =====");

            do {
                System.out.print("Masukkan nama peserta ke-" + peserta + ": ");
                String nama = sc.nextLine();

                if (nama.equals("")) {
                    System.out.println("Nama tidak boleh kosong!");
                    continue;
                }

                if (nama.equalsIgnoreCase("selesai")) {
                    System.out.println("Pendaftaran kelas dihentikan!");
                    break;
                }

                if (nama.equalsIgnoreCase("batal")) {
                    System.out.println("Pendaftaran peserta dibatalkan!");
                    peserta++;
                    continue;
                }

                jumlahPeserta++;
                totalPeserta++;

                biayaKelas += biayaPendaftaran;
                totalBiaya += biayaPendaftaran;

                System.out.println(nama + " berhasil didaftarkan!");
                System.out.println("Biaya pendaftaran: Rp" + biayaPendaftaran);

                peserta++;

            } while (peserta <= 4);

            System.out.println("\nJumlah peserta kelas " + i + ": " + jumlahPeserta);
            System.out.println("Biaya kelas " + i + ": Rp" + biayaKelas);
        }

        System.out.println("\n===== HASIL PENDAFTARAN =====");
        System.out.println("Total seluruh peserta: " + totalPeserta);
        System.out.println("Total biaya pendaftaran: Rp" + totalBiaya);

        sc.close();
    }
}

