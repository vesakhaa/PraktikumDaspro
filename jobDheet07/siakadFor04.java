import java.util.Scanner;
public class siakadFor04 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100, kkm=60;
        int lulus = 0, tidakLulus = 0;
        Scanner input = new Scanner(System.in);
        

        for (int i=1; i<=10; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = input.nextDouble();
            if(nilai > tertinggi){
                tertinggi=nilai;
            }
            if(nilai < terendah){
                terendah=nilai;
            }
            if(nilai >= kkm){
                lulus++;
            }else{
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai tertinggi: " + terendah);
        System.out.println("Jumlah siswa lulus: " + lulus);
        System.out.println("Jumlah siswa tidak lulus: " + tidakLulus);
    }
}
