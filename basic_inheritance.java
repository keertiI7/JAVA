package programs;
class Animal{
	public static void display() {
	System.out.println("I belong to animal class");
	
}
}
class dog extends Animal{
	public static void display() {
		System.out.println("I belong to dog class");
	}
}
	
public class basic_inheritance {
	public static void main(String[]args) {
	Animal.display();
	dog.display();
	
	}
}


