package jobSheet10;

import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        
        System.out.println("---");

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];
        String[] namaMatkul = new String[jumlahMatkul];

        for (int j = 0; j < jumlahMatkul; j++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (j + 1) + ": ");
            input.nextLine();
            namaMatkul[j] = input.nextLine();
        }
        
        System.out.println("---");

        System.out.println("## Input Nilai dan Rata-rata per Siswa");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai untuk Siswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah **" + namaMatkul[j] + "** : ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            
            double rataRataSiswa = totalPerSiswa / jumlahMatkul;
            System.out.printf("Nilai rata-rata Siswa ke-%d: %.2f\n", (i + 1), rataRataSiswa);
        }

        System.out.println("\n=====================================");
        
        System.out.println("## Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            double rataRataMatkul = totalPerMatkul / jumlahSiswa;

            System.out.printf("Mata Kuliah **%s**: %.2f\n", namaMatkul[j], rataRataMatkul);
        }
        
        input.close();
    }
}
