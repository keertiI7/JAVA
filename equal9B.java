package labinternal;
import java.util.Scanner;
public class equal9B {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter second number:");
		int n2=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter third number:");
		int n3=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter fourth number:");
		int n4=sc.nextInt();
		sc.nextLine();
		if(n1==n2 && n2==n3 && n3==n1) {
			System.out.println("EQUAL");
		}
		else {
			System.out.println("NOT EQUAL");
		}
		
		
	}

}
