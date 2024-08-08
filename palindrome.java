package PROGRAMS;

public class palindrome {
	public static void main(String[]args) {
		int x=121;
		int sum=0;
		int temp=x;
		int r=0;
		while(x>0) {
		r=x%10;
		sum=sum*10+r;
		x=x/10;
		}
		if(temp==sum) {
			System.out.println("Given number is a palindrome");
		
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
	}

}
