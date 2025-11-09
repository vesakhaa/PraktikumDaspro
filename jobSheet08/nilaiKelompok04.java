package jobSheet08;

import java.util.Scanner;

public class nilaiKelompok04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai = 0, totalNilai = 0, rataNilai = 0;
        int i = 1;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + " = ");
                nilai = input.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + " = " + rataNilai);
            i++;
        }
        input.close();

        System.out.println("Program selesai.");
    }
}
