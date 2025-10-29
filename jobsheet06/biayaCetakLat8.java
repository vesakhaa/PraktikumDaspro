package jobSheet06;

import java.util.Scanner;

public class biayaCetakLat8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int biayaPerHalaman = 200;
        int beratKertasPerLembar = 3; // gram
        int beratKemasan = 300;       // gram
        int biayaPengirimanPerKg = 15000;
        int gramPerKg = 1000;

        // input jumlah halaman
        System.out.print("Masukkan jumlah halaman buku: ");
        int jumlahHalaman = input.nextInt();
        input.nextLine(); // membersihkan newline

        // input jenis cover
        System.out.print("Masukkan jenis cover (hard cover / soft cover): ");
        String jenisCover = input.nextLine().toLowerCase();

        int biayaJilid = 0;
        int beratCover = 0;

        switch (jenisCover) {
            case "hard cover":
                biayaJilid = 20000;
                beratCover = 250;
                break;
            case "soft cover":
                biayaJilid = 10000;
                beratCover = 100;
                break;
            default:
                System.out.println("Jenis cover tidak valid. Gunakan 'hard cover' atau 'soft cover'.");
                return;
        }

        // menghitung biaya cetak
        int biayaCetak = jumlahHalaman * biayaPerHalaman;

        // menghitung berat kertas (bolak-balik)
        int jumlahLembar = (int) Math.ceil(jumlahHalaman / 2.0);
        int beratKertas = jumlahLembar * beratKertasPerLembar;

        // menghitung berat total paket (gram dan kg)
        int totalBeratGram = beratKertas + beratCover + beratKemasan;
        int totalBeratKg = (int) Math.ceil((double) totalBeratGram / gramPerKg);

        // menghitung biaya pengiriman
        int biayaPengiriman = totalBeratKg * biayaPengirimanPerKg;

        // menghitung total biaya
        int totalBiaya = biayaCetak + biayaJilid + biayaPengiriman;

        // Output
        System.out.println("Total biaya yang harus dibayar adalah: Rp " + totalBiaya);
    }
}