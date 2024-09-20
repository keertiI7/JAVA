package PROGRAMS;

public class computer {

	class processor{
		String brand;
		String speed;
		public processor() {
			this.brand="intel";
			this.speed="1080GB";
		}
	
		public void displaydetails() {
			System.out.println("Brand : "+this.brand);
			System.out.println("Speed : "+this.speed);
			
		}
	}
	public static void main(String[]args) {
		computer c= new computer();
		computer.processor p=c.new processor();
		p.displaydetails();
	}
}
