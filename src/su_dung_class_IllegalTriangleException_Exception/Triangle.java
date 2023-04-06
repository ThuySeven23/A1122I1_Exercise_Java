package su_dung_class_IllegalTriangleException_Exception;

import java.util.Scanner;

public class Triangle {
    public Triangle(int a , int b , int c) throws IllegalTriangleException {
        if (a + b > c || b + c > a || c + a > b)
            System.out.println("Triangle follows the rule");
        else
            System.out.println("Triangle doesn't follow the rule");
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            int a,b,c;
            System.out.print("Enter a: "); a = sc.nextInt();
            System.out.print("Enter b: "); b = sc.nextInt();
            System.out.print("Enter c: "); c = sc.nextInt();
            System.out.println("Triangle(" + a + "," + b + "," + c + ")");
            Triangle triangle = new Triangle(a,b,c);
        }catch (InputMismatchException i){
            System.out.println("Error, please enter again !!");
        }catch (Exception e){
            System.err.println("Exception occured: " + e);
        }
    }

}
