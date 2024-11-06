//Java program to find the frequency of a character in a string.
import java.util.Scanner;
public class FreqofChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		System.out.println("Enter a string:");
		String s= sc.nextLine();
		System.out.println("Enter the character to find the frequency of :");
		char c= sc.next().charAt(0);
		c=Character.toLowerCase(c);
		s=s.toLowerCase();
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==c) {
				count++;
			}
		}
		if (count==0) System.out.println("Character not found.");
		else System.out.println("Character found "+count+" times.");
		sc.close();

	}

}
