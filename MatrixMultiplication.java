package revision;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of rows and columns in first matrix: ");
		int m= sc.nextInt();
		int n= sc.nextInt();
		System.out.println("Enter the no. of rows and columns in second matrix: ");
		int p= sc.nextInt();
		int q= sc.nextInt();
		if (n!=p) {
			System.out.println("Matrix Multiplication not possible; invalid dimensions.");
		}
		else {
			int a[][]=new int[m][n];
			int b[][]=new int[p][q];
			int c[][]=new int[m][q];
			System.out.println("Enter the elements of first matrix:");
			for (int i=0;i<m;i++) {
				for (int j=0;j<n;j++) {
						 a[i][j]= sc.nextInt();
				}
			}
			System.out.println("Enter the elements of second matrix:");
			for (int i=0;i<p;i++) {
				for (int j=0;j<q;j++) {
						 b[i][j]= sc.nextInt();
				}
			}
			
			for (int i=0;i<m;i++) {
				for (int j=0;j<q;j++) {
					c[i][j]=0;
					for (int k=0;k<n;k++)
						 c[i][j]+= a[i][k]*b[k][j];
				}
			}
			System.out.println("Resultant matrix:");
			for (int i=0;i<m;i++) {
			//	
				for (int j=0;j<q;j++) {
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		sc.close();

	}

}
