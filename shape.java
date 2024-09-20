package PROGRAMS;

class shapes {
	public void getArea() {
		System.out.println("This getArea method is from shape class ");
	}
}
class rectangle extends shapes{
	int length;
	int breadth;
	public rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
	}
	public void getArea() {
		System.out.println("The area of rectangle is : " + length*breadth);
	}
}
public class shape{
	public static void main(String[]args) {
		rectangle r=new rectangle(8,9);
		r.getArea();
	}
}