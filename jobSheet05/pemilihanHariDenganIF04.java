
import java.util.Scanner;

public class pemilihanHariDenganIF04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka 1-7");
        int hari = sc.nextInt();

        if(hari >= 1 && hari <=5 ){
            System.out.println("its a Weekday");
        }else if(hari == 6 || hari == 7){
            System.out.println("its a Weekend");
        }else{
            System.out.println("invalid number");
        }
    }
}
