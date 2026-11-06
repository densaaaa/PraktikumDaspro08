package Jobsheet8;

import java.util.Scanner;

public class Tugas108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukka nilai n : ");
        int n = sc.nextInt();

        int i = 1;
        int total = 0;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                total++;
                j++;
                
            }
            System.out.println();
            
            i++;
        }
        System.out.println("Nilai yang tercetak: " + total);
    }
}
