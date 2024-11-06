package Java-Programs;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int f=1;
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		for (int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("Factorial is : "+f);
		sc.close();
	}

}
