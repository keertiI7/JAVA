package PROGRAMS;

public class dog {
	String name;
	String color;
	public dog(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public void print_details() {
		System.out.println("Name : " + this.name);
		System.out.println("color : " + this.color);
		
	}
	public static void main(String[]args) {
		dog d=new dog("Shiroo","White");
		d.print_details();
	}

}
