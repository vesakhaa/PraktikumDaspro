import java.util.Scanner;

public class cetakKRS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // if (uktLunas){
        //     System.out.println("Pembayaran UKT Terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else{
        //     System.out.println("Regulasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        // }
       
        System.out.println(uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan DPA" : "Regulasi ditolak Silahkan Lunasi UKT terlebih dahulu");
 
    }
}
