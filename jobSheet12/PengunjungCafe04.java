package jobSheet12;

public class PengunjungCafe04 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }

    static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Dasftar nama pengunjung: ");
        for(int i = 0; i<namaPengunjung.length; i++){
            System.out.println("- "+namaPengunjung[i]);
        }
    }
}
