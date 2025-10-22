package jobsheet06;

import java.util.Scanner;

public class biayaListrikLat6 {
    public static void main(String[] args) {
        double biayaTetap = 50000;
        double PPN = 0.1;
        double biayaTambahan = 0;

        Scanner sc = new Scanner(System.in);

        // input daya
        System.out.println("Masukkan daya yang digunakan (900 kWh, 1300 kWh, 2200 kWh, 5500 kWh):");
        String daya = sc.next();

        System.out.println("Masukkan KWH yang digunakan:");
        double KWH = sc.nextDouble();

        // menghitung biaya tambahan dengan switch case
        switch (daya) {
            case "900" -> biayaTambahan = 1300 * KWH;
            case "1300" -> biayaTambahan = 1500 * KWH;
            case "2200" -> biayaTambahan = 1700 * KWH;
            case "5500" -> biayaTambahan = 3500 * KWH;
            default -> {
                System.out.println("Daya yang diinputkan invalid");
                return;
            }
        }

        // menghitung biaya sebelum PPN
        double biayaNonPPN = biayaTetap + biayaTambahan;

        // menghitung PPN
        double jumlahPPN = biayaNonPPN * PPN;

        // menghitung total biaya yang harus dibayar
        int totalBiaya = (int) (biayaNonPPN - jumlahPPN);

        System.out.println("Biaya yang harus anda bayar adalah: Rp " + totalBiaya);
    }
}