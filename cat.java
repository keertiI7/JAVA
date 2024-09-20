package PROGRAMS;

public class cat{
	String name;
	int age;
	public cat() {
		name="unknown";
		age=0;
	}
	public static void main(String[]args) {
		cat A=new cat();
		System.out.println(A.name);
		System.out.println(A.age);
	}
}
