package xay_dung_lop_QuadraticEquation;

import java.util.Scanner;

public class Demo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Nhap a: "); a = sc.nextInt();
        System.out.print("Nhap b: "); b = sc.nextInt();
        System.out.print("Nhap c: "); c = sc.nextInt();

        final int DELTA = (b*b)-(4*a*c);

        //Tao phuong trinh bac 2:
        QuadraticEquation phuongTrinh = new QuadraticEquation(a,b,c);
        System.out.println(phuongTrinh.toString());
        if (false){
        }
        else{
            System.err.println("Giai: ");
            phuongTrinh.tinhNghiemPTB2(DELTA);
        }

    }
}
