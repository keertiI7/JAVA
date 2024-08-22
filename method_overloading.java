package programs;
class add{
	public int sum(int a,int b ) {
		return(a+b);
	}
	public int sum(int a,int b,int c) {
		return(a+b+c);
	}
	public double sum(double a,double b) {
		return(a+b);
	}
}
public class method_overloading {
	public static void main(String[]args) {
		add s1=new add();
		int result1=s1.sum(45,89);
		int result2=s1.sum(67,19,80);
		double result3=s1.sum(12.75,8.95);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
