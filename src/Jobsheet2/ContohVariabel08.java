package Jobsheet2;

public class ContohVariabel08 {
    public static void main(String args[]) {
        String salahSatuHobbySayaAdalah = "Bermian petak umpet";
        String nama = "Syahira";

        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println(salahSatuHobbySayaAdalah);
        System.out.println("Apakah pandai?" + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umur saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
        
        System.out.println("Nama saya :" + nama);
        
    }
}