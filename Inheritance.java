//Java program which creates a class named "Employee" having the following members: Name, Age, Phone Number, Address, Salary. It also has a methond named 'PrintSalary()' which prints the salary of the employee. Two classes 'Officer' and 'Manager' classes have data members 'Specialisation' and 'Department' respectively. Now assign name, age, phone number, address and salary to an officer and manager by making an object of both of these classes and print the same.
package Java-Programs;
import java.util.Scanner;
class Employee{
	String name; 
	int age;
	long phone;
	String address;
	double salary;
	void printSalary(){
		System.out.println("Salary:"+salary);
	}
	void printDetails(){
		System.out.println("Name:"+name+ "\nAge:"+age+"\nPhone Number:"+phone+"\nAddress:"+address);
	}
}
class Officer extends Employee{
	String specialisation;
	Officer(String name, int age, long phone, String address, double salary,String specialisation){
		this.name= name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
		this.specialisation=specialisation;
	}
}
class Manager extends Employee{
	String department;
	Manager(String name, int age, long phone, String address, double salary,String department){
		this.name= name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
		this.department=department;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the details of officer:");
		System.out.println("Enter the name:");
		String name= sc.nextLine();
		System.out.println("Enter the age:");
		int age= sc.nextInt();
		System.out.println("Enter the phone number:");
		long phone= sc.nextLong();
		System.out.println("Enter the address:");
		String address= sc.next();
		System.out.println("Enter the salary:");
		double salary= sc.nextDouble();
		System.out.println("Enter the specialisation:");
		String specialisation= sc.next();
		Officer of= new Officer(name, age, phone,address,salary, specialisation);
		System.out.println("Enter the details of manager:");
		System.out.println("Enter the name:");
		name= sc.next();
		System.out.println("Enter the age:");
		age= sc.nextInt();
		System.out.println("Enter the phone number:");
		phone= sc.nextLong();
		System.out.println("Enter the address:");
		address= sc.next();
		System.out.println("Enter the salary:");
		salary= sc.nextDouble();
		System.out.println("Enter the specialisation:");
		String department= sc.next();
		Manager mg= new Manager(name, age, phone,address,salary, department);
		sc.close();
		System.out.println("Officer Details:");
		of.printDetails();
		of.printSalary();
		System.out.println("Manager Details:");
		mg.printDetails();
		mg.printSalary();

	}

}
