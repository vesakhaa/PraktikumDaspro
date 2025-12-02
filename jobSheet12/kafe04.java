package jobSheet12;
import java.util.Scanner;

public class kafe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();

        System.out.print("Masukkan kode promo (atau '-' jika tidak ada): ");
        String kodePromo = sc.next();

        Menu(nama, isMember, kodePromo);

        int totalKeseluruhan = 0;
        int pilihanMenu, banyakItem;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (0 untuk selesai): ");
            pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;

            System.out.println("Subtotal pesanan: Rp." + totalHarga);
        }

        if (isMember) {
            totalKeseluruhan -= totalKeseluruhan * 10 / 100;
            System.out.println("Diskon member 10% diterapkan.");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalKeseluruhan -= totalKeseluruhan * 50 / 100;
            System.out.println("Diskon promo 50% diterapkan.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalKeseluruhan -= totalKeseluruhan * 30 / 100;
            System.out.println("Diskon promo 30% diterapkan.");
        }

        System.out.println("\n===== Ringkasan Pesanan =====");
        System.out.println("Total keseluruhan pesanan Anda: Rp." + totalKeseluruhan);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("\nSelamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            System.out.println("Menu tidak valid!");
            return 0;
        }

        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
}