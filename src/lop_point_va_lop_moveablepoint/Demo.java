package lop_point_va_lop_moveablepoint;

public class Demo {
    public static void main(String[] args) {
        MoveAblePoint car1 = new MoveAblePoint();
        System.out.println("Setting for car1");
        car1.setX(6);
        car1.setY(7);
        car1.setxSpeed(50);
        car1.setySpeed(70);
        System.out.println(car1);

        System.out.println();

        System.out.println("Setting for car2");
        MoveAblePoint car2 = new MoveAblePoint(4 , 5, 60 ,80);
        System.out.println(car2);
    }
}
