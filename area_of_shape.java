class Shape {
    double first;
    double second;

    Shape(double a, double b) {
        first = a;
        second = b;
    }

    double calculateArea() {
        return first * second;
    }
}

class Square {
    Shape area_of_shape;

    Square(double side) {
        area_of_shape = new Shape(side, side);
    }

    double calculateArea() {
        return area_of_shape.calculateArea();
    }
}

public class area_of_shape {
    public static void main(String[] args) {
        System.out.println("The area of rectangle:");
        Shape rectangle = new Shape(1, 2);
        System.out.println(rectangle.calculateArea());

        System.out.println("The area of square:");
        Square square = new Square(2);
        System.out.println(square.calculateArea());
    }
}