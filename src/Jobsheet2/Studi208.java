package Jobsheet2;

public class Studi208 {
    public static void main(String[] args) {
        double lebar = 30;
        double panjang = 100;
        double diameter = 5;
        double sisi = 2;

        double luasTanah = lebar * panjang;
        double jariJari = diameter / 2;
        double luasKolam = Math.PI * jariJari * jariJari;
        double luasTaman = sisi * sisi;

        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("=== Perhitungan Luas Tanah Pak Tono ===");
        System.out.printf("Luas Tanah          : %.2f m2%n", luasTanah);
        System.out.printf("Luas Kolam          : %.2f m2%n", luasKolam);
        System.out.printf("Luas Taman          : %.2f m2%n", luasTaman);
        System.out.printf("Luas Tidak Terpakai : %.2f m2%n", luasTidakDigunakan);
    }
}