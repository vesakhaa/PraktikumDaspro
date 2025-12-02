package jobSheet12;

import java.util.Scanner;

public class Kubus04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();


        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + volume);

        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan kubus adalah " + luasPermukaan);
    }

    static int hitungVolume(int S) {
        return S * S * S;
    }

    static int hitungLuasPermukaan(int S) {
        return 6 * S * S; 
    }
}