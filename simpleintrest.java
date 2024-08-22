package programs;
import java.util.Scanner;
public class simpleintrest {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Principal:");
		int p= sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter time:");
		int t= sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter rate:");
		int r= sc.nextInt();
		sc.nextLine();
		System.out.println("Simple intrest is :"+(p*t*r)/100);
		
	}

}
