package latihan;


import java.util.Scanner;

public class SertifikatKompetensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char hadir, proyek, pembayaran;
        int teori, praktik;

        System.out.print("Apakah peserta hadir? (Y/T): ");
        hadir = Character.toUpperCase(sc.next().charAt(0));

        if (hadir == 'Y') {
            System.out.print("Nilai teori: ");
            teori = sc.nextInt();

            System.out.print("Nilai praktik: ");
            praktik = sc.nextInt();

            if (teori >= 70) {
                if (praktik >= 75) {
                    System.out.print("Apakah proyek dikumpulkan? (Y/T): ");
                    proyek = Character.toUpperCase(sc.next().charAt(0));

                    if (proyek == 'Y') {
                        System.out.print("Status pembayaran (L/B): ");
                        pembayaran = Character.toUpperCase(sc.next().charAt(0));

                        if (pembayaran == 'L') {
                            if (teori >= 90 && praktik >= 90) {
                                System.out.println("Sertifikat Kompetensi Unggul");
                            } else {
                                if (teori >= 80 && praktik >= 85) {
                                    System.out.println("Sertifikat Kompetensi Mahir");
                                } else {
                                    System.out.println("Sertifikat Kompetensi Dasar");
                                }
                            }
                        } else {
                            if (pembayaran == 'B') {
                                System.out.println("Sertifikat ditahan: pembayaran belum lunas");
                            } else {
                                System.out.println("Kode pembayaran tidak valid");
                            }
                        }
                    } else {
                        if (proyek == 'T') {
                            System.out.println("Gagal: proyek belum dikumpulkan");
                        } else {
                            System.out.println("Input proyek tidak valid");
                        }
                    }
                } else {
                    System.out.println("Gagal: nilai praktik kurang dari 75");
                }
            } else {
                System.out.println("Gagal: nilai teori kurang dari 70");
            }
        } else {
            if (hadir == 'T') {
                System.out.println("Gagal: peserta tidak hadir");
            } else {
                System.out.println("Input kehadiran tidak valid");
            }
        }

        sc.close();
    }
}
