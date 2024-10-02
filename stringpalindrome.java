package labinternal;
import java.util.Scanner;
public class stringpalindrome {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)==s.charAt(r)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			l++;
			r--;
		}
		
		
	}

}
