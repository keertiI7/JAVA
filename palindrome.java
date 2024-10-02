package labinternal;
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int r= n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
	}

}
