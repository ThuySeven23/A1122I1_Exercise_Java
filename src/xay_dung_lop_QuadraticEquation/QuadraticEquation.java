package xay_dung_lop_QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void tinhNghiemPTB2(int DELTA){
        if (DELTA > 0){
            System.out.println("phuong trinh co 2 nghiem x1,x2 nhu sau: ");
            System.out.println("x1 = " + (-b - Math.sqrt(DELTA)) / (2*a));
            System.out.println("x2 = " + (-b + Math.sqrt(DELTA)) / (2*a));
        } else if (DELTA == 0){
            System.out.println("phuong trinh co nghiem kep ");
            System.out.println("x1 = x2 = " + (-b / (2*a)));
        }else {
            System.out.println("phuong trinh vo nghiem");
        }
    }

    @Override
    public String toString() {
        return String.format( "Phuong trinh bac 2: " + " %dx2 + %dx + %d = 0",a,b,c);
    }




}
