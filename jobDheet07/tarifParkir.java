import java.util.Scanner;

public class tarifParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int jenisKendaraan, durasi; 
        int totalBayar = 0; 


        
        do {
            // Input jenis kendaraan
            System.out.print("\nMasukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Selesai): ");
            jenisKendaraan = input.nextInt();

            // Jika input 0, keluar dari perulangan
            if (jenisKendaraan == 0) {
                System.out.println("Input selesai. Menghitung total pembayaran...");
                break;
            }

            // Validasi jenis kendaraan
            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid! Coba lagi.");
                continue; // Kembali ke awal perulangan
            }

            // Input durasi parkir
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            // Validasi durasi parkir
            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid! Masukkan angka lebih dari 0.");
                continue; // Kembali ke awal perulangan
            }

            int biaya = 0; 

            // Penentuan tarif parkir berdasarkan durasi dan jenis kendaraan
            if (durasi > 5) {
                biaya = 12500; // Tarif flat jika durasi lebih dari 5 jam
            } else if (jenisKendaraan == 1) {
                biaya = durasi * 3000; // Tarif mobil per jam
            } else {
                biaya = durasi * 2000; // Tarif motor per jam
            }

            // Akumulasi total pendapatan
            totalBayar += biaya;

            // Tampilkan biaya parkir untuk kendaraan saat ini
            System.out.println("Biaya parkir kendaraan ini: Rp " + biaya);
        } while (true); 

 
        System.out.println("\n=== RINGKASAN PARKIR HARI INI ===");
        System.out.println("Total pendapatan parkir: Rp " + totalBayar);

        input.close(); 
    }
}