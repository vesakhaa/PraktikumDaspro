package jobSheet08;

import java.util.Scanner;

public class nilaiKelompokFor04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalNilai;
        double rataNilai;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;

        // Modif FOR
        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata: " + rataNilai);
            System.out.println("---");

            // Modif Rata-Rata Tinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
        }
        input.close();

        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok "
                + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
    }
}
