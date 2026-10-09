package betaTest;
import java.util.Scanner;

public class perulangan3 {
    public static void main(String[] args) {
        
        Scanner uhuy = new Scanner(System.in);
        boolean loop = true;
        String pass = "admin";

        while (loop) {
            System.out.print("Masukkan password: ");
            String input = uhuy.nextLine();
            
            if (pass.equals(input)) {
            System.out.println("Password benar");
            loop = true;
        }else{
            System.out.println("password salah");
        }
        } 
    }
}