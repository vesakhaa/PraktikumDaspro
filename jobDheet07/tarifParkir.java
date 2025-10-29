import java.util.Scanner;

public class tarifParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisKendaraan;
        int durasi;
        int totalBayar = 0;

        System.out.println("=== PROGRAM PARKIR KENDARAAN ===");

        do {
            // Input jenis kendaraan sebagai teks
            System.out.print("\nMasukkan jenis kendaraan (mobil/motor, ketik 'selesai' untuk keluar): ");
            jenisKendaraan = input.next().toLowerCase(); // ubah ke huruf kecil agar mudah divalidasi

            // Jika input "selesai", keluar dari perulangan
            if (jenisKendaraan.equals("selesai")) {
                System.out.println("Input selesai. Menghitung total pembayaran...");
                break;
            }

            // Validasi jenis kendaraan
            if (!jenisKendaraan.equals("mobil") && !jenisKendaraan.equals("motor")) {
                System.out.println("Jenis kendaraan tidak valid! Coba lagi.");
                continue;
            }

            // Input durasi parkir
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            // Validasi durasi parkir
            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid! Masukkan angka lebih dari 0.");
                continue;
            }

            int biaya = 0;

            // Penentuan tarif parkir berdasarkan durasi dan jenis kendaraan
            if (durasi > 5) {
                biaya = 12500; // Tarif flat jika durasi lebih dari 5 jam
            } else if (jenisKendaraan.equals("mobil")) {
                biaya = durasi * 3000; // Tarif mobil per jam
            } else if(jenisKendaraan.equals("motor")){
                biaya = durasi * 2000; // Tarif motor per jam
            }

            // Akumulasi total pendapatan
            totalBayar += biaya;

            // Tampilkan biaya parkir untuk kendaraan saat ini
            System.out.println("Biaya parkir kendaraan ini: Rp " + biaya);
        } while (true);

        // Ringkasan akhir
        System.out.println("\n=== RINGKASAN PARKIR HARI INI ===");
        System.out.println("Total pendapatan parkir: Rp " + totalBayar);

        input.close();
    }
}