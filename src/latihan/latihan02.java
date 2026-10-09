package latihan;

import java.util.Scanner;

public class latihan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String nama, kelas;
        long nim;
        int absen;
        double nilaiTugas, nilaiUas, nilaiUts;

        System.out.println("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.println("Masukkan nim: ");
        nim = sc.nextLong();
        sc.nextLine();
        System.out.println("Masukkan kelas : ");
        kelas = sc.nextLine();
        System.out.println("Masukkan absen : ");
        absen = sc.nextInt();
        System.out.println("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.println("Masukkan nilai uts : ");
        nilaiUts = sc.nextInt();
        System.out.println("Masukkan nilai uas : ");
        nilaiUas = sc.nextInt();

        double nilaiAkhir = (nilaiTugas + nilaiUts + nilaiUas) / 3.0;
        String nilaiHuruf;


        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70 && nilaiAkhir <= 80) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir <= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 40 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "F";
        }

        System.out.println("Siswa yang bernama " + nama + " mempunyai nilai akhir " + (int)nilaiAkhir + " dengan nilai kualifikasi " + nilaiHuruf);

    }
}
