package betaTest;

public class kantinSekolah {
    public static void main(String[] args) {
        
        int porsi = 2;
        int harga = 12000;
        int duaPorsi = porsi * harga;

        System.out.println("Dua porsi nasi goreng seharga 12000 totalnya: " + duaPorsi);

        float denganTeh = duaPorsi += 3500.50;

        System.out.println("Dua porsi nasgor dengan es teh: " + denganTeh);

        float setelahDiskon = denganTeh *= 0.9f;

        System.out.println("Setelah dikenakan diskon 10% harga akhirnya adalah: " + setelahDiskon);

        int hargaBayar = (int) setelahDiskon;
        System.out.println("Harga akhir pembayaran adalah: " + hargaBayar);

    }
}
