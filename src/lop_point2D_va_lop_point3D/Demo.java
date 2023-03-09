package lop_point2D_va_lop_point3D;

public class Demo {
    public static void main(String[] args) {
        Point2D point2 = new Point2D();
        point2.setXY(3,4);
        System.out.println(point2.toString());

        Point3D point3 = new Point3D();
        point3.setXYZ(5,6,7);
        System.out.println(point3.toString());
    }
}
