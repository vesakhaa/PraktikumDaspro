package jobSheet09;

import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        int[] daftarPesanan = new int[daftarMenu.length]; 

        double totalBayar = 0;


        System.out.print("Masukkan jumlah jenis menu yang ingin dipesan: ");
        int jumlahJenis = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer newline

        // Linear Search
        for (int i = 0; i < jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama menu: ");
            String menuDicari = sc.nextLine();
            
            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();
            sc.nextLine(); 

            boolean ditemukan = false;
            
            for (int j = 0; j < daftarMenu.length; j++) {
                if (menuDicari.equalsIgnoreCase(daftarMenu[j])) {
                    ditemukan = true;

                    daftarPesanan[j] += jumlahItem; 
                    
                    System.out.println("Berhasil memesan " + jumlahItem + " " + daftarMenu[j]);
                    break; 
                }
            }

            if (!ditemukan) {
                System.out.println("Maaf, menu '" + menuDicari + "' tidak tersedia.");
            }
        }

        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < daftarPesanan.length; i++) {
            if (daftarPesanan[i] > 0) {
                double subTotal = daftarPesanan[i] * daftarHarga[i];
                totalBayar += subTotal;
                System.out.println(daftarMenu[i] + " x " + daftarPesanan[i] + " = Rp " + (int)subTotal);
            }
        }
        
        System.out.println("---------------------------");
        System.out.println("TOTAL BAYAR = Rp " + (int)totalBayar);
    }
}
