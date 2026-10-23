package Latihan;

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

// 8 % 1	0	8 % 51	8
// 8 % 2	0	8 % 52	8
// 8 % 3	2	8 % 53	8
// 8 % 4	0	8 % 54	8
// 8 % 5	3	8 % 55	8
// 8 % 6	2	8 % 56	8
// 8 % 7	1	8 % 57	8
// 8 % 8	0	8 % 58	8
// 8 % 9	8	8 % 59	8
// 8 % 10	8	8 % 60	8
