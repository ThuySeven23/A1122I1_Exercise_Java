package access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius , String color) {
        this.radius = radius;
        this.color = color;
    }

    public double calculateAreaCircle() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return  "Circle: r = " + radius + " & color = " + color + "\n" +
                "The Area of Circle: " + calculateAreaCircle() + "\n"
                ;
    }
}
