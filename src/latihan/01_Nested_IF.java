package latihan;

import java.util.Scanner;

class NestedIF {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pilih studi kasus:");
        System.out.println("1. Kelulusan");
        System.out.println("2. Akses laboratorium");
        System.out.println("3. Wi-Fi kampus");
        System.out.println("4. Bimbingan skripsi");
        System.out.println("5. Beasiswa");
        System.out.println("6. Diskon member");
        System.out.println("7. Login");
        System.out.println("8. Seleksi asisten lab");
        System.out.println("9. Biaya parkir");
        System.out.println("10. Dana prestasi");

        int pilihan = bacaIntRentang("Pilihan: ", 1, 10);

        switch (pilihan) {
            case 1:
                kasus1Kelulusan();
                break;
            case 2:
                kasus2AksesLab();
                break;
            case 3:
                kasus3Wifi();
                break;
            case 4:
                kasus4BimbinganSkripsi();
                break;
            case 5:
                kasus5Beasiswa();
                break;
            case 6:
                kasus6DiskonMember();
                break;
            case 7:
                kasus7Login();
                break;
            case 8:
                kasus8SeleksiAsisten();
                break;
            case 9:
                kasus9Parkir();
                break;
            case 10:
                kasus10DanaPrestasi();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    static void kasus1Kelulusan() {
        tampilkanJudul("STUDI KASUS 1: KELULUSAN");
        int nilai = bacaIntRentang("Nilai akhir (0-100): ", 0, 100);
        int kehadiran = bacaIntRentang("Kehadiran (0-100): ", 0, 100);
        boolean remedial = bacaYaTidak("Apakah remedial sudah lulus? (y/n): ");

        if (nilai >= 70) {
            if (kehadiran >= 80) {
                if (nilai >= 90 && kehadiran >= 95) {
                    System.out.println("Lulus dengan predikat istimewa");
                } else {
                    System.out.println("Lulus");
                }
            } else {
                System.out.println("Nilai memenuhi, tetapi kehadiran kurang");
            }
        } else if (nilai >= 60) {
            if (kehadiran >= 90) {
                if (remedial) {
                    System.out.println("Lulus melalui remedial");
                } else {
                    System.out.println("Belum lulus: remedial belum diselesaikan");
                }
            } else {
                System.out.println("Belum lulus: nilai dan kehadiran belum memenuhi");
            }
        } else {
            System.out.println("Tidak lulus karena nilai di bawah batas remedial");
        }
    }

    static void kasus2AksesLab() {
        tampilkanJudul("STUDI KASUS 2: AKSES LABORATORIUM");
        boolean mahasiswaAktif = bacaYaTidak("Apakah mahasiswa masih aktif? (y/n): ");
        boolean disanksi = bacaYaTidak("Apakah sedang menjalani sanksi? (y/n): ");
        boolean sertifikasiKeselamatan =
                bacaYaTidak("Apakah sertifikasi keselamatan masih berlaku? (y/n): ");
        boolean izinDosen = bacaYaTidak("Apakah memiliki izin dosen? (y/n): ");
        boolean asistenLab = bacaYaTidak("Apakah bertugas sebagai asisten lab? (y/n): ");

        if (mahasiswaAktif) {
            if (!disanksi) {
                if (sertifikasiKeselamatan) {
                    if (izinDosen || asistenLab) {
                        System.out.println("Akses laboratorium diizinkan");
                    } else {
                        System.out.println("Akses ditolak: perlu izin dosen atau status asisten");
                    }
                } else {
                    System.out.println("Akses ditolak: sertifikasi keselamatan tidak berlaku");
                }
            } else {
                System.out.println("Akses ditolak: mahasiswa sedang menjalani sanksi");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak aktif");
        }
    }

    static void kasus3Wifi() {
        tampilkanJudul("STUDI KASUS 3: AKSES WI-FI KAMPUS");
        System.out.print("Jenis pengguna (MAHASISWA/DOSEN): ");
        String jenisPengguna = input.next().toUpperCase();
        boolean akunAktif = bacaYaTidak("Apakah akun aktif? (y/n): ");
        boolean akunDiblokir = bacaYaTidak("Apakah akun diblokir? (y/n): ");
        int sisaKuota = bacaIntRentang("Sisa kuota dalam GB: ", 0, 1000);

        if (jenisPengguna.equals("MAHASISWA") || jenisPengguna.equals("DOSEN")) {
            if (akunAktif) {
                if (!akunDiblokir) {
                    if (sisaKuota > 0) {
                        if (jenisPengguna.equals("DOSEN")) {
                            System.out.println("Akses Wi-Fi dosen diizinkan");
                        } else {
                            System.out.println("Akses Wi-Fi mahasiswa diizinkan");
                        }
                    } else {
                        System.out.println("Akses ditolak: kuota internet habis");
                    }
                } else {
                    System.out.println("Akses ditolak: akun diblokir");
                }
            } else {
                System.out.println("Akses ditolak: akun tidak aktif");
            }
        } else {
            System.out.println("Akses ditolak: hanya mahasiswa dan dosen yang dapat menggunakan Wi-Fi");
        }
    }

    static void kasus4BimbinganSkripsi() {
        tampilkanJudul("STUDI KASUS 4: KELAYAKAN BIMBINGAN SKRIPSI");
        int p1 = bacaIntRentang("Jumlah bimbingan P1: ", 0, 100);
        int p2 = bacaIntRentang("Jumlah bimbingan P2: ", 0, 100);
        boolean proposalDisetujui = bacaYaTidak("Apakah proposal sudah disetujui? (y/n): ");
        double kemiripan = bacaDoubleRentang("Persentase kemiripan dokumen (0-100): ", 0, 100);

        if (p1 >= 8) {
            if (p2 >= 4) {
                if (proposalDisetujui) {
                    if (kemiripan <= 25) {
                        System.out.println("Syarat bimbingan dan administrasi terpenuhi");
                    } else {
                        System.out.println("Belum dapat mendaftar: kemiripan dokumen melebihi 25%");
                    }
                } else {
                    System.out.println("Belum dapat mendaftar: proposal belum disetujui");
                }
            } else {
                System.out.println("Bimbingan P2 belum memenuhi minimum 4 kali");
            }
        } else {
            System.out.println("Bimbingan P1 belum memenuhi minimum 8 kali");
        }
    }

    static void kasus5Beasiswa() {
        tampilkanJudul("STUDI KASUS 5: SELEKSI BEASISWA");
        double ipk = bacaDoubleRentang("IPK (0-4): ", 0, 4);
        double penghasilanOrtu =
                bacaDoubleRentang("Penghasilan orang tua per bulan (Rp): ", 0, 1_000_000_000);
        int semester = bacaIntRentang("Semester saat ini: ", 1, 14);
        boolean prestasi = bacaYaTidak("Apakah memiliki prestasi akademik/nonakademik? (y/n): ");

        if (ipk >= 3.50) {
            if (semester <= 8) {
                if (penghasilanOrtu <= 3_000_000) {
                    if (prestasi) {
                        System.out.println("Memenuhi syarat beasiswa prioritas");
                    } else {
                        System.out.println("Memenuhi syarat beasiswa reguler");
                    }
                } else if (penghasilanOrtu <= 5_000_000) {
                    if (prestasi && ipk >= 3.75) {
                        System.out.println("Memenuhi syarat beasiswa prestasi");
                    } else {
                        System.out.println("Penghasilan melewati batas beasiswa reguler");
                    }
                } else {
                    System.out.println("Penghasilan melewati batas beasiswa");
                }
            } else {
                System.out.println("Tidak memenuhi syarat: semester melewati batas");
            }
        } else {
            System.out.println("Tidak memenuhi syarat: IPK minimal 3,50");
        }
    }

    static void kasus6DiskonMember() {
        tampilkanJudul("STUDI KASUS 6: PERHITUNGAN DISKON MEMBER");
        double belanja = bacaDoubleRentang("Total belanja (Rp): ", 0.01, 1_000_000_000);
        boolean member = bacaYaTidak("Apakah pelanggan memiliki member? (y/n): ");
        boolean voucher = bacaYaTidak("Apakah pelanggan memiliki voucher tambahan 5%? (y/n): ");
        double diskon = 0;

        if (member) {
            if (belanja >= 500_000) {
                diskon = 0.20;
            } else if (belanja >= 100_000) {
                diskon = 0.15;
            } else {
                diskon = 0.05;
            }
            if (voucher) {
                diskon += 0.05;
            }
        } else {
            if (belanja >= 500_000) {
                diskon = 0.10;
            } else if (belanja >= 100_000) {
                diskon = 0.05;
            }
            if (voucher && belanja >= 100_000) {
                diskon += 0.05;
            }
        }

        if (diskon > 0.25) {
            diskon = 0.25;
        }

        double nilaiDiskon = belanja * diskon;
        double totalBayar = belanja - nilaiDiskon;
        int poin = (int) (totalBayar / 10_000);

        System.out.printf("Diskon: %.0f%%%n", diskon * 100);
        System.out.printf("Nilai diskon: Rp%.2f%n", nilaiDiskon);
        System.out.printf("Total bayar: Rp%.2f%n", totalBayar);
        System.out.println("Poin yang diperoleh: " + poin);
    }

    static void kasus7Login() {
        tampilkanJudul("STUDI KASUS 7: LOGIN DENGAN VERIFIKASI");
        System.out.print("Username (demo: admin): ");
        String username = input.next();
        System.out.print("Password (demo: java123): ");
        String password = input.next();
        System.out.print("Kode OTP (demo: 4826): ");
        String otp = input.next();
        int percobaanGagal = bacaIntRentang("Jumlah percobaan gagal sebelumnya (0-5): ", 0, 5);
        boolean akunAktif = bacaYaTidak("Apakah akun aktif? (y/n): ");

        if (percobaanGagal < 5) {
            if (akunAktif) {
                if (username.equals("admin")) {
                    if (password.equals("java123")) {
                        if (otp.equals("4826")) {
                            System.out.println("Login berhasil dengan verifikasi dua langkah");
                        } else {
                            System.out.println("Login gagal: kode OTP salah");
                        }
                    } else {
                        System.out.println("Login gagal: password salah");
                    }
                } else {
                    System.out.println("Login gagal: username tidak ditemukan");
                }
            } else {
                System.out.println("Login gagal: akun tidak aktif");
            }
        } else {
            System.out.println("Login ditolak: akun terkunci setelah 5 percobaan gagal");
        }
    }

    static void kasus8SeleksiAsisten() {
        tampilkanJudul("STUDI KASUS 8: SELEKSI ASISTEN LAB");
        double ipk = bacaDoubleRentang("IPK (0-4): ", 0, 4);
        int nilaiTes = bacaIntRentang("Nilai tes pemrograman (0-100): ", 0, 100);
        int nilaiWawancara = bacaIntRentang("Nilai wawancara (0-100): ", 0, 100);
        boolean tersediaJadwal = bacaYaTidak("Apakah jadwal tersedia? (y/n): ");

        if (ipk >= 3.25) {
            if (nilaiTes >= 75) {
                if (nilaiWawancara >= 70) {
                    if (tersediaJadwal) {
                        if (nilaiTes >= 90 && nilaiWawancara >= 85) {
                            System.out.println("Diterima sebagai asisten lab prioritas");
                        } else {
                            System.out.println("Diterima sebagai asisten lab");
                        }
                    } else {
                        System.out.println("Lolos seleksi, tetapi jadwal tidak tersedia");
                    }
                } else {
                    System.out.println("Tidak lolos: nilai wawancara minimal 70");
                }
            } else {
                System.out.println("Tidak lolos: nilai tes minimal 75");
            }
        } else {
            System.out.println("Tidak lolos: IPK minimal 3,25");
        }
    }

    static void kasus9Parkir() {
        tampilkanJudul("STUDI KASUS 9: BIAYA PARKIR");
        System.out.print("Jenis kendaraan (MOTOR/MOBIL): ");
        String jenis = input.next().toUpperCase();
        int jam = bacaIntRentang("Durasi parkir dalam jam (1-24): ", 1, 24);
        boolean tiketValid = bacaYaTidak("Apakah tiket parkir masih tersedia? (y/n): ");
        int biaya;

        if (jenis.equals("MOTOR")) {
            if (jam <= 2) {
                biaya = 2_000;
            } else {
                biaya = 2_000 + (jam - 2) * 1_000;
            }
            if (biaya > 15_000) {
                biaya = 15_000;
            }
            if (!tiketValid) {
                biaya += 10_000;
            }
        } else if (jenis.equals("MOBIL")) {
            if (jam <= 2) {
                biaya = 5_000;
            } else {
                biaya = 5_000 + (jam - 2) * 2_000;
            }
            if (biaya > 50_000) {
                biaya = 50_000;
            }
            if (!tiketValid) {
                biaya += 25_000;
            }
        } else {
            System.out.println("Jenis kendaraan tidak tersedia");
            return;
        }

        System.out.println("Total biaya parkir: Rp" + biaya);
    }

    static void kasus10DanaPrestasi() {
        tampilkanJudul("STUDI KASUS 10: VALIDASI DANA PRESTASI");
        System.out.print("Kategori (BELMAWA/BAKORMA/MANDIRI/PKM): ");
        String kategori = input.next().toUpperCase();
        double dana = bacaDoubleRentang("Jumlah dana (Rp): ", 0, 1_000_000_000);
        boolean proposalDisetujui = bacaYaTidak("Apakah proposal sudah disetujui? (y/n): ");
        boolean laporanLengkap = bacaYaTidak("Apakah laporan kegiatan sudah lengkap? (y/n): ");

        if (dana > 0) {
            if (proposalDisetujui) {
                if (laporanLengkap) {
                    if (kategori.equals("BELMAWA")) {
                        if (dana >= 1_000_000) {
                            System.out.println("Dana BELMAWA siap diproses");
                        } else {
                            System.out.println("Dana BELMAWA minimal Rp1.000.000");
                        }
                    } else if (kategori.equals("BAKORMA")) {
                        if (dana >= 500_000) {
                            System.out.println("Dana BAKORMA siap diproses");
                        } else {
                            System.out.println("Dana BAKORMA minimal Rp500.000");
                        }
                    } else if (kategori.equals("MANDIRI")) {
                        if (dana >= 250_000) {
                            System.out.println("Dana MANDIRI siap diproses");
                        } else {
                            System.out.println("Dana MANDIRI minimal Rp250.000");
                        }
                    } else if (kategori.equals("PKM")) {
                        if (dana >= 750_000) {
                            System.out.println("Dana PKM siap diproses");
                        } else {
                            System.out.println("Dana PKM minimal Rp750.000");
                        }
                    } else {
                        System.out.println("Kategori prestasi tidak dikenal");
                    }
                } else {
                    System.out.println("Dana belum dapat diproses: laporan belum lengkap");
                }
            } else {
                System.out.println("Dana belum dapat diproses: proposal belum disetujui");
            }
        } else {
            System.out.println("Dana harus lebih besar dari nol");
        }
    }

    static int bacaInt(String pesan) {
        while (true) {
            System.out.print(pesan);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            System.out.println("Masukkan bilangan bulat yang valid");
            input.next();
        }
    }

    static void tampilkanJudul(String judul) {
        System.out.println();
        System.out.println("========================================");
        System.out.println(judul);
        System.out.println("========================================");
        System.out.println();
    }

    static int bacaIntRentang(String pesan, int minimum, int maksimum) {
        int nilai;
        do {
            nilai = bacaInt(pesan);
            if (nilai < minimum || nilai > maksimum) {
                System.out.println("Nilai harus antara " + minimum + " dan " + maksimum);
            }
        } while (nilai < minimum || nilai > maksimum);
        return nilai;
    }

    static double bacaDouble(String pesan) {
        while (true) {
            System.out.print(pesan);
            if (input.hasNextDouble()) {
                return input.nextDouble();
            }
            System.out.println("Masukkan angka yang valid");
            input.next();
        }
    }

    static double bacaDoubleRentang(String pesan, double minimum, double maksimum) {
        double nilai;
        do {
            nilai = bacaDouble(pesan);
            if (Double.isNaN(nilai) || Double.isInfinite(nilai)
                    || nilai < minimum || nilai > maksimum) {
                System.out.println("Nilai harus antara " + minimum + " dan " + maksimum);
            }
        } while (Double.isNaN(nilai) || Double.isInfinite(nilai)
                || nilai < minimum || nilai > maksimum);
        return nilai;
    }

    static boolean bacaYaTidak(String pesan) {
        while (true) {
            System.out.print(pesan);
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("y")) {
                return true;
            }
            if (jawaban.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Jawab dengan y atau n");
        }
    }
}
