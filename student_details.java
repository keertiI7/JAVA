package programs;
import java.util.Scanner;
public class student_details {
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name :");
		String name=sc.nextLine();
		System.out.println("Please enter your roll number:");
		String roll_no=sc.nextLine();
		System.out.println("Please enter your department:");
		String dept=sc.nextLine();
		System.out.println("Please enter your section:");
		String section=sc.nextLine();
		System.out.println("Name:"+name+"\n"+"rollnumber:"+roll_no+"\n"+"Department:"+dept+"\n"+"Section:"+section+"\n");
		
	}

}
