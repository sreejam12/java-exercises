package inheritance;
abstract class Shape {
    
    public abstract double calculateArea();
    public void display() {
        System.out.println("Displaying shape");
    }
}
class Circle extends Shape {
    private double radius;

   
    public Circle(double radius) {
        this.radius = radius;
    }


    //Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;

  
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

  
    //Override
    public double calculateArea() {
        return width * height;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class LabExer1 {

	public static void main(String[] args) {
		Shape circlearea = new Circle(7.0);
        Shape rectanglearea = new Rectangle(2.0, 8.0);

       
        circlearea.display();
        System.out.println("Area of the circle: " + circlearea.calculateArea());

        rectanglearea.display();
        System.out.println("Area of the rectangle: " + rectanglearea.calculateArea());

	}

}
/*Question 1: Abstract Class and Inheritance
Define an abstract class Shape with:

An abstract method calculateArea().
A concrete method display() that prints "Displaying shape".
Define two subclasses Circle and Rectangle that extend Shape:

Implement the calculateArea() method to compute the area of a circle and rectangle respectively.
Provide constructors and necessary fields for each subclass.
Write a Main class to demonstrate polymorphic behavior by creating instances of Circle and Rectangle, calling their methods, and displaying their areas.*/