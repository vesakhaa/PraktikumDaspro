
import java.util.Scanner;

public class bilanganMinMax05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max, min;

        System.out.println("Input bilangan A:");
        int A = sc.nextInt();
        System.out.println("Input bilangan B:");
        int B = sc.nextInt();
        System.out.println("Input bilangan C:");
        int C = sc.nextInt();

        if(A > B){
            if(A > C){
                max = A;
            }else{
                max = C;
            }
        }else{
            if(B > C){
                max = B;
            }else{
                max = C;
            }
        }
        if(A < B){
            if(A < C){
                min = A;
            }else{
                min = C;
            }
        }else{
            if(B < C){
                min = B;
            }else{
                min = C;
            }
        }

        System.out.println("Nilai maksimum adalah: "+ max);
        System.out.println("Nilai minimum adalah: "+ min);
    }
}
