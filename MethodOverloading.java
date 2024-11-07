//Java program to calculate the area of different shapes- namely circle, triangle, rectangle- using the concept of method overloading.
package Java-Programs;
import java.util.Scanner;

 class calc {
	void area(float radius) {
		double area= 3.14*radius*radius;
		System.out.println("Area of circle= "+area);
	}
	void area(int length, int breadth) {
		int area= length*breadth;
		System.out.println("Area of rectangle= "+area);
	}
	void area(double height, double base) {
		double area= 0.5*height*base;
		System.out.println("Area of triangle= "+area);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		float radius= sc.nextFloat();
		System.out.println("Enter the length and breadth of the rectangle: ");
		int length= sc.nextInt();
		int breadth= sc.nextInt();
		System.out.println("Enter the height and base of the triangle: ");
		double height= sc.nextDouble();
		double base= sc.nextDouble();
		sc.close();
		calc c= new calc();
		c.area(radius);
		c.area(length, breadth);
		c.area(height, base);
		

	}

}
