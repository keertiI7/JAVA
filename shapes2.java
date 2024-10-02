package labinternal;
interface Shape {
 int length = 0;
 int width = 0;
 void printArea();
}

class Rectangle implements Shape {
 int length;
 int width;
 public Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }
 
 public void printArea() {
     int area = length * width;
     System.out.println("Rectangle Area: " + area);
 }
}

class Triangle implements Shape {
 int base;
 int height;
public Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 public void printArea() {
     double area = 0.5 * base * height;
     System.out.println("Triangle Area: " + area);
 }
}

class Circle implements Shape {
 int radius;
 Circle(int radius) {
     this.radius = radius;
 }

 public void printArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Circle Area: " + area);
 }
}

public class shapes2 {
 public static void main(String[] args) {
     
     Rectangle rectangle = new Rectangle(10, 5);
     Triangle triangle = new Triangle(6, 8);
     Circle circle = new Circle(7);

     
     rectangle.printArea();
     triangle.printArea();
     circle.printArea();
 }


		
	}


