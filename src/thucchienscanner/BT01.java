package thucchienscanner;
import java.util.Scanner;


public class BT01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so a : ");
    int a = Integer.parseInt(sc.nextLine());
    System.out.println("Nhap vao so b : ");
    int b = Integer.parseInt(sc.nextLine());
    System.out.println("So thu nhat la so hoan hao : " + isPN(a));
    System.out.println("So thu hai la so hoan hao : " + isPN(b));
    sc.close();
 }
    public static boolean isPN(int c){
        int sum = 0;
        for( int i = 1; i < c; i++ ){
            if (c % i == 0){
             sum += i;
          
         }
        }
        return sum == c;
    }
    
}