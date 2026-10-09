package latihan;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("MASUKKAN NAMA KENDARAAN");
        String kendaraan = sc.nextLine();

        if (kendaraan == "mobil"){
            System.out.println("Harga = 5000");
        } else if (kendaraan == "sepeda"){
            System.out.println("Harga = 6000");
        } else {
            System.out.println("ANjay");
        }
    }
    
}
