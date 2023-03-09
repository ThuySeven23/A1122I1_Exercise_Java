package lop_circle_va_lop_cylinder;

public class Circle {
    private double radius;
    private String color;


    public Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateAreaCircle(){
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return  "Circle: \n" +
                "Radius = " + radius + "\n" +
                "Color = " + color + "\n" +
                "The Area of Circle = " + calculateAreaCircle() + "\n"
                ;
    }



}
