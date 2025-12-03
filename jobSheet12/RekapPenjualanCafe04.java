package jobSheet12;

import java.util.Scanner;

public class RekapPenjualanCafe04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine(); 

        String[] namaMenu = new String[jumlahMenu];
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n--- Input Nama Menu ---");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        inputPenjualan(dataPenjualan, namaMenu, jumlahHari);

        tampilkanData(dataPenjualan, namaMenu, jumlahHari);

        menuTertinggi(dataPenjualan, namaMenu, jumlahHari);

        rataRata(dataPenjualan, namaMenu, jumlahHari);
    }

    public static void inputPenjualan(int[][] data, String[] menu, int hari) {
        System.out.println("\n--- Input Data Penjualan ---");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanData(int[][] data, String[] menu, int hari) {
        System.out.println("\n--- Rekap Data Penjualan ---");
        
        System.out.print("Menu\t\t");
        for (int i = 1; i <= hari; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
            if (menu[i].length() < 8) System.out.print("\t\t"); 
            else System.out.print("\t"); 

            for (int j = 0; j < hari; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] data, String[] menu, int hari) {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < hari; j++) {
                totalPerMenu += data[i][j];
            }

            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\n--- Menu Dengan Penjualan Tertinggi ---");
        System.out.println("Menu: " + menuTerlaris);
        System.out.println("Total Penjualan: " + maxPenjualan);
    }

    public static void rataRata(int[][] data, String[] menu, int hari) {
        System.out.println("\n--- Rata-rata Penjualan Setiap Menu ---");
        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int j = 0; j < hari; j++) {
                total += data[i][j];
            }
            double avg = total / hari;
            System.out.printf("%s: %.2f\n", menu[i], avg);
        }
    }
}