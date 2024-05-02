
package demoscanner;
import java.util.Scanner;
// Lay vi du khac phuc loi troi lenh
public class demo2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dia chi :" );
        String diachi = sc.nextLine();
        System.out.println("Nhap so tuoi :" );
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Dia chi cua ban la :" + diachi);
        System.out.println("Ban " + tuoi + " tuoi");
    }
}
