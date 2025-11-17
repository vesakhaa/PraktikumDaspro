package jobSheet09;

import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMhs=new int[10];
        double total=0;
        double rata2;
        int jmlLulus = 0;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for(int i = 0; i < nilaiMhs.length; i ++){
            total += nilaiMhs[i];
            if(nilaiMhs[i]>=70){
                jmlLulus++;
            }

        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus dengan nilai >70 adalah: "+jmlLulus);
    }
}
