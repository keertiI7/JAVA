package PROGRAMS;

public class add {
	public int addition(int x,int y) {
		int result=x+y;
		return result;
		}
	
public static void main(String[]args) {
 int x=10;
 int y=50;
 add myObj=new add();
 int result= myObj.addition(x,y);
 System.out.println(result);
}		
}
	