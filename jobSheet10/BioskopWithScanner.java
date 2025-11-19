package jobSheet10;

import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();
            System.out.print("Masukkan baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainya? (y/n): ");
            next = input.nextLine();

            if(next.equalsIgnoreCase("n")){
                break;
            }
        }
        
        input.close();
    }
}
