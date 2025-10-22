package jobsheet06;
import java.util.Scanner;

public class biayaListrikLat5 {
    public static void main(String[] args) {
        double biayaTetap = 50000;
        double PPN = 0.1;
        double biayaTambahan = 0;
        
        Scanner sc = new Scanner(System.in);

        //input kwh
        System.out.println("masukkan daya yang digunakan (900 kWh, 1300 kWh, 2200 kWh, 5500 kWh)");
        String daya = sc.next();

        System.out.println("Masukkan KWH yang digunakan: ");
        double KWH = sc.nextDouble();

        //menghitung biaya tambahan
        if(daya.equalsIgnoreCase("900")){
            biayaTambahan = 1300*KWH;
        }else if(daya.equalsIgnoreCase("1300")){
            biayaTambahan = 1500*KWH;
        }else if(daya.equalsIgnoreCase("2200")){
            biayaTambahan = 1700*KWH;
        }else if(daya.equalsIgnoreCase("5500")){
            biayaTambahan = 3500*KWH;
        }else {System.out.println("Daya yang diinputkan invalid");
        return;
    }
        

        //menghitung biaya sebelum PPN
        double biayaNonPPN = biayaTetap + biayaTambahan;

        //menghitung ppn
        double jumlahPPN= biayaNonPPN*PPN;
 
        // menghitung biaya yang harus dibayar konsumen
        int totalBiaya = (int) (biayaNonPPN-jumlahPPN);

        System.out.println("Biaya yang harus anda bayar adalah: Rp "+totalBiaya);
    }
}
