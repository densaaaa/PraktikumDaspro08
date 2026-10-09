package Jobsheet2;

public class Studi108 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        int jumlahAnak = 4;
        double tunjanganPerAnak = 100000;
        double persenPensiun = 0.10;

        double tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * persenPensiun;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        System.out.println("=== Slip Gaji Pak Danur ===");
        System.out.println("Gaji Pokok        : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Tunjangan Anak    : Rp " + String.format("%,.0f", tunjanganAnak));
        System.out.println("Potongan Pensiun  : Rp " + String.format("%,.0f", potonganPensiun));
        System.out.println("Gaji Bersih       : Rp " + String.format("%,.0f", gajiBersih));
    }
}