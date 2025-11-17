package jobSheet09;

import java.util.Scanner;

public class SearchNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jum = input.nextInt();

        int[] arrNilai = new int[jum];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; 
                break;     
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }
        System.out.println();
    }
}