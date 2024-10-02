package labinternal;
class Vehicle{
	public void drive() {
		System.out.println("driving a vehicle");
	}
}
class Car extends Vehicle{
	public void drive() {
		super.drive();
		System.out.println("Repairing a car");
	}
}
public class vehicle4A {
	public static void main(String[]args) {
		Car c = new Car();
		c.drive();
		
	}

}
