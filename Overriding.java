//Java program to implement overriding using super keyword.
package Java-Programs;
import java.util.Scanner;
class Employee1{
	int grossSalary, DA, HRA, salary;
	public void display() {
		System.out.println("...Employee...");
	}
	public void calcSalary() {
		grossSalary=salary+ (DA/100)*salary + (HRA/100)*salary;
		System.out.println("Salary of Employee is "+grossSalary);
	}
}

class Engineer extends Employee1{
	Engineer(int salary, int DA, int HRA){
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
	}
	public void display() {
		super.display();
		System.out.println("...Engineer...");
	}
	public void calcSalary() {
		super.calcSalary();
		System.out.println("Salary of Employee is "+grossSalary*2);
	}
}
public class Overriding {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base salary:");
		int salary= sc.nextInt();
		System.out.println("Enter the DA%:");
		int DA= sc.nextInt();
		System.out.println("Enter the HRA%:");
		int HRA= sc.nextInt();
		Engineer e= new Engineer(salary, DA,HRA);
		e.display();
		e.calcSalary();

	}

}
