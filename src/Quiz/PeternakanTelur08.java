package Quiz;

import java.util.Scanner;

public class PeternakanTelur08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ayam;

        System.out.println("Masukkan jumlah ayam: ");
        ayam = sc.nextInt();

        int jumlahTelur;
        int jumlahTray;
        int telurEceran;
        double beratTotal;

        jumlahTelur = 25 * ayam;
        jumlahTray = jumlahTelur / 30;
        telurEceran = jumlahTelur % 30;
        beratTotal = jumlahTelur * 62 / 1000;


        System.out.println("Total telur   : " + jumlahTelur);
        System.out.println("Jumlah tray   : " + jumlahTray);
        System.out.println("Telur eceran  : " + telurEceran);
        System.out.println("Berat total   : " + beratTotal + " kg");
    }
}