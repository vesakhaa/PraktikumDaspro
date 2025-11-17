package jobSheet09;

import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = input.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0;
        double rata2;
        
        int jumlahLulus = 0;
        double totalTidakLulus = 0;
        int jumlahTidakLulus = 0; 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        int max = nilaiMhs[0];
        int min = nilaiMhs[0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i]; 

            if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++; 
            }
        }

        rata2 = total / nilaiMhs.length;

        System.out.println("----------------------------------");
        System.out.println("Rata-rata nilai keseluruhan = " + rata2);

        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);
        } 

        System.out.println("Nilai tertinggi = " + max);
        System.out.println("Nilai terendah = " + min);
    }
}