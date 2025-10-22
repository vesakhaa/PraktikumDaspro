package jobsheet06;

import java.util.Scanner;

public class rentMobilLat4 {

    public static void main(String[] args) {
        double biayaSewa = 300000;
        double biayaSupir = 200000;
        double pertalite = 1000;
        double pertamax = 1300;
        String bbm;
        Double biayaBBM = null;

        Scanner sc = new Scanner(System.in);

        //menghitung biaya sewa dan supir
        double biayaMobil = biayaSewa + biayaSupir;

        System.out.println("Masukkan jenis bbm(pertalite/pertamax): ");
        bbm = sc.next();

        //input jarak tempuh
        System.out.println("Masukkan jarak tempuh: ");
        double jarakTempuh = sc.nextDouble();

        //menghitung biaya bbm
        if (bbm.equalsIgnoreCase("pertalite")) {
            biayaBBM = jarakTempuh * pertalite;
        } else if (bbm.equalsIgnoreCase("pertamax")) {
            biayaBBM = jarakTempuh * pertamax;
        }

        //input lama sewa
        System.out.println("Masukkan lama sewa: ");
        double lamaSewa = sc.nextDouble();

        if (lamaSewa >= 0 && lamaSewa <= 30) {
            double totalBiaya = biayaMobil * lamaSewa + biayaBBM;

            if (totalBiaya >= 2000000) {
                double diskon = totalBiaya * 0.05;
                totalBiaya = totalBiaya - diskon;
            }
            System.out.println("Biaya yang harus anda bayar adalah: Rp " + totalBiaya);
        } else {
            System.out.println("Lama sewa tidak boleh lebih dari 30 hari");
        }
    }
}
