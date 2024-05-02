/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoscanner;
import java.util.Scanner;
public class demo {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi : ");
int tuoi = Integer.parseInt(sc.nextLine());
System.out.println("Nhap dia chi : ");
String diachi = sc.nextLine();
System.out.println("Nhap so dien thoai: ");
int sdt = Integer.parseInt(sc.nextLine());
System.out.println("Nhap chuyen nganh: ");
String cn = sc.nextLine();
// Print out
System.out.println("\nBan ten la : " + ten);
System.out.println("Ban " + tuoi + " tuoi");
System.out.println("Dia chi cua ban la : " + diachi);
System.out.println("So dien thoai cua ban la : " + sdt);
System.out.println("Chuyen nganh cua ban la : " + cn);
        sc.close();
    }
    
}
