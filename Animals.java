package PROGRAMS;
class animal{
	public void move() {
		System.out.println("All animals move..");
	}
}
class cheetah extends animal{
	public void move() {
		System.out.println("cheetah runs..");
      }
	}

public class Animals {
	public static void main(String[]args) {
		cheetah c=new cheetah();
		c.move();
	}
}


