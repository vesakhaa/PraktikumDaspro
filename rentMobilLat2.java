import java.util.Scanner;

public class rentMobilLat2 {

    public static void main(String[] args) {
         double biayaSewa = 300000;
        double biayaSupir = 200000;
        double BBM = 1000;

        Scanner sc = new Scanner(System.in);

        //menghitung biaya sewa dan supir
        double biayaMobil = biayaSewa + biayaSupir;
        
        //input jarak tempuh
        System.out.println("Masukkan jarak tempuh: ");
        double jarakTempuh = sc.nextDouble();

        //menghitung biaya bbm
        double biayaBBM = BBM * jarakTempuh;

        //input lama sewa
        System.out.println("Masukkan lama sewa: ");
        double lamaSewa = sc.nextDouble();

        double totalBiaya = biayaMobil*lamaSewa + biayaBBM;

        if(totalBiaya >= 2000000){
            double diskon = totalBiaya*0.05;
            totalBiaya = totalBiaya-diskon;
        }

        System.out.println("Biaya yang harus anda bayar adalah: Rp "+ totalBiaya);

        

    
    }

}
