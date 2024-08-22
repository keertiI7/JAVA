package programs;
class A{
	public A(){
		super();
		System.out.println("In A default");
		
	}
	public A(int n) {
		super();
		System.out.println("In A  parameterised");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("In B default");
	}
	public B(int n) {
		super(8);
//		this();
		System.out.println("In B parameterised");
	}
}

public class Inheritance3 {
	public static void main(String[]args) {
		B myObj=new B(9);
	}

}
