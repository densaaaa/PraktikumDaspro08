package latihan;

import java.util.Scanner;

public class SwitchUkuran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ukuran;

        System.out.print("Pilih ukuran (S/M/L): ");
        ukuran = sc.next().charAt(0);

        ukuran = Character.toUpperCase(ukuran);

        switch (ukuran) {
            case 'S':
                System.out.println("Ukuran Small");
                break;
            case 'M':
                System.out.println("Ukuran Medium");
                break;
            case 'L':
                System.out.println("Ukuran Large");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        sc.close();
    }
}
