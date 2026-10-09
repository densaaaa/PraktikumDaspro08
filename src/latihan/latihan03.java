package latihan;

import java.util.Scanner;

public class latihan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bulan;

        System.out.println("Masukkan nama bulan : ");
        bulan = sc.nextLine();

        int hari = 0;

        switch (bulan) {
            case "januari":
                hari = 31;
                break;
            case "februari":
                hari = 28;
                break;
            case "maret":
                hari = 31;
                break;
            case "april":
                hari = 30;
                break;
            case "mei":
                hari = 31;
                break;
            case "juni":
                hari = 30;
                break;
            case "juli":
                hari = 31;
                break;
            case "agustus":
                hari = 31;
                break;
            case "september":
                hari = 30;
                break;
            case "oktober":
                hari = 31;
                break;
            case "novermber":
                hari = 30;
                break;
            case "desember":
                hari = 31;
                break;
        }

        System.out.println("bulan " + bulan + " memiliki jumlah " + hari + " dalam 1 bulan" );
    }
}
