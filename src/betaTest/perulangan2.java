package betaTest;

public class perulangan2 {
    public static void main(String[] args) {

        System.out.println("Numbers");
        for (int angka = 1; angka < 5; angka++) {
            if (angka % 2 == 1) {
                System.out.println(angka + " Genap");
            } else {
                System.out.println(angka + " Ganjil");
            }
        }
    }
}