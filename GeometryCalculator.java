package polymorphism;
import java.lang.Math;
public class GeometryCalculator {
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}
	public double calculateArea(double length,double width) {
		return length*width;
	}
	public double calculateArea(double width,double length) {
		return width*length;
	}
	public int calculateArea(int side) {
		return side*side;
	}
	public double calculateArea(double height,double base,boolean isTriangle) {
		if(isTriangle) {
			return 0.5*height*base;
		}
		return 0;
	}
	public static void main(String[] args) {
		GeometryCalculator obj=new GeometryCalculator();
		obj.calculateArea(123456);
		obj.calculateArea(123,456);
		obj.calculateArea(12,46);
		System.out.println("area of circle:"+obj.calculateArea(123456));
		System.out.println("area of rectangle:"+obj.calculateArea(123,456));
		System.out.println("area of rectangle:"+obj.calculateArea(12,56));
		System.out.println("area of square:"+obj.calculateArea(12));
		System.out.println("area of triangle:"+obj.calculateArea(12,6,true));

	}

}
//In the GeometryCalculator class, three overloaded methods named calculateArea are defined. How does Java distinguish between these methods when they have the same name?
