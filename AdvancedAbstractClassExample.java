//Interface for Drawable objects

interface Drawable {
    void draw();
}

//Abstract class representing a shape

abstract class Shape implements Drawable {
    private String color;

    public Shape(String color){
        this.color = color;
    }

//    Abstract method to calculate area
public abstract double calculateArea();

//Concrete method to print the color
public void printColor(){
System.out.println("Color: " + color);
}

//Implementing the draw method from the Drawable interface
@Override
    public void draw() {
    System.out.println("Drawing a shape with color: " + color);
}
}

//Concrete class circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

//    Override to provide the area calculation for a circle
@Override
    public double calculateArea() {
        return Math.PI * radius * radius;
}
}

//Concrete class Rectangle extending Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

//    Override to provide the area calculation for a rectangle
@Override
    public double calculateArea() {
        return width * height;
}
}

public class AdvancedAbstractClassExample {
    public static void main(String[] args) {
//        Create instance of Circle and Rectangle
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

//        Call methods and demonstrate the use of interfaces
        circle.printColor();
        System.out.println("Area of Circle " + circle.calculateArea());
        circle.draw();

        System.out.println();

        rectangle.printColor();
        System.out.println("Area of Rectangle " + rectangle.calculateArea());
        rectangle.draw();
    }
}