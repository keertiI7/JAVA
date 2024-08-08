package PROGRAMS;

public class primenumber {
	public static void main(String[]args) {
		int x =2;
		int count=0;
	for(int i=1;i<x;i++) {
		if(x%i==0) {
		count=count+1;
		}
	}
	if(count==1) {
		System.out.println("It is a prime number");
		}
	else{
		System.out.println("It is not a prime number");
		}
	

}
}
