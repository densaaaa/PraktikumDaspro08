package Latihan;
import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password, role;

        System.out.println("Masukkan username");
        username = sc.nextLine();

        if (username.equals("admin")) {
            System.out.println("Masukkan password");
            password = sc.nextLine();

            if (password.equals("java123")) {
                System.err.println("Masukkan role (admin)");
                role = sc.nextLine();

                if (role.equals("admin")) {
                    System.out.println("Anda mendapatkan hak akses");
                } else {
                    System.out.println("Anda tidak mendapatkan hak akses");
                }
            } else {
                System.out.println("Password salah");
            }
        } else {
            System.out.println("Username salah");
        }
    }
}
