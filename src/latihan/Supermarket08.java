package Latihan;
    
import java.util.Scanner;

public class Supermarket08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan, jumlah, harga = 0;
        double total, diskon = 0, diskonMember = 0, bayar;
        char member;

        System.out.println("=== SUPERMARKET 08 ===");
        System.out.println("1. Beras         - Rp18000/kg");
        System.out.println("2. Gula          - Rp15000/kg");
        System.out.println("3. Minyak Goreng - Rp20000/liter");
        System.out.println("4. Telur         - Rp28000/kg");

        System.out.print("Pilih barang: ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                harga = 18000;
                break;
            case 2:
                harga = 15000;
                break;
            case 3:
                harga = 20000;
                break;
            case 4:
                harga = 28000;
                break;
            default:
                System.out.println("Pilihan barang tidak valid");
                sc.close();
                return;
        }

        System.out.print("Jumlah barang: ");
        jumlah = sc.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0");
        } else {
            total = harga * jumlah;

            if (total >= 100000) {
                diskon = total * 0.10;
            }

            System.out.print("Punya kartu member? (Y/T): ");
            member = Character.toUpperCase(sc.next().charAt(0));

            if (member == 'Y' || member == 'T') {
                if (member == 'Y') {
                    diskonMember = (total - diskon) * 0.05;
                }

                bayar = total - diskon - diskonMember;

                System.out.println("\n=== STRUK BELANJA ===");
                System.out.println("Harga satuan : Rp" + harga);
                System.out.println("Jumlah       : " + jumlah);
                System.out.println("Total        : Rp" + total);
                System.out.println("Diskon       : Rp" + diskon);
                System.out.println("Diskon member: Rp" + diskonMember);
                System.out.println("Total bayar  : Rp" + bayar);
            } else {
                System.out.println("Input member tidak valid");
            }
        }

        sc.close();
    }
}


