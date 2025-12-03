package jobSheet12;

import java.util.Scanner;

public class NilaiMahasiswa04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        double[] nilaiMhs = new double[N];

        isianArray(nilaiMhs, N);

        tampilArray(nilaiMhs);

        double totalNilai = hitungTotal(nilaiMhs);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total Nilai Seluruh Mahasiswa: " + totalNilai);

        sc.close();
    }
    
    public static void isianArray(double[] nilaiArray, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Pengisian Nilai Mahasiswa ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiArray[i] = sc.nextDouble();
        }
        sc.close();
    }

    public static void tampilArray(double[] nilaiArray) {
        System.out.println("\n--- Daftar Nilai Mahasiswa ---");
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiArray[i]);
        }
    }

    public static double hitungTotal(double[] nilaiArray) {
        double total = 0;
        for (double nilai : nilaiArray) {
            total += nilai;
        }
        return total;
    }
}