package jobsheet06;
import java.util.Scanner;

public class biayaCetakLat9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int biayaPerHalaman = 200;
        int biayaJilidHardCover = 20000;
        int beratKertasPerLembar = 3; // gram
        int beratHardCover = 250;     // gram
        int beratKemasan = 300;       // gram
        int biayaPengirimanPerKg = 15000;
        int biayaKurirKhusus = 20000;
        int gramPerKg = 1000;

        // input jumlah halaman
        System.out.print("Masukkan jumlah halaman buku: ");
        int jumlahHalaman = input.nextInt();
        input.nextLine(); // membersihkan newline

        // input kota pelanggan
        System.out.print("Masukkan kota pelanggan: ");
        String kota = input.nextLine().toLowerCase();

        // menghitung biaya cetak
        int biayaCetak = jumlahHalaman * biayaPerHalaman;

        // menghitung berat kertas (bolak-balik)
        int jumlahLembar = (int) Math.ceil(jumlahHalaman / 2.0);
        int beratKertas = jumlahLembar * beratKertasPerLembar;

        // menghitung berat paket (dirubah ke KG)
        int totalBeratGram = beratKertas + beratHardCover + beratKemasan;
        int totalBeratKg = (int) Math.ceil((double) totalBeratGram / gramPerKg);

        // menghitung biaya pengiriman
        int biayaPengiriman;
        if (kota.equals("malang") || kota.equals("batu")) {
            biayaPengiriman = biayaKurirKhusus;
        } else {
            biayaPengiriman = totalBeratKg * biayaPengirimanPerKg;
        }

        // menghitung total biaya yang harus dibayar konsumen
        int totalBiaya = biayaCetak + biayaJilidHardCover + biayaPengiriman;

        // Output
        System.out.println("Total biaya yang harus dibayar adalah: Rp " + totalBiaya);
    }
}