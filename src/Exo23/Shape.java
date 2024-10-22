package Exo23;

public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Radius of the Circle: " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("Sides of the Traiangel are: " +
                side1 + "," + side2 + "," + side3);
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}