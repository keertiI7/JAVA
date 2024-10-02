package labinternal;

public class Area3 {
	double radius;
	double length;
	double width;
	public Area3(double radius,double length,double width) {
		this.radius=radius;
		this.length=length;
		this.width=width;
	}
	public void carea() {
		System.out.println("The area of the circle is :"+ Math.PI*(radius*radius));
	}
	public void rarea() {
		System.out.println("The area of rectangle is :"+ length*width);
	}
	public static void main(String[]args) {
		Area3 x=new Area3(-4.5,12.2,6.4);
		x.carea();
		x.rarea();
		
	}
}
