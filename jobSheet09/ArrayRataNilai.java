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
        
        // Variabel untuk mahasiswa lulus
        int jumlahLulus = 0;
        
        // Variabel untuk mahasiswa TIDAK lulus
        double totalTidakLulus = 0;
        int jumlahTidakLulus = 0; // Tetap butuh ini untuk pembagi rumus rata-rata

        // Input Nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        // Proses Hitung
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i]; // Untuk rata-rata keseluruhan

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            } else {
                // Jika tidak lulus, tambahkan nilainya ke total khusus
                totalTidakLulus += nilaiMhs[i];
                // Hitung orangnya (hanya untuk pembagi nanti)
                jumlahTidakLulus++; 
            }
        }

        rata2 = total / nilaiMhs.length;
        

        System.out.println("Rata-rata nilai lulus = " + rata2);
        // System.out.println("Banyaknya mahasiswa yang lulus (> 70) = " + jumlahLulus);

        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);
        } 
    }
}