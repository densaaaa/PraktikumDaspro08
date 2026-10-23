package P8;
import java.util.Scanner;

public class TamanRekreasi_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket;
        int kode;
        double diskon; 

        System.out.println("Masukkan jumlah tiket");
        tiket = sc.nextInt();
        System.out.println("==== PILIHAN TIKET ====");
        System.out.println("1 = REGULER");
        System.out.println("2 = TERUSAN");
        System.out.println("3 = PELAJAR");
        System.out.println("");
        System.out.println("Masukkan kode");
        kode = sc.nextInt();

        switch (kode){
            case 1 :
            System.out.println("45,000");
            break;
            case 2 :
            System.out.println("70,000");
            break;
            case 3 :
            System.out.println("35,000");
            break;
            default:
            System.out.println("Pilihan tidak tersedia");
        }

        if (tiket <= 9 || tiket >= 9 ){
            System.out.println("Anda tidak mendapatkan diskon");
        }else {
            System.out.println("Anda dapat diskon 10%");
        }

    }   
}

// P = 8

// 8 % 3 = 2
// 8 % 5 = 3
