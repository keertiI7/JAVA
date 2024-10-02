/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Animal{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animal{
	public void cats() {
		System.out.println("Cats Meow");	
	}

	void dogs() {
		
	}
}
class Dogs extends Animal{
	public void dogs() {
		System.out.println("Dogs Bark");
	}
	void cats() {

	
	}
}

public class animal7 {
	public static void main(String[]args) {
		Cats c=new Cats();
		Dogs d=new Dogs();
		c.cats();
		d.dogs();
		
		}
}
