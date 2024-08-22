package programs;
import java.util.Scanner;
public class calculator {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter operator:\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Remainder\n");
		int operator=sc.nextInt();
		sc.nextLine();
		switch(operator) {
		case 1:
			System.out.println("Addition is :"+(a+b));
			break;
		case 2:
			System.out.println("Subtraction is :"+(a-b));
			break;
		case 3:
			System.out.println("Multiplication is :"+(a*b));
			break;
		case 4:
			System.out.println("Division is :"+(a/b));
			break;
		case 5:
			System.out.println("Remainder is :"+(a%b));
			break;
		default:
			System.out.println("Invalid choice");
				
		}
	}

}
