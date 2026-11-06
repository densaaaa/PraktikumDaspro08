package Jobsheet8;

import java.util.Scanner;

public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// P = 8

// uji coba langkah 3 = **********
// uji coba langkah 32 = ***************
// uji coba setelah debug = [i=0] [i=1] *[i=2] **[i=3] ***[i=4] ****[i=5] *****

// sesudah sout ditambahkan sebelum inner loop =
// Masukkan nilai n = 5
// [i=0] 
// [i=1] *
// [i=2] **
// [i=3] ***
// [i=4] ****
// [i=5] *****

