//Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides. Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides that shows the number of sides in the given geometrical structures. (Exercise to understand polymorphism). 

package Java-Programs;

abstract class Shape {
	abstract void numberofSides();
	abstract void SumofAngles();
}
class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side=side;
	}
	void numberofSides() {
		System.out.println("The rectangle has "+side+" sides.");
	}
	void SumofAngles() {
		System.out.println("The sum of angles of a rectangle is: "+(side-2)*180);
	}
}
class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side=side;
	}
	void numberofSides() {
		System.out.println("The triangle has "+side+" sides.");
	}
	void SumofAngles() {
		System.out.println("The sum of angles of a triangle is: "+(side-2)*180);
	}
}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side=side;
	}
	void numberofSides() {
		System.out.println("The hexagon has "+side+" sides.");
	}
	void SumofAngles() {
		System.out.println("The sum of angles of a hexagon is: "+(side-2)*180);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Rectangle r= new Rectangle(4);
		Triangle t= new Triangle(3);
		Hexagon h= new Hexagon(6);
		r.numberofSides();
		r.SumofAngles();
		t.numberofSides();
		t.SumofAngles();
		h.numberofSides();
		h.SumofAngles();

	}

}
