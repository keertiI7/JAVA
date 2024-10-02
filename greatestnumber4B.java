package labinternal;
import java.util.Scanner;
public class greatestnumber4B {
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1ST number:");
	int n1=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter 2ND number:");
	int n2=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter 3RD number:");
	int n3=sc.nextInt();
	sc.nextLine();
	if(n1>n2 && n1>n3) {
		System.out.println("The Greatest number is :"+n1);
	}
	else if(n2>n1 && n2>n3) {
		System.out.println("The Greatest number is :"+n2);
	}
	else {
		System.out.println("The Greatest number is :"+n3);
	}
	

}
}
