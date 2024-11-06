import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the word:");
		String s= sc.nextLine();
		s= s.toLowerCase();
		for (int i=0;i<(s.length()-1)/2;i++) {
			if (s.charAt(i)!=s.charAt(s.length()-1-i)){
				flag=1;
			}
		}
		if (flag==1) {
			System.out.println("Not Palindrome");
		}
		else System.out.println("Palindrome");
		sc.close();
	}

}
