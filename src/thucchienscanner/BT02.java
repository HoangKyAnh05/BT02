package thucchienscanner;
import java.util.Scanner;

public class BT02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao so bat ky : ");
        int a = sc.nextInt();
        if ( a % 2 == 0 ){
            printSquare(a);
           
        }else{
        printTriangle(a);
                }
        sc.close();
    }
    public static void printSquare(int b){
        for (int i = 0; i< b; i++){
            for(int j = 0; j< b; j++){
                System.out.print("* ");
            }
      System.out.println();
        }
    }
    public static void printTriangle(int c){
        for(int i = 0; i < c; i++){
            for ( int j = 0; j<c-i; j++){
                 System.out.print(" ");
            }
            for (int k = 0; k <2*i+1; k++){
            System.out.print("*");
        }
             System.out.println();
        }
       
    }
            
}
