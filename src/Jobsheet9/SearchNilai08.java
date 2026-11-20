package Jobsheet9;

public class SearchNilai08 {
    public static void main(String[] args) {

        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        int key = 90;
        boolean ditemukan = false;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}

// P = 8