package jobsheet06;
import java.util.Scanner;

public class rentMobilLat3 {
    public static void main(String[] args) {
       double biayaSewa = 300000;
        double biayaSupir = 200000;
        double BBM = 1000;
        double totalBiaya;

        Scanner sc = new Scanner(System.in);

        //menghitung biaya sewa dan supir
        double biayaMobil = biayaSewa + biayaSupir;
        

        //input lama sewa
        System.out.println("Masukkan lama sewa: ");
        double lamaSewa = sc.nextDouble();

        //input jarak tempuh
        System.out.println("Masukkan jarak tempuh: ");
        double jarakTempuh = sc.nextDouble();

        //menghitung biaya bbm
        double biayaBBM = BBM * jarakTempuh;

        if(lamaSewa >=0 && lamaSewa<=30){
            totalBiaya = biayaMobil*lamaSewa + biayaBBM;
            System.out.println("Biaya yang harus anda bayar adalah: Rp "+ totalBiaya);
        }else{
            System.out.println("Lama sewa tidak boleh lebih dari 30 hari");
        }
    }
}
