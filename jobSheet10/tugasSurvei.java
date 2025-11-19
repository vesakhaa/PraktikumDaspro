package jobSheet10;

import java.util.Scanner;

public class tugasSurvei {
    public static void main(String[] args) {
        // Mendefinisikan jumlah Responden dan Pertanyaan (ukuran array)
        int NUM_RESPONDEN = 10;
        int NUM_PERTANYAAN = 6;

        int[][] dataSurvei = new int[NUM_RESPONDEN][NUM_PERTANYAAN];
        
        // Variabel untuk menyimpan total semua nilai, digunakan untuk rata-rata keseluruhan
        double totalKeseluruhan = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- MEMULAI INPUT DATA SURVEI ---");

        for (int i = 0; i < NUM_RESPONDEN; i++) {

            for (int j = 0; j < NUM_PERTANYAAN; j++) {

                System.out.printf("Masukkan nilai (1-5) untuk Responden %d, Pertanyaan %d: ", (i + 1), (j + 1));
                
                int nilai = input.nextInt();

                dataSurvei[i][j] = nilai;

                totalKeseluruhan += nilai;
            }
            System.out.println("---------------------------------");
        }

        System.out.println("\n--- RATA-RATA PER RESPONDEN ---");

        for (int i = 0; i < NUM_RESPONDEN; i++) {
            double totalResponden = 0;

            for (int j = 0; j < NUM_PERTANYAAN; j++) {
                totalResponden += dataSurvei[i][j];
            }

            double rataRata = totalResponden / NUM_PERTANYAAN;
            System.out.printf("Rata-rata Responden %d: %.2f\n", (i + 1), rataRata);
        }

        System.out.println("\n--- RATA-RATA PER PERTANYAAN ---");

        for (int j = 0; j < NUM_PERTANYAAN; j++) {
            double totalPertanyaan = 0;

            for (int i = 0; i < NUM_RESPONDEN; i++) {
                totalPertanyaan += dataSurvei[i][j];
            }

            double rataRata = totalPertanyaan / NUM_RESPONDEN;
            System.out.printf("Rata-rata Pertanyaan %d: %.2f\n", (j + 1), rataRata);
        }

        System.out.println("\n--- RATA-RATA KESELURUHAN ---");

        final int JUMLAH_TOTAL_DATA = NUM_RESPONDEN * NUM_PERTANYAAN;

        double rataRataKeseluruhan = totalKeseluruhan / JUMLAH_TOTAL_DATA;
        
        System.out.printf("Rata-rata Nilai Survei Keseluruhan: %.2f\n", rataRataKeseluruhan);

        input.close();
    }
}
