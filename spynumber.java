package labinternal;
import java.util.Scanner;
public class spynumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		if(n>0) {
			while(n>0) {
				int r=n%10;
				sum=sum+r;
				mul=mul*r;
				n=n/10;
			}
		}
		if(sum==mul) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}

}
