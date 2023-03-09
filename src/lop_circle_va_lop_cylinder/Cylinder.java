package lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateAreaCylinder(){
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {

        return  "Cylinder: \n" +
                "Height = " + height + "\n" +
                "The Area of Cylinder = " + calculateAreaCylinder() + "\n"
                ;
    }
}
