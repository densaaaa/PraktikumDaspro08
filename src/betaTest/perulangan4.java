package betaTest;
import java.util.Scanner;

public class perulangan4 {
    public static void main(String[] args) {
        
        Scanner uhuy = new Scanner(System.in);

        int pilihan = 0;
        String nama = "";

        do { 
            System.out.println("Pilihan Menu");
            System.out.println("1. Input nama");
            System.out.println("2. Print nama");
            System.out.println("3. Exit");
            System.out.print("pilih : ");
            pilihan = uhuy.nextInt();
            uhuy.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = uhuy.nextLine();
                    break;
                case 2:
                    System.out.println(nama);
                    break;
                case 3:
                    System.exit(3);
                    break;

                default:
                   System.out.println("pilihan invalid");
                   break;
            }
        } while (pilihan != 0 );

    }
}
